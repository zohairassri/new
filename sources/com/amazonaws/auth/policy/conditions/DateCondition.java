package com.amazonaws.auth.policy.conditions;

import com.amazonaws.auth.policy.Condition;
import com.amazonaws.util.DateUtils;
import java.util.Arrays;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DateCondition extends Condition {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum DateComparisonType {
        DateEquals,
        DateGreaterThan,
        DateGreaterThanEquals,
        DateLessThan,
        DateLessThanEquals,
        DateNotEquals
    }

    public DateCondition(DateComparisonType dateComparisonType, Date date) {
        this.type = dateComparisonType.toString();
        this.conditionKey = ConditionFactory.CURRENT_TIME_CONDITION_KEY;
        this.values = Arrays.asList(DateUtils.formatISO8601Date(date));
    }
}
