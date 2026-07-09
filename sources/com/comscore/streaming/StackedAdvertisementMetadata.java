package com.comscore.streaming;

import com.comscore.util.cpp.CppJavaBinder;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class StackedAdvertisementMetadata extends CppJavaBinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f19439b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class Builder extends CppJavaBinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f19440b;

        public Builder() {
            try {
                this.f19440b = StackedAdvertisementMetadata.newCppInstanceBuilderNative();
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
            }
        }

        public StackedAdvertisementMetadata build() {
            try {
                return new StackedAdvertisementMetadata(StackedAdvertisementMetadata.buildNative(this.f19440b));
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return new StackedAdvertisementMetadata(0L);
            }
        }

        public Builder customLabels(Map<String, String> map) {
            try {
                StackedAdvertisementMetadata.customLabelsNative(this.f19440b, map);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        @Override // com.comscore.util.cpp.CppJavaBinder
        protected void destroyCppObject() {
            try {
                StackedAdvertisementMetadata.destroyCppInstanceBuilderNative(this.f19440b);
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
            }
        }

        public Builder fee(int i11) {
            try {
                StackedAdvertisementMetadata.feeNative(this.f19440b, i11);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        public Builder placementId(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedAdvertisementMetadata.placementIdNative(this.f19440b, str);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        public Builder serverCampaignId(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedAdvertisementMetadata.serverCampaignIdNative(this.f19440b, str);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        public Builder siteId(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedAdvertisementMetadata.siteIdNative(this.f19440b, str);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        public Builder title(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedAdvertisementMetadata.titleNative(this.f19440b, str);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }

        public Builder uniqueId(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedAdvertisementMetadata.uniqueIdNative(this.f19440b, str);
                return this;
            } catch (UnsatisfiedLinkError e11) {
                printException(e11);
                return this;
            }
        }
    }

    StackedAdvertisementMetadata(long j11) {
        this.f19439b = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long buildNative(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void customLabelsNative(long j11, Map<String, String> map);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void destroyCppInstanceBuilderNative(long j11);

    private native void destroyCppInstanceNative(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void feeNative(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long newCppInstanceBuilderNative();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void placementIdNative(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void serverCampaignIdNative(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void siteIdNative(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void titleNative(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void uniqueIdNative(long j11, String str);

    @Override // com.comscore.util.cpp.CppJavaBinder
    protected void destroyCppObject() {
        destroyCppInstanceNative(a());
    }

    long a() {
        return this.f19439b;
    }
}
