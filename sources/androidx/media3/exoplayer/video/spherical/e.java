package androidx.media3.exoplayer.video.spherical;

import android.opengl.GLES20;
import android.util.Log;
import androidx.media3.common.util.GlUtil;
import androidx.media3.exoplayer.video.spherical.c;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f10866j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float[] f10867k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f10868l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f10869m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f10870n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f10872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f10873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media3.common.util.b f10874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f10877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10879i;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FloatBuffer f10881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final FloatBuffer f10882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f10883d;

        public a(c.b bVar) {
            this.f10880a = bVar.a();
            this.f10881b = GlUtil.e(bVar.f10864c);
            this.f10882c = GlUtil.e(bVar.f10865d);
            int i11 = bVar.f10863b;
            if (i11 == 1) {
                this.f10883d = 5;
            } else if (i11 != 2) {
                this.f10883d = 4;
            } else {
                this.f10883d = 6;
            }
        }
    }

    e() {
    }

    public static boolean c(c cVar) {
        c.a aVar = cVar.f10857a;
        c.a aVar2 = cVar.f10858b;
        return aVar.b() == 1 && aVar.a(0).f10862a == 0 && aVar2.b() == 1 && aVar2.a(0).f10862a == 0;
    }

    public void a(int i11, float[] fArr, boolean z11) {
        a aVar = z11 ? this.f10873c : this.f10872b;
        if (aVar == null) {
            return;
        }
        int i12 = this.f10871a;
        GLES20.glUniformMatrix3fv(this.f10876f, 1, false, i12 == 1 ? z11 ? f10868l : f10867k : i12 == 2 ? z11 ? f10870n : f10869m : f10866j, 0);
        GLES20.glUniformMatrix4fv(this.f10875e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i11);
        GLES20.glUniform1i(this.f10879i, 0);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e11) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e11);
        }
        GLES20.glVertexAttribPointer(this.f10877g, 3, 5126, false, 12, (Buffer) aVar.f10881b);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e12) {
            Log.e("ProjectionRenderer", "Failed to load position data", e12);
        }
        GLES20.glVertexAttribPointer(this.f10878h, 2, 5126, false, 8, (Buffer) aVar.f10882c);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e13) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e13);
        }
        GLES20.glDrawArrays(aVar.f10883d, 0, aVar.f10880a);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e14) {
            Log.e("ProjectionRenderer", "Failed to render", e14);
        }
    }

    public void b() {
        try {
            androidx.media3.common.util.b bVar = new androidx.media3.common.util.b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f10874d = bVar;
            this.f10875e = bVar.j("uMvpMatrix");
            this.f10876f = this.f10874d.j("uTexMatrix");
            this.f10877g = this.f10874d.e("aPosition");
            this.f10878h = this.f10874d.e("aTexCoords");
            this.f10879i = this.f10874d.j("uTexture");
        } catch (GlUtil.GlException e11) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e11);
        }
    }

    public void d(c cVar) {
        if (c(cVar)) {
            this.f10871a = cVar.f10859c;
            a aVar = new a(cVar.f10857a.a(0));
            this.f10872b = aVar;
            if (!cVar.f10860d) {
                aVar = new a(cVar.f10858b.a(0));
            }
            this.f10873c = aVar;
        }
    }
}
