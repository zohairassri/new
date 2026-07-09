package g6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f98175f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static a f98176g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f98177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f98178b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f98179c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f98180d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f98181e;

    /* JADX INFO: renamed from: g6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class HandlerC1129a extends Handler {
        HandlerC1129a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f98183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList f98184b;

        b(Intent intent, ArrayList arrayList) {
            this.f98183a = intent;
            this.f98184b = arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IntentFilter f98185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f98186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f98187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f98188d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f98185a = intentFilter;
            this.f98186b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f98186b);
            sb2.append(" filter=");
            sb2.append(this.f98185a);
            if (this.f98188d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    private a(Context context) {
        this.f98177a = context;
        this.f98181e = new HandlerC1129a(context.getMainLooper());
    }

    public static a b(Context context) {
        a aVar;
        synchronized (f98175f) {
            try {
                if (f98176g == null) {
                    f98176g = new a(context.getApplicationContext());
                }
                aVar = f98176g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f98178b) {
                try {
                    size = this.f98180d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f98180d.toArray(bVarArr);
                    this.f98180d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = bVarArr[i11];
                int size2 = bVar.f98184b.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    c cVar = (c) bVar.f98184b.get(i12);
                    if (!cVar.f98188d) {
                        cVar.f98186b.onReceive(this.f98177a, bVar.f98183a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f98178b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f98178b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f98178b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                    String action = intentFilter.getAction(i11);
                    ArrayList arrayList2 = (ArrayList) this.f98179c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f98179c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d(Intent intent) {
        int iMatch;
        synchronized (this.f98178b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f98177a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z11 = (intent.getFlags() & 8) != 0;
                if (z11) {
                    intent.toString();
                }
                ArrayList arrayList = (ArrayList) this.f98179c.get(intent.getAction());
                if (arrayList != null) {
                    if (z11) {
                        arrayList.toString();
                    }
                    ArrayList arrayList2 = null;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        c cVar = (c) arrayList.get(i11);
                        if (z11) {
                            Objects.toString(cVar.f98185a);
                        }
                        if (!cVar.f98187c && (iMatch = cVar.f98185a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager")) >= 0) {
                            if (z11) {
                                Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(cVar);
                            cVar.f98187c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            ((c) arrayList2.get(i12)).f98187c = false;
                        }
                        this.f98180d.add(new b(intent, arrayList2));
                        if (!this.f98181e.hasMessages(1)) {
                            this.f98181e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f98178b) {
            try {
                ArrayList arrayList = (ArrayList) this.f98178b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar = (c) arrayList.get(size);
                    cVar.f98188d = true;
                    for (int i11 = 0; i11 < cVar.f98185a.countActions(); i11++) {
                        String action = cVar.f98185a.getAction(i11);
                        ArrayList arrayList2 = (ArrayList) this.f98179c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = (c) arrayList2.get(size2);
                                if (cVar2.f98186b == broadcastReceiver) {
                                    cVar2.f98188d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f98179c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
