package com.theathletic.brackets.ui.bffbrackets.components;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.brackets.ui.bffbrackets.components.c1, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B?\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u0017\u0010\u0012R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Lcom/theathletic/brackets/ui/bffbrackets/components/c1;", "", "", "", "Lcom/theathletic/brackets/ui/bffbrackets/components/a1;", "headers", "", "Lcom/theathletic/brackets/ui/bffbrackets/components/z0;", "games", "gameBlockHeight", "Landroidx/compose/ui/layout/s;", "placeables", "<init>", "(Ljava/util/Map;Ljava/util/List;ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()Ljava/util/Map;", QueryKeys.PAGE_LOAD_TIME, "Ljava/util/List;", "()Ljava/util/List;", QueryKeys.IDLING, QueryKeys.SUBDOMAIN, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class MeasuredChildren {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map headers;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List games;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int gameBlockHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List placeables;

    public MeasuredChildren(Map headers, List games, int i11, List placeables) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(games, "games");
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        this.headers = headers;
        this.games = games;
        this.gameBlockHeight = i11;
        this.placeables = placeables;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getGameBlockHeight() {
        return this.gameBlockHeight;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getGames() {
        return this.games;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Map getHeaders() {
        return this.headers;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getPlaceables() {
        return this.placeables;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeasuredChildren)) {
            return false;
        }
        MeasuredChildren measuredChildren = (MeasuredChildren) other;
        return Intrinsics.areEqual(this.headers, measuredChildren.headers) && Intrinsics.areEqual(this.games, measuredChildren.games) && this.gameBlockHeight == measuredChildren.gameBlockHeight && Intrinsics.areEqual(this.placeables, measuredChildren.placeables);
    }

    public int hashCode() {
        return (((((this.headers.hashCode() * 31) + this.games.hashCode()) * 31) + Integer.hashCode(this.gameBlockHeight)) * 31) + this.placeables.hashCode();
    }

    public String toString() {
        return "MeasuredChildren(headers=" + this.headers + ", games=" + this.games + ", gameBlockHeight=" + this.gameBlockHeight + ", placeables=" + this.placeables + ")";
    }
}
