package com.theathletic.user;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/theathletic/user/c;", "", "<init>", "()V", "", "id", "Lcom/theathletic/user/i;", "a", "(Ljava/lang/String;Laf0/c;)Ljava/lang/Object;", "followingNotification", "", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "(Lcom/theathletic/user/i;Laf0/c;)Ljava/lang/Object;", "", "followableNotificationList", QueryKeys.PAGE_LOAD_TIME, "(Ljava/util/List;Laf0/c;)Ljava/lang/Object;", "db_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c {
    public abstract Object a(String str, af0.c cVar);

    public abstract Object b(List list, af0.c cVar);

    public abstract Object c(LocalFollowableNotificationSettings localFollowableNotificationSettings, af0.c cVar);
}
