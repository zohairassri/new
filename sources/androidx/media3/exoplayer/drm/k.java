package androidx.media3.exoplayer.drm;

import android.media.MediaDrmException;
import androidx.media3.exoplayer.drm.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements m {
    @Override // androidx.media3.exoplayer.drm.m
    public Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public m.d b() {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void d(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void e(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public int f() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.m
    public p6.b g(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public boolean h(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public m.a k(byte[] bArr, List list, int i11, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void release() {
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void i(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void m(m.b bVar) {
    }
}
