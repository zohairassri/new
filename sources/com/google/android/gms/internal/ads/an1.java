package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public interface an1 {
    void T(String str);

    void a();

    int b();

    void c(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void d(View view, Map map);

    void e(View view);

    void f(t40 t40Var);

    JSONObject g(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void h(View view, View view2, Map map, Map map2, boolean z11, ImageView.ScaleType scaleType, int i11);

    void i(Bundle bundle);

    boolean j();

    boolean k(Bundle bundle);

    void l();

    void m(yl.y0 y0Var);

    void n();

    void o(View view, MotionEvent motionEvent, View view2);

    JSONObject p(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void q(View view, View view2, Map map, Map map2, boolean z11, ImageView.ScaleType scaleType);

    void r(yl.v0 v0Var);

    void s(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void t(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void v0(Bundle bundle);

    void zzg();

    boolean zzh();

    void zzn();

    void zzq();
}
