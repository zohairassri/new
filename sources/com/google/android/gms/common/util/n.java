package com.google.android.gms.common.util;

import com.amazonaws.services.s3.internal.Constants;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class n {
    public static void a(StringBuilder sb2, HashMap map) {
        sb2.append("{");
        boolean z11 = true;
        for (String str : map.keySet()) {
            if (!z11) {
                sb2.append(",");
            }
            String str2 = (String) map.get(str);
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append(Constants.NULL_VERSION_ID);
            } else {
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\"");
            }
            z11 = false;
        }
        sb2.append("}");
    }
}
