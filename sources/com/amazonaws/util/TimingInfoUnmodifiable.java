package com.amazonaws.util;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class TimingInfoUnmodifiable extends TimingInfo {
    TimingInfoUnmodifiable(Long l11, long j11, Long l12) {
        super(l11, j11, l12);
    }

    @Override // com.amazonaws.util.TimingInfo
    public TimingInfo endTiming() {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazonaws.util.TimingInfo
    public void setEndTime(long j11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazonaws.util.TimingInfo
    public void setEndTimeNano(long j11) {
        throw new UnsupportedOperationException();
    }
}
