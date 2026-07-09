package androidx.databinding;

import androidx.annotation.NonNull;
import androidx.databinding.j;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements j {
    private transient q mCallbacks;

    @Override // androidx.databinding.j
    public void addOnPropertyChangedCallback(@NonNull j.a aVar) {
        synchronized (this) {
            try {
                if (this.mCallbacks == null) {
                    this.mCallbacks = new q();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mCallbacks.b(aVar);
    }

    public void notifyChange() {
        synchronized (this) {
            try {
                q qVar = this.mCallbacks;
                if (qVar == null) {
                    return;
                }
                qVar.e(this, 0, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void notifyPropertyChanged(int i11) {
        synchronized (this) {
            try {
                q qVar = this.mCallbacks;
                if (qVar == null) {
                    return;
                }
                qVar.e(this, i11, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.j
    public void removeOnPropertyChangedCallback(@NonNull j.a aVar) {
        synchronized (this) {
            try {
                q qVar = this.mCallbacks;
                if (qVar == null) {
                    return;
                }
                qVar.k(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
