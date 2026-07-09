package com.theathletic.article.component.data;

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/theathletic/article/component/data/ArticleNotificationToggle;", "", "name", "", "objectId", "enabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getObjectId", "getEnabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ArticleNotificationToggle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ArticleNotificationToggle Disabled = new ArticleNotificationToggle(null, null, false);
    private final boolean enabled;
    private final String name;
    private final String objectId;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/theathletic/article/component/data/ArticleNotificationToggle$Companion;", "", "<init>", "()V", BucketLifecycleConfiguration.DISABLED, "Lcom/theathletic/article/component/data/ArticleNotificationToggle;", "getDisabled", "()Lcom/theathletic/article/component/data/ArticleNotificationToggle;", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ArticleNotificationToggle getDisabled() {
            return ArticleNotificationToggle.Disabled;
        }

        private Companion() {
        }
    }

    public ArticleNotificationToggle(String str, String str2, boolean z11) {
        this.name = str;
        this.objectId = str2;
        this.enabled = z11;
    }

    public static /* synthetic */ ArticleNotificationToggle copy$default(ArticleNotificationToggle articleNotificationToggle, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = articleNotificationToggle.name;
        }
        if ((i11 & 2) != 0) {
            str2 = articleNotificationToggle.objectId;
        }
        if ((i11 & 4) != 0) {
            z11 = articleNotificationToggle.enabled;
        }
        return articleNotificationToggle.copy(str, str2, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getObjectId() {
        return this.objectId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final ArticleNotificationToggle copy(String name, String objectId, boolean enabled) {
        return new ArticleNotificationToggle(name, objectId, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleNotificationToggle)) {
            return false;
        }
        ArticleNotificationToggle articleNotificationToggle = (ArticleNotificationToggle) other;
        return Intrinsics.areEqual(this.name, articleNotificationToggle.name) && Intrinsics.areEqual(this.objectId, articleNotificationToggle.objectId) && this.enabled == articleNotificationToggle.enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getName() {
        return this.name;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.objectId;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled);
    }

    @NotNull
    public String toString() {
        return "ArticleNotificationToggle(name=" + this.name + ", objectId=" + this.objectId + ", enabled=" + this.enabled + ")";
    }
}
