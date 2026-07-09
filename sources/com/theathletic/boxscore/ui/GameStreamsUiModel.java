package com.theathletic.boxscore.ui;

import com.amazonaws.services.s3.internal.Constants;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.boxscore.ui.h3, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0015\u001c\u0018B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u001c\u0010 ¨\u0006!"}, d2 = {"Lcom/theathletic/boxscore/ui/h3;", "", "Lcom/theathletic/boxscore/ui/h3$a;", "broadcastNetwork", "Lcom/theathletic/boxscore/ui/h3$c;", "streamingInfo", "Lcom/theathletic/boxscore/ui/h3$b;", "livePreview", "", "showLivePreview", "<init>", "(Lcom/theathletic/boxscore/ui/h3$a;Lcom/theathletic/boxscore/ui/h3$c;Lcom/theathletic/boxscore/ui/h3$b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/theathletic/boxscore/ui/h3$a;", "()Lcom/theathletic/boxscore/ui/h3$a;", QueryKeys.PAGE_LOAD_TIME, "Lcom/theathletic/boxscore/ui/h3$c;", QueryKeys.SUBDOMAIN, "()Lcom/theathletic/boxscore/ui/h3$c;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "Lcom/theathletic/boxscore/ui/h3$b;", "()Lcom/theathletic/boxscore/ui/h3$b;", QueryKeys.MEMFLY_API_VERSION, "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GameStreamsUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BroadcastNetwork broadcastNetwork;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final StreamingInfo streamingInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LivePreview livePreview;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showLivePreview;

    /* JADX INFO: renamed from: com.theathletic.boxscore.ui.h3$a, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/theathletic/boxscore/ui/h3$a;", "", "", "title", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BroadcastNetwork {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        public BroadcastNetwork(String title, String name) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(name, "name");
            this.title = title;
            this.name = name;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BroadcastNetwork)) {
                return false;
            }
            BroadcastNetwork broadcastNetwork = (BroadcastNetwork) other;
            return Intrinsics.areEqual(this.title, broadcastNetwork.title) && Intrinsics.areEqual(this.name, broadcastNetwork.name);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            return "BroadcastNetwork(title=" + this.title + ", name=" + this.name + ")";
        }
    }

    /* JADX INFO: renamed from: com.theathletic.boxscore.ui.h3$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/theathletic/boxscore/ui/h3$b;", "", "", "title", "widgetUrl", "provider", "", "allowPreviewToPlay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.PAGE_LOAD_TIME, QueryKeys.SUBDOMAIN, QueryKeys.MEMFLY_API_VERSION, "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LivePreview {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String widgetUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String provider;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean allowPreviewToPlay;

        public LivePreview(String title, String widgetUrl, String provider, boolean z11) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(widgetUrl, "widgetUrl");
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.title = title;
            this.widgetUrl = widgetUrl;
            this.provider = provider;
            this.allowPreviewToPlay = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAllowPreviewToPlay() {
            return this.allowPreviewToPlay;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getProvider() {
            return this.provider;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getWidgetUrl() {
            return this.widgetUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LivePreview)) {
                return false;
            }
            LivePreview livePreview = (LivePreview) other;
            return Intrinsics.areEqual(this.title, livePreview.title) && Intrinsics.areEqual(this.widgetUrl, livePreview.widgetUrl) && Intrinsics.areEqual(this.provider, livePreview.provider) && this.allowPreviewToPlay == livePreview.allowPreviewToPlay;
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.widgetUrl.hashCode()) * 31) + this.provider.hashCode()) * 31) + Boolean.hashCode(this.allowPreviewToPlay);
        }

        public String toString() {
            return "LivePreview(title=" + this.title + ", widgetUrl=" + this.widgetUrl + ", provider=" + this.provider + ", allowPreviewToPlay=" + this.allowPreviewToPlay + ")";
        }
    }

    /* JADX INFO: renamed from: com.theathletic.boxscore.ui.h3$c, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/theathletic/boxscore/ui/h3$c;", "", "", "title", "", "Lcom/theathletic/boxscore/ui/h3$c$a;", "streams", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StreamingInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List streams;

        /* JADX INFO: renamed from: com.theathletic.boxscore.ui.h3$c$a, reason: from toString */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/theathletic/boxscore/ui/h3$c$a;", "", "", "ctaText", "provider", Constants.URL_ENCODING, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Stream {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String ctaText;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String provider;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String url;

            public Stream(String ctaText, String provider, String url) {
                Intrinsics.checkNotNullParameter(ctaText, "ctaText");
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(url, "url");
                this.ctaText = ctaText;
                this.provider = provider;
                this.url = url;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCtaText() {
                return this.ctaText;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getProvider() {
                return this.provider;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Stream)) {
                    return false;
                }
                Stream stream = (Stream) other;
                return Intrinsics.areEqual(this.ctaText, stream.ctaText) && Intrinsics.areEqual(this.provider, stream.provider) && Intrinsics.areEqual(this.url, stream.url);
            }

            public int hashCode() {
                return (((this.ctaText.hashCode() * 31) + this.provider.hashCode()) * 31) + this.url.hashCode();
            }

            public String toString() {
                return "Stream(ctaText=" + this.ctaText + ", provider=" + this.provider + ", url=" + this.url + ")";
            }
        }

        public StreamingInfo(String title, List streams) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(streams, "streams");
            this.title = title;
            this.streams = streams;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getStreams() {
            return this.streams;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StreamingInfo)) {
                return false;
            }
            StreamingInfo streamingInfo = (StreamingInfo) other;
            return Intrinsics.areEqual(this.title, streamingInfo.title) && Intrinsics.areEqual(this.streams, streamingInfo.streams);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.streams.hashCode();
        }

        public String toString() {
            return "StreamingInfo(title=" + this.title + ", streams=" + this.streams + ")";
        }
    }

    public GameStreamsUiModel(BroadcastNetwork broadcastNetwork, StreamingInfo streamingInfo, LivePreview livePreview, boolean z11) {
        this.broadcastNetwork = broadcastNetwork;
        this.streamingInfo = streamingInfo;
        this.livePreview = livePreview;
        this.showLivePreview = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BroadcastNetwork getBroadcastNetwork() {
        return this.broadcastNetwork;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LivePreview getLivePreview() {
        return this.livePreview;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowLivePreview() {
        return this.showLivePreview;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final StreamingInfo getStreamingInfo() {
        return this.streamingInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameStreamsUiModel)) {
            return false;
        }
        GameStreamsUiModel gameStreamsUiModel = (GameStreamsUiModel) other;
        return Intrinsics.areEqual(this.broadcastNetwork, gameStreamsUiModel.broadcastNetwork) && Intrinsics.areEqual(this.streamingInfo, gameStreamsUiModel.streamingInfo) && Intrinsics.areEqual(this.livePreview, gameStreamsUiModel.livePreview) && this.showLivePreview == gameStreamsUiModel.showLivePreview;
    }

    public int hashCode() {
        BroadcastNetwork broadcastNetwork = this.broadcastNetwork;
        int iHashCode = (broadcastNetwork == null ? 0 : broadcastNetwork.hashCode()) * 31;
        StreamingInfo streamingInfo = this.streamingInfo;
        int iHashCode2 = (iHashCode + (streamingInfo == null ? 0 : streamingInfo.hashCode())) * 31;
        LivePreview livePreview = this.livePreview;
        return ((iHashCode2 + (livePreview != null ? livePreview.hashCode() : 0)) * 31) + Boolean.hashCode(this.showLivePreview);
    }

    public String toString() {
        return "GameStreamsUiModel(broadcastNetwork=" + this.broadcastNetwork + ", streamingInfo=" + this.streamingInfo + ", livePreview=" + this.livePreview + ", showLivePreview=" + this.showLivePreview + ")";
    }
}
