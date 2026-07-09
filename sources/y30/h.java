package y30;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import wf0.c0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Lwf0/c0;", "Lkotlin/Function1;", "block", "", QueryKeys.PAGE_LOAD_TIME, "(Lwf0/c0;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(c0 c0Var, Function1 function1) {
        Object value = c0Var.getValue();
        if (value == null) {
            return;
        }
        c0Var.setValue(function1.invoke(value));
    }
}
