package com.statsig.androidsdk.evaluator;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xr.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JY\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R$\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006!"}, d2 = {"Lcom/statsig/androidsdk/evaluator/SpecCondition;", "", "type", "", "targetValue", "operator", "field", "additionalValues", "", "idType", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getAdditionalValues", "()Ljava/util/Map;", "getField", "()Ljava/lang/String;", "getIdType", "getOperator", "getTargetValue", "()Ljava/lang/Object;", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SpecCondition {

    @c("additionalValues")
    private final Map<String, Object> additionalValues;

    @c("field")
    private final String field;

    @c("idType")
    @NotNull
    private final String idType;

    @c("operator")
    private final String operator;

    @c("targetValue")
    private final Object targetValue;

    @c("type")
    @NotNull
    private final String type;

    public SpecCondition(@NotNull String type, Object obj, String str, String str2, Map<String, ? extends Object> map, @NotNull String idType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(idType, "idType");
        this.type = type;
        this.targetValue = obj;
        this.operator = str;
        this.field = str2;
        this.additionalValues = map;
        this.idType = idType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpecCondition copy$default(SpecCondition specCondition, String str, Object obj, String str2, String str3, Map map, String str4, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = specCondition.type;
        }
        if ((i11 & 2) != 0) {
            obj = specCondition.targetValue;
        }
        if ((i11 & 4) != 0) {
            str2 = specCondition.operator;
        }
        if ((i11 & 8) != 0) {
            str3 = specCondition.field;
        }
        if ((i11 & 16) != 0) {
            map = specCondition.additionalValues;
        }
        if ((i11 & 32) != 0) {
            str4 = specCondition.idType;
        }
        Map map2 = map;
        String str5 = str4;
        return specCondition.copy(str, obj, str2, str3, map2, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getTargetValue() {
        return this.targetValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getField() {
        return this.field;
    }

    public final Map<String, Object> component5() {
        return this.additionalValues;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIdType() {
        return this.idType;
    }

    @NotNull
    public final SpecCondition copy(@NotNull String type, Object targetValue, String operator, String field, Map<String, ? extends Object> additionalValues, @NotNull String idType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(idType, "idType");
        return new SpecCondition(type, targetValue, operator, field, additionalValues, idType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecCondition)) {
            return false;
        }
        SpecCondition specCondition = (SpecCondition) other;
        return Intrinsics.areEqual(this.type, specCondition.type) && Intrinsics.areEqual(this.targetValue, specCondition.targetValue) && Intrinsics.areEqual(this.operator, specCondition.operator) && Intrinsics.areEqual(this.field, specCondition.field) && Intrinsics.areEqual(this.additionalValues, specCondition.additionalValues) && Intrinsics.areEqual(this.idType, specCondition.idType);
    }

    public final Map<String, Object> getAdditionalValues() {
        return this.additionalValues;
    }

    public final String getField() {
        return this.field;
    }

    @NotNull
    public final String getIdType() {
        return this.idType;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final Object getTargetValue() {
        return this.targetValue;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Object obj = this.targetValue;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.operator;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.field;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.additionalValues;
        return ((iHashCode4 + (map != null ? map.hashCode() : 0)) * 31) + this.idType.hashCode();
    }

    @NotNull
    public String toString() {
        return "SpecCondition(type=" + this.type + ", targetValue=" + this.targetValue + ", operator=" + ((Object) this.operator) + ", field=" + ((Object) this.field) + ", additionalValues=" + this.additionalValues + ", idType=" + this.idType + ')';
    }
}
