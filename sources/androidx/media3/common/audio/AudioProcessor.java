package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import k6.n0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f8844a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class UnhandledAudioFormatException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f8845a;

        public UnhandledAudioFormatException(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public UnhandledAudioFormatException(String str, a aVar) {
            super(str + " " + aVar);
            this.f8845a = aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f8846e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8850d;

        public a(androidx.media3.common.a aVar) {
            this(aVar.H, aVar.G, aVar.I);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8847a == aVar.f8847a && this.f8848b == aVar.f8848b && this.f8849c == aVar.f8849c;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f8847a), Integer.valueOf(this.f8848b), Integer.valueOf(this.f8849c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f8847a + ", channelCount=" + this.f8848b + ", encoding=" + this.f8849c + ']';
        }

        public a(int i11, int i12, int i13) {
            this.f8847a = i11;
            this.f8848b = i12;
            this.f8849c = i13;
            this.f8850d = n0.F0(i13) ? n0.i0(i13, i12) : -1;
        }
    }

    boolean a();

    boolean b();

    ByteBuffer c();

    void d(ByteBuffer byteBuffer);

    void e();

    a f(a aVar);

    void flush();

    void reset();
}
