package r3;

import android.graphics.Paint;
import f2.x1;
import f2.y1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Paint.Cap a(int i11) {
        x1.a aVar = x1.f93458a;
        return x1.e(i11, aVar.a()) ? Paint.Cap.BUTT : x1.e(i11, aVar.b()) ? Paint.Cap.ROUND : x1.e(i11, aVar.c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    public static final Paint.Join b(int i11) {
        y1.a aVar = y1.f93464a;
        return y1.e(i11, aVar.b()) ? Paint.Join.MITER : y1.e(i11, aVar.c()) ? Paint.Join.ROUND : y1.e(i11, aVar.a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
