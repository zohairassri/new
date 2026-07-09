package yr;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class z extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f140954a;

    public z(String str) {
        this.f140954a = str;
    }

    private BigDecimal a() {
        return b0.b(this.f140954a);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return a();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f140954a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.f140954a.equals(((z) obj).f140954a);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f140954a);
    }

    public int hashCode() {
        return this.f140954a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f140954a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f140954a);
            }
        } catch (NumberFormatException unused2) {
            return this.a().intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f140954a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public String toString() {
        return this.f140954a;
    }
}
