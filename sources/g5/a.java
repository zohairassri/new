package g5;

import android.R;
import android.widget.AbsSpinner;
import android.widget.SpinnerAdapter;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(AbsSpinner absSpinner, List list) {
        if (list == null) {
            absSpinner.setAdapter((SpinnerAdapter) null);
            return;
        }
        SpinnerAdapter adapter = absSpinner.getAdapter();
        if (adapter instanceof g) {
            ((g) adapter).b(list);
        } else {
            absSpinner.setAdapter((SpinnerAdapter) new g(absSpinner.getContext(), list, R.layout.simple_spinner_item, R.layout.simple_spinner_dropdown_item, 0));
        }
    }
}
