package com.google.android.gms.internal.ads;

import android.graphics.Color;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class n20 extends v20 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f31172i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f31173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f31174m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f31176b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f31177c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f31179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f31180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f31181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f31182h;

    static {
        int iRgb = Color.rgb(12, 174, FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEOUTERCORNER);
        f31172i = iRgb;
        f31173l = Color.rgb(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEPUPILS, FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEPUPILS, FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEPUPILS);
        f31174m = iRgb;
    }

    public n20(String str, List list, Integer num, Integer num2, Integer num3, int i11, int i12, boolean z11) {
        this.f31175a = str;
        for (int i13 = 0; i13 < list.size(); i13++) {
            p20 p20Var = (p20) list.get(i13);
            this.f31176b.add(p20Var);
            this.f31177c.add(p20Var);
        }
        this.f31178d = num != null ? num.intValue() : f31173l;
        this.f31179e = num2 != null ? num2.intValue() : f31174m;
        this.f31180f = num3 != null ? num3.intValue() : 12;
        this.f31181g = i11;
        this.f31182h = i12;
    }

    public final int o7() {
        return this.f31180f;
    }

    public final int p7() {
        return this.f31181g;
    }

    @Override // com.google.android.gms.internal.ads.w20
    public final String zzb() {
        return this.f31175a;
    }

    @Override // com.google.android.gms.internal.ads.w20
    public final List zzc() {
        return this.f31177c;
    }

    public final List zzd() {
        return this.f31176b;
    }

    public final int zze() {
        return this.f31178d;
    }

    public final int zzf() {
        return this.f31179e;
    }

    public final int zzi() {
        return this.f31182h;
    }
}
