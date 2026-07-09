package com.theathletic.boxscore.ui;

import com.amazonaws.services.s3.internal.Constants;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.boxscore.ui.i6, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0012\u0015B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/theathletic/boxscore/ui/i6;", "", "Lcom/theathletic/boxscore/ui/i6$a;", "locationInfo", "Lcom/theathletic/boxscore/ui/i6$b;", "tickets", "<init>", "(Lcom/theathletic/boxscore/ui/i6$a;Lcom/theathletic/boxscore/ui/i6$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/theathletic/boxscore/ui/i6$a;", "()Lcom/theathletic/boxscore/ui/i6$a;", QueryKeys.PAGE_LOAD_TIME, "Lcom/theathletic/boxscore/ui/i6$b;", "()Lcom/theathletic/boxscore/ui/i6$b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GameTicketsUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationInfo locationInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Tickets tickets;

    /* JADX INFO: renamed from: com.theathletic.boxscore.ui.i6$a, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/theathletic/boxscore/ui/i6$a;", "", "", "venue", "temperature", "weatherOutlook", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocationInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String venue;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String temperature;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String weatherOutlook;

        public LocationInfo(String venue, String temperature, String weatherOutlook) {
            Intrinsics.checkNotNullParameter(venue, "venue");
            Intrinsics.checkNotNullParameter(temperature, "temperature");
            Intrinsics.checkNotNullParameter(weatherOutlook, "weatherOutlook");
            this.venue = venue;
            this.temperature = temperature;
            this.weatherOutlook = weatherOutlook;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTemperature() {
            return this.temperature;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getVenue() {
            return this.venue;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getWeatherOutlook() {
            return this.weatherOutlook;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationInfo)) {
                return false;
            }
            LocationInfo locationInfo = (LocationInfo) other;
            return Intrinsics.areEqual(this.venue, locationInfo.venue) && Intrinsics.areEqual(this.temperature, locationInfo.temperature) && Intrinsics.areEqual(this.weatherOutlook, locationInfo.weatherOutlook);
        }

        public int hashCode() {
            return (((this.venue.hashCode() * 31) + this.temperature.hashCode()) * 31) + this.weatherOutlook.hashCode();
        }

        public String toString() {
            return "LocationInfo(venue=" + this.venue + ", temperature=" + this.temperature + ", weatherOutlook=" + this.weatherOutlook + ")";
        }
    }

    /* JADX INFO: renamed from: com.theathletic.boxscore.ui.i6$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/theathletic/boxscore/ui/i6$b;", "", "", "priceDisplay", "provider", Constants.URL_ENCODING, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tickets {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceDisplay;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String provider;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        public Tickets(String priceDisplay, String provider, String url) {
            Intrinsics.checkNotNullParameter(priceDisplay, "priceDisplay");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(url, "url");
            this.priceDisplay = priceDisplay;
            this.provider = provider;
            this.url = url;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPriceDisplay() {
            return this.priceDisplay;
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
            if (!(other instanceof Tickets)) {
                return false;
            }
            Tickets tickets = (Tickets) other;
            return Intrinsics.areEqual(this.priceDisplay, tickets.priceDisplay) && Intrinsics.areEqual(this.provider, tickets.provider) && Intrinsics.areEqual(this.url, tickets.url);
        }

        public int hashCode() {
            return (((this.priceDisplay.hashCode() * 31) + this.provider.hashCode()) * 31) + this.url.hashCode();
        }

        public String toString() {
            return "Tickets(priceDisplay=" + this.priceDisplay + ", provider=" + this.provider + ", url=" + this.url + ")";
        }
    }

    public GameTicketsUiModel(LocationInfo locationInfo, Tickets tickets) {
        this.locationInfo = locationInfo;
        this.tickets = tickets;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocationInfo getLocationInfo() {
        return this.locationInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Tickets getTickets() {
        return this.tickets;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameTicketsUiModel)) {
            return false;
        }
        GameTicketsUiModel gameTicketsUiModel = (GameTicketsUiModel) other;
        return Intrinsics.areEqual(this.locationInfo, gameTicketsUiModel.locationInfo) && Intrinsics.areEqual(this.tickets, gameTicketsUiModel.tickets);
    }

    public int hashCode() {
        LocationInfo locationInfo = this.locationInfo;
        int iHashCode = (locationInfo == null ? 0 : locationInfo.hashCode()) * 31;
        Tickets tickets = this.tickets;
        return iHashCode + (tickets != null ? tickets.hashCode() : 0);
    }

    public String toString() {
        return "GameTicketsUiModel(locationInfo=" + this.locationInfo + ", tickets=" + this.tickets + ")";
    }
}
