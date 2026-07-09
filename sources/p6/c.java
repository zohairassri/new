package p6;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f121176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f121177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f121178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f121179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f121180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f121181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f121182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f121183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f121184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f121185j;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f121186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f121187b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i11, int i12) {
            this.f121187b.set(i11, i12);
            this.f121186a.setPattern(this.f121187b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f121186a = cryptoInfo;
            this.f121187b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f121184i = cryptoInfo;
        this.f121185j = new b(cryptoInfo);
    }

    public MediaCodec.CryptoInfo a() {
        return this.f121184i;
    }

    public void b(int i11) {
        if (i11 == 0) {
            return;
        }
        if (this.f121179d == null) {
            int[] iArr = new int[1];
            this.f121179d = iArr;
            this.f121184i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f121179d;
        iArr2[0] = iArr2[0] + i11;
    }

    public void c(int i11, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i12, int i13, int i14) {
        this.f121181f = i11;
        this.f121179d = iArr;
        this.f121180e = iArr2;
        this.f121177b = bArr;
        this.f121176a = bArr2;
        this.f121178c = i12;
        this.f121182g = i13;
        this.f121183h = i14;
        MediaCodec.CryptoInfo cryptoInfo = this.f121184i;
        cryptoInfo.numSubSamples = i11;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i12;
        ((b) k6.a.e(this.f121185j)).b(i13, i14);
    }
}
