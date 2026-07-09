package com.theathletic.debugtools.billingconfig;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.ui.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/theathletic/debugtools/billingconfig/BillingConfigState;", "Lcom/theathletic/ui/r;", "", "isSubscribed", "isTrialEligible", "", "selectedCurrencyIndex", "", "", "currencies", "<init>", "(ZZILjava/util/List;)V", "a", "(ZZILjava/util/List;)Lcom/theathletic/debugtools/billingconfig/BillingConfigState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", QueryKeys.MEMFLY_API_VERSION, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "()Z", QueryKeys.VISIT_FREQUENCY, QueryKeys.IDLING, QueryKeys.SUBDOMAIN, "Ljava/util/List;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()Ljava/util/List;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillingConfigState implements r {
    public static final int $stable = 8;

    @NotNull
    private final List<String> currencies;
    private final boolean isSubscribed;
    private final boolean isTrialEligible;
    private final int selectedCurrencyIndex;

    public BillingConfigState(boolean z11, boolean z12, int i11, List currencies) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.isSubscribed = z11;
        this.isTrialEligible = z12;
        this.selectedCurrencyIndex = i11;
        this.currencies = currencies;
    }

    public static /* synthetic */ BillingConfigState b(BillingConfigState billingConfigState, boolean z11, boolean z12, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = billingConfigState.isSubscribed;
        }
        if ((i12 & 2) != 0) {
            z12 = billingConfigState.isTrialEligible;
        }
        if ((i12 & 4) != 0) {
            i11 = billingConfigState.selectedCurrencyIndex;
        }
        if ((i12 & 8) != 0) {
            list = billingConfigState.currencies;
        }
        return billingConfigState.a(z11, z12, i11, list);
    }

    public final BillingConfigState a(boolean isSubscribed, boolean isTrialEligible, int selectedCurrencyIndex, List currencies) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        return new BillingConfigState(isSubscribed, isTrialEligible, selectedCurrencyIndex, currencies);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getCurrencies() {
        return this.currencies;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSelectedCurrencyIndex() {
        return this.selectedCurrencyIndex;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingConfigState)) {
            return false;
        }
        BillingConfigState billingConfigState = (BillingConfigState) other;
        return this.isSubscribed == billingConfigState.isSubscribed && this.isTrialEligible == billingConfigState.isTrialEligible && this.selectedCurrencyIndex == billingConfigState.selectedCurrencyIndex && Intrinsics.areEqual(this.currencies, billingConfigState.currencies);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsTrialEligible() {
        return this.isTrialEligible;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isSubscribed) * 31) + Boolean.hashCode(this.isTrialEligible)) * 31) + Integer.hashCode(this.selectedCurrencyIndex)) * 31) + this.currencies.hashCode();
    }

    public String toString() {
        return "BillingConfigState(isSubscribed=" + this.isSubscribed + ", isTrialEligible=" + this.isTrialEligible + ", selectedCurrencyIndex=" + this.selectedCurrencyIndex + ", currencies=" + this.currencies + ")";
    }
}
