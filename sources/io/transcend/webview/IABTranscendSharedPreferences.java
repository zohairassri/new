package io.transcend.webview;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class IABTranscendSharedPreferences {
    private final SharedPreferences sharedPreferences;

    public IABTranscendSharedPreferences(Context context) {
        this.sharedPreferences = androidx.preference.j.b(context.getApplicationContext());
    }

    public void getAll() {
        System.out.println(this.sharedPreferences.getAll());
    }

    public String getTCFTCString() {
        return this.sharedPreferences.getString(IABConstants.IAB_TCF_TC_STRING, null);
    }

    public void saveKey(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        if (str2 != null) {
            editorEdit.putString(str, str2);
        } else {
            editorEdit.remove(str);
        }
        editorEdit.apply();
    }

    public void saveTCFSDKId(int i11) {
        saveKey("IABTCF_CmpSdkID", i11);
    }

    public void saveKey(String str, int i11) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putInt(str, i11);
        editorEdit.apply();
    }
}
