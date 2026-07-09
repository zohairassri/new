package com.statsig.androidsdk;

import com.comscore.android.id.IdHelperAndroid;
import com.theathletic.video.component.data.VideoRepository;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/statsig/androidsdk/HashAlgorithm;", "", VideoRepository.XML_ATTR_VALUE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SHA256", "DJB2", "NONE", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum HashAlgorithm {
    SHA256("sha256"),
    DJB2("djb2"),
    NONE(IdHelperAndroid.NO_ID_AVAILABLE);


    @NotNull
    private final String value;

    HashAlgorithm(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static HashAlgorithm[] valuesCustom() {
        HashAlgorithm[] hashAlgorithmArrValuesCustom = values();
        return (HashAlgorithm[]) Arrays.copyOf(hashAlgorithmArrValuesCustom, hashAlgorithmArrValuesCustom.length);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
