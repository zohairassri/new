package on;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f120616a = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "gbraid", "session_number", "session_id"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f120617b = {"_ln", "_fot", "_fvt", "_ldl", TransferTable.COLUMN_ID, "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_gbraid", "_sno", "_sid"};

    public static String a(String str) {
        return a0.b(str, f120616a, f120617b);
    }
}
