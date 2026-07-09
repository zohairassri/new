package kotlin;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lz70/a0;", "Landroid/view/GestureDetector$OnGestureListener;", "<init>", "()V", "Landroid/view/MotionEvent;", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", "onDown", "", "onLongPress", "(Landroid/view/MotionEvent;)V", "onShowPress", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a0 implements GestureDetector.OnGestureListener {
    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        return false;
    }
}
