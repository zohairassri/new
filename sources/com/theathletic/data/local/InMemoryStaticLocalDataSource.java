package com.theathletic.data.local;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/theathletic/data/local/InMemoryStaticLocalDataSource;", "Key", "Item", "", "<init>", "()V", "itemsMap", "", "get", TransferTable.COLUMN_KEY, "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "", "item", "(Ljava/lang/Object;Ljava/lang/Object;)V", "containsKey", "", "(Ljava/lang/Object;)Z", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InMemoryStaticLocalDataSource<Key, Item> {

    @NotNull
    private final Map<Key, Item> itemsMap = new LinkedHashMap();

    public final boolean containsKey(Key key) {
        return this.itemsMap.containsKey(key);
    }

    public final Item get(Key key) {
        return this.itemsMap.get(key);
    }

    public final void put(Key key, Item item) {
        this.itemsMap.put(key, item);
    }
}
