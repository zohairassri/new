package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class UserInfo {
    public int uid;
    public String userAccount;

    public UserInfo() {
    }

    @CalledByNative
    public void SetUid(int i11) {
        this.uid = i11;
    }

    @CalledByNative
    public void SetUserAccount(String str) {
        this.userAccount = str;
    }

    public UserInfo(int i11, String str) {
        this.uid = i11;
        this.userAccount = str;
    }
}
