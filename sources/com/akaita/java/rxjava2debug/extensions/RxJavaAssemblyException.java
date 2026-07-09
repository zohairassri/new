package com.akaita.java.rxjava2debug.extensions;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class RxJavaAssemblyException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f18394a = b();

    public static String b() {
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        sb2.append("RxJavaAssemblyException: assembled\r\n");
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (c(stackTraceElement)) {
                sb2.append("at ");
                sb2.append(stackTraceElement);
                sb2.append("\r\n");
            }
        }
        return sb2.toString();
    }

    private static boolean c(StackTraceElement stackTraceElement) {
        if (stackTraceElement.getLineNumber() == 1) {
            return false;
        }
        String className = stackTraceElement.getClassName();
        return (className.contains("java.lang.Thread") || className.contains("junit.runner") || className.contains("org.junit.internal") || className.contains("junit4.runner") || className.contains("java.lang.reflect") || className.contains("sun.reflect") || className.contains(".RxJavaAssemblyException") || className.contains("OnAssembly") || className.contains("RxJavaAssemblyTracking") || className.contains("RxJavaPlugins")) ? false : true;
    }

    public static RxJavaAssemblyException d(Throwable th2) {
        HashSet hashSet = new HashSet();
        while (th2 != null) {
            if (!(th2 instanceof RxJavaAssemblyException)) {
                if (!hashSet.add(th2)) {
                    break;
                }
                th2 = th2.getCause();
            } else {
                return (RxJavaAssemblyException) th2;
            }
        }
        return null;
    }

    public Throwable a(Throwable th2) {
        HashSet hashSet = new HashSet();
        Throwable cause = th2;
        while (cause.getCause() != null) {
            if (!hashSet.add(cause)) {
                return th2;
            }
            cause = cause.getCause();
        }
        try {
            cause.initCause(this);
        } catch (Throwable unused) {
        }
        return th2;
    }

    public String e() {
        return this.f18394a;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
