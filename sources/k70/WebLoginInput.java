package k70;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k70.rb1, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001f\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\f\u0010\u0014¨\u0006\u0016"}, d2 = {"Lk70/rb1;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "email", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "password", "Llc/t0;", "Llc/t0;", "()Llc/t0;", "amp_reader_id", "graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WebLoginInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String password;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 amp_reader_id;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final lc.t0 getAmp_reader_id() {
        return this.amp_reader_id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebLoginInput)) {
            return false;
        }
        WebLoginInput webLoginInput = (WebLoginInput) other;
        return Intrinsics.areEqual(this.email, webLoginInput.email) && Intrinsics.areEqual(this.password, webLoginInput.password) && Intrinsics.areEqual(this.amp_reader_id, webLoginInput.amp_reader_id);
    }

    public int hashCode() {
        return (((this.email.hashCode() * 31) + this.password.hashCode()) * 31) + this.amp_reader_id.hashCode();
    }

    public String toString() {
        return "WebLoginInput(email=" + this.email + ", password=" + this.password + ", amp_reader_id=" + this.amp_reader_id + ")";
    }
}
