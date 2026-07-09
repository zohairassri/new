package com.nytimes.android.poisonpill.ui;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f48358b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48359a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends g implements InterfaceC0362g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f48360c = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f48361d = pv.k.logo_poison_pill_athletic;

        private a() {
            super("Athletic", null);
        }

        @Override // com.nytimes.android.poisonpill.ui.g.InterfaceC0362g
        public int a() {
            return f48361d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final g a(String appName) {
            Intrinsics.checkNotNullParameter(appName, "appName");
            switch (appName.hashCode()) {
                case -1678124166:
                    if (appName.equals("Cooking")) {
                        return c.f48362c;
                    }
                    break;
                case -892787884:
                    if (appName.equals("Crossplay")) {
                        return d.f48364c;
                    }
                    break;
                case 2424563:
                    if (appName.equals("News")) {
                        return h.f48369c;
                    }
                    break;
                case 68567713:
                    if (appName.equals("Games")) {
                        return f.f48367c;
                    }
                    break;
                case 270062368:
                    if (appName.equals("Athletic")) {
                        return a.f48360c;
                    }
                    break;
            }
            return new e(appName);
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends g implements InterfaceC0362g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f48362c = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f48363d = pv.k.logo_poison_pill_cooking;

        private c() {
            super("Cooking", null);
        }

        @Override // com.nytimes.android.poisonpill.ui.g.InterfaceC0362g
        public int a() {
            return f48363d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d extends g implements InterfaceC0362g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f48364c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f48365d = pv.k.logo_poison_pill_crossplay;

        private d() {
            super("Crossplay", null);
        }

        @Override // com.nytimes.android.poisonpill.ui.g.InterfaceC0362g
        public int a() {
            return f48365d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class e extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f48366c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String appName) {
            super(appName, null);
            Intrinsics.checkNotNullParameter(appName, "appName");
            this.f48366c = appName;
        }

        @Override // com.nytimes.android.poisonpill.ui.g
        public String b() {
            return this.f48366c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f48366c, ((e) obj).f48366c);
        }

        public int hashCode() {
            return this.f48366c.hashCode();
        }

        public String toString() {
            return "Custom(appName=" + this.f48366c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class f extends g implements InterfaceC0362g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f48367c = new f();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f48368d = pv.k.logo_poison_pill_games;

        private f() {
            super("Games", null);
        }

        @Override // com.nytimes.android.poisonpill.ui.g.InterfaceC0362g
        public int a() {
            return f48368d;
        }
    }

    /* JADX INFO: renamed from: com.nytimes.android.poisonpill.ui.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface InterfaceC0362g {
        int a();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class h extends g implements InterfaceC0362g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f48369c = new h();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f48370d = pv.k.logo_poison_pill_news;

        private h() {
            super("News", null);
        }

        @Override // com.nytimes.android.poisonpill.ui.g.InterfaceC0362g
        public int a() {
            return f48370d;
        }
    }

    public /* synthetic */ g(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String b() {
        return this.f48359a;
    }

    private g(String str) {
        this.f48359a = str;
    }
}
