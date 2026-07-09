package w7;

import androidx.media3.common.a;
import h6.u;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final androidx.media3.common.a f134921g = new a.b().y0("application/id3").P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final androidx.media3.common.a f134922h = new a.b().y0("application/x-scte35").P();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f134925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f134926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f134927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f134928f;

    public a(String str, String str2, long j11, long j12, byte[] bArr) {
        this.f134923a = str;
        this.f134924b = str2;
        this.f134925c = j11;
        this.f134926d = j12;
        this.f134927e = bArr;
    }

    @Override // h6.u.a
    public byte[] E() {
        if (e() != null) {
            return this.f134927e;
        }
        return null;
    }

    @Override // h6.u.a
    public androidx.media3.common.a e() {
        String str = this.f134923a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f134922h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f134921g;
            default:
                return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f134925c == aVar.f134925c && this.f134926d == aVar.f134926d && Objects.equals(this.f134923a, aVar.f134923a) && Objects.equals(this.f134924b, aVar.f134924b) && Arrays.equals(this.f134927e, aVar.f134927e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f134928f == 0) {
            String str = this.f134923a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f134924b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j11 = this.f134925c;
            int i11 = (((iHashCode + iHashCode2) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f134926d;
            this.f134928f = ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + Arrays.hashCode(this.f134927e);
        }
        return this.f134928f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f134923a + ", id=" + this.f134926d + ", durationMs=" + this.f134925c + ", value=" + this.f134924b;
    }
}
