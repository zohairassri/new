package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f7327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence[] f7328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f7329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f7331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f7332g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        public static RemoteInput a(s sVar) {
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(sVar.i()).setLabel(sVar.h()).setChoices(sVar.e()).setAllowFreeFormInput(sVar.c()).addExtras(sVar.g());
            Set setD = sVar.d();
            if (setD != null) {
                Iterator it = setD.iterator();
                while (it.hasNext()) {
                    b.a(builderAddExtras, (String) it.next(), true);
                }
            }
            c.a(builderAddExtras, sVar.f());
            return builderAddExtras.build();
        }

        static Bundle b(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {
        static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z11) {
            return builder.setAllowDataType(str, z11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class c {
        static RemoteInput.Builder a(RemoteInput.Builder builder, int i11) {
            return builder.setEditChoicesBeforeSending(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7333a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f7336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence[] f7337e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f7334b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bundle f7335c = new Bundle();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f7338f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f7339g = 0;

        public d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f7333a = str;
        }

        public s a() {
            return new s(this.f7333a, this.f7336d, this.f7337e, this.f7338f, this.f7339g, this.f7335c, this.f7334b);
        }

        public d b(CharSequence charSequence) {
            this.f7336d = charSequence;
            return this;
        }
    }

    s(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z11, int i11, Bundle bundle, Set set) {
        this.f7326a = str;
        this.f7327b = charSequence;
        this.f7328c = charSequenceArr;
        this.f7329d = z11;
        this.f7330e = i11;
        this.f7331f = bundle;
        this.f7332g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    static RemoteInput a(s sVar) {
        return a.a(sVar);
    }

    static RemoteInput[] b(s[] sVarArr) {
        if (sVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[sVarArr.length];
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            remoteInputArr[i11] = a(sVarArr[i11]);
        }
        return remoteInputArr;
    }

    public static Bundle j(Intent intent) {
        return a.b(intent);
    }

    public boolean c() {
        return this.f7329d;
    }

    public Set d() {
        return this.f7332g;
    }

    public CharSequence[] e() {
        return this.f7328c;
    }

    public int f() {
        return this.f7330e;
    }

    public Bundle g() {
        return this.f7331f;
    }

    public CharSequence h() {
        return this.f7327b;
    }

    public String i() {
        return this.f7326a;
    }

    public boolean k() {
        if (c()) {
            return false;
        }
        return ((e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
