package com.theathletic.topics.local;

import com.theathletic.data.local.InMemoryStaticLocalDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/theathletic/topics/local/b;", "Lcom/theathletic/data/local/InMemoryStaticLocalDataSource;", "", "Lcom/theathletic/topics/local/a;", "<init>", "()V", "data", "", "a", "(Lcom/theathletic/topics/local/a;)V", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends InMemoryStaticLocalDataSource<Object, FollowableItems> {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/topics/local/b$a;", "", "<init>", "()V", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f82497a = new a();

        private a() {
        }
    }

    public final void a(FollowableItems data) {
        Intrinsics.checkNotNullParameter(data, "data");
        put(a.f82497a, data);
    }
}
