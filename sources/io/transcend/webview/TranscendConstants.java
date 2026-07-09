package io.transcend.webview;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class TranscendConstants {
    public static final String STORAGE_CONSENT_KEY = "tcmConsent";
    public static final String STORAGE_TCF_KEY = "tcmTcf";
    public static final String TRANSCEND_BRIDGE_URL = "https://cdn.transcend-mobile-consent.com/VERSION/BUNDLE_ID/bridge.html";
    public static final String TRANSCEND_BUNDLE_REGEX = "/(cm|cm-test)/([^/]+)/";
    public static final String TRANSCEND_CONSENT_DATA = "Transcend_Consent_Data";
    public static final String TRANSCEND_CONSENT_URL = "Transcend_Consent_Url";
    public static final String TRANSCEND_NO_INTERNET_ERROR = "Please check your network settings. Failed to load Transcend Consent Manager.";
    public static final String TRANSCEND_SDK_CACHE = "SDK_CACHE";
    public static final int TRANSCEND_TCF_CMP_SDK_ID = 399;
    public static Map<String, Object> sharedPreferencesMapper = new HashMap<String, Object>() { // from class: io.transcend.webview.TranscendConstants.1
        {
            put("cmpId", "IABTCF_CmpSdkID");
            put("cmpVersion", IABConstants.IAB_TCF_CMP_SDK_VERSION);
            put("tcfPolicyVersion", IABConstants.IAB_TCF_POLICY_VERSION);
            put("gdprApplies", "IABTCF_gdprApplies");
            put("publisherCC", "IABTCF_PublisherCC");
            put("purposeOneTreatment", "IABTCF_PurposeOneTreatment");
            put("tcString", IABConstants.IAB_TCF_TC_STRING);
            put("vendor_consents", "IABTCF_VendorConsents");
            put("vendor_legitimateInterests", "IABTCF_VendorLegitimateInterests");
            put("purpose_consents", "IABTCF_PurposeConsents");
            put("purpose_legitimateInterests", IABConstants.IAB_TCF_PURPOSE_LEGITIMATE_INTERESTS);
            put("specialFeatureOptins", IABConstants.IAB_TCF_SPECIAL_FEATURE_OPT_INS);
            put("publisher_consents", IABConstants.IAB_TCF_PUBLISHER_CONSENT);
            put("publisher_legitimateInterests", IABConstants.IAB_TCF_PUBLISHER_LEGITIMATE_INTERESTS);
            put("publisher_restrictions", IABConstants.IAB_TCF_PUBLISHER_RESTRICTIONS);
            put("publisher_customPurpose_consents", IABConstants.IAB_TCF_PUBLISHER_CUSTOM_PURPOSES_CONSENTS);
            put("publisher_customPurpose_legitimateInterests", IABConstants.IAB_TCF_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS);
        }
    };

    private TranscendConstants() {
    }
}
