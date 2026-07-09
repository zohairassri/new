package com.amazonaws.auth;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface AWSCognitoIdentityProvider extends AWSIdentityProvider {
    void clearListeners();

    String getIdentityId();

    String getIdentityPoolId();

    Map<String, String> getLogins();

    void identityChanged(String str);

    boolean isAuthenticated();

    void registerIdentityChangedListener(IdentityChangedListener identityChangedListener);

    void setLogins(Map<String, String> map);

    void unregisterIdentityChangedListener(IdentityChangedListener identityChangedListener);
}
