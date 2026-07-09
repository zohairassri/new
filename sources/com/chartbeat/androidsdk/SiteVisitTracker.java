package com.chartbeat.androidsdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class SiteVisitTracker {
    private static final String KEY_LAST_SITE_VISIT_DEPTH = "site-visit-depth-";
    private static final String KEY_LAST_SITE_VISIT_ID = "site-visit-uid-";
    private static final String KEY_LAST_SITE_VISIT_REFERRER = "site-visit-referrer-";
    private static final String KEY_LAST_SITE_VISIT_REFRESH_TIME = "site-visit-refresh_time-";
    private static final int MINUTES_TO_TRACK_SITE_VISIT = 30;
    private static final int SITE_VISIT_ID_CHAR_LENGTH = 28;
    private static final String TAG = "Chartbeat SiteVisitTracker";
    protected SharedPreferences prefs;

    SiteVisitTracker(Context context) {
        if (context == null) {
            throw new NullPointerException("Activity or application context cannot be null");
        }
        this.prefs = context.getSharedPreferences(ChartBeatTracker.CHARTBEAT_PREFS, 0);
    }

    public int getSiteVisitDepth() {
        return this.prefs.getInt(KEY_LAST_SITE_VISIT_DEPTH, 0);
    }

    public String getSiteVisitId() {
        return this.prefs.getString(KEY_LAST_SITE_VISIT_ID, null);
    }

    public String getSiteVisitReferrer() {
        return this.prefs.getString(KEY_LAST_SITE_VISIT_REFERRER, null);
    }

    Date getSiteVisitRefreshTime() {
        long j11 = this.prefs.getLong(KEY_LAST_SITE_VISIT_REFRESH_TIME, 0L);
        if (j11 != 0) {
            return new Date(j11);
        }
        return null;
    }

    Boolean hasSiteVisitExpired() {
        Date date = new Date();
        Date siteVisitRefreshTime = getSiteVisitRefreshTime();
        if (siteVisitRefreshTime == null) {
            return Boolean.TRUE;
        }
        siteVisitRefreshTime.setMinutes(siteVisitRefreshTime.getMinutes() + 30);
        return Boolean.valueOf(siteVisitRefreshTime.before(date));
    }

    void storeSiteVisitDepth(int i11) {
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        editorEdit.putInt(KEY_LAST_SITE_VISIT_DEPTH, i11);
        editorEdit.apply();
    }

    public void storeSiteVisitId(String str) {
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        editorEdit.putString(KEY_LAST_SITE_VISIT_ID, str);
        editorEdit.apply();
    }

    void storeSiteVisitReferrer(String str) {
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        editorEdit.putString(KEY_LAST_SITE_VISIT_REFERRER, str);
        editorEdit.apply();
    }

    void storeSiteVisitRefreshTime(Date date) {
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        editorEdit.putLong(KEY_LAST_SITE_VISIT_REFRESH_TIME, date.getTime());
        editorEdit.apply();
    }

    public void trackSiteVisit(String str) {
        if (str == null) {
            str = new String();
        }
        String siteVisitReferrer = getSiteVisitReferrer();
        if (!(!(siteVisitReferrer == null || str.length() <= 0 || siteVisitReferrer.equals(str)) || hasSiteVisitExpired().booleanValue() || (siteVisitReferrer == null && str.length() > 0))) {
            storeSiteVisitDepth(getSiteVisitDepth() + 1);
            return;
        }
        storeSiteVisitDepth(1);
        storeSiteVisitReferrer(str);
        storeSiteVisitId(SecurityUtils.randomChars(28));
        storeSiteVisitRefreshTime(new Date());
    }

    public void visited() {
        storeSiteVisitRefreshTime(new Date());
    }
}
