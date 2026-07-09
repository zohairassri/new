package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.l1;
import com.google.android.gms.common.internal.m1;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class t extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22901a;

    protected t(byte[] bArr) {
        com.google.android.gms.common.internal.n.a(bArr.length == 25);
        this.f22901a = Arrays.hashCode(bArr);
    }

    protected static byte[] k1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e11) {
            throw new AssertionError(e11);
        }
    }

    abstract byte[] I0();

    public final boolean equals(Object obj) {
        com.google.android.gms.dynamic.a aVarZzd;
        if (!(obj instanceof m1)) {
            return false;
        }
        try {
            m1 m1Var = (m1) obj;
            if (m1Var.zze() == this.f22901a && (aVarZzd = m1Var.zzd()) != null) {
                return Arrays.equals(I0(), (byte[]) com.google.android.gms.dynamic.b.I0(aVarZzd));
            }
            return false;
        } catch (RemoteException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return false;
        }
    }

    public final int hashCode() {
        return this.f22901a;
    }

    @Override // com.google.android.gms.common.internal.m1
    public final com.google.android.gms.dynamic.a zzd() {
        return com.google.android.gms.dynamic.b.k1(I0());
    }

    @Override // com.google.android.gms.common.internal.m1
    public final int zze() {
        return this.f22901a;
    }
}
