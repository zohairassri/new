package com.comscore;

import com.comscore.util.cpp.CppJavaBinder;
import com.comscore.util.log.Logger;
import com.comscore.util.setup.Setup;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ClientConfiguration extends CppJavaBinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f19370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Builder f19371c;

    ClientConfiguration() {
        this.f19370b = 0L;
        this.f19371c = null;
    }

    private static native void addPersistentLabelsNative(long j11, Map<String, String> map);

    private static native boolean containsPersistentLabelNative(long j11, String str);

    private static native boolean containsStartLabelNative(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean getDefaultHttpRedirectCachingEnabledNative();

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean getDefaultKeepAliveMeasurementNative();

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean getDefaultSecureTransmissionNative();

    private static native String getPersistentLabelNative(long j11, String str);

    private static native Map<String, String> getPersistentLabelsNative(long j11);

    private static native Map<String, String> getStartLabelsNative(long j11);

    private static native boolean isHttpRedirectCachingEnabledNative(long j11);

    private static native boolean isKeepAliveMeasurementEnabledNative(long j11);

    private static native boolean isSecureTransmissionEnabledNative(long j11);

    private static native void removeAllPersistentLabelsNative(long j11);

    private static native void removePersistentLabelNative(long j11, String str);

    private static native void setPersistentLabelNative(long j11, String str, String str2);

    long a() {
        return this.f19370b;
    }

    public void addPersistentLabels(Map<String, String> map) {
        try {
            addPersistentLabelsNative(this.f19370b, map);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    public boolean containsPersistentLabel(String str) {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f19371c) != null) {
            return builder.persistentLabels.containsKey(str);
        }
        try {
            return containsPersistentLabelNative(this.f19370b, str);
        } catch (UnsatisfiedLinkError e11) {
            this.printException(e11);
            return false;
        }
    }

    public boolean containsStartLabel(String str) {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f19371c) != null) {
            return builder.startLabels.containsKey(str);
        }
        try {
            return containsStartLabelNative(this.f19370b, str);
        } catch (UnsatisfiedLinkError e11) {
            this.printException(e11);
            return false;
        }
    }

    public String getPersistentLabel(String str) {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f19371c) != null) {
            return builder.persistentLabels.get(str);
        }
        try {
            return getPersistentLabelNative(this.f19370b, str);
        } catch (UnsatisfiedLinkError e11) {
            this.printException(e11);
            return null;
        }
    }

    public Map<String, String> getPersistentLabels() {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f19371c) != null) {
            return builder.persistentLabels;
        }
        try {
            return getPersistentLabelsNative(this.f19370b);
        } catch (UnsatisfiedLinkError e11) {
            this.printException(e11);
            return null;
        }
    }

    public Map<String, String> getStartLabels() {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f19371c) != null) {
            return builder.startLabels;
        }
        try {
            return getStartLabelsNative(this.f19370b);
        } catch (UnsatisfiedLinkError e11) {
            this.printException(e11);
            return null;
        }
    }

    public boolean isHttpRedirectCachingEnabled() {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f19371c) != null) {
            return builder.httpRedirectCaching;
        }
        try {
            return isHttpRedirectCachingEnabledNative(this.f19370b);
        } catch (UnsatisfiedLinkError e11) {
            this.printException(e11);
            return false;
        }
    }

    public boolean isKeepAliveMeasurementEnabled() {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f19371c) != null) {
            return builder.keepAliveMeasurement;
        }
        try {
            return isKeepAliveMeasurementEnabledNative(this.f19370b);
        } catch (UnsatisfiedLinkError e11) {
            this.printException(e11);
            return false;
        }
    }

    public boolean isSecureTransmissionEnabled() {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f19371c) != null) {
            return builder.secureTransmission;
        }
        try {
            return isSecureTransmissionEnabledNative(this.f19370b);
        } catch (UnsatisfiedLinkError e11) {
            this.printException(e11);
            return false;
        }
    }

    @Deprecated
    public boolean isVceEnabled() {
        return false;
    }

    public void removeAllPersistentLabels() {
        try {
            removeAllPersistentLabelsNative(this.f19370b);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    public void removePersistentLabel(String str) {
        try {
            removePersistentLabelNative(this.f19370b, str);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    public void setPersistentLabel(String str, String str2) {
        try {
            setPersistentLabelNative(this.f19370b, str, str2);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }

    ClientConfiguration(Builder builder) {
        this.f19370b = 0L;
        this.f19371c = null;
        this.f19371c = builder.a();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class Builder<T extends Builder, P extends ClientConfiguration> {
        protected String clientId;
        protected boolean httpRedirectCaching;
        protected boolean keepAliveMeasurement;
        protected Map<String, String> persistentLabels;
        protected boolean secureTransmission;
        protected Map<String, String> startLabels;

        protected Builder(Builder builder) {
            this.persistentLabels = new HashMap(builder.persistentLabels);
            this.startLabels = new HashMap(builder.startLabels);
            this.keepAliveMeasurement = builder.keepAliveMeasurement;
            this.secureTransmission = builder.secureTransmission;
            this.httpRedirectCaching = builder.httpRedirectCaching;
            this.clientId = builder.clientId;
        }

        abstract T a();

        public abstract P build();

        public T httpRedirectCaching(boolean z11) {
            this.httpRedirectCaching = z11;
            return (T) self();
        }

        public T keepAliveMeasurement(boolean z11) {
            this.keepAliveMeasurement = z11;
            return (T) self();
        }

        public T persistentLabels(Map<String, String> map) {
            this.persistentLabels.clear();
            this.persistentLabels.putAll(map);
            return (T) self();
        }

        public T secureTransmission(boolean z11) {
            this.secureTransmission = z11;
            return (T) self();
        }

        protected abstract T self();

        protected void setClientId(String str) {
            this.clientId = str;
        }

        public T startLabels(Map<String, String> map) {
            this.startLabels.clear();
            this.startLabels.putAll(map);
            return (T) self();
        }

        @Deprecated
        public T vce(boolean z11) {
            return (T) self();
        }

        protected Builder() {
            try {
                this.keepAliveMeasurement = ClientConfiguration.getDefaultKeepAliveMeasurementNative();
                this.secureTransmission = ClientConfiguration.getDefaultSecureTransmissionNative();
                this.httpRedirectCaching = ClientConfiguration.getDefaultHttpRedirectCachingEnabledNative();
            } catch (UnsatisfiedLinkError e11) {
                Logger.e("Error using the native library: ", e11);
            }
            this.persistentLabels = new HashMap();
            this.startLabels = new HashMap();
        }
    }
}
