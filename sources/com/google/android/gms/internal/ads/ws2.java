package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ws2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zzbzu f37569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37570b;

    public ws2(zzbzu zzbzuVar, int i11) {
        this.f37569a = zzbzuVar;
        this.f37570b = i11;
    }

    public final String a() {
        return this.f37569a.f39649d;
    }

    public final String b() {
        return ay3.a(this.f37569a.f39646a.getString("ms"));
    }

    public final PackageInfo c() {
        return this.f37569a.f39651f;
    }

    public final List d() {
        return this.f37569a.f39650e;
    }

    public final String e() {
        return this.f37569a.f39653h;
    }

    public final int f() {
        return this.f37570b;
    }

    final boolean g() {
        return this.f37569a.f39656m;
    }

    final boolean h() {
        return this.f37569a.f39657n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final int i() {
        Bundle bundle = this.f37569a.f39646a.getBundle("extras");
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("query_info_type", "");
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        return 0;
                    }
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        return 1;
                    }
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        return 2;
                    }
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        return 3;
                    }
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        return 4;
                    }
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        return 5;
                    }
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        return 6;
                    }
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        return 7;
                    }
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        return 8;
                    }
                    break;
            }
        }
        return -1;
    }

    final int j() {
        return this.f37569a.f39660v;
    }
}
