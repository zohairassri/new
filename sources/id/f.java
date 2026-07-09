package id;

import android.content.Context;
import id.d;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class f extends d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f103621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f103622b;

        a(Context context, String str) {
            this.f103621a = context;
            this.f103622b = str;
        }

        @Override // id.d.a
        public File getCacheDirectory() {
            File cacheDir = this.f103621a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f103622b != null ? new File(cacheDir, this.f103622b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j11) {
        super(new a(context, str), j11);
    }
}
