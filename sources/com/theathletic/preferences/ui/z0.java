package com.theathletic.preferences.ui;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\b\u000fB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/theathletic/preferences/ui/z0;", "Lcom/theathletic/ui/o0;", "", "sectionId", "", "titleResId", "<init>", "(Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "getSectionId", "()Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.IDLING, "()I", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "Lcom/theathletic/preferences/ui/z0$a;", "Lcom/theathletic/preferences/ui/z0$b;", "Lcom/theathletic/preferences/ui/z0$c;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class z0 implements com.theathletic.ui.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String sectionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int titleResId;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/preferences/ui/z0$a;", "Lcom/theathletic/preferences/ui/z0;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends z0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f75966c = new a();

        private a() {
            super("NEWSLETTER", R.string.preferences_section_newsletters, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/preferences/ui/z0$b;", "Lcom/theathletic/preferences/ui/z0;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends z0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f75967c = new b();

        private b() {
            super("PUSH_NOTIFS", R.string.preferences_section_push_notifs, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/preferences/ui/z0$c;", "Lcom/theathletic/preferences/ui/z0;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends z0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f75968c = new c();

        private c() {
            super("TOPIC_PUSH_NOTIFS", R.string.preferences_section_topic_push_notifs, null);
        }
    }

    public /* synthetic */ z0(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11);
    }

    @Override // com.theathletic.ui.o0
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getTitleResId() {
        return this.titleResId;
    }

    private z0(String str, int i11) {
        this.sectionId = str;
        this.titleResId = i11;
    }
}
