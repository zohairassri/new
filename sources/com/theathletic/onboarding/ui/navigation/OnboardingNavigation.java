package com.theathletic.onboarding.ui.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/theathletic/onboarding/ui/navigation/OnboardingNavigation;", "", "", "route", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Following", "NewsLetter", "Lcom/theathletic/onboarding/ui/navigation/OnboardingNavigation$Following;", "Lcom/theathletic/onboarding/ui/navigation/OnboardingNavigation$NewsLetter;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OnboardingNavigation {
    public static final int $stable = 0;

    @NotNull
    private final String route;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/onboarding/ui/navigation/OnboardingNavigation$Following;", "Lcom/theathletic/onboarding/ui/navigation/OnboardingNavigation;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Following extends OnboardingNavigation {
        public static final int $stable = 0;

        @NotNull
        public static final Following INSTANCE = new Following();

        private Following() {
            super("following", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/onboarding/ui/navigation/OnboardingNavigation$NewsLetter;", "Lcom/theathletic/onboarding/ui/navigation/OnboardingNavigation;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewsLetter extends OnboardingNavigation {
        public static final int $stable = 0;

        @NotNull
        public static final NewsLetter INSTANCE = new NewsLetter();

        private NewsLetter() {
            super("newsLetter", null);
        }
    }

    public /* synthetic */ OnboardingNavigation(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    private OnboardingNavigation(String str) {
        this.route = str;
    }
}
