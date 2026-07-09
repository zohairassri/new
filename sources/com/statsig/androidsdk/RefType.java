package com.statsig.androidsdk;

import com.theathletic.video.component.data.VideoRepository;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/statsig/androidsdk/RefType;", "", VideoRepository.XML_ATTR_VALUE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "GATE", "EXPERIMENT", "LAYER", "DYNAMIC_CONFIG", "STATIC", "UNKNOWN", "Companion", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum RefType {
    GATE("gate"),
    EXPERIMENT("experiment"),
    LAYER("layer"),
    DYNAMIC_CONFIG("dynamic_config"),
    STATIC("static"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String value;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/statsig/androidsdk/RefType$Companion;", "", "()V", "fromString", "Lcom/statsig/androidsdk/RefType;", VideoRepository.XML_ATTR_VALUE, "", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RefType fromString(@NotNull String value) {
            RefType refType;
            Intrinsics.checkNotNullParameter(value, "value");
            RefType[] refTypeArrValuesCustom = RefType.valuesCustom();
            int length = refTypeArrValuesCustom.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    refType = null;
                    break;
                }
                refType = refTypeArrValuesCustom[i11];
                if (Intrinsics.areEqual(refType.getValue(), value)) {
                    break;
                }
                i11++;
            }
            return refType == null ? RefType.UNKNOWN : refType;
        }

        private Companion() {
        }
    }

    RefType(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static RefType[] valuesCustom() {
        RefType[] refTypeArrValuesCustom = values();
        return (RefType[]) Arrays.copyOf(refTypeArrValuesCustom, refTypeArrValuesCustom.length);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.value;
    }
}
