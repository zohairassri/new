package ra0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public enum a {
    SESSION("ux.session"),
    LOG("sys.log"),
    CRASH("sys.android.crash"),
    NATIVE_CRASH("sys.android.native_crash"),
    REACT_NATIVE_CRASH("sys.android.react_native_crash"),
    FLUTTER_EXCEPTION("sys.flutter_exception"),
    AEI("sys.exit"),
    EXCEPTION("sys.exception"),
    NETWORK_CAPTURE("sys.network_capture"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1655a f124272b = new C1655a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f124284a;

    /* JADX INFO: renamed from: ra0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1655a {

        /* JADX INFO: renamed from: ra0.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public /* synthetic */ class C1656a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.SESSION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.CRASH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.LOG.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.NATIVE_CRASH.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.REACT_NATIVE_CRASH.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.FLUTTER_EXCEPTION.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.AEI.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[a.EXCEPTION.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[a.NETWORK_CAPTURE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ C1655a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final a a(String component) {
            Intrinsics.checkNotNullParameter(component, "component");
            switch (component.hashCode()) {
                case -1052618729:
                    if (component.equals("native")) {
                        return a.NATIVE_CRASH;
                    }
                    break;
                case -760334308:
                    if (component.equals("flutter")) {
                        return a.FLUTTER_EXCEPTION;
                    }
                    break;
                case 96453:
                    if (component.equals("aei")) {
                        return a.AEI;
                    }
                    break;
                case 107332:
                    if (component.equals("log")) {
                        return a.LOG;
                    }
                    break;
                case 94921639:
                    if (component.equals("crash")) {
                        return a.CRASH;
                    }
                    break;
                case 108386687:
                    if (component.equals("react")) {
                        return a.REACT_NATIVE_CRASH;
                    }
                    break;
                case 1481625679:
                    if (component.equals("exception")) {
                        return a.EXCEPTION;
                    }
                    break;
                case 1843485230:
                    if (component.equals("network")) {
                        return a.NETWORK_CAPTURE;
                    }
                    break;
                case 1984987798:
                    if (component.equals("session")) {
                        return a.SESSION;
                    }
                    break;
            }
            return a.UNKNOWN;
        }

        public final a b(String str) {
            a aVar;
            a[] aVarArrValues = a.values();
            int length = aVarArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    aVar = null;
                    break;
                }
                aVar = aVarArrValues[i11];
                if (Intrinsics.areEqual(aVar.b(), str)) {
                    break;
                }
                i11++;
            }
            return aVar == null ? a.UNKNOWN : aVar;
        }

        public final String c(a payloadType) {
            Intrinsics.checkNotNullParameter(payloadType, "payloadType");
            switch (C1656a.$EnumSwitchMapping$0[payloadType.ordinal()]) {
                case 1:
                    return "session";
                case 2:
                    return "crash";
                case 3:
                    return "log";
                case 4:
                    return "native";
                case 5:
                    return "react";
                case 6:
                    return "flutter";
                case 7:
                    return "aei";
                case 8:
                    return "exception";
                case 9:
                    return "network";
                default:
                    return "unknown";
            }
        }

        private C1655a() {
        }
    }

    a(String str) {
        this.f124284a = str;
    }

    public final String b() {
        return this.f124284a;
    }
}
