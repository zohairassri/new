package y6;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import y6.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f139882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f139883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LoudnessCodecController f139884c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return c.this.f139883b.a(bundle);
        }
    }

    public c() {
        this(b.f139886a);
    }

    public void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f139884c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            k6.a.g(this.f139882a.add(mediaCodec));
        }
    }

    public void c() {
        this.f139882a.clear();
        LoudnessCodecController loudnessCodecController = this.f139884c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f139882a.remove(mediaCodec) || (loudnessCodecController = this.f139884c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void e(int i11) {
        LoudnessCodecController loudnessCodecController = this.f139884c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f139884c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i11, com.google.common.util.concurrent.f.a(), new a());
        this.f139884c = loudnessCodecControllerCreate;
        Iterator it = this.f139882a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public c(b bVar) {
        this.f139882a = new HashSet();
        this.f139883b = bVar;
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f139886a = new b() { // from class: y6.d
            @Override // y6.c.b
            public final Bundle a(Bundle bundle) {
                return c.b.b(bundle);
            }
        };

        Bundle a(Bundle bundle);

        static /* synthetic */ Bundle b(Bundle bundle) {
            return bundle;
        }
    }
}
