package com.theathletic.drawable;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljava/io/File;", "", "a", "(Ljava/io/File;)F", "core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 File.kt\ncom/theathletic/extension/FileKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,15:1\n22793#2,5:16\n*S KotlinDebug\n*F\n+ 1 File.kt\ncom/theathletic/extension/FileKt\n*L\n10#1:16,5\n*E\n"})
public final class n {
    public static final float a(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (!file.isDirectory()) {
            return 0.0f;
        }
        File[] fileArrListFiles = file.listFiles();
        double length = 0.0d;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                length += (file2.length() / 1024.0d) / 1024.0d;
            }
        }
        return (float) length;
    }
}
