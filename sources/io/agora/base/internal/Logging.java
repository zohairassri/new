package io.agora.base.internal;

import io.agora.rtc2.internal.AudioRoutingController;
import io.agora.rtc2.internal.Marshallable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class Logging {
    private static final int AGORA_LOG_DEBUG = 2048;
    private static final int AGORA_LOG_ERROR = 4;
    private static final int AGORA_LOG_INFO = 1;
    private static final int AGORA_LOG_WARN = 2;
    private static Loggable loggable;
    private static final Logger fallbackLogger = createFallbackLogger();
    private static volatile boolean loggingEnabled = true;
    private static Severity loggableSeverity = Severity.LS_INFO;
    private static int nativeLogLevel = 2055;

    /* JADX INFO: renamed from: io.agora.base.internal.Logging$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$agora$base$internal$Logging$Severity;

        static {
            int[] iArr = new int[Severity.values().length];
            $SwitchMap$io$agora$base$internal$Logging$Severity = iArr;
            try {
                iArr[Severity.LS_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$base$internal$Logging$Severity[Severity.LS_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$agora$base$internal$Logging$Severity[Severity.LS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum Severity {
        LS_SENSITIVE,
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Deprecated
    public enum TraceLevel {
        TRACE_NONE(0),
        TRACE_STATEINFO(1),
        TRACE_WARNING(2),
        TRACE_ERROR(4),
        TRACE_CRITICAL(8),
        TRACE_APICALL(16),
        TRACE_DEFAULT(255),
        TRACE_MODULECALL(32),
        TRACE_MEMORY(256),
        TRACE_TIMER(AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER),
        TRACE_STREAM(1024),
        TRACE_DEBUG(2048),
        TRACE_INFO(4096),
        TRACE_TERSEINFO(Marshallable.PROTO_PACKET_SIZE),
        TRACE_ALL(Settings.DEFAULT_INITIAL_WINDOW_SIZE);

        public final int level;

        TraceLevel(int i11) {
            this.level = i11;
        }
    }

    private static Logger createFallbackLogger() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    public static void d(String str, String str2) {
        if ((nativeLogLevel & 2048) != 0) {
            log(Severity.LS_VERBOSE, str, str2);
        }
    }

    static void deleteInjectedLoggable() {
        loggable = null;
    }

    public static void e(String str, String str2) {
        if ((nativeLogLevel & 4) != 0) {
            log(Severity.LS_ERROR, str, str2);
        }
    }

    public static void enableLogThreads() {
        nativeEnableLogThreads();
    }

    public static void enableLogTimeStamps() {
        nativeEnableLogTimeStamps();
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        if (loggable != null) {
            throw new IllegalStateException("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
        }
        nativeEnableLogToDebugOutput(severity.ordinal());
        loggingEnabled = true;
    }

    private static String getStackTraceString(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        try {
            th2.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        } catch (Throwable unused) {
            String message = th2.getMessage();
            return message == null ? "" : message;
        }
    }

    public static void i(String str, String str2) {
        if ((nativeLogLevel & 1) != 0) {
            log(Severity.LS_INFO, str, str2);
        }
    }

    static void injectLoggable(Loggable loggable2, Severity severity) {
        if (loggable2 != null) {
            loggable = loggable2;
            loggableSeverity = severity;
        }
    }

    public static void log(Severity severity, String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Logging tag or message may not be null.");
        }
        if (loggable != null) {
            if (severity.ordinal() < loggableSeverity.ordinal()) {
                return;
            }
            loggable.onLogMessage(str2, severity, str);
        } else {
            if (loggingEnabled) {
                nativeLog(severity.ordinal(), str, str2);
                return;
            }
            int i11 = AnonymousClass1.$SwitchMap$io$agora$base$internal$Logging$Severity[severity.ordinal()];
            Level level = i11 != 1 ? i11 != 2 ? i11 != 3 ? Level.FINE : Level.INFO : Level.WARNING : Level.SEVERE;
            fallbackLogger.log(level, str + ": " + str2);
        }
    }

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i11);

    private static native void nativeLog(int i11, String str, String str2);

    public static void setNativeLogLevel(int i11) {
        nativeLogLevel = i11;
    }

    public static void v(String str, String str2) {
        if ((nativeLogLevel & 2048) != 0) {
            log(Severity.LS_VERBOSE, str, str2);
        }
    }

    public static void w(String str, String str2) {
        if ((nativeLogLevel & 2) != 0) {
            log(Severity.LS_WARNING, str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        if ((nativeLogLevel & 4) != 0) {
            Severity severity = Severity.LS_ERROR;
            log(severity, str, str2);
            log(severity, str, th2.toString());
            log(severity, str, getStackTraceString(th2));
        }
    }

    public static void w(String str, String str2, Throwable th2) {
        if ((nativeLogLevel & 2) != 0) {
            Severity severity = Severity.LS_WARNING;
            log(severity, str, str2);
            log(severity, str, th2.toString());
            log(severity, str, getStackTraceString(th2));
        }
    }

    @Deprecated
    public static void enableTracing(String str, EnumSet<TraceLevel> enumSet) {
    }
}
