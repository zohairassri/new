package com.theathletic.liveblog.data.local;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/theathletic/liveblog/data/local/NativeLiveBlogAuthor;", "", "id", "", "name", "description", "avatarUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getDescription", "getAvatarUri", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "entity_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NativeLiveBlogAuthor {
    private final String avatarUri;
    private final String description;

    @NotNull
    private final String id;

    @NotNull
    private final String name;

    public NativeLiveBlogAuthor(@NotNull String id2, @NotNull String name, String str, String str2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id2;
        this.name = name;
        this.description = str;
        this.avatarUri = str2;
    }

    public static /* synthetic */ NativeLiveBlogAuthor copy$default(NativeLiveBlogAuthor nativeLiveBlogAuthor, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nativeLiveBlogAuthor.id;
        }
        if ((i11 & 2) != 0) {
            str2 = nativeLiveBlogAuthor.name;
        }
        if ((i11 & 4) != 0) {
            str3 = nativeLiveBlogAuthor.description;
        }
        if ((i11 & 8) != 0) {
            str4 = nativeLiveBlogAuthor.avatarUri;
        }
        return nativeLiveBlogAuthor.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvatarUri() {
        return this.avatarUri;
    }

    @NotNull
    public final NativeLiveBlogAuthor copy(@NotNull String id2, @NotNull String name, String description, String avatarUri) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new NativeLiveBlogAuthor(id2, name, description, avatarUri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeLiveBlogAuthor)) {
            return false;
        }
        NativeLiveBlogAuthor nativeLiveBlogAuthor = (NativeLiveBlogAuthor) other;
        return Intrinsics.areEqual(this.id, nativeLiveBlogAuthor.id) && Intrinsics.areEqual(this.name, nativeLiveBlogAuthor.name) && Intrinsics.areEqual(this.description, nativeLiveBlogAuthor.description) && Intrinsics.areEqual(this.avatarUri, nativeLiveBlogAuthor.avatarUri);
    }

    public final String getAvatarUri() {
        return this.avatarUri;
    }

    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarUri;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NativeLiveBlogAuthor(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", avatarUri=" + this.avatarUri + ")";
    }
}
