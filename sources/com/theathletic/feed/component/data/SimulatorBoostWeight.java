package com.theathletic.feed.component.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/theathletic/feed/component/data/SimulatorBoostWeight;", "", "important", "", "veryImportant", "<init>", "(DD)V", "getImportant", "()D", "getVeryImportant", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SimulatorBoostWeight {
    public static final int $stable = 0;
    private final double important;
    private final double veryImportant;

    public SimulatorBoostWeight(double d11, double d12) {
        this.important = d11;
        this.veryImportant = d12;
    }

    public static /* synthetic */ SimulatorBoostWeight copy$default(SimulatorBoostWeight simulatorBoostWeight, double d11, double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = simulatorBoostWeight.important;
        }
        if ((i11 & 2) != 0) {
            d12 = simulatorBoostWeight.veryImportant;
        }
        return simulatorBoostWeight.copy(d11, d12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getImportant() {
        return this.important;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getVeryImportant() {
        return this.veryImportant;
    }

    @NotNull
    public final SimulatorBoostWeight copy(double important, double veryImportant) {
        return new SimulatorBoostWeight(important, veryImportant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimulatorBoostWeight)) {
            return false;
        }
        SimulatorBoostWeight simulatorBoostWeight = (SimulatorBoostWeight) other;
        return Double.compare(this.important, simulatorBoostWeight.important) == 0 && Double.compare(this.veryImportant, simulatorBoostWeight.veryImportant) == 0;
    }

    public final double getImportant() {
        return this.important;
    }

    public final double getVeryImportant() {
        return this.veryImportant;
    }

    public int hashCode() {
        return (Double.hashCode(this.important) * 31) + Double.hashCode(this.veryImportant);
    }

    @NotNull
    public String toString() {
        return "SimulatorBoostWeight(important=" + this.important + ", veryImportant=" + this.veryImportant + ")";
    }
}
