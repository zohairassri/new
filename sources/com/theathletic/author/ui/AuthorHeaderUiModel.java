package com.theathletic.author.ui;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.author.ui.b0, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJX\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001c\u0010\u0011R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/theathletic/author/ui/b0;", "", "", "name", "imageUrl", "description", "bio", "", "Lcom/theathletic/author/ui/v0;", "socialHandle", "", "isFollowed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/theathletic/author/ui/b0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", QueryKeys.VISIT_FREQUENCY, QueryKeys.PAGE_LOAD_TIME, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, "Ljava/util/List;", QueryKeys.ACCOUNT_ID, "()Ljava/util/List;", QueryKeys.MEMFLY_API_VERSION, QueryKeys.HOST, "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AuthorHeaderUiModel {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f51016g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bio;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List socialHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFollowed;

    public AuthorHeaderUiModel(String name, String str, String str2, String str3, List socialHandle, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(socialHandle, "socialHandle");
        this.name = name;
        this.imageUrl = str;
        this.description = str2;
        this.bio = str3;
        this.socialHandle = socialHandle;
        this.isFollowed = z11;
    }

    public static /* synthetic */ AuthorHeaderUiModel b(AuthorHeaderUiModel authorHeaderUiModel, String str, String str2, String str3, String str4, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authorHeaderUiModel.name;
        }
        if ((i11 & 2) != 0) {
            str2 = authorHeaderUiModel.imageUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = authorHeaderUiModel.description;
        }
        if ((i11 & 8) != 0) {
            str4 = authorHeaderUiModel.bio;
        }
        if ((i11 & 16) != 0) {
            list = authorHeaderUiModel.socialHandle;
        }
        if ((i11 & 32) != 0) {
            z11 = authorHeaderUiModel.isFollowed;
        }
        List list2 = list;
        boolean z12 = z11;
        return authorHeaderUiModel.a(str, str2, str3, str4, list2, z12);
    }

    public final AuthorHeaderUiModel a(String name, String imageUrl, String description, String bio, List socialHandle, boolean isFollowed) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(socialHandle, "socialHandle");
        return new AuthorHeaderUiModel(name, imageUrl, description, bio, socialHandle, isFollowed);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBio() {
        return this.bio;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorHeaderUiModel)) {
            return false;
        }
        AuthorHeaderUiModel authorHeaderUiModel = (AuthorHeaderUiModel) other;
        return Intrinsics.areEqual(this.name, authorHeaderUiModel.name) && Intrinsics.areEqual(this.imageUrl, authorHeaderUiModel.imageUrl) && Intrinsics.areEqual(this.description, authorHeaderUiModel.description) && Intrinsics.areEqual(this.bio, authorHeaderUiModel.bio) && Intrinsics.areEqual(this.socialHandle, authorHeaderUiModel.socialHandle) && this.isFollowed == authorHeaderUiModel.isFollowed;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getSocialHandle() {
        return this.socialHandle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsFollowed() {
        return this.isFollowed;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bio;
        return ((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.socialHandle.hashCode()) * 31) + Boolean.hashCode(this.isFollowed);
    }

    public String toString() {
        return "AuthorHeaderUiModel(name=" + this.name + ", imageUrl=" + this.imageUrl + ", description=" + this.description + ", bio=" + this.bio + ", socialHandle=" + this.socialHandle + ", isFollowed=" + this.isFollowed + ")";
    }
}
