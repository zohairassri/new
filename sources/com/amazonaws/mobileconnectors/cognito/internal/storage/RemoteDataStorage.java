package com.amazonaws.mobileconnectors.cognito.internal.storage;

import com.amazonaws.mobileconnectors.cognito.DatasetMetadata;
import com.amazonaws.mobileconnectors.cognito.Record;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataConflictException;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataStorageException;
import com.amazonaws.mobileconnectors.cognito.exceptions.DatasetNotFoundException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public interface RemoteDataStorage {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface DatasetUpdates {
        String getDatasetName();

        List<String> getMergedDatasetNameList();

        List<Record> getRecords();

        long getSyncCount();

        String getSyncSessionToken();

        boolean isDeleted();

        boolean isExists();
    }

    void deleteDataset(String str) throws DatasetNotFoundException;

    DatasetMetadata getDatasetMetadata(String str) throws DataStorageException;

    List<DatasetMetadata> getDatasets() throws DataStorageException;

    DatasetUpdates listUpdates(String str, long j11) throws DataStorageException;

    List<Record> putRecords(String str, List<Record> list, String str2, String str3) throws DatasetNotFoundException, DataConflictException;

    void subscribeToDataset(String str, String str2);

    void unsubscribeFromDataset(String str, String str2);
}
