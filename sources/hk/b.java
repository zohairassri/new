package hk;

import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f102167b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f102170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f102171d;

        public a(String str, String str2, long j11, long j12) {
            this.f102168a = str;
            this.f102169b = str2;
            this.f102170c = j11;
            this.f102171d = j12;
        }
    }

    public b(long j11, List list) {
        this.f102166a = j11;
        this.f102167b = list;
    }

    public MotionPhotoMetadata a(long j11) {
        long j12;
        if (this.f102167b.size() < 2) {
            return null;
        }
        long j13 = j11;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        long j17 = -1;
        boolean z11 = false;
        for (int size = this.f102167b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f102167b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f102168a) | z11;
            if (size == 0) {
                j13 -= aVar.f102171d;
                j12 = 0;
            } else {
                j12 = j13 - aVar.f102170c;
            }
            long j18 = j12;
            long j19 = j13;
            j13 = j18;
            if (!zEquals || j13 == j19) {
                z11 = zEquals;
            } else {
                j17 = j19 - j13;
                j16 = j13;
                z11 = false;
            }
            if (size == 0) {
                j14 = j13;
                j15 = j19;
            }
        }
        if (j16 == -1 || j17 == -1 || j14 == -1 || j15 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j14, j15, this.f102166a, j16, j17);
    }
}
