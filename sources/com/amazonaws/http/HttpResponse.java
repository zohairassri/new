package com.amazonaws.http;

import com.amazonaws.services.s3.Headers;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class HttpResponse {
    private InputStream content;
    private final Map<String, String> headers;
    private final InputStream rawContent;
    private final int statusCode;
    private final String statusText;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class Builder {
        private InputStream content;
        private final Map<String, String> headers = new HashMap();
        private int statusCode;
        private String statusText;

        public HttpResponse build() {
            return new HttpResponse(this.statusText, this.statusCode, Collections.unmodifiableMap(this.headers), this.content);
        }

        public Builder content(InputStream inputStream) {
            this.content = inputStream;
            return this;
        }

        public Builder header(String str, String str2) {
            this.headers.put(str, str2);
            return this;
        }

        public Builder statusCode(int i11) {
            this.statusCode = i11;
            return this;
        }

        public Builder statusText(String str) {
            this.statusText = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public InputStream getContent() throws IOException {
        if (this.content == null) {
            synchronized (this) {
                try {
                    if (this.rawContent == null || !"gzip".equals(this.headers.get(Headers.CONTENT_ENCODING))) {
                        this.content = this.rawContent;
                    } else {
                        this.content = new GZIPInputStream(this.rawContent);
                    }
                } finally {
                }
            }
        }
        return this.content;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public InputStream getRawContent() throws IOException {
        return this.rawContent;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusText() {
        return this.statusText;
    }

    private HttpResponse(String str, int i11, Map<String, String> map, InputStream inputStream) {
        this.statusText = str;
        this.statusCode = i11;
        this.headers = map;
        this.rawContent = inputStream;
    }
}
