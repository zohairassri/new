package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class eg3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static eg3 f25733c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f25735b;

    private eg3(Context context) {
        this.f25734a = context.getPackageName();
        this.f25735b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static eg3 a(Context context) {
        if (f25733c == null) {
            f25733c = new eg3(context);
        }
        return f25733c;
    }

    final void b(String str, Object obj) throws IOException {
        boolean zCommit;
        if (obj instanceof String) {
            zCommit = this.f25735b.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = this.f25735b.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            zCommit = this.f25735b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                String strValueOf = String.valueOf(obj.getClass());
                String str2 = this.f25734a;
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 33 + String.valueOf(str2).length());
                sb2.append("Unexpected object class ");
                sb2.append(strValueOf);
                sb2.append(" for app ");
                sb2.append(str2);
                Log.e("GpidLifecycleSPHandler", sb2.toString());
                String str3 = this.f25734a;
                StringBuilder sb3 = new StringBuilder(str.length() + 25 + String.valueOf(str3).length());
                sb3.append("Failed to store ");
                sb3.append(str);
                sb3.append(" for app ");
                sb3.append(str3);
                throw new IOException(sb3.toString());
            }
            zCommit = this.f25735b.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (zCommit) {
            return;
        }
        String str32 = this.f25734a;
        StringBuilder sb32 = new StringBuilder(str.length() + 25 + String.valueOf(str32).length());
        sb32.append("Failed to store ");
        sb32.append(str);
        sb32.append(" for app ");
        sb32.append(str32);
        throw new IOException(sb32.toString());
    }

    final String c(String str, String str2) {
        return this.f25735b.getString(str, null);
    }

    final long d(String str, long j11) {
        return this.f25735b.getLong(str, -1L);
    }

    final boolean e(String str, boolean z11) {
        return this.f25735b.getBoolean(str, true);
    }

    final void f(String str) throws IOException {
        if (this.f25735b.edit().remove(str).commit()) {
            return;
        }
        String str2 = this.f25734a;
        StringBuilder sb2 = new StringBuilder(str.length() + 26 + String.valueOf(str2).length());
        sb2.append("Failed to remove ");
        sb2.append(str);
        sb2.append(" for app ");
        sb2.append(str2);
        throw new IOException(sb2.toString());
    }

    final boolean g(String str) {
        return this.f25735b.contains(str);
    }
}
