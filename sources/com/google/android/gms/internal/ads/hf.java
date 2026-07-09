package com.google.android.gms.internal.ads;

import com.amazonaws.event.ProgressEvent;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f27684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f27685e;

    public hf(int i11, String str, int i12, List list, byte[] bArr) {
        this.f27681a = i11;
        this.f27682b = str;
        this.f27683c = i12;
        this.f27684d = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.f27685e = bArr;
    }

    public final int a() {
        int i11 = this.f27683c;
        if (i11 == 2) {
            return ProgressEvent.PART_COMPLETED_EVENT_CODE;
        }
        if (i11 != 3) {
            return 0;
        }
        return AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER;
    }
}
