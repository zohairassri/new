package hf0;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class d extends c {
    public static final List a(Path path, String glob) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            Intrinsics.checkNotNull(directoryStreamNewDirectoryStream);
            List listI1 = CollectionsKt.i1(directoryStreamNewDirectoryStream);
            gf0.b.a(directoryStreamNewDirectoryStream, null);
            return listI1;
        } finally {
        }
    }

    public static /* synthetic */ List b(Path path, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "*";
        }
        return a(path, str);
    }
}
