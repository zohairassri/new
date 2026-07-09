package com.theathletic.onboarding.ui.following;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/theathletic/onboarding/ui/following/OnboardingFollowingEvent;", "", "ProgressToNextStep", "Lcom/theathletic/onboarding/ui/following/OnboardingFollowingEvent$ProgressToNextStep;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OnboardingFollowingEvent {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/theathletic/onboarding/ui/following/OnboardingFollowingEvent$ProgressToNextStep;", "Lcom/theathletic/onboarding/ui/following/OnboardingFollowingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProgressToNextStep implements OnboardingFollowingEvent {
        public static final int $stable = 0;

        @NotNull
        public static final ProgressToNextStep INSTANCE = new ProgressToNextStep();

        private ProgressToNextStep() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ProgressToNextStep);
        }

        public int hashCode() {
            return 2050493443;
        }

        public String toString() {
            return "ProgressToNextStep";
        }
    }
}
