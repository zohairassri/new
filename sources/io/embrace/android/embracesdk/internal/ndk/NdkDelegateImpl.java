package io.embrace.android.embracesdk.internal.ndk;

import hb0.s;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JZ\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096 ¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0096 ¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0096 ¢\u0006\u0004\b\u0016\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0096 ¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\b\u0019\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\b\u001a\u0010\u0003J\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0096 ¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0096 ¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u0096 ¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fH\u0096 ¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lio/embrace/android/embracesdk/internal/ndk/NdkDelegateImpl;", "Lhb0/s;", "<init>", "()V", "", "report_path", "markerFilePath", "session_id", "app_state", "report_id", "", "api_level", "", "is_32bit", "dev_logging", "", "_installSignalHandlers", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZ)V", "new_device_meta_data", "_updateMetaData", "(Ljava/lang/String;)V", "new_session_id", "_updateSessionId", "new_app_state", "_updateAppState", "_testNativeCrash_C", "_testNativeCrash_CPP", "path", "_getCrashReport", "(Ljava/lang/String;)Ljava/lang/String;", "_getErrors", "_checkForOverwrittenHandlers", "()Ljava/lang/String;", "_reinstallSignalHandlers", "()Z", "embrace-android-features_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NdkDelegateImpl implements s {
    @Override // hb0.s
    public native String _checkForOverwrittenHandlers();

    @Override // hb0.s
    public native String _getCrashReport(String path);

    @Override // hb0.s
    public native String _getErrors(String path);

    @Override // hb0.s
    public native void _installSignalHandlers(String report_path, String markerFilePath, String session_id, String app_state, String report_id, int api_level, boolean is_32bit, boolean dev_logging);

    @Override // hb0.s
    public native boolean _reinstallSignalHandlers();

    public native void _testNativeCrash_C();

    public native void _testNativeCrash_CPP();

    @Override // hb0.s
    public native void _updateAppState(String new_app_state);

    @Override // hb0.s
    public native void _updateMetaData(String new_device_meta_data);

    @Override // hb0.s
    public native void _updateSessionId(String new_session_id);
}
