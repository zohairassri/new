package com.theathletic.onboarding.component.models;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/theathletic/onboarding/component/models/NewsletterOption;", "", "", "type", "", "isEnabled", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", QueryKeys.MEMFLY_API_VERSION, "()Z", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NewsletterOption {
    private final boolean isEnabled;

    @NotNull
    private final String type;

    public NewsletterOption(String type, boolean z11) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.isEnabled = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsletterOption)) {
            return false;
        }
        NewsletterOption newsletterOption = (NewsletterOption) other;
        return Intrinsics.areEqual(this.type, newsletterOption.type) && this.isEnabled == newsletterOption.isEnabled;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + Boolean.hashCode(this.isEnabled);
    }

    public String toString() {
        return "NewsletterOption(type=" + this.type + ", isEnabled=" + this.isEnabled + ")";
    }
}
