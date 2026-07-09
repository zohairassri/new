package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ml.l0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f20071a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f20072e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f20076d;

        public a(int i11, int i12, int i13) {
            this.f20073a = i11;
            this.f20074b = i12;
            this.f20075c = i13;
            this.f20076d = l0.r0(i13) ? l0.Z(i13, i12) : -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f20073a == aVar.f20073a && this.f20074b == aVar.f20074b && this.f20075c == aVar.f20075c;
        }

        public int hashCode() {
            return zo.k.b(Integer.valueOf(this.f20073a), Integer.valueOf(this.f20074b), Integer.valueOf(this.f20075c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f20073a + ", channelCount=" + this.f20074b + ", encoding=" + this.f20075c + ']';
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
