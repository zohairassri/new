package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a62 {
    public static void a(MediaFormat mediaFormat, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 4);
            sb2.append("csd-");
            sb2.append(i11);
            mediaFormat.setByteBuffer(sb2.toString(), ByteBuffer.wrap((byte[]) list.get(i11)));
        }
    }

    public static void b(MediaFormat mediaFormat, String str, int i11) {
        if (i11 != -1) {
            mediaFormat.setInteger(str, i11);
        }
    }
}
