package com.google.android.exoplayer2.video;

import ak.i;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.b;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import nl.h;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21749b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f21750a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final float[] f21751l = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final float[] f21752m = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final float[] f21753n = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String[] f21754r = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final FloatBuffer f21755s = GlUtil.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final GLSurfaceView f21756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f21757b = new int[3];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f21758c = new int[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f21759d = new int[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f21760e = new int[3];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AtomicReference f21761f = new AtomicReference();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final FloatBuffer[] f21762g = new FloatBuffer[3];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private b f21763h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f21764i;

        public a(GLSurfaceView gLSurfaceView) {
            this.f21756a = gLSurfaceView;
            for (int i11 = 0; i11 < 3; i11++) {
                int[] iArr = this.f21759d;
                this.f21760e[i11] = -1;
                iArr[i11] = -1;
            }
        }

        private void b() {
            try {
                GLES20.glGenTextures(3, this.f21757b, 0);
                for (int i11 = 0; i11 < 3; i11++) {
                    GLES20.glUniform1i(this.f21763h.j(f21754r[i11]), i11);
                    GLES20.glActiveTexture(33984 + i11);
                    GlUtil.a(3553, this.f21757b[i11]);
                }
                GlUtil.b();
            } catch (GlUtil.GlException e11) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e11);
            }
        }

        public void a(i iVar) {
            android.support.v4.media.a.a(this.f21761f.getAndSet(iVar));
            this.f21756a.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            android.support.v4.media.a.a(this.f21761f.getAndSet(null));
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i11, int i12) {
            GLES20.glViewport(0, 0, i11, i12);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                b bVar = new b("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f21763h = bVar;
                GLES20.glVertexAttribPointer(bVar.e("in_pos"), 2, 5126, false, 0, (Buffer) f21755s);
                this.f21758c[0] = this.f21763h.e("in_tc_y");
                this.f21758c[1] = this.f21763h.e("in_tc_u");
                this.f21758c[2] = this.f21763h.e("in_tc_v");
                this.f21764i = this.f21763h.j("mColorConversion");
                GlUtil.b();
                b();
                GlUtil.b();
            } catch (GlUtil.GlException e11) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e11);
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    public void setOutputBuffer(i iVar) {
        this.f21750a.a(iVar);
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f21750a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public h getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
