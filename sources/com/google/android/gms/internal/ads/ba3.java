package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ba3 implements y93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f23762a = new int[2];

    @Override // com.google.android.gms.internal.ads.y93
    public final void a(View view, JSONObject jSONObject, x93 x93Var, boolean z11, boolean z12) {
        int i11;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z11) {
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    x93Var.a(viewGroup.getChildAt(i12), this, jSONObject, z12);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                View childAt = viewGroup.getChildAt(i13);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i14 = 0;
            while (i14 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i14));
                int size2 = arrayList3.size();
                int i15 = 0;
                while (true) {
                    i11 = i14 + 1;
                    if (i15 < size2) {
                        x93Var.a((View) arrayList3.get(i15), this, jSONObject, z12);
                        i15++;
                    }
                }
                i14 = i11;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.y93
    public final JSONObject zza(View view) {
        if (view == null) {
            return ja3.b(0, 0, 0, 0);
        }
        int[] iArr = this.f23762a;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return ja3.b(iArr[0], iArr[1], width, height);
    }
}
