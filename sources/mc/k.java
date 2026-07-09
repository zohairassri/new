package mc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f116039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f116040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final okio.g f116041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final okio.h f116042d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f116043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private okio.g f116044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private okio.h f116045c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f116046d = new ArrayList();

        public a(int i11) {
            this.f116043a = i11;
        }

        private final boolean e() {
            return (this.f116044b == null && this.f116045c == null) ? false : true;
        }

        public final a a(List headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f116046d.addAll(headers);
            return this;
        }

        public final a b(okio.g bodySource) {
            Intrinsics.checkNotNullParameter(bodySource, "bodySource");
            if (e()) {
                throw new IllegalStateException("body() can only be called once");
            }
            this.f116044b = bodySource;
            return this;
        }

        public final a c(okio.h bodyString) {
            Intrinsics.checkNotNullParameter(bodyString, "bodyString");
            if (e()) {
                throw new IllegalStateException("body() can only be called once");
            }
            this.f116045c = bodyString;
            return this;
        }

        public final k d() {
            return new k(this.f116043a, this.f116046d, this.f116044b, this.f116045c, null);
        }

        public final a f(List headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f116046d.clear();
            this.f116046d.addAll(headers);
            return this;
        }
    }

    public /* synthetic */ k(int i11, List list, okio.g gVar, okio.h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, list, gVar, hVar);
    }

    public final okio.g a() {
        okio.g gVar = this.f116041c;
        if (gVar != null) {
            return gVar;
        }
        okio.h hVar = this.f116042d;
        if (hVar != null) {
            return new okio.e().b2(hVar);
        }
        return null;
    }

    public final List b() {
        return this.f116040b;
    }

    public final int c() {
        return this.f116039a;
    }

    public final a d() {
        a aVar = new a(this.f116039a);
        okio.g gVar = this.f116041c;
        if (gVar != null) {
            aVar.b(gVar);
        }
        okio.h hVar = this.f116042d;
        if (hVar != null) {
            aVar.c(hVar);
        }
        aVar.a(this.f116040b);
        return aVar;
    }

    private k(int i11, List list, okio.g gVar, okio.h hVar) {
        this.f116039a = i11;
        this.f116040b = list;
        this.f116041c = gVar;
        this.f116042d = hVar;
    }
}
