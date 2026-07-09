package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class kn0 extends ie3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SensorManager f29769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f29770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Display f29771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f29772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f29773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f29774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f29775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private jn0 f29776h;

    kn0(Context context) {
        super("OrientationMonitor", "ads");
        this.f29769a = (SensorManager) context.getSystemService("sensor");
        this.f29771c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.f29772d = new float[9];
        this.f29773e = new float[9];
        this.f29770b = new Object();
    }

    @Override // com.google.android.gms.internal.ads.ie3
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f29770b) {
            try {
                if (this.f29774f == null) {
                    this.f29774f = new float[9];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        float[] fArr2 = this.f29772d;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f29771c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(fArr2, 2, 129, this.f29773e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(fArr2, 129, 130, this.f29773e);
        } else if (rotation != 3) {
            System.arraycopy(fArr2, 0, this.f29773e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(fArr2, 130, 1, this.f29773e);
        }
        float[] fArr3 = this.f29773e;
        float f11 = fArr3[1];
        fArr3[1] = fArr3[3];
        fArr3[3] = f11;
        float f12 = fArr3[2];
        fArr3[2] = fArr3[6];
        fArr3[6] = f12;
        float f13 = fArr3[5];
        fArr3[5] = fArr3[7];
        fArr3[7] = f13;
        synchronized (this.f29770b) {
            System.arraycopy(fArr3, 0, this.f29774f, 0, 9);
        }
        jn0 jn0Var = this.f29776h;
        if (jn0Var != null) {
            jn0Var.zza();
        }
    }

    final void b() {
        if (this.f29775g != null) {
            return;
        }
        SensorManager sensorManager = this.f29769a;
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (defaultSensor == null) {
            int i11 = bm.k1.f14837b;
            cm.o.c("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        fe3 fe3Var = new fe3(handlerThread.getLooper());
        this.f29775g = fe3Var;
        if (sensorManager.registerListener(this, defaultSensor, 0, fe3Var)) {
            return;
        }
        int i12 = bm.k1.f14837b;
        cm.o.c("SensorManager.registerListener failed.");
        c();
    }

    final void c() {
        if (this.f29775g == null) {
            return;
        }
        this.f29769a.unregisterListener(this);
        this.f29775g.post(new in0(this));
        this.f29775g = null;
    }

    final void d(jn0 jn0Var) {
        this.f29776h = jn0Var;
    }

    final boolean e(float[] fArr) {
        synchronized (this.f29770b) {
            try {
                float[] fArr2 = this.f29774f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
