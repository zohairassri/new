package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.e;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgi {
    private final Context zza;
    private AdsRenderingSettings zzb;

    public zzgi(Context context, AdsRenderingSettings adsRenderingSettings) {
        this.zza = context;
        this.zzb = adsRenderingSettings;
    }

    private static final boolean zzc(String str, Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public final void zza(AdsRenderingSettings adsRenderingSettings) {
        this.zzb = adsRenderingSettings;
    }

    public final boolean zzb(String str) {
        if (zzqm.zzc(str)) {
            return false;
        }
        Context context = this.zza;
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo == null) {
            return false;
        }
        if (!this.zzb.getEnableCustomTabs()) {
            return zzc(str, this.zza);
        }
        new e.d().a().a(this.zza, Uri.parse(str));
        return true;
    }
}
