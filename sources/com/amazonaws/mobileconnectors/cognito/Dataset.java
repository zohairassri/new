package com.amazonaws.mobileconnectors.cognito;

import com.amazonaws.mobileconnectors.cognito.exceptions.DataStorageException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public interface Dataset {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface SyncCallback {
        boolean onConflict(Dataset dataset, List<SyncConflict> list);

        boolean onDatasetDeleted(Dataset dataset, String str);

        boolean onDatasetsMerged(Dataset dataset, List<String> list);

        void onFailure(DataStorageException dataStorageException);

        void onSuccess(Dataset dataset, List<Record> list);
    }

    void delete();

    String get(String str);

    Map<String, String> getAll();

    List<Record> getAllRecords();

    DatasetMetadata getDatasetMetadata();

    long getLastSyncCount();

    long getSizeInBytes(String str);

    long getTotalSizeInBytes();

    boolean isChanged(String str);

    void put(String str, String str2);

    void putAll(Map<String, String> map);

    void remove(String str);

    void resolve(List<Record> list);

    void subscribe();

    void synchronize(SyncCallback syncCallback);

    void synchronizeOnConnectivity(SyncCallback syncCallback);

    void unsubscribe();
}
