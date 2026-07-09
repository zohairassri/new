package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class sb {
    public static final sb B;
    public static final sb N;
    private static final /* synthetic */ sb[] S;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sb f40719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final sb f40720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final sb f40721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final sb f40722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final sb f40723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final sb f40724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final sb f40725i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final sb f40726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final sb f40727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final sb f40728n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final sb f40729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final sb f40730s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final sb f40731v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final sb f40732w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final sb f40733x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final sb f40734y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cc f40735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40736b;

    static {
        sb sbVar = new sb("DOUBLE", 0, cc.DOUBLE, 1);
        f40719c = sbVar;
        sb sbVar2 = new sb("FLOAT", 1, cc.FLOAT, 5);
        f40720d = sbVar2;
        cc ccVar = cc.LONG;
        sb sbVar3 = new sb("INT64", 2, ccVar, 0);
        f40721e = sbVar3;
        sb sbVar4 = new sb("UINT64", 3, ccVar, 0);
        f40722f = sbVar4;
        cc ccVar2 = cc.INT;
        sb sbVar5 = new sb("INT32", 4, ccVar2, 0);
        f40723g = sbVar5;
        sb sbVar6 = new sb("FIXED64", 5, ccVar, 1);
        f40724h = sbVar6;
        sb sbVar7 = new sb("FIXED32", 6, ccVar2, 5);
        f40725i = sbVar7;
        sb sbVar8 = new sb("BOOL", 7, cc.BOOLEAN, 0);
        f40726l = sbVar8;
        rb rbVar = new rb("STRING", cc.STRING);
        f40727m = rbVar;
        cc ccVar3 = cc.MESSAGE;
        tb tbVar = new tb("GROUP", ccVar3);
        f40728n = tbVar;
        vb vbVar = new vb("MESSAGE", ccVar3);
        f40729r = vbVar;
        xb xbVar = new xb("BYTES", cc.BYTE_STRING);
        f40730s = xbVar;
        sb sbVar9 = new sb("UINT32", 12, ccVar2, 0);
        f40731v = sbVar9;
        sb sbVar10 = new sb("ENUM", 13, cc.ENUM, 0);
        f40732w = sbVar10;
        sb sbVar11 = new sb("SFIXED32", 14, ccVar2, 5);
        f40733x = sbVar11;
        sb sbVar12 = new sb("SFIXED64", 15, ccVar, 1);
        f40734y = sbVar12;
        sb sbVar13 = new sb("SINT32", 16, ccVar2, 0);
        B = sbVar13;
        sb sbVar14 = new sb("SINT64", 17, ccVar, 0);
        N = sbVar14;
        S = new sb[]{sbVar, sbVar2, sbVar3, sbVar4, sbVar5, sbVar6, sbVar7, sbVar8, rbVar, tbVar, vbVar, xbVar, sbVar9, sbVar10, sbVar11, sbVar12, sbVar13, sbVar14};
    }

    public static sb[] values() {
        return (sb[]) S.clone();
    }

    public final cc a() {
        return this.f40735a;
    }

    private sb(String str, int i11, cc ccVar, int i12) {
        this.f40735a = ccVar;
        this.f40736b = i12;
    }
}
