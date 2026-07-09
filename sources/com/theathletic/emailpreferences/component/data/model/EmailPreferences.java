package com.theathletic.emailpreferences.component.data.model;

import com.theathletic.video.component.data.VideoRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/theathletic/emailpreferences/component/data/model/EmailPreferences;", "", "title", "", "emailType", "description", VideoRepository.XML_ATTR_VALUE, "", "index", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "getTitle", "()Ljava/lang/String;", "getEmailType", "getDescription", "getValue", "()Z", "getIndex", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmailPreferences {
    private final String description;

    @NotNull
    private final String emailType;
    private final int index;

    @NotNull
    private final String title;
    private final boolean value;

    public EmailPreferences(@NotNull String title, @NotNull String emailType, String str, boolean z11, int i11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(emailType, "emailType");
        this.title = title;
        this.emailType = emailType;
        this.description = str;
        this.value = z11;
        this.index = i11;
    }

    public static /* synthetic */ EmailPreferences copy$default(EmailPreferences emailPreferences, String str, String str2, String str3, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = emailPreferences.title;
        }
        if ((i12 & 2) != 0) {
            str2 = emailPreferences.emailType;
        }
        if ((i12 & 4) != 0) {
            str3 = emailPreferences.description;
        }
        if ((i12 & 8) != 0) {
            z11 = emailPreferences.value;
        }
        if ((i12 & 16) != 0) {
            i11 = emailPreferences.index;
        }
        int i13 = i11;
        String str4 = str3;
        return emailPreferences.copy(str, str2, str4, z11, i13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmailType() {
        return this.emailType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final EmailPreferences copy(@NotNull String title, @NotNull String emailType, String description, boolean value, int index) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(emailType, "emailType");
        return new EmailPreferences(title, emailType, description, value, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailPreferences)) {
            return false;
        }
        EmailPreferences emailPreferences = (EmailPreferences) other;
        return Intrinsics.areEqual(this.title, emailPreferences.title) && Intrinsics.areEqual(this.emailType, emailPreferences.emailType) && Intrinsics.areEqual(this.description, emailPreferences.description) && this.value == emailPreferences.value && this.index == emailPreferences.index;
    }

    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getEmailType() {
        return this.emailType;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.emailType.hashCode()) * 31;
        String str = this.description;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.value)) * 31) + Integer.hashCode(this.index);
    }

    @NotNull
    public String toString() {
        return "EmailPreferences(title=" + this.title + ", emailType=" + this.emailType + ", description=" + this.description + ", value=" + this.value + ", index=" + this.index + ")";
    }
}
