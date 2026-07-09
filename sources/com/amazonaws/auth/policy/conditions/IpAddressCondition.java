package com.amazonaws.auth.policy.conditions;

import com.amazonaws.auth.policy.Condition;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class IpAddressCondition extends Condition {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum IpAddressComparisonType {
        IpAddress,
        NotIpAddress
    }

    public IpAddressCondition(String str) {
        this(IpAddressComparisonType.IpAddress, str);
    }

    public IpAddressCondition(IpAddressComparisonType ipAddressComparisonType, String str) {
        this.type = ipAddressComparisonType.toString();
        this.conditionKey = ConditionFactory.SOURCE_IP_CONDITION_KEY;
        this.values = Arrays.asList(str);
    }
}
