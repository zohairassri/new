package com.comscore.streaming;

import com.comscore.util.cpp.CppJavaBinder;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class StreamingPublisherConfiguration extends CppJavaBinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<StreamingConfiguration> f19452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19453c;

    StreamingPublisherConfiguration(StreamingConfiguration streamingConfiguration, String str) {
        this.f19452b = new WeakReference<>(streamingConfiguration);
        this.f19453c = str;
    }

    private native void addLabelsNative(long j11, String str, Map<String, String> map);

    private native void removeAllLabelsNative(long j11, String str);

    private native void removeLabelNative(long j11, String str, String str2);

    private native void setLabelNative(long j11, String str, String str2, String str3);

    public void addLabels(Map<String, String> map) {
        try {
            StreamingConfiguration streamingConfiguration = this.f19452b.get();
            if (streamingConfiguration == null) {
                return;
            }
            addLabelsNative(streamingConfiguration.a(), this.f19453c, map);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    public void removeAllLabels() {
        try {
            StreamingConfiguration streamingConfiguration = this.f19452b.get();
            if (streamingConfiguration == null) {
                return;
            }
            removeAllLabelsNative(streamingConfiguration.a(), this.f19453c);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    public void removeLabel(String str) {
        try {
            StreamingConfiguration streamingConfiguration = this.f19452b.get();
            if (streamingConfiguration == null) {
                return;
            }
            removeLabelNative(streamingConfiguration.a(), this.f19453c, str);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    public void setLabel(String str, String str2) {
        StreamingPublisherConfiguration streamingPublisherConfiguration;
        try {
            StreamingConfiguration streamingConfiguration = this.f19452b.get();
            if (streamingConfiguration == null) {
                return;
            }
            streamingPublisherConfiguration = this;
            try {
                streamingPublisherConfiguration.setLabelNative(streamingConfiguration.a(), this.f19453c, str, str2);
                return;
            } catch (UnsatisfiedLinkError e11) {
                e = e11;
            }
        } catch (UnsatisfiedLinkError e12) {
            e = e12;
            streamingPublisherConfiguration = this;
        }
        streamingPublisherConfiguration.printException(e);
    }

    @Override // com.comscore.util.cpp.CppJavaBinder
    protected void destroyCppObject() {
    }
}
