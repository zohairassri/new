package com.theathletic.ui;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.video.component.data.VideoRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/theathletic/ui/s0;", "", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.PAGE_LOAD_TIME, "a", "Lcom/theathletic/ui/s0$a;", "Lcom/theathletic/ui/s0$b;", "Lcom/theathletic/ui/s0$c;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface s0 {

    /* JADX INFO: renamed from: com.theathletic.ui.s0$c, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/theathletic/ui/s0$c;", "Lcom/theathletic/ui/s0;", "", VideoRepository.XML_ATTR_VALUE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StringWrapper implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        public StringWrapper(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StringWrapper) && Intrinsics.areEqual(this.value, ((StringWrapper) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "StringWrapper(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: com.theathletic.ui.s0$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB'\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/theathletic/ui/s0$b;", "Lcom/theathletic/ui/s0;", "", "stringRes", "", "", "parameters", "<init>", "(ILjava/util/List;)V", "", "items", "(I[Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.IDLING, QueryKeys.PAGE_LOAD_TIME, "Ljava/util/List;", "()Ljava/util/List;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StringWithParams implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int stringRes;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List parameters;

        public StringWithParams(int i11, List parameters) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.stringRes = i11;
            this.parameters = parameters;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getParameters() {
            return this.parameters;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getStringRes() {
            return this.stringRes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringWithParams)) {
                return false;
            }
            StringWithParams stringWithParams = (StringWithParams) other;
            return this.stringRes == stringWithParams.stringRes && Intrinsics.areEqual(this.parameters, stringWithParams.parameters);
        }

        public int hashCode() {
            return (Integer.hashCode(this.stringRes) * 31) + this.parameters.hashCode();
        }

        public String toString() {
            return "StringWithParams(stringRes=" + this.stringRes + ", parameters=" + this.parameters + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StringWithParams(int i11, Object... items) {
            this(i11, kotlin.collections.n.c1(items));
            Intrinsics.checkNotNullParameter(items, "items");
        }
    }

    /* JADX INFO: renamed from: com.theathletic.ui.s0$a, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB/\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\n\"\u00020\u0006¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0016\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/theathletic/ui/s0$a;", "Lcom/theathletic/ui/s0;", "", "pluralsRes", "count", "", "", "parameters", "<init>", "(IILjava/util/List;)V", "", "items", "(II[Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.IDLING, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.PAGE_LOAD_TIME, "Ljava/util/List;", "()Ljava/util/List;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Plurals implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int pluralsRes;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int count;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List parameters;

        public Plurals(int i11, int i12, List parameters) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.pluralsRes = i11;
            this.count = i12;
            this.parameters = parameters;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getParameters() {
            return this.parameters;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getPluralsRes() {
            return this.pluralsRes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Plurals)) {
                return false;
            }
            Plurals plurals = (Plurals) other;
            return this.pluralsRes == plurals.pluralsRes && this.count == plurals.count && Intrinsics.areEqual(this.parameters, plurals.parameters);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.pluralsRes) * 31) + Integer.hashCode(this.count)) * 31) + this.parameters.hashCode();
        }

        public String toString() {
            return "Plurals(pluralsRes=" + this.pluralsRes + ", count=" + this.count + ", parameters=" + this.parameters + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Plurals(int i11, int i12, Object... items) {
            this(i11, i12, kotlin.collections.n.c1(items));
            Intrinsics.checkNotNullParameter(items, "items");
        }
    }
}
