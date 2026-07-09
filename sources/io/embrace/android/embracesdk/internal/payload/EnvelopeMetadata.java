package io.embrace.android.embracesdk.internal.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ^\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b \u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u000f¨\u0006!"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/EnvelopeMetadata;", "", "", "userId", "email", "username", "", "personas", "timezoneDescription", "locale", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)Lio/embrace/android/embracesdk/internal/payload/EnvelopeMetadata;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.VISIT_FREQUENCY, QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.ACCOUNT_ID, QueryKeys.SUBDOMAIN, "Ljava/util/Set;", "()Ljava/util/Set;", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EnvelopeMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String userId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String username;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set personas;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timezoneDescription;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String locale;

    public EnvelopeMetadata(@g(name = "user_id") String str, @g(name = "email") String str2, @g(name = "username") String str3, @g(name = "personas") Set<String> set, @g(name = "timezone_description") String str4, @g(name = "locale") String str5) {
        this.userId = str;
        this.email = str2;
        this.username = str3;
        this.personas = set;
        this.timezoneDescription = str4;
        this.locale = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnvelopeMetadata a(EnvelopeMetadata envelopeMetadata, String str, String str2, String str3, Set set, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = envelopeMetadata.userId;
        }
        if ((i11 & 2) != 0) {
            str2 = envelopeMetadata.email;
        }
        if ((i11 & 4) != 0) {
            str3 = envelopeMetadata.username;
        }
        if ((i11 & 8) != 0) {
            set = envelopeMetadata.personas;
        }
        if ((i11 & 16) != 0) {
            str4 = envelopeMetadata.timezoneDescription;
        }
        if ((i11 & 32) != 0) {
            str5 = envelopeMetadata.locale;
        }
        String str6 = str4;
        String str7 = str5;
        return envelopeMetadata.copy(str, str2, str3, set, str6, str7);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final EnvelopeMetadata copy(@g(name = "user_id") String userId, @g(name = "email") String email, @g(name = "username") String username, @g(name = "personas") Set<String> personas, @g(name = "timezone_description") String timezoneDescription, @g(name = "locale") String locale) {
        return new EnvelopeMetadata(userId, email, username, personas, timezoneDescription, locale);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Set getPersonas() {
        return this.personas;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTimezoneDescription() {
        return this.timezoneDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnvelopeMetadata)) {
            return false;
        }
        EnvelopeMetadata envelopeMetadata = (EnvelopeMetadata) other;
        return Intrinsics.areEqual(this.userId, envelopeMetadata.userId) && Intrinsics.areEqual(this.email, envelopeMetadata.email) && Intrinsics.areEqual(this.username, envelopeMetadata.username) && Intrinsics.areEqual(this.personas, envelopeMetadata.personas) && Intrinsics.areEqual(this.timezoneDescription, envelopeMetadata.timezoneDescription) && Intrinsics.areEqual(this.locale, envelopeMetadata.locale);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.email;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.username;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Set set = this.personas;
        int iHashCode4 = (iHashCode3 + (set == null ? 0 : set.hashCode())) * 31;
        String str4 = this.timezoneDescription;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.locale;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "EnvelopeMetadata(userId=" + this.userId + ", email=" + this.email + ", username=" + this.username + ", personas=" + this.personas + ", timezoneDescription=" + this.timezoneDescription + ", locale=" + this.locale + ')';
    }

    public /* synthetic */ EnvelopeMetadata(String str, String str2, String str3, Set set, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : set, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5);
    }
}
