package t4;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f129368a;

    k(Object obj) {
        this.f129368a = (LocaleList) obj;
    }

    @Override // t4.j
    public String a() {
        return this.f129368a.toLanguageTags();
    }

    @Override // t4.j
    public Object b() {
        return this.f129368a;
    }

    public boolean equals(Object obj) {
        return this.f129368a.equals(((j) obj).b());
    }

    @Override // t4.j
    public Locale get(int i11) {
        return this.f129368a.get(i11);
    }

    public int hashCode() {
        return this.f129368a.hashCode();
    }

    @Override // t4.j
    public boolean isEmpty() {
        return this.f129368a.isEmpty();
    }

    @Override // t4.j
    public int size() {
        return this.f129368a.size();
    }

    public String toString() {
        return this.f129368a.toString();
    }
}
