package tq;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f130230a;

    public k(Context context, String str) {
        this.f130230a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        try {
            long j11 = this.f130230a.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f130230a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f130230a.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f130230a.edit().putStringSet(key, hashSet).putLong("fire-count", j11 - 1).commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized String d(long j11) {
        return new Date(j11).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    private synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f130230a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void h(String str) {
        try {
            String strE = e(str);
            if (strE == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f130230a.getStringSet(strE, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f130230a.edit().remove(strE).commit();
            } else {
                this.f130230a.edit().putStringSet(strE, hashSet).commit();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.f130230a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f130230a.edit().putStringSet(str, hashSet).commit();
    }

    synchronized void b() {
        try {
            SharedPreferences.Editor editorEdit = this.f130230a.edit();
            int i11 = 0;
            for (Map.Entry<String, ?> entry : this.f130230a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strD = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strD)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strD);
                        i11++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i11 == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i11);
            }
            editorEdit.commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized List c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f130230a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(l.a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    synchronized boolean f(long j11, long j12) {
        return d(j11).equals(d(j12));
    }

    synchronized void g() {
        String strD = d(System.currentTimeMillis());
        this.f130230a.edit().putString("last-used-date", strD).commit();
        h(strD);
    }

    synchronized boolean i(long j11) {
        return j("fire-global", j11);
    }

    synchronized boolean j(String str, long j11) {
        if (!this.f130230a.contains(str)) {
            this.f130230a.edit().putLong(str, j11).commit();
            return true;
        }
        if (f(this.f130230a.getLong(str, -1L), j11)) {
            return false;
        }
        this.f130230a.edit().putLong(str, j11).commit();
        return true;
    }

    synchronized void k(long j11, String str) {
        String strD = d(j11);
        if (this.f130230a.getString("last-used-date", "").equals(strD)) {
            String strE = e(strD);
            if (strE == null) {
                return;
            }
            if (strE.equals(str)) {
                return;
            }
            m(str, strD);
            return;
        }
        long j12 = this.f130230a.getLong("fire-count", 0L);
        if (j12 + 1 == 30) {
            a();
            j12 = this.f130230a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f130230a.getStringSet(str, new HashSet()));
        hashSet.add(strD);
        this.f130230a.edit().putStringSet(str, hashSet).putLong("fire-count", j12 + 1).putString("last-used-date", strD).commit();
    }

    synchronized void l(long j11) {
        this.f130230a.edit().putLong("fire-global", j11).commit();
    }
}
