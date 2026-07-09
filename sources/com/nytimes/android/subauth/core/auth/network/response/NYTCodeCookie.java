package com.nytimes.android.subauth.core.auth.network.response;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import com.theathletic.video.component.data.VideoRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/nytimes/android/subauth/core/auth/network/response/NYTCodeCookie;", "", "", VideoRepository.XML_ATTR_VALUE, "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/nytimes/android/subauth/core/auth/network/response/NYTCodeCookie;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "subauth-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NYTCodeCookie {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public NYTCodeCookie(@g(name = VideoRepository.XML_ATTR_VALUE) @NotNull String value, @g(name = "name") @NotNull String id2) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.value = value;
        this.id = id2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final NYTCodeCookie copy(@g(name = VideoRepository.XML_ATTR_VALUE) @NotNull String value, @g(name = "name") @NotNull String id2) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new NYTCodeCookie(value, id2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NYTCodeCookie)) {
            return false;
        }
        NYTCodeCookie nYTCodeCookie = (NYTCodeCookie) other;
        return Intrinsics.areEqual(this.value, nYTCodeCookie.value) && Intrinsics.areEqual(this.id, nYTCodeCookie.id);
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + this.id.hashCode();
    }

    public String toString() {
        return "NYTCodeCookie(value=" + this.value + ", id=" + this.id + ")";
    }
}
