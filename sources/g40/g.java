package g40;

import android.net.Uri;
import com.amazonaws.services.s3.internal.Constants;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b>\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0004J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u0019\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u0004J\u001b\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H&¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0002H&¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0002H&¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0002H&¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u0002H&¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0002H&¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u0002H&¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\u0002H&¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010*\u001a\u00020\u0002H&¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010+\u001a\u00020\u0002H&¢\u0006\u0004\b+\u0010\u0004J\u0017\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0011H&¢\u0006\u0004\b-\u0010\u0014J\u000f\u0010.\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010\u0004J\u000f\u0010/\u001a\u00020\u0002H&¢\u0006\u0004\b/\u0010\u0004J\u000f\u00100\u001a\u00020\u0002H&¢\u0006\u0004\b0\u0010\u0004J\u000f\u00101\u001a\u00020\u0002H&¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\u0002H&¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\u0002H&¢\u0006\u0004\b3\u0010\u0004J+\u00108\u001a\u00020\u00022\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\t2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b8\u00109J\u0019\u0010:\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u000104H&¢\u0006\u0004\b:\u0010;J#\u0010>\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\t2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b>\u0010?J!\u0010B\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\t2\b\b\u0002\u0010A\u001a\u00020\u0011H&¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bD\u0010\fJ\u000f\u0010E\u001a\u00020\u0002H&¢\u0006\u0004\bE\u0010\u0004J\u0017\u0010F\u001a\u00020\u00022\u0006\u00105\u001a\u000204H&¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00022\u0006\u00105\u001a\u000204H&¢\u0006\u0004\bH\u0010GJ\u0017\u0010J\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\tH&¢\u0006\u0004\bJ\u0010\fJ\u0017\u0010K\u001a\u00020\u00022\u0006\u00105\u001a\u000204H&¢\u0006\u0004\bK\u0010GJ\u0017\u0010M\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\tH&¢\u0006\u0004\bM\u0010\fJ\u0017\u0010O\u001a\u00020\u00022\u0006\u0010N\u001a\u000204H&¢\u0006\u0004\bO\u0010GJ\u0017\u0010P\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bP\u0010\fJ\u0017\u0010Q\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bQ\u0010\fJ\u000f\u0010R\u001a\u00020\u0002H&¢\u0006\u0004\bR\u0010\u0004J\u001f\u0010T\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\t2\u0006\u0010S\u001a\u00020\u0011H&¢\u0006\u0004\bT\u0010CJ#\u0010W\u001a\u00020\u00022\b\u0010U\u001a\u0004\u0018\u00010\t2\b\u0010V\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\bW\u0010?J\u0017\u0010Y\u001a\u00020\u00022\u0006\u0010X\u001a\u00020\tH&¢\u0006\u0004\bY\u0010\fJ\u0017\u0010Z\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\bZ\u0010\fJ\u000f\u0010[\u001a\u00020\u0002H&¢\u0006\u0004\b[\u0010\u0004J!\u0010^\u001a\u00020\u00022\u0006\u0010\\\u001a\u00020\t2\b\u0010]\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b^\u0010?J\u001f\u0010`\u001a\u00020\u00022\u0006\u0010_\u001a\u00020\t2\u0006\u0010\\\u001a\u00020\tH&¢\u0006\u0004\b`\u0010?J/\u0010c\u001a\u00020\u00022\u0006\u0010a\u001a\u00020\t2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\be\u0010\fJ!\u0010g\u001a\u00020\u00022\u0006\u00106\u001a\u00020\t2\b\u0010f\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\bg\u0010?J\u001b\u0010i\u001a\u00020\u00022\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\bi\u0010\fJ\u000f\u0010j\u001a\u00020\u0002H&¢\u0006\u0004\bj\u0010\u0004J\u000f\u0010k\u001a\u00020\u0002H&¢\u0006\u0004\bk\u0010\u0004J\u000f\u0010l\u001a\u00020\u0002H&¢\u0006\u0004\bl\u0010\u0004J\u000f\u0010m\u001a\u00020\u0002H&¢\u0006\u0004\bm\u0010\u0004J\u000f\u0010n\u001a\u00020\u0002H&¢\u0006\u0004\bn\u0010\u0004J\u000f\u0010o\u001a\u00020\u0002H&¢\u0006\u0004\bo\u0010\u0004J\u000f\u0010p\u001a\u00020\u0002H&¢\u0006\u0004\bp\u0010\u0004J\u000f\u0010q\u001a\u00020\u0002H&¢\u0006\u0004\bq\u0010\u0004¨\u0006rÀ\u0006\u0003"}, d2 = {"Lg40/g;", "", "", "m0", "()V", "X0", QueryKeys.TOKEN, "B0", "s0", "", Constants.URL_ENCODING, "a", "(Ljava/lang/String;)V", "Landroid/net/Uri;", "uri", "p0", "(Landroid/net/Uri;)V", "", "clearTask", "K", "(Z)V", QueryKeys.WRITING, "e0", "Y", "b0", "j1", "", "requestCode", "z0", "(Ljava/lang/Integer;)V", "email", "idHash", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "(Ljava/lang/String;Ljava/lang/String;I)V", "s", "P0", "U", "O", "S0", "Z0", "R0", QueryKeys.MAX_SCROLL_DEPTH, "T", QueryKeys.PAGE_LOAD_TIME, "allowBackPress", "C", QueryKeys.SDK_VERSION, "d1", QueryKeys.IDLING, QueryKeys.AUTHOR_G1, "b1", QueryKeys.HOST, "", "articleId", "source", "rawUrl", QueryKeys.ENGAGED_SECONDS, "(JLjava/lang/String;Ljava/lang/String;)V", "l0", "(Ljava/lang/Long;)V", "id", "postId", "J", "(Ljava/lang/String;Ljava/lang/String;)V", "storyId", "sourceGameHub", "W0", "(Ljava/lang/String;Z)V", "A", QueryKeys.SUBDOMAIN, "i1", "(J)V", QueryKeys.ACCOUNT_ID, "slugKey", "G", "f1", "gameId", "L0", "teamId", QueryKeys.EXTERNAL_REFERRER, "o0", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "v0", "isFirstTeamSelected", "V0", "playerSlug", "leagueString", "f0", "tag", "i0", "D0", QueryKeys.USER_ID, "leagueCode", "initialTab", "X", "leagueName", "M", "tournamentId", "commentId", "M0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "I0", "liveRoomId", "N", "roomToEditId", "F", "h0", "q0", "B", "u0", QueryKeys.SCREEN_WIDTH, "t0", "E0", "a0", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a {
    }

    static /* synthetic */ void C0(g gVar, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCreateLiveRoomActivity");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        gVar.F(str);
    }

    static /* synthetic */ void D(g gVar, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTournamentHubActivity");
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        gVar.M0(str, str2, str3);
    }

    static /* synthetic */ void Y0(g gVar, Integer num, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startManageAccountActivity");
        }
        if ((i11 & 1) != 0) {
            num = null;
        }
        gVar.z0(num);
    }

    static /* synthetic */ void r0(g gVar, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSlideStory");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        gVar.W0(str, z11);
    }

    static /* synthetic */ void w(g gVar, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startAuthenticationActivity");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        gVar.K(z11);
    }

    void A(String url);

    void B();

    void B0();

    void C(boolean allowBackPress);

    void D0(String url);

    void E(long articleId, String source, String rawUrl);

    void E0();

    void F(String roomToEditId);

    void G(String slugKey);

    void I();

    void I0(String url);

    void J(String id2, String postId);

    void K(boolean clearTask);

    void L0(String gameId);

    void M(String leagueName, String leagueCode);

    void M0(String tournamentId, String initialTab, String commentId);

    void N(String source, String liveRoomId);

    void O();

    void P0();

    void R0();

    void S();

    void S0();

    void T();

    void U();

    void V();

    void V0(String gameId, boolean isFirstTeamSelected);

    void W();

    void W0(String storyId, boolean sourceGameHub);

    void X(String leagueCode, String initialTab);

    void X0();

    void Y();

    void Z0();

    void a(String url);

    void a0();

    void b();

    void b0(String url);

    void b1();

    void c(String url);

    void d();

    void d1();

    void e(String email, String idHash, int requestCode);

    void e0();

    void f0(String playerSlug, String leagueString);

    void f1(long articleId);

    void g(long articleId);

    void g1();

    void h();

    void h0();

    void i0(String tag);

    void i1(long articleId);

    void j1();

    void l0(Long articleId);

    void m();

    void m0();

    void o0(String url);

    void p0(Uri uri);

    void q0();

    void r(long teamId);

    void s();

    void s0();

    void t();

    void t0();

    void u();

    void u0();

    void v0();

    void z0(Integer requestCode);
}
