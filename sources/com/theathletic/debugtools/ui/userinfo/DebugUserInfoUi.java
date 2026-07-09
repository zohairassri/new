package com.theathletic.debugtools.ui.userinfo;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.video.component.data.VideoRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/theathletic/debugtools/ui/userinfo/DebugUserInfoUi;", "", "<init>", "()V", "UserInfoItem", "Interactor", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DebugUserInfoUi {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/theathletic/debugtools/ui/userinfo/DebugUserInfoUi$Interactor;", "", "", "a", "()V", "", TransferTable.COLUMN_KEY, "contents", "O1", "(Ljava/lang/String;Ljava/lang/String;)V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Interactor {
        void O1(String key, String contents);

        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/theathletic/debugtools/ui/userinfo/DebugUserInfoUi$UserInfoItem;", "", "", "label", VideoRepository.XML_ATTR_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "a", QueryKeys.PAGE_LOAD_TIME, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserInfoItem {
        public static final int $stable = 0;

        @NotNull
        private final String label;

        @NotNull
        private final String value;

        public UserInfoItem(String label, String value) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.label = label;
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserInfoItem)) {
                return false;
            }
            UserInfoItem userInfoItem = (UserInfoItem) other;
            return Intrinsics.areEqual(this.label, userInfoItem.label) && Intrinsics.areEqual(this.value, userInfoItem.value);
        }

        public int hashCode() {
            return (this.label.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "UserInfoItem(label=" + this.label + ", value=" + this.value + ")";
        }
    }
}
