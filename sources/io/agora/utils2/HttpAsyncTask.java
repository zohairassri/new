package io.agora.utils2;

import android.os.AsyncTask;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
class HttpAsyncTask extends AsyncTask<HttpAsyncTaskParam, Void, Void> {
    private static final int RESPONSE_COMPLETED = 1;
    private static final int RESPONSE_COMPLETED_REASON_NONE = 0;
    private static final int RESPONSE_COMPLETED_REASON_OTHER_ERROR = 4;
    private static final int RESPONSE_COMPLETED_REASON_SOCKET_TIMEOUT = 3;
    private static final int RESPONSE_COMPLETED_REASON_SUCCESS = 1;
    private static final int RESPONSE_COMPLETED_REASON_UNKNOWN_HOST = 2;
    private static final int RESPONSE_ON_GOING = 0;
    private static final int SIZE_FOR_CALLBACK = 16384;
    private static final String TAG = "HttpAsyncTask";
    private long nativeHandle;

    public HttpAsyncTask(long j11) {
        this.nativeHandle = j11;
    }

    private static native int nativeNotifyResponse(long j11, int i11, int i12, int i13, byte[] bArr, int i14, Map<String, String> map);

    private int notifyNativeResponse(int i11, int i12, int i13, byte[] bArr, Map<String, String> map) {
        return nativeNotifyResponse(this.nativeHandle, i11, i12, i13, bArr, bArr != null ? bArr.length : 0, map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0202 A[Catch: Exception -> 0x0035, SocketTimeoutException -> 0x0231, UnknownHostException -> 0x0238, TRY_ENTER, TryCatch #9 {SocketTimeoutException -> 0x0231, UnknownHostException -> 0x0238, Exception -> 0x0035, blocks: (B:7:0x001d, B:9:0x0028, B:10:0x0030, B:14:0x0041, B:16:0x0045, B:17:0x004d, B:19:0x0053, B:20:0x0069, B:22:0x006d, B:24:0x0073, B:26:0x0077, B:28:0x007d, B:29:0x00b3, B:31:0x00b7, B:33:0x00bd, B:34:0x00c4, B:36:0x00d6, B:37:0x00de, B:39:0x00e8, B:40:0x00eb, B:42:0x00ef, B:43:0x0100, B:45:0x010f, B:46:0x0117, B:48:0x011d, B:56:0x013f, B:57:0x0143, B:59:0x015c, B:61:0x0160, B:64:0x0165, B:66:0x016b, B:112:0x020c, B:69:0x0178, B:101:0x01df, B:109:0x0202, B:115:0x0215, B:116:0x0218, B:13:0x0038), top: B:133:0x001d }] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Void doInBackground(io.agora.utils2.HttpAsyncTaskParam... r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.HttpAsyncTask.doInBackground(io.agora.utils2.HttpAsyncTaskParam[]):java.lang.Void");
    }
}
