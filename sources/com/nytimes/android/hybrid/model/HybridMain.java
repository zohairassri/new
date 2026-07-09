package com.nytimes.android.hybrid.model;

import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/nytimes/android/hybrid/model/HybridMain;", "", "contents", "", "(Ljava/lang/String;)V", "getContents", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "hybrid_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class HybridMain {

    @NotNull
    private final String contents;

    public HybridMain(@NotNull String contents) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        this.contents = contents;
    }

    public static /* synthetic */ HybridMain copy$default(HybridMain hybridMain, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hybridMain.contents;
        }
        return hybridMain.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContents() {
        return this.contents;
    }

    @NotNull
    public final HybridMain copy(@NotNull String contents) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        return new HybridMain(contents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HybridMain) && Intrinsics.areEqual(this.contents, ((HybridMain) other).contents);
    }

    @NotNull
    public final String getContents() {
        return this.contents;
    }

    public int hashCode() {
        return this.contents.hashCode();
    }

    @NotNull
    public String toString() {
        return "HybridMain(contents=" + this.contents + ")";
    }
}
