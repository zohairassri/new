package com.theathletic.debugtools.logs.ui;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/theathletic/debugtools/logs/ui/AnalyticsLogUi;", "", "<init>", "()V", "AnalyticsLogItem", "Interactor", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnalyticsLogUi {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/theathletic/debugtools/logs/ui/AnalyticsLogUi$AnalyticsLogItem;", "", "", "label", "", "params", "collectors", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "Ljava/util/Map;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()Ljava/util/Map;", "a", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnalyticsLogItem {
        public static final int $stable = 8;

        @NotNull
        private final String collectors;

        @NotNull
        private final String label;

        @NotNull
        private final Map<String, String> params;

        public AnalyticsLogItem(String label, Map params, String collectors) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(collectors, "collectors");
            this.label = label;
            this.params = params;
            this.collectors = collectors;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCollectors() {
            return this.collectors;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Map getParams() {
            return this.params;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnalyticsLogItem)) {
                return false;
            }
            AnalyticsLogItem analyticsLogItem = (AnalyticsLogItem) other;
            return Intrinsics.areEqual(this.label, analyticsLogItem.label) && Intrinsics.areEqual(this.params, analyticsLogItem.params) && Intrinsics.areEqual(this.collectors, analyticsLogItem.collectors);
        }

        public int hashCode() {
            return (((this.label.hashCode() * 31) + this.params.hashCode()) * 31) + this.collectors.hashCode();
        }

        public String toString() {
            return "AnalyticsLogItem(label=" + this.label + ", params=" + this.params + ", collectors=" + this.collectors + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/theathletic/debugtools/logs/ui/AnalyticsLogUi$Interactor;", "", "", "a", "()V", "h0", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Interactor {
        void a();

        void h0();
    }
}
