package ob;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends androidx.vectordrawable.graphics.drawable.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f120260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f120261c;

        a(Function0 function0, Function0 function02) {
            this.f120260b = function0;
            this.f120261c = function02;
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            Function0 function0 = this.f120261c;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            Function0 function0 = this.f120260b;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final androidx.vectordrawable.graphics.drawable.b a(Function0 function0, Function0 function02) {
        return new a(function0, function02);
    }

    public static final boolean b(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }
}
