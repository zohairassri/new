package s5;

import android.text.Editable;
import androidx.emoji2.text.n;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f125550a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f125551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f125552c;

    private b() {
        try {
            f125552c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f125551b == null) {
            synchronized (f125550a) {
                try {
                    if (f125551b == null) {
                        f125551b = new b();
                    }
                } finally {
                }
            }
        }
        return f125551b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f125552c;
        return cls != null ? n.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
