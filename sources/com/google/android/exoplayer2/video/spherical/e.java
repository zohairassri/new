package com.google.android.exoplayer2.video.spherical;

import android.opengl.GLES20;
import android.util.Log;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.video.spherical.c;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f21809j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float[] f21810k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f21811l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f21812m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f21813n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f21815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f21816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.exoplayer2.util.b f21817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21822i;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f21823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FloatBuffer f21824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final FloatBuffer f21825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f21826d;

        public a(c.b bVar) {
            this.f21823a = bVar.a();
            this.f21824b = GlUtil.e(bVar.f21807c);
            this.f21825c = GlUtil.e(bVar.f21808d);
            int i11 = bVar.f21806b;
            if (i11 == 1) {
                this.f21826d = 5;
            } else if (i11 != 2) {
                this.f21826d = 4;
            } else {
                this.f21826d = 6;
            }
        }
    }

    e() {
    }

    public static boolean c(c cVar) {
        c.a aVar = cVar.f21800a;
        c.a aVar2 = cVar.f21801b;
        return aVar.b() == 1 && aVar.a(0).f21805a == 0 && aVar2.b() == 1 && aVar2.a(0).f21805a == 0;
    }

    public void a(int i11, float[] fArr, boolean z11) {
        a aVar = z11 ? this.f21816c : this.f21815b;
        if (aVar == null) {
            return;
        }
        int i12 = this.f21814a;
        GLES20.glUniformMatrix3fv(this.f21819f, 1, false, i12 == 1 ? z11 ? f21811l : f21810k : i12 == 2 ? z11 ? f21813n : f21812m : f21809j, 0);
        GLES20.glUniformMatrix4fv(this.f21818e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i11);
        GLES20.glUniform1i(this.f21822i, 0);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e11) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e11);
        }
        GLES20.glVertexAttribPointer(this.f21820g, 3, 5126, false, 12, (Buffer) aVar.f21824b);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e12) {
            Log.e("ProjectionRenderer", "Failed to load position data", e12);
        }
        GLES20.glVertexAttribPointer(this.f21821h, 2, 5126, false, 8, (Buffer) aVar.f21825c);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e13) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e13);
        }
        GLES20.glDrawArrays(aVar.f21826d, 0, aVar.f21823a);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e14) {
            Log.e("ProjectionRenderer", "Failed to render", e14);
        }
    }

    public void b() {
        try {
            com.google.android.exoplayer2.util.b bVar = new com.google.android.exoplayer2.util.b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f21817d = bVar;
            this.f21818e = bVar.j("uMvpMatrix");
            this.f21819f = this.f21817d.j("uTexMatrix");
            this.f21820g = this.f21817d.e("aPosition");
            this.f21821h = this.f21817d.e("aTexCoords");
            this.f21822i = this.f21817d.j("uTexture");
        } catch (GlUtil.GlException e11) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e11);
        }
    }

    public void d(c cVar) {
        if (c(cVar)) {
            this.f21814a = cVar.f21802c;
            a aVar = new a(cVar.f21800a.a(0));
            this.f21815b = aVar;
            if (!cVar.f21803d) {
                aVar = new a(cVar.f21801b.a(0));
            }
            this.f21816c = aVar;
        }
    }
}
