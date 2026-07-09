package com.theathletic.rooms.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/theathletic/rooms/ui/k0;", "", "<init>", "()V", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.PAGE_LOAD_TIME, QueryKeys.SUBDOMAIN, "a", "Lcom/theathletic/rooms/ui/k0$a;", "Lcom/theathletic/rooms/ui/k0$b;", "Lcom/theathletic/rooms/ui/k0$c;", "Lcom/theathletic/rooms/ui/k0$d;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class k0 {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/rooms/ui/k0$a;", "Lcom/theathletic/rooms/ui/k0;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f79037a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.theathletic.rooms.ui.k0$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/theathletic/rooms/ui/k0$b;", "Lcom/theathletic/rooms/ui/k0;", "", "isMuted", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.MEMFLY_API_VERSION, "()Z", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeMute extends k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isMuted;

        public ChangeMute(boolean z11) {
            super(null);
            this.isMuted = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsMuted() {
            return this.isMuted;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChangeMute) && this.isMuted == ((ChangeMute) other).isMuted;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMuted);
        }

        public String toString() {
            return "ChangeMute(isMuted=" + this.isMuted + ")";
        }
    }

    /* JADX INFO: renamed from: com.theathletic.rooms.ui.k0$c, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/theathletic/rooms/ui/k0$c;", "Lcom/theathletic/rooms/ui/k0;", "", "roomEnded", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.MEMFLY_API_VERSION, "()Z", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LeaveRoom extends k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean roomEnded;

        public LeaveRoom() {
            this(false, 1, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getRoomEnded() {
            return this.roomEnded;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LeaveRoom) && this.roomEnded == ((LeaveRoom) other).roomEnded;
        }

        public int hashCode() {
            return Boolean.hashCode(this.roomEnded);
        }

        public String toString() {
            return "LeaveRoom(roomEnded=" + this.roomEnded + ")";
        }

        public LeaveRoom(boolean z11) {
            super(null);
            this.roomEnded = z11;
        }

        public /* synthetic */ LeaveRoom(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11);
        }
    }

    /* JADX INFO: renamed from: com.theathletic.rooms.ui.k0$d, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/theathletic/rooms/ui/k0$d;", "Lcom/theathletic/rooms/ui/k0;", "", "onStage", "fromHost", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.MEMFLY_API_VERSION, QueryKeys.PAGE_LOAD_TIME, "()Z", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwapStageStatus extends k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean onStage;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean fromHost;

        public /* synthetic */ SwapStageStatus(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11, (i11 & 2) != 0 ? false : z12);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getFromHost() {
            return this.fromHost;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getOnStage() {
            return this.onStage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SwapStageStatus)) {
                return false;
            }
            SwapStageStatus swapStageStatus = (SwapStageStatus) other;
            return this.onStage == swapStageStatus.onStage && this.fromHost == swapStageStatus.fromHost;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.onStage) * 31) + Boolean.hashCode(this.fromHost);
        }

        public String toString() {
            return "SwapStageStatus(onStage=" + this.onStage + ", fromHost=" + this.fromHost + ")";
        }

        public SwapStageStatus(boolean z11, boolean z12) {
            super(null);
            this.onStage = z11;
            this.fromHost = z12;
        }
    }

    public /* synthetic */ k0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private k0() {
    }
}
