package hc0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f100672a;

    private b(String str) {
        this.f100672a = str;
    }

    static a b(String str) {
        Objects.requireNonNull(str, "value must not be null");
        return new b(str);
    }

    @Override // hc0.a
    public String a() {
        return this.f100672a;
    }

    @Override // hc0.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String getValue() {
        return this.f100672a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Objects.equals(this.f100672a, ((a) obj).getValue());
    }

    public int hashCode() {
        return this.f100672a.hashCode();
    }

    public String toString() {
        return "AnyValueString{" + this.f100672a + "}";
    }
}
