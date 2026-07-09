package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class pt1 {
    public static boolean a(Context context) {
        return g("EGL_EXT_protected_content");
    }

    public static boolean b() {
        return g("EGL_KHR_surfaceless_context");
    }

    public static boolean c(int i11) {
        if (i11 == 6) {
            return d();
        }
        if (i11 == 7) {
            return g("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        return true;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 33 && g("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static void e() throws zzdu {
        StringBuilder sb2 = new StringBuilder();
        l04 l04Var = new l04();
        boolean z11 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z11) {
                sb2.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            l04Var.g(Integer.valueOf(iGlGetError));
            z11 = true;
        }
        if (z11) {
            throw new zzdu(sb2.toString(), l04Var.j());
        }
    }

    public static void f(boolean z11, String str) throws zzdu {
        if (!z11) {
            throw new zzdu(str, o04.p());
        }
    }

    private static boolean g(String str) throws zzdu {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        f(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        f(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        e();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }
}
