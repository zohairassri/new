package com.statsig.androidsdk;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xr.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017BY\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u0003\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u0003¢\u0006\u0002\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J!\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u0003HÆ\u0003J!\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u0003HÆ\u0003Jc\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00032 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R.\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR.\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/statsig/androidsdk/StatsigOverrides;", "", "gates", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "configs", "", "layers", "(Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;)V", "getConfigs", "()Ljava/util/concurrent/ConcurrentHashMap;", "getGates", "getLayers", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class StatsigOverrides {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @c("configs")
    @NotNull
    private final ConcurrentHashMap<String, Map<String, Object>> configs;

    @c("gates")
    @NotNull
    private final ConcurrentHashMap<String, Boolean> gates;

    @c("layers")
    @NotNull
    private final ConcurrentHashMap<String, Map<String, Object>> layers;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/statsig/androidsdk/StatsigOverrides$Companion;", "", "()V", "empty", "Lcom/statsig/androidsdk/StatsigOverrides;", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StatsigOverrides empty() {
            return new StatsigOverrides(new ConcurrentHashMap(), new ConcurrentHashMap(), new ConcurrentHashMap());
        }

        private Companion() {
        }
    }

    public StatsigOverrides(@NotNull ConcurrentHashMap<String, Boolean> gates, @NotNull ConcurrentHashMap<String, Map<String, Object>> configs, @NotNull ConcurrentHashMap<String, Map<String, Object>> layers) {
        Intrinsics.checkNotNullParameter(gates, "gates");
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(layers, "layers");
        this.gates = gates;
        this.configs = configs;
        this.layers = layers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatsigOverrides copy$default(StatsigOverrides statsigOverrides, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, ConcurrentHashMap concurrentHashMap3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            concurrentHashMap = statsigOverrides.gates;
        }
        if ((i11 & 2) != 0) {
            concurrentHashMap2 = statsigOverrides.configs;
        }
        if ((i11 & 4) != 0) {
            concurrentHashMap3 = statsigOverrides.layers;
        }
        return statsigOverrides.copy(concurrentHashMap, concurrentHashMap2, concurrentHashMap3);
    }

    @NotNull
    public final ConcurrentHashMap<String, Boolean> component1() {
        return this.gates;
    }

    @NotNull
    public final ConcurrentHashMap<String, Map<String, Object>> component2() {
        return this.configs;
    }

    @NotNull
    public final ConcurrentHashMap<String, Map<String, Object>> component3() {
        return this.layers;
    }

    @NotNull
    public final StatsigOverrides copy(@NotNull ConcurrentHashMap<String, Boolean> gates, @NotNull ConcurrentHashMap<String, Map<String, Object>> configs, @NotNull ConcurrentHashMap<String, Map<String, Object>> layers) {
        Intrinsics.checkNotNullParameter(gates, "gates");
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(layers, "layers");
        return new StatsigOverrides(gates, configs, layers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatsigOverrides)) {
            return false;
        }
        StatsigOverrides statsigOverrides = (StatsigOverrides) other;
        return Intrinsics.areEqual(this.gates, statsigOverrides.gates) && Intrinsics.areEqual(this.configs, statsigOverrides.configs) && Intrinsics.areEqual(this.layers, statsigOverrides.layers);
    }

    @NotNull
    public final ConcurrentHashMap<String, Map<String, Object>> getConfigs() {
        return this.configs;
    }

    @NotNull
    public final ConcurrentHashMap<String, Boolean> getGates() {
        return this.gates;
    }

    @NotNull
    public final ConcurrentHashMap<String, Map<String, Object>> getLayers() {
        return this.layers;
    }

    public int hashCode() {
        return (((this.gates.hashCode() * 31) + this.configs.hashCode()) * 31) + this.layers.hashCode();
    }

    @NotNull
    public String toString() {
        return "StatsigOverrides(gates=" + this.gates + ", configs=" + this.configs + ", layers=" + this.layers + ')';
    }
}
