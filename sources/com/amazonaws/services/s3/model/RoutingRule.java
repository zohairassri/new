package com.amazonaws.services.s3.model;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class RoutingRule {
    RoutingRuleCondition condition;
    RedirectRule redirect;

    public RoutingRuleCondition getCondition() {
        return this.condition;
    }

    public RedirectRule getRedirect() {
        return this.redirect;
    }

    public void setCondition(RoutingRuleCondition routingRuleCondition) {
        this.condition = routingRuleCondition;
    }

    public void setRedirect(RedirectRule redirectRule) {
        this.redirect = redirectRule;
    }

    public RoutingRule withCondition(RoutingRuleCondition routingRuleCondition) {
        setCondition(routingRuleCondition);
        return this;
    }

    public RoutingRule withRedirect(RedirectRule redirectRule) {
        setRedirect(redirectRule);
        return this;
    }
}
