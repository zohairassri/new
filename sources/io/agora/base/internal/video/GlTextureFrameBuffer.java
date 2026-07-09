package io.agora.base.internal.video;

import android.opengl.GLES20;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class GlTextureFrameBuffer {
    private int frameBufferId;
    private int height;
    private final int pixelFormat;
    private int textureId;
    private int width;

    public GlTextureFrameBuffer(int i11) {
        if (i11 != 34842) {
            switch (i11) {
                case 6407:
                case 6408:
                case 6409:
                    break;
                default:
                    throw new IllegalArgumentException("Invalid pixel format: " + i11);
            }
        }
        this.pixelFormat = i11;
        this.width = 0;
        this.height = 0;
    }

    public void bindTexture(int i11, int i12, int i13, int i14, boolean z11) {
        if (!z11 && i13 == this.width && i14 == this.height && this.textureId == i11) {
            return;
        }
        this.textureId = i11;
        this.width = i13;
        this.height = i14;
        if (this.frameBufferId == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.frameBufferId = iArr[0];
        }
        GLES20.glBindFramebuffer(36160, this.frameBufferId);
        GLES20.glFramebufferTexture2D(36160, 36064, i12, i11, 0);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            GLES20.glBindFramebuffer(36160, 0);
            return;
        }
        throw new IllegalStateException("Framebuffer not complete, status: " + iGlCheckFramebufferStatus);
    }

    public int getFrameBufferId() {
        return this.frameBufferId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.textureId;
    }

    public int getWidth() {
        return this.width;
    }

    public void release() {
        GLES20.glDeleteTextures(1, new int[]{this.textureId}, 0);
        this.textureId = 0;
        GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
        this.frameBufferId = 0;
        this.width = 0;
        this.height = 0;
    }

    public void setSize(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Invalid size: " + i11 + "x" + i12);
        }
        if (i11 == this.width && i12 == this.height) {
            return;
        }
        int iGenerateTexture = this.textureId;
        if (iGenerateTexture == 0) {
            iGenerateTexture = GlUtil.generateTexture(3553);
        }
        int i13 = iGenerateTexture;
        if (this.frameBufferId == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.frameBufferId = iArr[0];
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i13);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        int i14 = this.pixelFormat;
        if (i14 != 34842) {
            GLES20.glTexImage2D(3553, 0, i14, i11, i12, 0, i14, 5121, null);
        } else {
            if (!HdrUtil.isSupportedEGL3()) {
                throw new IllegalArgumentException("not support hdr");
            }
            GLES20.glTexImage2D(3553, 0, 34842, i11, i12, 0, 6408, 5126, null);
            GlUtil.checkNoGLES2Error("GlTextureFrameBuffer glTexImage2D GL_RGBA16F");
        }
        GLES20.glBindTexture(3553, 0);
        GlUtil.checkNoGLES2Error("GlTextureFrameBuffer setSize");
        bindTexture(i13, 3553, i11, i12, false);
    }
}
