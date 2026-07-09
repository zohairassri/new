package o0;

import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextClassification f119906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f119907c;

    public h(Object obj, TextClassification textClassification, int i11) {
        super(obj);
        this.f119906b = textClassification;
        this.f119907c = i11;
    }

    public final int b() {
        return this.f119907c;
    }

    public final TextClassification c() {
        return this.f119906b;
    }

    public String toString() {
        return "TextContextMenuRemoteActionItem(key=" + a() + ", textClassification=" + this.f119906b + ", index=" + this.f119907c + ')';
    }
}
