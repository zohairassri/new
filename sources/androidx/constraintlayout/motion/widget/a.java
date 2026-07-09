package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.view.View;
import com.chartbeat.androidsdk.QueryKeys;
import java.nio.CharBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static String a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String c(Context context, int i11) {
        if (i11 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i11);
        } catch (Exception unused) {
            return "?" + i11;
        }
    }

    public static String d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String e(MotionLayout motionLayout, int i11) {
        return f(motionLayout, i11, -1);
    }

    public static String f(MotionLayout motionLayout, int i11, int i12) {
        int length;
        if (i11 == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i11);
        if (i12 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i12) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i12 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i12) / length).toString().replace((char) 0, '.') + QueryKeys.END_MARKER, QueryKeys.END_MARKER);
    }

    public static void g(String str, String str2, int i11) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i11, stackTrace.length - 1);
        String str3 = " ";
        for (int i12 = 1; i12 <= iMin; i12++) {
            StackTraceElement stackTraceElement = stackTrace[i12];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(".(");
            sb2.append(stackTrace[i12].getFileName());
            sb2.append(":");
            sb2.append(stackTrace[i12].getLineNumber());
            sb2.append(") ");
            sb2.append(stackTrace[i12].getMethodName());
            str3 = str3 + " ";
        }
    }
}
