package l0;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f112752a;

    public final Integer a(KeyEvent keyEvent) {
        int iC = p2.d.c(keyEvent);
        if ((Integer.MIN_VALUE & iC) != 0) {
            this.f112752a = Integer.valueOf(iC & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.f112752a;
        if (num == null) {
            return Integer.valueOf(iC);
        }
        this.f112752a = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iC));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        if (num2 != null) {
            iC = num2.intValue();
        }
        return Integer.valueOf(iC);
    }
}
