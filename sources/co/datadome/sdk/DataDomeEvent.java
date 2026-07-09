package co.datadome.sdk;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Keep
public class DataDomeEvent {
    private final long date = new Date().getTime();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f18019id;
    private final String message;
    private final String source;

    public DataDomeEvent(int i11, String str, String str2) {
        this.f18019id = i11;
        this.message = str;
        this.source = str2;
    }

    @NonNull
    public String customJsonString() {
        return String.format(Locale.getDefault(), "{\"id\":%d, \"message\":\"%s\", \"source\":\"%s\", \"date\":%d}", Integer.valueOf(this.f18019id), this.message, this.source, Long.valueOf(this.date));
    }
}
