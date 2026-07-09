package lb0;

import io.embrace.android.embracesdk.internal.config.remote.Unwinder;
import io.embrace.android.embracesdk.internal.payload.ThreadState;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f113994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f113995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f113996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f113997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f113998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f113999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f114000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f114001h;

    public f(Long l11, String str, Integer num, Long l12, Long l13, List list, ThreadState threadState, Unwinder unwinder) {
        this.f113994a = l11;
        this.f113995b = str;
        this.f113996c = num;
        this.f113997d = l12;
        this.f113998e = l13;
        this.f113999f = list;
        this.f114000g = unwinder != null ? Integer.valueOf(unwinder.getCode()) : null;
        this.f114001h = threadState != null ? Integer.valueOf(threadState.getCode()) : null;
    }

    public final Long a() {
        return this.f113994a;
    }

    public final String b() {
        return this.f113995b;
    }

    public final Integer c() {
        return this.f113996c;
    }

    public final Long d() {
        return this.f113997d;
    }

    public final List e() {
        return this.f113999f;
    }

    public final Integer f() {
        return this.f114001h;
    }

    public final Long g() {
        return this.f113998e;
    }

    public final Integer h() {
        return this.f114000g;
    }
}
