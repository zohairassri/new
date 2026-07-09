package com.theathletic.utility;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001*R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0019\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u001a0 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001c\u0010)\u001a\u00020$8&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+À\u0006\u0003"}, d2 = {"Lcom/theathletic/utility/i0;", "", "", "q", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "accessToken", "getLogGoogleSubLastToken", "b0", "logGoogleSubLastToken", "", QueryKeys.ACCOUNT_ID, "()Ljava/lang/Long;", "setLastGoogleSubArticleId", "(Ljava/lang/Long;)V", "lastGoogleSubArticleId", "s", "setLastGoogleSubPodcastId", "lastGoogleSubPodcastId", "", "getLastDeclinedUpdateVersionCode", "()I", QueryKeys.IS_NEW_USER, "(I)V", "lastDeclinedUpdateVersionCode", "", "T", "()Ljava/util/Map;", "h0", "(Ljava/util/Map;)V", "followablesOrder", "Lwf0/q0;", "O", "()Lwf0/q0;", "followablesOrderStateFlow", "", QueryKeys.SCROLL_WINDOW_HEIGHT, "()Z", "B", "(Z)V", "hasCustomFollowableOrder", "a", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i0 {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/utility/i0$a;", "", "<init>", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f84798a = new a();

        private a() {
        }
    }

    void B(boolean z11);

    wf0.q0 O();

    Map T();

    void b0(String str);

    Long g();

    void h0(Map map);

    void n(int i11);

    String q();

    Long s();

    boolean w();
}
