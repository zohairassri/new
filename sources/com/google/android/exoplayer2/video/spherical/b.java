package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class b implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f21793a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f21794b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f21795c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f21796d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Display f21797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a[] f21798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21799g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void a(float[] fArr, float f11);
    }

    public b(Display display, a... aVarArr) {
        this.f21797e = display;
        this.f21798f = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f21794b);
        SensorManager.getOrientation(this.f21794b, this.f21796d);
        return this.f21796d[2];
    }

    private void b(float[] fArr, float f11) {
        for (a aVar : this.f21798f) {
            aVar.a(fArr, f11);
        }
    }

    private void c(float[] fArr) {
        if (!this.f21799g) {
            com.google.android.exoplayer2.video.spherical.a.a(this.f21795c, fArr);
            this.f21799g = true;
        }
        float[] fArr2 = this.f21794b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f21794b, 0, this.f21795c, 0);
    }

    private void d(float[] fArr, int i11) {
        if (i11 != 0) {
            int i12 = 129;
            int i13 = 1;
            if (i11 == 1) {
                i13 = 129;
                i12 = 2;
            } else if (i11 == 2) {
                i13 = 130;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException();
                }
                i12 = 130;
            }
            float[] fArr2 = this.f21794b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f21794b, i12, i13, fArr);
        }
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f21793a, sensorEvent.values);
        d(this.f21793a, this.f21797e.getRotation());
        float fA = a(this.f21793a);
        e(this.f21793a);
        c(this.f21793a);
        b(this.f21793a, fA);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
    }
}
