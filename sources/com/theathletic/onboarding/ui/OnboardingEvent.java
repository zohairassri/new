package com.theathletic.onboarding.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/theathletic/onboarding/ui/OnboardingEvent;", "", "<init>", "()V", "StartMainActivity", "StartOnboardingPaywall", "FinishAffinity", "Lcom/theathletic/onboarding/ui/OnboardingEvent$FinishAffinity;", "Lcom/theathletic/onboarding/ui/OnboardingEvent$StartMainActivity;", "Lcom/theathletic/onboarding/ui/OnboardingEvent$StartOnboardingPaywall;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OnboardingEvent {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/theathletic/onboarding/ui/OnboardingEvent$FinishAffinity;", "Lcom/theathletic/onboarding/ui/OnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FinishAffinity extends OnboardingEvent {
        public static final int $stable = 0;

        @NotNull
        public static final FinishAffinity INSTANCE = new FinishAffinity();

        private FinishAffinity() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FinishAffinity);
        }

        public int hashCode() {
            return 1768787803;
        }

        public String toString() {
            return "FinishAffinity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/theathletic/onboarding/ui/OnboardingEvent$StartMainActivity;", "Lcom/theathletic/onboarding/ui/OnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartMainActivity extends OnboardingEvent {
        public static final int $stable = 0;

        @NotNull
        public static final StartMainActivity INSTANCE = new StartMainActivity();

        private StartMainActivity() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof StartMainActivity);
        }

        public int hashCode() {
            return -1164074774;
        }

        public String toString() {
            return "StartMainActivity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/theathletic/onboarding/ui/OnboardingEvent$StartOnboardingPaywall;", "Lcom/theathletic/onboarding/ui/OnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartOnboardingPaywall extends OnboardingEvent {
        public static final int $stable = 0;

        @NotNull
        public static final StartOnboardingPaywall INSTANCE = new StartOnboardingPaywall();

        private StartOnboardingPaywall() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof StartOnboardingPaywall);
        }

        public int hashCode() {
            return 1777520661;
        }

        public String toString() {
            return "StartOnboardingPaywall";
        }
    }

    public /* synthetic */ OnboardingEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OnboardingEvent() {
    }
}
