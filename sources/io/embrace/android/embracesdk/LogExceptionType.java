package io.embrace.android.embracesdk;

import com.comscore.android.id.IdHelperAndroid;
import com.theathletic.video.component.data.VideoRepository;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/embrace/android/embracesdk/LogExceptionType;", "", VideoRepository.XML_ATTR_VALUE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NONE", "HANDLED", "UNHANDLED", "embrace-android-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum LogExceptionType {
    NONE(IdHelperAndroid.NO_ID_AVAILABLE),
    HANDLED("handled"),
    UNHANDLED("unhandled");


    @NotNull
    private final String value;

    LogExceptionType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
