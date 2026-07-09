package hm;

import com.google.android.gms.internal.ads.jv;
import com.google.android.gms.internal.ads.zzcdh;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f102264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f102265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zzcdh f102266c;

    /* synthetic */ a0(z zVar, byte[] bArr) {
        this.f102264a = zVar.d();
        this.f102265b = zVar.e();
        this.f102266c = zVar.f();
    }

    public final Set a() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f102264a.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String b() {
        return this.f102264a.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final jv c() {
        String str = this.f102264a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    return jv.AD_LOADER;
                }
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    return jv.INTERSTITIAL;
                }
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    return jv.REWARD_BASED_VIDEO_AD;
                }
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    return jv.BANNER;
                }
                break;
        }
        return jv.AD_INITIATER_UNSPECIFIED;
    }

    final String d() {
        return this.f102265b;
    }

    final zzcdh e() {
        return this.f102266c;
    }
}
