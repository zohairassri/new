package com.theathletic.onboarding.ui;

import com.theathletic.onboarding.ui.navigation.OnboardingNavigation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/theathletic/onboarding/ui/OnboardingProgressStep;", "", "Lcom/theathletic/onboarding/ui/navigation/OnboardingNavigation;", "navigationItem", "<init>", "(Lcom/theathletic/onboarding/ui/navigation/OnboardingNavigation;)V", "Lcom/theathletic/onboarding/ui/navigation/OnboardingNavigation;", "a", "()Lcom/theathletic/onboarding/ui/navigation/OnboardingNavigation;", "FollowingStep", "NewsletterStep", "Lcom/theathletic/onboarding/ui/OnboardingProgressStep$FollowingStep;", "Lcom/theathletic/onboarding/ui/OnboardingProgressStep$NewsletterStep;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OnboardingProgressStep {
    public static final int $stable = 0;

    @NotNull
    private final OnboardingNavigation navigationItem;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/theathletic/onboarding/ui/OnboardingProgressStep$FollowingStep;", "Lcom/theathletic/onboarding/ui/OnboardingProgressStep;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FollowingStep extends OnboardingProgressStep {
        public static final int $stable = 0;

        @NotNull
        public static final FollowingStep INSTANCE = new FollowingStep();

        private FollowingStep() {
            super(OnboardingNavigation.Following.INSTANCE, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FollowingStep);
        }

        public int hashCode() {
            return 1770224596;
        }

        public String toString() {
            return "FollowingStep";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/theathletic/onboarding/ui/OnboardingProgressStep$NewsletterStep;", "Lcom/theathletic/onboarding/ui/OnboardingProgressStep;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewsletterStep extends OnboardingProgressStep {
        public static final int $stable = 0;

        @NotNull
        public static final NewsletterStep INSTANCE = new NewsletterStep();

        private NewsletterStep() {
            super(OnboardingNavigation.NewsLetter.INSTANCE, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NewsletterStep);
        }

        public int hashCode() {
            return 1413584686;
        }

        public String toString() {
            return "NewsletterStep";
        }
    }

    public /* synthetic */ OnboardingProgressStep(OnboardingNavigation onboardingNavigation, DefaultConstructorMarker defaultConstructorMarker) {
        this(onboardingNavigation);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OnboardingNavigation getNavigationItem() {
        return this.navigationItem;
    }

    private OnboardingProgressStep(OnboardingNavigation onboardingNavigation) {
        this.navigationItem = onboardingNavigation;
    }
}
