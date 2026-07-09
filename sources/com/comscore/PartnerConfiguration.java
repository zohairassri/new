package com.comscore;

import com.comscore.ClientConfiguration;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class PartnerConfiguration extends ClientConfiguration {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class Builder extends ClientConfiguration.Builder<Builder, PartnerConfiguration> {
        protected String externalClientId;

        public Builder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.comscore.ClientConfiguration.Builder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Builder a() {
            return new Builder(this);
        }

        public Builder externalClientId(String str) {
            this.externalClientId = str;
            return this;
        }

        public Builder partnerId(String str) {
            setClientId(str);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.comscore.ClientConfiguration.Builder
        public Builder self() {
            return this;
        }

        private Builder(Builder builder) {
            super(builder);
            this.externalClientId = builder.externalClientId;
        }

        @Override // com.comscore.ClientConfiguration.Builder
        public PartnerConfiguration build() {
            return new PartnerConfiguration(this);
        }
    }

    private static native void destroyCppInstanceNative(long j11);

    private static native String getExternalClientIdNative(long j11);

    private static native String getPartnerIdNative(long j11);

    private static native long newCppInstanceNative(Builder builder);

    @Override // com.comscore.util.cpp.CppJavaBinder
    protected void destroyCppObject() {
        destroyCppInstanceNative(this.f19370b);
    }

    public String getExternalClientId() {
        try {
            return getExternalClientIdNative(this.f19370b);
        } catch (UnsatisfiedLinkError e11) {
            this.printException(e11);
            return null;
        }
    }

    public String getPartnerId() {
        try {
            return getPartnerIdNative(this.f19370b);
        } catch (UnsatisfiedLinkError e11) {
            this.printException(e11);
            return null;
        }
    }

    PartnerConfiguration(long j11) {
        this.f19370b = j11;
    }

    private PartnerConfiguration(Builder builder) {
        super(builder);
        try {
            this.f19370b = newCppInstanceNative(builder);
        } catch (UnsatisfiedLinkError e11) {
            printException(e11);
        }
    }
}
