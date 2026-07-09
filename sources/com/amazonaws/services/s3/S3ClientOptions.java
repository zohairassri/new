package com.amazonaws.services.s3;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class S3ClientOptions {
    public static final boolean DEFAULT_ACCELERATE_MODE_ENABLED = false;
    public static final boolean DEFAULT_CHUNKED_ENCODING_DISABLED = false;
    public static final boolean DEFAULT_DUALSTACK_ENABLED = false;
    public static final boolean DEFAULT_PATH_STYLE_ACCESS = false;
    public static final boolean DEFAULT_PAYLOAD_SIGNING_ENABLED = false;
    private final boolean accelerateModeEnabled;
    private final boolean chunkedEncodingDisabled;
    private final boolean dualstackEnabled;
    private boolean pathStyleAccess;
    private final boolean payloadSigningEnabled;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class Builder {
        private boolean accelerateModeEnabled;
        private boolean chunkedEncodingDisabled;
        private boolean dualstackEnabled;
        private boolean pathStyleAccess;
        private boolean payloadSigningEnabled;

        public S3ClientOptions build() {
            return new S3ClientOptions(this.pathStyleAccess, this.chunkedEncodingDisabled, this.accelerateModeEnabled, this.payloadSigningEnabled, this.dualstackEnabled);
        }

        public Builder disableChunkedEncoding() {
            this.chunkedEncodingDisabled = true;
            return this;
        }

        public Builder enableDualstack() {
            this.dualstackEnabled = true;
            return this;
        }

        public Builder setAccelerateModeEnabled(boolean z11) {
            this.accelerateModeEnabled = z11;
            return this;
        }

        public Builder setPathStyleAccess(boolean z11) {
            this.pathStyleAccess = z11;
            return this;
        }

        public Builder setPayloadSigningEnabled(boolean z11) {
            this.payloadSigningEnabled = z11;
            return this;
        }

        private Builder() {
            this.pathStyleAccess = false;
            this.chunkedEncodingDisabled = false;
            this.accelerateModeEnabled = false;
            this.payloadSigningEnabled = false;
            this.dualstackEnabled = false;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean isAccelerateModeEnabled() {
        return this.accelerateModeEnabled;
    }

    public boolean isChunkedEncodingDisabled() {
        return this.chunkedEncodingDisabled;
    }

    public boolean isDualstackEnabled() {
        return this.dualstackEnabled;
    }

    public boolean isPathStyleAccess() {
        return this.pathStyleAccess;
    }

    public boolean isPayloadSigningEnabled() {
        return this.payloadSigningEnabled;
    }

    @Deprecated
    public void setPathStyleAccess(boolean z11) {
        this.pathStyleAccess = z11;
    }

    @Deprecated
    public S3ClientOptions withPathStyleAccess(boolean z11) {
        setPathStyleAccess(z11);
        return this;
    }

    @Deprecated
    public S3ClientOptions() {
        this.pathStyleAccess = false;
        this.chunkedEncodingDisabled = false;
        this.accelerateModeEnabled = false;
        this.payloadSigningEnabled = false;
        this.dualstackEnabled = false;
    }

    @Deprecated
    public S3ClientOptions(S3ClientOptions s3ClientOptions) {
        this.pathStyleAccess = s3ClientOptions.pathStyleAccess;
        this.chunkedEncodingDisabled = s3ClientOptions.chunkedEncodingDisabled;
        this.accelerateModeEnabled = s3ClientOptions.accelerateModeEnabled;
        this.payloadSigningEnabled = s3ClientOptions.payloadSigningEnabled;
        this.dualstackEnabled = s3ClientOptions.dualstackEnabled;
    }

    private S3ClientOptions(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.pathStyleAccess = z11;
        this.chunkedEncodingDisabled = z12;
        this.accelerateModeEnabled = z13;
        this.payloadSigningEnabled = z14;
        this.dualstackEnabled = z15;
    }
}
