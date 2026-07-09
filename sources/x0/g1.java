package x0;

import android.view.textclassifier.TextClassification;
import h3.c3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f136226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f136227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextClassification f136228c;

    public /* synthetic */ g1(CharSequence charSequence, long j11, TextClassification textClassification, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, j11, textClassification);
    }

    public final long a() {
        return this.f136227b;
    }

    public final CharSequence b() {
        return this.f136226a;
    }

    public final TextClassification c() {
        return this.f136228c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.areEqual(this.f136226a, g1Var.f136226a) && c3.g(this.f136227b, g1Var.f136227b) && Intrinsics.areEqual(this.f136228c, g1Var.f136228c);
    }

    public int hashCode() {
        return (((this.f136226a.hashCode() * 31) + c3.o(this.f136227b)) * 31) + this.f136228c.hashCode();
    }

    public String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f136226a) + ", selection=" + ((Object) c3.q(this.f136227b)) + ", textClassification=" + this.f136228c + ')';
    }

    private g1(CharSequence charSequence, long j11, TextClassification textClassification) {
        this.f136226a = charSequence;
        this.f136227b = j11;
        this.f136228c = textClassification;
    }
}
