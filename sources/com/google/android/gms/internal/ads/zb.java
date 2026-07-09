package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.theathletic.pushnotification.component.data.remote.PushNotificationRePromptRemoteDataStore;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39116f;

    private zb(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f39111a = i11;
        this.f39112b = i12;
        this.f39113c = i13;
        this.f39114d = i14;
        this.f39115e = i15;
        this.f39116f = i16;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zb a(String str) {
        jx3.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i11 >= length) {
                if (i13 == -1 || i14 == -1 || i16 == -1) {
                    return null;
                }
                return new zb(i12, i13, i14, i15, i16, length);
            }
            String strA = sw3.a(strArrSplit[i11].trim());
            switch (strA.hashCode()) {
                case 100571:
                    if (strA.equals("end")) {
                        i14 = i11;
                    }
                    break;
                case 3556653:
                    if (strA.equals("text")) {
                        i16 = i11;
                    }
                    break;
                case 102749521:
                    if (strA.equals("layer")) {
                        i12 = i11;
                    }
                    break;
                case 109757538:
                    if (strA.equals("start")) {
                        i13 = i11;
                    }
                    break;
                case 109780401:
                    if (strA.equals(PushNotificationRePromptRemoteDataStore.PARAM_STYLE)) {
                        i15 = i11;
                    }
                    break;
            }
            i11++;
        }
    }
}
