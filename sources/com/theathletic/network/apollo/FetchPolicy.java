package com.theathletic.network.apollo;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import rc.e;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e2\u00020\u0001:\u0005\u000f\u0010\u0011\u0012\u000eB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/theathletic/network/apollo/FetchPolicy;", "", "Lrc/e;", "policy", "", "timeout", "<init>", "(Lrc/e;J)V", "Lrc/e;", "a", "()Lrc/e;", "J", QueryKeys.PAGE_LOAD_TIME, "()J", "Companion", "CacheOnly", "NetworkOnly", "CacheFirst", "NetworkFirst", "Lcom/theathletic/network/apollo/FetchPolicy$CacheFirst;", "Lcom/theathletic/network/apollo/FetchPolicy$CacheOnly;", "Lcom/theathletic/network/apollo/FetchPolicy$NetworkFirst;", "Lcom/theathletic/network/apollo/FetchPolicy$NetworkOnly;", "graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FetchPolicy {
    public static final long ONE_DAY = 86400000;

    @NotNull
    private final e policy;
    private final long timeout;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/network/apollo/FetchPolicy$CacheFirst;", "Lcom/theathletic/network/apollo/FetchPolicy;", "<init>", "()V", "graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CacheFirst extends FetchPolicy {

        @NotNull
        public static final CacheFirst INSTANCE = new CacheFirst();

        private CacheFirst() {
            super(e.f124706a, FetchPolicy.ONE_DAY, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/network/apollo/FetchPolicy$CacheOnly;", "Lcom/theathletic/network/apollo/FetchPolicy;", "<init>", "()V", "graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CacheOnly extends FetchPolicy {

        @NotNull
        public static final CacheOnly INSTANCE = new CacheOnly();

        private CacheOnly() {
            super(e.f124707b, FetchPolicy.ONE_DAY, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/network/apollo/FetchPolicy$NetworkFirst;", "Lcom/theathletic/network/apollo/FetchPolicy;", "<init>", "()V", "graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NetworkFirst extends FetchPolicy {

        @NotNull
        public static final NetworkFirst INSTANCE = new NetworkFirst();

        private NetworkFirst() {
            super(e.f124708c, 0L, 2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/network/apollo/FetchPolicy$NetworkOnly;", "Lcom/theathletic/network/apollo/FetchPolicy;", "<init>", "()V", "graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NetworkOnly extends FetchPolicy {

        @NotNull
        public static final NetworkOnly INSTANCE = new NetworkOnly();

        private NetworkOnly() {
            super(e.f124709d, 0L, 2, null);
        }
    }

    public /* synthetic */ FetchPolicy(e eVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, j11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getPolicy() {
        return this.policy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    private FetchPolicy(e eVar, long j11) {
        this.policy = eVar;
        this.timeout = j11;
    }

    public /* synthetic */ FetchPolicy(e eVar, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i11 & 2) != 0 ? 0L : j11, null);
    }
}
