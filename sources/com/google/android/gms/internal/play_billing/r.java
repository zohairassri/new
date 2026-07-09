package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f42540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p f42541c;

    /* synthetic */ r(String str, s sVar) {
        p pVar = new p();
        this.f42540b = pVar;
        this.f42541c = pVar;
        str.getClass();
        this.f42539a = str;
    }

    public final r a(Object obj) {
        p pVar = new p();
        this.f42541c.f42513b = pVar;
        this.f42541c = pVar;
        pVar.f42512a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f42539a);
        sb2.append('{');
        p pVar = this.f42540b.f42513b;
        String str = "";
        while (pVar != null) {
            Object obj = pVar.f42512a;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            }
            pVar = pVar.f42513b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
