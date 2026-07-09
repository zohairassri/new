package ud;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f131318a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f131318a.add(imageHeaderParser);
    }

    public synchronized List b() {
        return this.f131318a;
    }
}
