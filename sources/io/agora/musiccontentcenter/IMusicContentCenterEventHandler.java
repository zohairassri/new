package io.agora.musiccontentcenter;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public interface IMusicContentCenterEventHandler {
    @CalledByNative
    void onLyricResult(String str, long j11, String str2, int i11);

    @CalledByNative
    void onMusicChartsResult(String str, MusicChartInfo[] musicChartInfoArr, int i11);

    @CalledByNative
    void onMusicCollectionResult(String str, int i11, int i12, int i13, Music[] musicArr, int i14);

    @CalledByNative
    void onPreLoadEvent(String str, long j11, int i11, String str2, int i12, int i13);

    @CalledByNative
    void onSongSimpleInfoResult(String str, long j11, String str2, int i11);
}
