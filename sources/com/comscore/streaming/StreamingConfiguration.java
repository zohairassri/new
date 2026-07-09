package com.comscore.streaming;

import com.comscore.util.cpp.CppJavaBinder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class StreamingConfiguration extends CppJavaBinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f19447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakHashMap<String, StreamingPublisherConfiguration> f19448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f19449d;

    private native void addLabelsNative(long j11, Map<String, String> map);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void autoResumeStateOnAssetChangeNative(long j11, boolean z11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long buildNative(long j11);

    private native long copyNative(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void customStartMinimumPlaybackNative(long j11, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void destroyCppInstanceBuilderNative(long j11);

    private native void destroyCppInstanceNative(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void heartbeatIntervalsNative(long j11, List<Map<String, Long>> list);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void heartbeatMeasurementNative(long j11, boolean z11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void includedPublishersNative(long j11, List<String> list);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void keepAliveIntervalNative(long j11, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void keepAliveMeasurementNative(long j11, boolean z11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void labelsNative(long j11, Map<String, String> map);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long newCppInstanceBuilderNative();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void pauseOnBufferingIntervalNative(long j11, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void pauseOnBufferingNative(long j11, boolean z11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void playbackIntervalMergeToleranceNative(long j11, long j12);

    private native void removeAllLabelsNative(long j11);

    private native void removeLabelNative(long j11, String str);

    private native void setLabelNative(long j11, String str, String str2);

    public void addLabels(Map<String, String> map) {
        try {
            addLabelsNative(this.f19447b, map);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    @Override // com.comscore.util.cpp.CppJavaBinder
    protected void destroyCppObject() {
        try {
            destroyCppInstanceNative(this.f19447b);
            this.f19447b = 0L;
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    public StreamingPublisherConfiguration getStreamingPublisherConfiguration(String str) {
        synchronized (this.f19449d) {
            try {
                StreamingPublisherConfiguration streamingPublisherConfiguration = this.f19448c.get(str);
                if (streamingPublisherConfiguration != null) {
                    return streamingPublisherConfiguration;
                }
                StreamingPublisherConfiguration streamingPublisherConfiguration2 = new StreamingPublisherConfiguration(this, str);
                this.f19448c.put(str, streamingPublisherConfiguration2);
                return streamingPublisherConfiguration2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeAllLabels() {
        try {
            removeAllLabelsNative(this.f19447b);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    public void removeLabel(String str) {
        try {
            removeLabelNative(this.f19447b, str);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    public void setLabel(String str, String str2) {
        try {
            setLabelNative(this.f19447b, str, str2);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class Builder extends CppJavaBinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f19450b;

        public Builder() {
            this.f19450b = 0L;
            try {
                this.f19450b = StreamingConfiguration.newCppInstanceBuilderNative();
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
            }
        }

        public Builder autoResumeStateOnAssetChange(boolean z11) {
            try {
                StreamingConfiguration.autoResumeStateOnAssetChangeNative(this.f19450b, z11);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        public StreamingConfiguration build() {
            try {
                return new StreamingConfiguration(StreamingConfiguration.buildNative(this.f19450b));
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return new StreamingConfiguration(0L);
            }
        }

        public Builder customStartMinimumPlayback(long j11) {
            try {
                StreamingConfiguration.customStartMinimumPlaybackNative(this.f19450b, j11);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        @Override // com.comscore.util.cpp.CppJavaBinder
        protected void destroyCppObject() {
            try {
                StreamingConfiguration.destroyCppInstanceBuilderNative(this.f19450b);
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
            }
        }

        public Builder heartbeatIntervals(List<Map<String, Long>> list) {
            if (list == null) {
                return this;
            }
            Iterator<Map<String, Long>> it = list.iterator();
            while (it.hasNext()) {
                for (Map.Entry<String, Long> entry : it.next().entrySet()) {
                    if (!(entry.getKey() instanceof String) || !(entry.getValue() instanceof Long)) {
                        throw new IllegalArgumentException("intervals must be an object of type ArrayList<HashMap<String, Long>>");
                    }
                }
            }
            try {
                StreamingConfiguration.heartbeatIntervalsNative(this.f19450b, list);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        public Builder heartbeatMeasurement(boolean z11) {
            try {
                StreamingConfiguration.heartbeatMeasurementNative(this.f19450b, z11);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        public Builder includedPublishers(List<String> list) {
            try {
                StreamingConfiguration.includedPublishersNative(this.f19450b, list);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        public Builder keepAliveInterval(long j11) {
            try {
                StreamingConfiguration.keepAliveIntervalNative(this.f19450b, j11);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        public Builder keepAliveMeasurement(boolean z11) {
            try {
                StreamingConfiguration.keepAliveMeasurementNative(this.f19450b, z11);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        public Builder labels(Map<String, String> map) {
            try {
                StreamingConfiguration.labelsNative(this.f19450b, map);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        public Builder pauseOnBuffering(boolean z11) {
            try {
                StreamingConfiguration.pauseOnBufferingNative(this.f19450b, z11);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        public Builder pauseOnBufferingInterval(long j11) {
            try {
                StreamingConfiguration.pauseOnBufferingIntervalNative(this.f19450b, j11);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        public Builder playbackIntervalMergeTolerance(long j11) {
            try {
                StreamingConfiguration.playbackIntervalMergeToleranceNative(this.f19450b, j11);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        public Builder includedPublishers(String... strArr) {
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, strArr);
            includedPublishers(arrayList);
            return this;
        }
    }

    private StreamingConfiguration(long j11) {
        this.f19449d = new Object();
        this.f19447b = j11;
        this.f19448c = new WeakHashMap<>();
    }

    long a() {
        return this.f19447b;
    }

    @Deprecated
    public StreamingConfiguration(StreamingConfiguration streamingConfiguration) {
        this.f19447b = 0L;
        this.f19449d = new Object();
        try {
            this.f19447b = copyNative(streamingConfiguration.f19447b);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }
}
