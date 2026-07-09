package dw;

import android.content.res.Resources;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final /* synthetic */ h[] f90574o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f90575p0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f90582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f90557b = new h("LinkGateway", 0, uv.f.subauth_lnk_gateway);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f90558c = new h("LinkMeter", 1, uv.f.subauth_lnk_meter);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f90559d = new h("LinkWelcome", 2, uv.f.subauth_lnk_welcome);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f90560e = new h("LinkOverflow", 3, uv.f.subauth_lnk_overflow);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f90561f = new h("LinkAd", 4, uv.f.subauth_lnk_ad);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f90562g = new h("LinkDlSubscribe", 5, uv.f.subauth_lnk_dl_subscribe);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f90563h = new h("RegiOverflow", 6, uv.f.subauth_reg_overflow);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f90564i = new h("RegiGrowl", 7, uv.f.subauth_reg_growl);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f90568l = new h("RegiSaveSection", 8, uv.f.subauth_reg_savesection);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f90570m = new h("RegiSavePrompt", 9, uv.f.subauth_reg_saveprompt);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f90572n = new h("RegiGateway", 10, uv.f.subauth_reg_gateway);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f90576r = new h("RegiMeter", 11, uv.f.subauth_reg_meter);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h f90577s = new h("RegiSettings", 12, uv.f.subauth_reg_settings);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h f90578v = new h("RegiWelcome", 13, uv.f.subauth_reg_welcome);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h f90579w = new h("RegiComments", 14, uv.f.subauth_regi_comments);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h f90580x = new h("RegiCooking", 15, uv.f.subauth_regi_cooking);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final h f90581y = new h("RegiForcedLogout", 16, uv.f.subauth_regi_forcedlogout);
    public static final h B = new h("RegiRecentPrompt", 17, uv.f.subauth_regi_recentlyviewed_prompt);
    public static final h N = new h("RegiFollow", 18, uv.f.subauth_regi_follow);
    public static final h S = new h("AudioRegiOnboarding", 19, uv.f.subauth_audio_regi_onboarding);
    public static final h X = new h("AudioRegiFollowing", 20, uv.f.subauth_audio_regi_following);
    public static final h Y = new h("AudioRegiQueue", 21, uv.f.subauth_audio_regi_queue);
    public static final h Z = new h("AudioRegiSettings", 22, uv.f.subauth_audio_regi_settings);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h f90565i0 = new h("GamesRegiWelcome", 23, uv.f.subauth_games_regi_welcome);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h f90566j0 = new h("GamesRegiArchive", 24, uv.f.subauth_games_regi_archive);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h f90567k0 = new h("GamesRegiLeaderboard", 25, uv.f.subauth_games_regi_leaderboard);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h f90569l0 = new h("GamesRegiSettings", 26, uv.f.subauth_games_regi_settings);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h f90571m0 = new h("GamesRegiExpansionGame", 27, uv.f.subauth_games_regi_expansion_game);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h f90573n0 = new h("GamesRegiDefault", 28, uv.f.subauth_games_regi_default);

    static {
        h[] hVarArrA = a();
        f90574o0 = hVarArrA;
        f90575p0 = cf0.b.a(hVarArrA);
    }

    private h(String str, int i11, int i12) {
        this.f90582a = i12;
    }

    private static final /* synthetic */ h[] a() {
        return new h[]{f90557b, f90558c, f90559d, f90560e, f90561f, f90562g, f90563h, f90564i, f90568l, f90570m, f90572n, f90576r, f90577s, f90578v, f90579w, f90580x, f90581y, B, N, S, X, Y, Z, f90565i0, f90566j0, f90567k0, f90569l0, f90571m0, f90573n0};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f90574o0.clone();
    }

    public final String b(Resources resources) {
        if (resources == null) {
            return null;
        }
        return resources.getString(uv.f.subauth_regi_info_prefix) + resources.getString(this.f90582a);
    }
}
