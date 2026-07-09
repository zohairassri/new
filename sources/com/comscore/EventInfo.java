package com.comscore;

import com.comscore.util.cpp.CppJavaBinder;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class EventInfo extends CppJavaBinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f19374b;

    public EventInfo() {
        this.f19374b = 0L;
        try {
            this.f19374b = newCppInstanceNative();
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    private static native void addIncludedPublisherNative(long j11, String str);

    private static native void addLabelsNative(long j11, Map<String, String> map);

    private static native void addPublisherLabelsNative(long j11, String str, Map<String, String> map);

    private static native void destroyCppInstanceNative(long j11);

    private static native long newCppInstanceNative();

    private static native void setLabelNative(long j11, String str, String str2);

    private static native void setPublisherLabelNative(long j11, String str, String str2, String str3);

    long a() {
        return this.f19374b;
    }

    public void addIncludedPublisher(String str) {
        try {
            addIncludedPublisherNative(this.f19374b, str);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    public void addLabels(Map<String, String> map) {
        try {
            addLabelsNative(this.f19374b, map);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    public void addPublisherLabels(String str, Map<String, String> map) {
        try {
            addPublisherLabelsNative(this.f19374b, str, map);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    @Override // com.comscore.util.cpp.CppJavaBinder
    protected void destroyCppObject() {
        destroyCppInstanceNative(this.f19374b);
    }

    public void setLabel(String str, String str2) {
        try {
            setLabelNative(this.f19374b, str, str2);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    public void setPublisherLabel(String str, String str2, String str3) {
        try {
            setPublisherLabelNative(this.f19374b, str, str2, str3);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }
}
