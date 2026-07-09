package tv;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final String a(com.google.android.play.core.appupdate.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int iF = aVar.f();
        return iF != 1 ? iF != 2 ? iF != 3 ? "UNKNOWN" : "DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS" : "UPDATE_AVAILABLE" : "UPDATE_NOT_AVAILABLE";
    }
}
