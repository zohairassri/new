package androidx.compose.ui.window;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f6285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f6286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f6287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f6288f;

    public t(int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f6283a = i11;
        this.f6284b = z11;
        this.f6285c = z12;
        this.f6286d = z13;
        this.f6287e = z14;
        this.f6288f = z15;
    }

    public final boolean a() {
        return this.f6285c;
    }

    public final boolean b() {
        return this.f6286d;
    }

    public final boolean c() {
        return this.f6287e;
    }

    public final int d() {
        return this.f6283a;
    }

    public final boolean e() {
        return this.f6284b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f6283a == tVar.f6283a && this.f6284b == tVar.f6284b && this.f6285c == tVar.f6285c && this.f6286d == tVar.f6286d && this.f6287e == tVar.f6287e && this.f6288f == tVar.f6288f;
    }

    public final boolean f() {
        return this.f6288f;
    }

    public int hashCode() {
        return (((((((((this.f6283a * 31) + Boolean.hashCode(this.f6284b)) * 31) + Boolean.hashCode(this.f6285c)) * 31) + Boolean.hashCode(this.f6286d)) * 31) + Boolean.hashCode(this.f6287e)) * 31) + Boolean.hashCode(this.f6288f);
    }

    public /* synthetic */ t(int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? true : z11, (i12 & 4) != 0 ? true : z12, (i12 & 8) != 0 ? true : z13, (i12 & 16) != 0 ? true : z14, (i12 & 32) != 0 ? false : z15);
    }

    public /* synthetic */ t(boolean z11, boolean z12, boolean z13, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? true : z13, (i11 & 8) != 0 ? true : z14);
    }

    public t(boolean z11, boolean z12, boolean z13, boolean z14) {
        this(z11, z12, z13, u.f6289a, true, z14);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ t(boolean r2, boolean r3, boolean r4, androidx.compose.ui.window.u r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            r0 = 1
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            androidx.compose.ui.window.u r5 = androidx.compose.ui.window.u.f6289a
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.t.<init>(boolean, boolean, boolean, androidx.compose.ui.window.u, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public t(boolean z11, boolean z12, boolean z13, u uVar, boolean z14, boolean z15) {
        this(z11, z12, z13, uVar, z14, z15, false);
    }

    public t(boolean z11, boolean z12, boolean z13, u uVar, boolean z14, boolean z15, boolean z16) {
        this(c.h(z11, uVar, z15), uVar == u.f6289a, z12, z13, z14, z16);
    }
}
