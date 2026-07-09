package y30;

import android.content.Context;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\fJ'\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001a\u0010\bR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020!0 0\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001e¨\u0006'À\u0006\u0003"}, d2 = {"Ly30/i;", "", "Landroid/content/Context;", "context", "", "initialize", "(Landroid/content/Context;)V", "destroy", "()V", "", "isMuted", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "(Z)V", "", "level", QueryKeys.SUBDOMAIN, "(F)V", "onStage", QueryKeys.VISIT_FREQUENCY, "", "channelName", "token", "", "userId", QueryKeys.ACCOUNT_ID, "(Ljava/lang/String;Ljava/lang/String;J)V", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "Lwf0/g;", "Ly30/l;", "a", "()Lwf0/g;", "audioRoomState", "", "", QueryKeys.HOST, "userIdToVolume", "Ly30/k;", QueryKeys.PAGE_LOAD_TIME, "events", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {
    wf0.g a();

    wf0.g b();

    void c();

    void d(float level);

    void destroy();

    void e(boolean isMuted);

    void f(boolean onStage);

    void g(String channelName, String token, long userId);

    wf0.g h();

    void initialize(Context context);
}
