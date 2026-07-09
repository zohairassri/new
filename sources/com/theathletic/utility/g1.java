package com.theathletic.utility;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001:\u0001!R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u000f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u000f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u000f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010 \u001a\u0004\u0018\u00010\u000f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/theathletic/utility/g1;", "", "", "M", "()Z", QueryKeys.TOKEN, "(Z)V", "isOnboarding", "", "Lp20/d$a;", "N", "()Ljava/util/List;", QueryKeys.USER_ID, "(Ljava/util/List;)V", "chosenFollowables", "", QueryKeys.SCREEN_WIDTH, QueryKeys.DECAY, "chosenNewsletters", QueryKeys.EXTERNAL_REFERRER, "()Ljava/lang/String;", "J", "(Ljava/lang/String;)V", "deferredDeeplinkUrl", "getDeferredDeeplinkArticleId", "x", "deferredDeeplinkArticleId", "getDeferredDeeplinkLiveBlogId", "Y", "deferredDeeplinkLiveBlogId", "getDeferredDeeplinkLeagueIds", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "deferredDeeplinkLeagueIds", "a", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g1 {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/utility/g1$a;", "", "<init>", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f84784a = new a();

        private a() {
        }
    }

    void J(String str);

    boolean M();

    List N();

    List S();

    void Y(String str);

    void e(String str);

    String getDeferredDeeplinkArticleId();

    String getDeferredDeeplinkLeagueIds();

    String getDeferredDeeplinkLiveBlogId();

    void j(List list);

    String r();

    void t(boolean z11);

    void u(List list);

    void x(String str);
}
