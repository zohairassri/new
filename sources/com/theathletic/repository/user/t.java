package com.theathletic.repository.user;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.concurrent.Future;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/theathletic/repository/user/t;", "", "", "id", "", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "(J)Z", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "isRead", "Ljava/util/concurrent/Future;", "", QueryKeys.PAGE_LOAD_TIME, "(JZ)Ljava/util/concurrent/Future;", "isPlayed", QueryKeys.ACCOUNT_ID, "a", "timestamp", QueryKeys.SUBDOMAIN, "(JLaf0/c;)Ljava/lang/Object;", "Lwf0/g;", "Lcom/theathletic/entity/authentication/UserData;", QueryKeys.HOST, "()Lwf0/g;", "userDataFlow", "", QueryKeys.VISIT_FREQUENCY, "()I", "totalReadArticleCount", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface t {
    boolean a(long id2);

    Future b(long id2, boolean isRead);

    boolean c(long id2);

    Object d(long j11, af0.c cVar);

    boolean e(long id2);

    int f();

    Future g(long id2, boolean isPlayed);

    wf0.g h();
}
