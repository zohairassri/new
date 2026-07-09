package com.amazonaws.util.json;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface AwsJsonReader {
    void beginArray() throws IOException;

    void beginObject() throws IOException;

    void close() throws IOException;

    void endArray() throws IOException;

    void endObject() throws IOException;

    boolean hasNext() throws IOException;

    boolean isContainer() throws IOException;

    String nextName() throws IOException;

    String nextString() throws IOException;

    AwsJsonToken peek() throws IOException;

    void skipValue() throws IOException;
}
