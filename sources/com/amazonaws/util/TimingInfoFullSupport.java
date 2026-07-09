package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class TimingInfoFullSupport extends TimingInfo {
    private final Map<String, Number> countersByName;
    private final Map<String, List<TimingInfo>> subMeasurementsByName;

    TimingInfoFullSupport(Long l11, long j11, Long l12) {
        super(l11, j11, l12);
        this.subMeasurementsByName = new HashMap();
        this.countersByName = new HashMap();
    }

    @Override // com.amazonaws.util.TimingInfo
    public void addSubMeasurement(String str, TimingInfo timingInfo) {
        List<TimingInfo> arrayList = this.subMeasurementsByName.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.subMeasurementsByName.put(str, arrayList);
        }
        if (timingInfo.isEndTimeKnown()) {
            arrayList.add(timingInfo);
            return;
        }
        LogFactory.getLog(getClass()).debug("Skip submeasurement timing info with no end time for " + str);
    }

    @Override // com.amazonaws.util.TimingInfo
    public Map<String, Number> getAllCounters() {
        return this.countersByName;
    }

    @Override // com.amazonaws.util.TimingInfo
    public List<TimingInfo> getAllSubMeasurements(String str) {
        return this.subMeasurementsByName.get(str);
    }

    @Override // com.amazonaws.util.TimingInfo
    public Number getCounter(String str) {
        return this.countersByName.get(str);
    }

    @Override // com.amazonaws.util.TimingInfo
    public TimingInfo getLastSubMeasurement(String str) {
        List<TimingInfo> list;
        Map<String, List<TimingInfo>> map = this.subMeasurementsByName;
        if (map == null || map.size() == 0 || (list = this.subMeasurementsByName.get(str)) == null || list.size() == 0) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    @Override // com.amazonaws.util.TimingInfo
    public TimingInfo getSubMeasurement(String str) {
        return getSubMeasurement(str, 0);
    }

    @Override // com.amazonaws.util.TimingInfo
    public Map<String, List<TimingInfo>> getSubMeasurementsByName() {
        return this.subMeasurementsByName;
    }

    @Override // com.amazonaws.util.TimingInfo
    public void incrementCounter(String str) {
        setCounter(str, (getCounter(str) != null ? r0.intValue() : 0) + 1);
    }

    @Override // com.amazonaws.util.TimingInfo
    public void setCounter(String str, long j11) {
        this.countersByName.put(str, Long.valueOf(j11));
    }

    @Override // com.amazonaws.util.TimingInfo
    public TimingInfo getSubMeasurement(String str, int i11) {
        List<TimingInfo> list = this.subMeasurementsByName.get(str);
        if (i11 < 0 || list == null || list.size() == 0 || i11 >= list.size()) {
            return null;
        }
        return list.get(i11);
    }
}
