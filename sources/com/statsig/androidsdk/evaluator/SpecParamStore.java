package com.statsig.androidsdk.evaluator;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xr.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00060\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J!\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00060\u0006HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00060\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R.\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00060\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/statsig/androidsdk/evaluator/SpecParamStore;", "", "targetAppIDs", "", "", "parameters", "", "(Ljava/util/List;Ljava/util/Map;)V", "getParameters", "()Ljava/util/Map;", "getTargetAppIDs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SpecParamStore {

    @c("parameters")
    @NotNull
    private final Map<String, Map<String, Object>> parameters;

    @c("targetAppIDs")
    @NotNull
    private final List<String> targetAppIDs;

    /* JADX WARN: Multi-variable type inference failed */
    public SpecParamStore(@NotNull List<String> targetAppIDs, @NotNull Map<String, ? extends Map<String, ? extends Object>> parameters) {
        Intrinsics.checkNotNullParameter(targetAppIDs, "targetAppIDs");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.targetAppIDs = targetAppIDs;
        this.parameters = parameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpecParamStore copy$default(SpecParamStore specParamStore, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = specParamStore.targetAppIDs;
        }
        if ((i11 & 2) != 0) {
            map = specParamStore.parameters;
        }
        return specParamStore.copy(list, map);
    }

    @NotNull
    public final List<String> component1() {
        return this.targetAppIDs;
    }

    @NotNull
    public final Map<String, Map<String, Object>> component2() {
        return this.parameters;
    }

    @NotNull
    public final SpecParamStore copy(@NotNull List<String> targetAppIDs, @NotNull Map<String, ? extends Map<String, ? extends Object>> parameters) {
        Intrinsics.checkNotNullParameter(targetAppIDs, "targetAppIDs");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new SpecParamStore(targetAppIDs, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecParamStore)) {
            return false;
        }
        SpecParamStore specParamStore = (SpecParamStore) other;
        return Intrinsics.areEqual(this.targetAppIDs, specParamStore.targetAppIDs) && Intrinsics.areEqual(this.parameters, specParamStore.parameters);
    }

    @NotNull
    public final Map<String, Map<String, Object>> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final List<String> getTargetAppIDs() {
        return this.targetAppIDs;
    }

    public int hashCode() {
        return (this.targetAppIDs.hashCode() * 31) + this.parameters.hashCode();
    }

    @NotNull
    public String toString() {
        return "SpecParamStore(targetAppIDs=" + this.targetAppIDs + ", parameters=" + this.parameters + ')';
    }
}
