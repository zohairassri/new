package com.theathletic.onboarding.component.models;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/theathletic/onboarding/component/models/OnboardingFlag;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "onboardingCompleted", QueryKeys.MEMFLY_API_VERSION, "getOnboardingCompleted", "()Z", "onboardingSkipped", "getOnboardingSkipped", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingFlag {
    private final boolean onboardingCompleted;
    private final boolean onboardingSkipped;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingFlag)) {
            return false;
        }
        OnboardingFlag onboardingFlag = (OnboardingFlag) other;
        return this.onboardingCompleted == onboardingFlag.onboardingCompleted && this.onboardingSkipped == onboardingFlag.onboardingSkipped;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.onboardingCompleted) * 31) + Boolean.hashCode(this.onboardingSkipped);
    }

    public String toString() {
        return "OnboardingFlag(onboardingCompleted=" + this.onboardingCompleted + ", onboardingSkipped=" + this.onboardingSkipped + ")";
    }
}
