package io.embrace.android.embracesdk.internal.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@i(generateAdapter = false)
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"io/embrace/android/embracesdk/internal/payload/PushNotificationBreadcrumb$NotificationType", "", "Lio/embrace/android/embracesdk/internal/payload/PushNotificationBreadcrumb$NotificationType;", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "()Ljava/lang/String;", "Builder", "a", "NOTIFICATION", "DATA", "NOTIFICATION_AND_DATA", "UNKNOWN", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum PushNotificationBreadcrumb$NotificationType {
    NOTIFICATION("notif"),
    DATA("data"),
    NOTIFICATION_AND_DATA("notif-data"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: Builder, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String type;

    /* JADX INFO: renamed from: io.embrace.android.embracesdk.internal.payload.PushNotificationBreadcrumb$NotificationType$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PushNotificationBreadcrumb$NotificationType a(boolean z11, boolean z12) {
            return (z11 && z12) ? PushNotificationBreadcrumb$NotificationType.NOTIFICATION_AND_DATA : (!z11 || z12) ? (z11 || !z12) ? PushNotificationBreadcrumb$NotificationType.UNKNOWN : PushNotificationBreadcrumb$NotificationType.NOTIFICATION : PushNotificationBreadcrumb$NotificationType.DATA;
        }

        private Companion() {
        }
    }

    PushNotificationBreadcrumb$NotificationType(String str) {
        this.type = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
