package k90;

import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface i {
    boolean addSpanAttribute(String str, String str2, String str3);

    boolean addSpanEvent(String str, String str2, Long l11, Map map);

    boolean recordCompletedSpan(String str, long j11, long j12, ErrorCode errorCode, String str2, Map map, List list);

    Object recordSpan(String str, String str2, Map map, List list, Function0 function0);

    String startSpan(String str, String str2, Long l11);

    boolean stopSpan(String str, ErrorCode errorCode, Long l11);
}
