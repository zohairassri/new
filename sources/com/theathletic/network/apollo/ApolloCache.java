package com.theathletic.network.apollo;

import android.content.Context;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/theathletic/network/apollo/ApolloCache;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ljava/io/File;", TransferTable.COLUMN_FILE, "Ljava/io/File;", "a", "()Ljava/io/File;", "", "size", "J", QueryKeys.PAGE_LOAD_TIME, "()J", "graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApolloCache {

    @NotNull
    private final File file;
    private final long size;

    public ApolloCache(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.file = new File(context.getApplicationContext().getCacheDir(), "apolloCache");
        this.size = 2097152L;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getSize() {
        return this.size;
    }
}
