package com.amazonaws.mobile.config;

import android.content.Context;
import com.amazonaws.ClientConfiguration;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface AWSConfigurable {
    AWSConfigurable initialize(Context context) throws Exception;

    AWSConfigurable initialize(Context context, AWSConfiguration aWSConfiguration) throws Exception;

    AWSConfigurable initialize(Context context, AWSConfiguration aWSConfiguration, ClientConfiguration clientConfiguration) throws Exception;
}
