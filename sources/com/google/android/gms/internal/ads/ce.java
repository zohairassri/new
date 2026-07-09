package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k5 f24536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f24537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f24540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f24546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f24547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f24548m;

    public ce(k5 k5Var) {
        this.f24536a = k5Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void e(int i11) {
        long j11 = this.f24547l;
        if (j11 != -9223372036854775807L) {
            long j12 = this.f24537b;
            long j13 = this.f24546k;
            if (j12 == j13) {
                return;
            }
            int i12 = (int) (j12 - j13);
            this.f24536a.c(j11, this.f24548m ? 1 : 0, i12, i11, null);
        }
    }

    public final void a() {
        this.f24541f = false;
        this.f24542g = false;
        this.f24543h = false;
        this.f24544i = false;
        this.f24545j = false;
    }

    public final void b(long j11, int i11, int i12, long j12, boolean z11) {
        this.f24542g = false;
        this.f24543h = false;
        this.f24540e = j12;
        this.f24539d = 0;
        this.f24537b = j11;
        if (i12 >= 32 && i12 != 40) {
            if (this.f24544i && !this.f24545j) {
                if (z11) {
                    e(i11);
                }
                this.f24544i = false;
            }
            if (i12 <= 35 || i12 == 39) {
                this.f24543h = !this.f24545j;
                this.f24545j = true;
            }
        }
        boolean z12 = i12 >= 16 && i12 <= 21;
        this.f24538c = z12;
        this.f24541f = z12 || i12 <= 9;
    }

    public final void c(byte[] bArr, int i11, int i12) {
        if (this.f24541f) {
            int i13 = this.f24539d;
            int i14 = (i11 + 2) - i13;
            if (i14 >= i12) {
                this.f24539d = i13 + (i12 - i11);
            } else {
                this.f24542g = (bArr[i14] & ByteCompanionObject.MIN_VALUE) != 0;
                this.f24541f = false;
            }
        }
    }

    public final void d(long j11, int i11, boolean z11) {
        if (this.f24545j && this.f24542g) {
            this.f24548m = this.f24538c;
            this.f24545j = false;
        } else if (this.f24543h || this.f24542g) {
            if (z11 && this.f24544i) {
                e(i11 + ((int) (j11 - this.f24537b)));
            }
            this.f24546k = this.f24537b;
            this.f24547l = this.f24540e;
            this.f24548m = this.f24538c;
            this.f24544i = true;
        }
    }
}
