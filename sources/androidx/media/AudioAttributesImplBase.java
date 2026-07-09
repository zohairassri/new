package androidx.media;

import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8610d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8611a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8612b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8613c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8614d = -1;

        a() {
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f8612b, this.f8613c, this.f8611a, this.f8614d);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a b(int i11) {
            if (i11 == 0 || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                this.f8612b = i11;
                return this;
            }
            this.f8612b = 0;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i11) {
            switch (i11) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f8611a = i11;
                    break;
                case 16:
                    this.f8611a = 12;
                    break;
                default:
                    this.f8611a = 0;
                    break;
            }
            return this;
        }
    }

    public AudioAttributesImplBase() {
        this.f8607a = 0;
        this.f8608b = 0;
        this.f8609c = 0;
        this.f8610d = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object a() {
        return null;
    }

    public int b() {
        return this.f8608b;
    }

    public int c() {
        int i11 = this.f8609c;
        int iD = d();
        if (iD == 6) {
            i11 |= 4;
        } else if (iD == 7) {
            i11 |= 1;
        }
        return i11 & 273;
    }

    public int d() {
        int i11 = this.f8610d;
        return i11 != -1 ? i11 : AudioAttributesCompat.b(false, this.f8609c, this.f8607a);
    }

    public int e() {
        return this.f8607a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f8608b == audioAttributesImplBase.b() && this.f8609c == audioAttributesImplBase.c() && this.f8607a == audioAttributesImplBase.e() && this.f8610d == audioAttributesImplBase.f8610d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8608b), Integer.valueOf(this.f8609c), Integer.valueOf(this.f8607a), Integer.valueOf(this.f8610d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f8610d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f8610d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.d(this.f8607a));
        sb2.append(" content=");
        sb2.append(this.f8608b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f8609c).toUpperCase());
        return sb2.toString();
    }

    AudioAttributesImplBase(int i11, int i12, int i13, int i14) {
        this.f8608b = i11;
        this.f8609c = i12;
        this.f8607a = i13;
        this.f8610d = i14;
    }
}
