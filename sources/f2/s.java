package f2;

import android.graphics.Shader;
import android.os.Build;
import f2.z1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final Shader.TileMode a(int i11) {
        z1.a aVar = z1.f93469a;
        return z1.f(i11, aVar.a()) ? Shader.TileMode.CLAMP : z1.f(i11, aVar.d()) ? Shader.TileMode.REPEAT : z1.f(i11, aVar.c()) ? Shader.TileMode.MIRROR : z1.f(i11, aVar.b()) ? Build.VERSION.SDK_INT >= 31 ? b2.f93349a.a() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }
}
