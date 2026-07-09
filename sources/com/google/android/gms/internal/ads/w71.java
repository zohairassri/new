package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class w71 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w71 f37186b = new w71(0, 0, 1, 1, 0, false, true, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AudioAttributes f37187a;

    static {
        String str = yy2.f38899a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    /* synthetic */ w71(int i11, int i12, int i13, int i14, int i15, boolean z11, boolean z12, byte[] bArr) {
    }

    public final AudioAttributes a() {
        if (this.f37187a == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i11 = Build.VERSION.SDK_INT;
            usage.setAllowedCapturePolicy(1);
            usage.setHapticChannelsMuted(true);
            if (i11 >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.f37187a = usage.build();
        }
        return this.f37187a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w71.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }
}
