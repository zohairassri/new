package t10;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0003\b¸\u0001\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0004R\u0014\u0010!\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0004R\u0014\u0010#\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0004R\u0014\u0010'\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0004R\u0014\u0010)\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0004R\u0014\u0010+\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0004R\u0014\u0010-\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0004R\u0014\u0010/\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0004R\u0014\u00101\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0004R\u0014\u00103\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0004R\u0014\u00105\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0004R\u0014\u00107\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0004R\u0014\u00109\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0004R\u0014\u0010;\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0004R\u0014\u0010=\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0004R\u0014\u0010?\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0004R\u0014\u0010A\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0004R\u0014\u0010C\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0004R\u0014\u0010E\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0004R\u0014\u0010G\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0004R\u0014\u0010I\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0004R\u0014\u0010K\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u0004R\u0014\u0010M\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0004R\u0014\u0010O\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0004R\u0014\u0010Q\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0004R\u0014\u0010S\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u0004R\u0014\u0010U\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\u0004R\u0014\u0010W\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0004R\u0014\u0010Y\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0004R\u0014\u0010[\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u0004R\u0014\u0010]\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u0004R\u0014\u0010_\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\u0004R\u0014\u0010a\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\u0004R\u0014\u0010c\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\u0004R\u0014\u0010e\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bd\u0010\u0004R\u0014\u0010g\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010\u0004R\u0014\u0010i\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010\u0004R\u0014\u0010k\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\u0004R\u0014\u0010m\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\u0004R\u0014\u0010o\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\u0004R\u0014\u0010q\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bp\u0010\u0004R\u0014\u0010s\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010\u0004R\u0014\u0010u\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bt\u0010\u0004R\u0014\u0010w\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\u0004R\u0014\u0010y\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bx\u0010\u0004R\u0014\u0010{\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bz\u0010\u0004R\u0014\u0010}\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b|\u0010\u0004R\u0014\u0010\u007f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u0004R\u0016\u0010\u0081\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u0004R\u0016\u0010\u0083\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u0004R\u0016\u0010\u0085\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\u0004R\u0016\u0010\u0087\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u0004R\u0016\u0010\u0089\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\u0004R\u0016\u0010\u008b\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010\u0004R\u0016\u0010\u008d\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010\u0004R\u0016\u0010\u008f\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010\u0004R\u0016\u0010\u0091\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010\u0004R\u0016\u0010\u0093\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010\u0004R\u0016\u0010\u0095\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010\u0004R\u0016\u0010\u0097\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010\u0004R\u0016\u0010\u0099\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010\u0004R\u0016\u0010\u009b\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010\u0004R\u0016\u0010\u009d\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010\u0004R\u0016\u0010\u009f\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010\u0004R\u0016\u0010¡\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u0010\u0004R\u0016\u0010£\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010\u0004R\u0016\u0010¥\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010\u0004R\u0016\u0010§\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010\u0004R\u0016\u0010©\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010\u0004R\u0016\u0010«\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010\u0004R\u0016\u0010\u00ad\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010\u0004R\u0016\u0010¯\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b®\u0001\u0010\u0004R\u0016\u0010±\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010\u0004R\u0016\u0010³\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010\u0004R\u0016\u0010µ\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010\u0004R\u0016\u0010·\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010\u0004R\u0016\u0010¹\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010\u0004¨\u0006º\u0001À\u0006\u0003"}, d2 = {"Lt10/a;", "", "", "O", "()Z", "isAdsEnabled", "F0", "isArticleAdsEnabled", QueryKeys.VIEW_TITLE, "isArticleWebviewEnabled", "D0", "isHomeFeedAdsEnabled", QueryKeys.READING, "isLeagueFeedAdsEnabled", "f0", "isTeamFeedAdsEnabled", "G", "isLiveBlogAdsEnabled", "h0", "isNewsTopicAdsEnabled", QueryKeys.SUBDOMAIN, "isAuthorAdsEnabled", "k0", "isDiscoverAdsEnabled", "A0", "isDeeplinkForegroundCheckDisabled", "X", "isBoxScoresDiscussTabEnabled", QueryKeys.FORCE_DECAY, "areTeamSpecificCommentsEnabled", "M0", "isCommentDrawerEnabled", "b0", "isGameHubNewViewModelEnabled", "C", "isExtraSubLoggingEnabled", "A", "isBoxScoreTopCommentsEnabled", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "isTopSportsNewsNotificationEnabled", QueryKeys.USER_ID, "isTopSportsNewsFeatureIntroEnabled", "C0", "isTcfConsentEnabled", QueryKeys.CONTENT_HEIGHT, "isPrivacyConsentEnabled", "a0", "isGeoBasedGDPREnabled", QueryKeys.TOKEN, "isArticleBoxScoreEnabled", "m0", "isIterateSurveyEnabled", "v0", "isFeedInspectorEnabled", "T", "isEt2NonDqaedEventsEnabled", "F", "isChartbeatEnabled", QueryKeys.MEMFLY_API_VERSION, "isAlternateMediaEnabled", "H0", "isArticleVideosEnabled", QueryKeys.SCREEN_WIDTH, "isNewYorkTimesSourceArticleEnabled", QueryKeys.DOCUMENT_WIDTH, "isPrivacyRefreshEnabled", "U", "isAppRatingEnabled", "k", "isSponsoredModuleEnabled", QueryKeys.EXTERNAL_REFERRER, "isVideoAutoPlayPreferencesEnabled", "x0", "isFeedCuratedModuleVideoCarouselEnabled", "q", "isFeedCuratedModuleVideoStreamEnabled", QueryKeys.VISIT_FREQUENCY, "isAppsflyerLoggedOutAccessEnabled", "l", "isEt2MigrationEnabled", "s", "isFeedGameFeedModuleVideoStreamEnabled", QueryKeys.ACCOUNT_ID, "isFeedGameFeedModuleVideoStreamCarouselEnabled", QueryKeys.MAX_SCROLL_DEPTH, "isVideoDeepLinkingEnabled", QueryKeys.IDLING, "isVideoPlayerAdPrerollEnabled", "x", "isVideoFeedModuleEnabled", "z", "isFeedVideoLiveStreamEnabled", "y0", "isEndlessVideoFeedEnabled", "H", "isConnectionSportsPushNotificationEnabled", "i0", "isFeedLinksBannerEnabled", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "isSavedStoriesAssetsCacheEnabled", QueryKeys.SDK_VERSION, "isFeedAssetsCacheEnabled", "G0", "isAgeSignalApiEnabled", "Y", "isOnboardingDeferredDeeplinkEnabled", QueryKeys.SCROLL_WINDOW_HEIGHT, "isNotificationPreferenceComposeEnabled", "l0", "isFreeArticleGiftingEnabled", "L0", "isLiveBlogGiftingEnabled", "J0", "isNativeBridgeEnabled", "o0", "isLeaguePickEmHubEnabled", QueryKeys.INTERNAL_REFERRER, "isUpcomingPicksTabEnabled", "t0", "isStatsTabEnabled", "w0", "isResultsPicksTabEnabled", "c0", "isPickEmShareablesEnabled", QueryKeys.IS_NEW_USER, "isBffBracketsEnabled", "Q", "isBffBracketsLocalMocksEnabled", "K0", "isWebBffBracketsEnabled", "s0", "isPodcastListeningSubscriberOnly", "E0", "isScoresFeedGameParticipantsCountEnabled", "u0", "isScoresFeedGameReportersEnabled", "p0", "isCuratedGamesParticipantsCountEnabled", "e0", "isCuratedGamesReportersEnabled", "d0", "isScoresBannerCommentsCountEnabled", "N", "isScoresBannerReportersEnabled", "q0", "isDiscussionParticipantsCountHeaderEnabled", "B", "isDiscussionReportersHeaderEnabled", "M", "isDiscussionFilterChipsEnabled", "K", "isDiscussThreadInitiallyCollapsed", QueryKeys.HOST, "isDiscussThreadCollapsedTeaserEnabled", "J", "isCrossAppLoginEnabled", "L", "isTournamentHubEnabled", "B0", "isGolfScheduleEnabled", "I0", "isStandaloneContentModuleEnabled", "a", "isNotificationCenterEnabled", QueryKeys.PAGE_LOAD_TIME, "isFlexibleLayoutEnabled", "z0", "isFeedFanZoneEnabled", "r0", "isTeamChatEnabled", QueryKeys.VIEW_ID, "isUtilityBarSearchEnabled", "j0", "isUtilityBarAccountEnabled", QueryKeys.DECAY, "isUtilityBarNotificationsEnabled", "P", "isDiscussionLabelEnabled", QueryKeys.SECTION_G0, "isPlayNavTabEnabled", QueryKeys.ENGAGED_SECONDS, "isWorldCupNavTabEnabled", QueryKeys.WRITING, "isRegiCommentingEnabled", "n0", "isOneTapVideoFullscreenEnabled", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    boolean A();

    boolean A0();

    boolean B();

    boolean B0();

    boolean C();

    boolean C0();

    boolean D();

    boolean D0();

    boolean E();

    boolean E0();

    boolean F();

    boolean F0();

    boolean G();

    boolean G0();

    boolean H();

    boolean H0();

    boolean I();

    boolean I0();

    boolean J();

    boolean J0();

    boolean K();

    boolean K0();

    boolean L();

    boolean L0();

    boolean M();

    boolean M0();

    boolean N();

    boolean O();

    boolean P();

    boolean Q();

    boolean R();

    boolean S();

    boolean T();

    boolean U();

    boolean V();

    boolean W();

    boolean X();

    boolean Y();

    boolean Z();

    boolean a();

    boolean a0();

    boolean b();

    boolean b0();

    boolean c();

    boolean c0();

    boolean d();

    boolean d0();

    boolean e();

    boolean e0();

    boolean f();

    boolean f0();

    boolean g();

    boolean g0();

    boolean h();

    boolean h0();

    boolean i();

    boolean i0();

    boolean j();

    boolean j0();

    boolean k();

    boolean k0();

    boolean l();

    boolean l0();

    boolean m();

    boolean m0();

    boolean n();

    boolean n0();

    boolean o();

    boolean o0();

    boolean p();

    boolean p0();

    boolean q();

    boolean q0();

    boolean r();

    boolean r0();

    boolean s();

    boolean s0();

    boolean t();

    boolean t0();

    boolean u();

    boolean u0();

    boolean v();

    boolean v0();

    boolean w();

    boolean w0();

    boolean x();

    boolean x0();

    boolean y();

    boolean y0();

    boolean z();

    boolean z0();
}
