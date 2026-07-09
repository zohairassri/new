package d70;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.subscriptions.component.data.SubscriptionsRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d70.d, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001c\u0010 ¨\u0006!"}, d2 = {"Ld70/d;", "", "", "title", "titleNonEligible", "defaultConfirmationButtonText", "nonEligibleButtonText", "termsText", "termsTextTrial", "", "Ld70/a;", SubscriptionsRepository.PLANS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.VISIT_FREQUENCY, QueryKeys.PAGE_LOAD_TIME, QueryKeys.ACCOUNT_ID, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "Ljava/util/List;", "()Ljava/util/List;", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Subscriptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String titleNonEligible;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String defaultConfirmationButtonText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nonEligibleButtonText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termsText;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termsTextTrial;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List plans;

    public Subscriptions(String str, String str2, String str3, String str4, String str5, String str6, List plans) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.title = str;
        this.titleNonEligible = str2;
        this.defaultConfirmationButtonText = str3;
        this.nonEligibleButtonText = str4;
        this.termsText = str5;
        this.termsTextTrial = str6;
        this.plans = plans;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDefaultConfirmationButtonText() {
        return this.defaultConfirmationButtonText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNonEligibleButtonText() {
        return this.nonEligibleButtonText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPlans() {
        return this.plans;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTermsText() {
        return this.termsText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTermsTextTrial() {
        return this.termsTextTrial;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Subscriptions)) {
            return false;
        }
        Subscriptions subscriptions = (Subscriptions) other;
        return Intrinsics.areEqual(this.title, subscriptions.title) && Intrinsics.areEqual(this.titleNonEligible, subscriptions.titleNonEligible) && Intrinsics.areEqual(this.defaultConfirmationButtonText, subscriptions.defaultConfirmationButtonText) && Intrinsics.areEqual(this.nonEligibleButtonText, subscriptions.nonEligibleButtonText) && Intrinsics.areEqual(this.termsText, subscriptions.termsText) && Intrinsics.areEqual(this.termsTextTrial, subscriptions.termsTextTrial) && Intrinsics.areEqual(this.plans, subscriptions.plans);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitleNonEligible() {
        return this.titleNonEligible;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.titleNonEligible;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.defaultConfirmationButtonText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nonEligibleButtonText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.termsText;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.termsTextTrial;
        return ((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.plans.hashCode();
    }

    public String toString() {
        return "Subscriptions(title=" + this.title + ", titleNonEligible=" + this.titleNonEligible + ", defaultConfirmationButtonText=" + this.defaultConfirmationButtonText + ", nonEligibleButtonText=" + this.nonEligibleButtonText + ", termsText=" + this.termsText + ", termsTextTrial=" + this.termsTextTrial + ", plans=" + this.plans + ")";
    }
}
