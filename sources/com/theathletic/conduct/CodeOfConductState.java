package com.theathletic.conduct;

import com.amazonaws.event.ProgressEvent;
import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.R;
import com.theathletic.ui.r;
import io.agora.rtc2.internal.AudioRoutingController;
import io.agora.rtc2.internal.Marshallable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.theathletic.conduct.h, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b&\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b'\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b(\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b*\u0010\u0017R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b \u0010\u0017¨\u0006,"}, d2 = {"Lcom/theathletic/conduct/h;", "Lcom/theathletic/ui/r;", "", "titleRes", "introRes", "firstSubtitleRes", "firstTextRes", "secondSubtitleRes", "secondTextRes", "thirdSubtitleRes", "thirdTextRes", "fourthSubtitleRes", "fourthTextRes", "epilogueRes", "agreeRes", "disagreeRes", "closeRes", "<init>", "(IIIIIIIIIIIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.IDLING, QueryKeys.IS_NEW_USER, QueryKeys.PAGE_LOAD_TIME, QueryKeys.VIEW_TITLE, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.SUBDOMAIN, QueryKeys.VISIT_FREQUENCY, QueryKeys.DECAY, "k", QueryKeys.ACCOUNT_ID, "l", QueryKeys.HOST, QueryKeys.MAX_SCROLL_DEPTH, "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CodeOfConductState implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int titleRes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int introRes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int firstSubtitleRes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int firstTextRes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int secondSubtitleRes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int secondTextRes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int thirdSubtitleRes;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int thirdTextRes;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fourthSubtitleRes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fourthTextRes;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final int epilogueRes;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final int agreeRes;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final int disagreeRes;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final int closeRes;

    public CodeOfConductState() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16383, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAgreeRes() {
        return this.agreeRes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCloseRes() {
        return this.closeRes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDisagreeRes() {
        return this.disagreeRes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getEpilogueRes() {
        return this.epilogueRes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getFirstSubtitleRes() {
        return this.firstSubtitleRes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeOfConductState)) {
            return false;
        }
        CodeOfConductState codeOfConductState = (CodeOfConductState) other;
        return this.titleRes == codeOfConductState.titleRes && this.introRes == codeOfConductState.introRes && this.firstSubtitleRes == codeOfConductState.firstSubtitleRes && this.firstTextRes == codeOfConductState.firstTextRes && this.secondSubtitleRes == codeOfConductState.secondSubtitleRes && this.secondTextRes == codeOfConductState.secondTextRes && this.thirdSubtitleRes == codeOfConductState.thirdSubtitleRes && this.thirdTextRes == codeOfConductState.thirdTextRes && this.fourthSubtitleRes == codeOfConductState.fourthSubtitleRes && this.fourthTextRes == codeOfConductState.fourthTextRes && this.epilogueRes == codeOfConductState.epilogueRes && this.agreeRes == codeOfConductState.agreeRes && this.disagreeRes == codeOfConductState.disagreeRes && this.closeRes == codeOfConductState.closeRes;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getFirstTextRes() {
        return this.firstTextRes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getFourthSubtitleRes() {
        return this.fourthSubtitleRes;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getFourthTextRes() {
        return this.fourthTextRes;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.titleRes) * 31) + Integer.hashCode(this.introRes)) * 31) + Integer.hashCode(this.firstSubtitleRes)) * 31) + Integer.hashCode(this.firstTextRes)) * 31) + Integer.hashCode(this.secondSubtitleRes)) * 31) + Integer.hashCode(this.secondTextRes)) * 31) + Integer.hashCode(this.thirdSubtitleRes)) * 31) + Integer.hashCode(this.thirdTextRes)) * 31) + Integer.hashCode(this.fourthSubtitleRes)) * 31) + Integer.hashCode(this.fourthTextRes)) * 31) + Integer.hashCode(this.epilogueRes)) * 31) + Integer.hashCode(this.agreeRes)) * 31) + Integer.hashCode(this.disagreeRes)) * 31) + Integer.hashCode(this.closeRes);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getIntroRes() {
        return this.introRes;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSecondSubtitleRes() {
        return this.secondSubtitleRes;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getSecondTextRes() {
        return this.secondTextRes;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getThirdSubtitleRes() {
        return this.thirdSubtitleRes;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getThirdTextRes() {
        return this.thirdTextRes;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    public String toString() {
        return "CodeOfConductState(titleRes=" + this.titleRes + ", introRes=" + this.introRes + ", firstSubtitleRes=" + this.firstSubtitleRes + ", firstTextRes=" + this.firstTextRes + ", secondSubtitleRes=" + this.secondSubtitleRes + ", secondTextRes=" + this.secondTextRes + ", thirdSubtitleRes=" + this.thirdSubtitleRes + ", thirdTextRes=" + this.thirdTextRes + ", fourthSubtitleRes=" + this.fourthSubtitleRes + ", fourthTextRes=" + this.fourthTextRes + ", epilogueRes=" + this.epilogueRes + ", agreeRes=" + this.agreeRes + ", disagreeRes=" + this.disagreeRes + ", closeRes=" + this.closeRes + ")";
    }

    public CodeOfConductState(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25) {
        this.titleRes = i11;
        this.introRes = i12;
        this.firstSubtitleRes = i13;
        this.firstTextRes = i14;
        this.secondSubtitleRes = i15;
        this.secondTextRes = i16;
        this.thirdSubtitleRes = i17;
        this.thirdTextRes = i18;
        this.fourthSubtitleRes = i19;
        this.fourthTextRes = i21;
        this.epilogueRes = i22;
        this.agreeRes = i23;
        this.disagreeRes = i24;
        this.closeRes = i25;
    }

    public /* synthetic */ CodeOfConductState(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, DefaultConstructorMarker defaultConstructorMarker) {
        this((i26 & 1) != 0 ? R.string.comments_check_conduct_title : i11, (i26 & 2) != 0 ? R.string.comments_check_conduct_introduction : i12, (i26 & 4) != 0 ? R.string.comments_check_conduct_subtitle_1 : i13, (i26 & 8) != 0 ? R.string.comments_check_conduct_text_1 : i14, (i26 & 16) != 0 ? R.string.comments_check_conduct_subtitle_2 : i15, (i26 & 32) != 0 ? R.string.comments_check_conduct_text_2 : i16, (i26 & 64) != 0 ? R.string.comments_check_conduct_subtitle_3 : i17, (i26 & 128) != 0 ? R.string.comments_check_conduct_text_3 : i18, (i26 & 256) != 0 ? R.string.comments_check_conduct_subtitle_4 : i19, (i26 & AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER) != 0 ? R.string.comments_check_conduct_text_4 : i21, (i26 & 1024) != 0 ? R.string.comments_check_conduct_epilogue : i22, (i26 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? R.string.comments_check_conduct_button_yes : i23, (i26 & 4096) != 0 ? R.string.comments_check_conduct_button_no : i24, (i26 & Marshallable.PROTO_PACKET_SIZE) != 0 ? R.string.comments_check_conduct_button_close : i25);
    }
}
