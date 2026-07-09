package com.theathletic.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014Jb\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b#\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b$\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b*\u0010)¨\u0006+"}, d2 = {"Lcom/theathletic/video/VideoAnalyticsPayload;", "Landroid/os/Parcelable;", "", "moduleId", "moduleName", "parentObjectType", "parentObjectId", "view", "", "pageOrder", "vIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/theathletic/video/VideoAnalyticsPayload;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.PAGE_LOAD_TIME, QueryKeys.SUBDOMAIN, QueryKeys.HOST, QueryKeys.ACCOUNT_ID, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.DECAY, QueryKeys.VISIT_FREQUENCY, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", QueryKeys.VIEW_TITLE, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoAnalyticsPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VideoAnalyticsPayload> CREATOR = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f85167h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String moduleId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String moduleName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentObjectType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentObjectId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String view;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer pageOrder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer vIndex;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VideoAnalyticsPayload> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VideoAnalyticsPayload createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VideoAnalyticsPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VideoAnalyticsPayload[] newArray(int i11) {
            return new VideoAnalyticsPayload[i11];
        }
    }

    public VideoAnalyticsPayload(String moduleId, String str, String str2, String str3, String str4, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        this.moduleId = moduleId;
        this.moduleName = str;
        this.parentObjectType = str2;
        this.parentObjectId = str3;
        this.view = str4;
        this.pageOrder = num;
        this.vIndex = num2;
    }

    public static /* synthetic */ VideoAnalyticsPayload b(VideoAnalyticsPayload videoAnalyticsPayload, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = videoAnalyticsPayload.moduleId;
        }
        if ((i11 & 2) != 0) {
            str2 = videoAnalyticsPayload.moduleName;
        }
        if ((i11 & 4) != 0) {
            str3 = videoAnalyticsPayload.parentObjectType;
        }
        if ((i11 & 8) != 0) {
            str4 = videoAnalyticsPayload.parentObjectId;
        }
        if ((i11 & 16) != 0) {
            str5 = videoAnalyticsPayload.view;
        }
        if ((i11 & 32) != 0) {
            num = videoAnalyticsPayload.pageOrder;
        }
        if ((i11 & 64) != 0) {
            num2 = videoAnalyticsPayload.vIndex;
        }
        Integer num3 = num;
        Integer num4 = num2;
        String str6 = str5;
        String str7 = str3;
        return videoAnalyticsPayload.a(str, str2, str7, str4, str6, num3, num4);
    }

    public final VideoAnalyticsPayload a(String moduleId, String moduleName, String parentObjectType, String parentObjectId, String view, Integer pageOrder, Integer vIndex) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        return new VideoAnalyticsPayload(moduleId, moduleName, parentObjectType, parentObjectId, view, pageOrder, vIndex);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getModuleId() {
        return this.moduleId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getModuleName() {
        return this.moduleName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoAnalyticsPayload)) {
            return false;
        }
        VideoAnalyticsPayload videoAnalyticsPayload = (VideoAnalyticsPayload) other;
        return Intrinsics.areEqual(this.moduleId, videoAnalyticsPayload.moduleId) && Intrinsics.areEqual(this.moduleName, videoAnalyticsPayload.moduleName) && Intrinsics.areEqual(this.parentObjectType, videoAnalyticsPayload.parentObjectType) && Intrinsics.areEqual(this.parentObjectId, videoAnalyticsPayload.parentObjectId) && Intrinsics.areEqual(this.view, videoAnalyticsPayload.view) && Intrinsics.areEqual(this.pageOrder, videoAnalyticsPayload.pageOrder) && Intrinsics.areEqual(this.vIndex, videoAnalyticsPayload.vIndex);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getPageOrder() {
        return this.pageOrder;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getParentObjectId() {
        return this.parentObjectId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getParentObjectType() {
        return this.parentObjectType;
    }

    public int hashCode() {
        int iHashCode = this.moduleId.hashCode() * 31;
        String str = this.moduleName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.parentObjectType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.parentObjectId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.view;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.pageOrder;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.vIndex;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getVIndex() {
        return this.vIndex;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getView() {
        return this.view;
    }

    public String toString() {
        return "VideoAnalyticsPayload(moduleId=" + this.moduleId + ", moduleName=" + this.moduleName + ", parentObjectType=" + this.parentObjectType + ", parentObjectId=" + this.parentObjectId + ", view=" + this.view + ", pageOrder=" + this.pageOrder + ", vIndex=" + this.vIndex + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.moduleId);
        dest.writeString(this.moduleName);
        dest.writeString(this.parentObjectType);
        dest.writeString(this.parentObjectId);
        dest.writeString(this.view);
        Integer num = this.pageOrder;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.vIndex;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
    }

    public /* synthetic */ VideoAnalyticsPayload(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : num2);
    }
}
