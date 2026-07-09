package a5;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f179a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InputContentInfo f180a;

        a(Object obj) {
            this.f180a = (InputContentInfo) obj;
        }

        @Override // a5.d.b
        public Object a() {
            return this.f180a;
        }

        @Override // a5.d.b
        public Uri b() {
            return this.f180a.getContentUri();
        }

        @Override // a5.d.b
        public void c() {
            this.f180a.requestPermission();
        }

        @Override // a5.d.b
        public Uri d() {
            return this.f180a.getLinkUri();
        }

        @Override // a5.d.b
        public ClipDescription getDescription() {
            return this.f180a.getDescription();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private interface b {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    private d(b bVar) {
        this.f179a = bVar;
    }

    public static d f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(new a(obj));
    }

    public Uri a() {
        return this.f179a.b();
    }

    public ClipDescription b() {
        return this.f179a.getDescription();
    }

    public Uri c() {
        return this.f179a.d();
    }

    public void d() {
        this.f179a.c();
    }

    public Object e() {
        return this.f179a.a();
    }
}
