package com.theathletic.profile.ui.privacychoices;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.profile.ui.privacychoices.l, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/theathletic/profile/ui/privacychoices/l;", "", "", "isOptedIn", "isEnabled", "Lcom/theathletic/profile/ui/privacychoices/l$a;", "errorState", "<init>", "(ZZLcom/theathletic/profile/ui/privacychoices/l$a;)V", "a", "(ZZLcom/theathletic/profile/ui/privacychoices/l$a;)Lcom/theathletic/profile/ui/privacychoices/l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", QueryKeys.MEMFLY_API_VERSION, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "()Z", QueryKeys.PAGE_LOAD_TIME, QueryKeys.SUBDOMAIN, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "Lcom/theathletic/profile/ui/privacychoices/l$a;", "()Lcom/theathletic/profile/ui/privacychoices/l$a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PrivacyChoicesUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOptedIn;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final a errorState;

    /* JADX INFO: renamed from: com.theathletic.profile.ui.privacychoices.l$a */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/theathletic/profile/ui/privacychoices/l$a;", "", "<init>", "()V", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.PAGE_LOAD_TIME, "a", "Lcom/theathletic/profile/ui/privacychoices/l$a$a;", "Lcom/theathletic/profile/ui/privacychoices/l$a$b;", "Lcom/theathletic/profile/ui/privacychoices/l$a$c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: com.theathletic.profile.ui.privacychoices.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/profile/ui/privacychoices/l$a$a;", "Lcom/theathletic/profile/ui/privacychoices/l$a;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0744a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0744a f76590a = new C0744a();

            private C0744a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.theathletic.profile.ui.privacychoices.l$a$b */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/profile/ui/privacychoices/l$a$b;", "Lcom/theathletic/profile/ui/privacychoices/l$a;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f76591a = new b();

            private b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.theathletic.profile.ui.privacychoices.l$a$c */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/profile/ui/privacychoices/l$a$c;", "Lcom/theathletic/profile/ui/privacychoices/l$a;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f76592a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public PrivacyChoicesUiModel(boolean z11, boolean z12, a aVar) {
        this.isOptedIn = z11;
        this.isEnabled = z12;
        this.errorState = aVar;
    }

    public static /* synthetic */ PrivacyChoicesUiModel b(PrivacyChoicesUiModel privacyChoicesUiModel, boolean z11, boolean z12, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = privacyChoicesUiModel.isOptedIn;
        }
        if ((i11 & 2) != 0) {
            z12 = privacyChoicesUiModel.isEnabled;
        }
        if ((i11 & 4) != 0) {
            aVar = privacyChoicesUiModel.errorState;
        }
        return privacyChoicesUiModel.a(z11, z12, aVar);
    }

    public final PrivacyChoicesUiModel a(boolean isOptedIn, boolean isEnabled, a errorState) {
        return new PrivacyChoicesUiModel(isOptedIn, isEnabled, errorState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getErrorState() {
        return this.errorState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsOptedIn() {
        return this.isOptedIn;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacyChoicesUiModel)) {
            return false;
        }
        PrivacyChoicesUiModel privacyChoicesUiModel = (PrivacyChoicesUiModel) other;
        return this.isOptedIn == privacyChoicesUiModel.isOptedIn && this.isEnabled == privacyChoicesUiModel.isEnabled && Intrinsics.areEqual(this.errorState, privacyChoicesUiModel.errorState);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isOptedIn) * 31) + Boolean.hashCode(this.isEnabled)) * 31;
        a aVar = this.errorState;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "PrivacyChoicesUiModel(isOptedIn=" + this.isOptedIn + ", isEnabled=" + this.isEnabled + ", errorState=" + this.errorState + ")";
    }

    public /* synthetic */ PrivacyChoicesUiModel(boolean z11, boolean z12, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? null : aVar);
    }
}
