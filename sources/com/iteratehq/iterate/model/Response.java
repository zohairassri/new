package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import com.theathletic.video.component.data.VideoRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0001HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/iteratehq/iterate/model/Response;", "", VideoRepository.XML_ATTR_VALUE, "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "iterate_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Response {

    @NotNull
    private final Object value;

    public Response(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public static /* synthetic */ Response copy$default(Response response, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = response.value;
        }
        return response.copy(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @NotNull
    public final Response copy(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new Response(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Response) && Intrinsics.areEqual(this.value, ((Response) other).value);
    }

    @NotNull
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "Response(value=" + this.value + ")";
    }
}
