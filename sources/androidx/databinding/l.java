package androidx.databinding;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class l extends b implements Serializable {
    static final long serialVersionUID = 1;
    private Object mValue;

    public l(Object obj) {
        this.mValue = obj;
    }

    public Object get() {
        return this.mValue;
    }

    public void set(Object obj) {
        if (obj != this.mValue) {
            this.mValue = obj;
            notifyChange();
        }
    }

    public l() {
    }

    public l(j... jVarArr) {
        super(jVarArr);
    }
}
