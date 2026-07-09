package com.amazonaws.services.s3.model;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class InstructionFileId extends S3ObjectId {
    public static final String DEFAULT_INSTRUCTION_FILE_SUFFIX = "instruction";

    @Deprecated
    public static final String DEFAULT_INSTURCTION_FILE_SUFFIX = "instruction";
    public static final String DOT = ".";

    InstructionFileId(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.amazonaws.services.s3.model.S3ObjectId
    public InstructionFileId instructionFileId() {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazonaws.services.s3.model.S3ObjectId
    public InstructionFileId instructionFileId(String str) {
        throw new UnsupportedOperationException();
    }
}
