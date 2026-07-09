package tf0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class i2 extends j0 {
    @Override // tf0.j0
    public j0 K0(int i11, String str) {
        yf0.l.a(i11);
        return yf0.l.b(this, str);
    }

    public abstract i2 W0();

    protected final String a1() {
        i2 i2VarW0;
        i2 i2VarC = c1.c();
        if (this == i2VarC) {
            return "Dispatchers.Main";
        }
        try {
            i2VarW0 = i2VarC.W0();
        } catch (UnsupportedOperationException unused) {
            i2VarW0 = null;
        }
        if (this == i2VarW0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // tf0.j0
    public String toString() {
        String strA1 = a1();
        if (strA1 != null) {
            return strA1;
        }
        return r0.a(this) + '@' + r0.b(this);
    }
}
