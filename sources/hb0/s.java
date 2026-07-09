package hb0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface s {
    String _checkForOverwrittenHandlers();

    String _getCrashReport(String str);

    String _getErrors(String str);

    void _installSignalHandlers(String str, String str2, String str3, String str4, String str5, int i11, boolean z11, boolean z12);

    boolean _reinstallSignalHandlers();

    void _updateAppState(String str);

    void _updateMetaData(String str);

    void _updateSessionId(String str);
}
