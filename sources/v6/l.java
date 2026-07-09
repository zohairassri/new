package v6;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements p6.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f132540d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f132541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f132542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f132543c;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        /*
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            v6.l.f132540d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.l.<clinit>():void");
    }

    public l(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    public l(UUID uuid, byte[] bArr, boolean z11) {
        this.f132541a = uuid;
        this.f132542b = bArr;
        this.f132543c = z11;
    }
}
