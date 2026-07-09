package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/iteratehq/iterate/model/TriggerOptions;", "", "seconds", "", "<init>", "(Ljava/lang/Integer;)V", "getSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/iteratehq/iterate/model/TriggerOptions;", "equals", "", "other", "hashCode", "toString", "", "iterate_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TriggerOptions {
    private final Integer seconds;

    public TriggerOptions(Integer num) {
        this.seconds = num;
    }

    public static /* synthetic */ TriggerOptions copy$default(TriggerOptions triggerOptions, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = triggerOptions.seconds;
        }
        return triggerOptions.copy(num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getSeconds() {
        return this.seconds;
    }

    @NotNull
    public final TriggerOptions copy(Integer seconds) {
        return new TriggerOptions(seconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TriggerOptions) && Intrinsics.areEqual(this.seconds, ((TriggerOptions) other).seconds);
    }

    public final Integer getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        Integer num = this.seconds;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @NotNull
    public String toString() {
        return "TriggerOptions(seconds=" + this.seconds + ")";
    }
}
