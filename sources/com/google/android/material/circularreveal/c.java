package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public interface c extends b.a {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class b implements TypeEvaluator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator f44382b = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f44383a = new e();

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f11, e eVar, e eVar2) {
            this.f44383a.b(eo.a.d(eVar.f44386a, eVar2.f44386a, f11), eo.a.d(eVar.f44387b, eVar2.f44387b, f11), eo.a.d(eVar.f44388c, eVar2.f44388c, f11));
            return this.f44383a;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class C0326c extends Property {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property f44384a = new C0326c("circularReveal");

        private C0326c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(c cVar) {
            return cVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c cVar, e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class d extends Property {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property f44385a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f44386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f44387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f44388c;

        public boolean a() {
            return this.f44388c == Float.MAX_VALUE;
        }

        public void b(float f11, float f12, float f13) {
            this.f44386a = f11;
            this.f44387b = f12;
            this.f44388c = f13;
        }

        public void c(e eVar) {
            b(eVar.f44386a, eVar.f44387b, eVar.f44388c);
        }

        private e() {
        }

        public e(float f11, float f12, float f13) {
            this.f44386a = f11;
            this.f44387b = f12;
            this.f44388c = f13;
        }

        public e(e eVar) {
            this(eVar.f44386a, eVar.f44387b, eVar.f44388c);
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i11);

    void setRevealInfo(e eVar);
}
