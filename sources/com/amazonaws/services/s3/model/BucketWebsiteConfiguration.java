package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class BucketWebsiteConfiguration implements Serializable {
    private String errorDocument;
    private String indexDocumentSuffix;
    private RedirectRule redirectAllRequestsTo;
    private List<RoutingRule> routingRules = new LinkedList();

    public BucketWebsiteConfiguration() {
    }

    public String getErrorDocument() {
        return this.errorDocument;
    }

    public String getIndexDocumentSuffix() {
        return this.indexDocumentSuffix;
    }

    public RedirectRule getRedirectAllRequestsTo() {
        return this.redirectAllRequestsTo;
    }

    public List<RoutingRule> getRoutingRules() {
        return this.routingRules;
    }

    public void setErrorDocument(String str) {
        this.errorDocument = str;
    }

    public void setIndexDocumentSuffix(String str) {
        this.indexDocumentSuffix = str;
    }

    public void setRedirectAllRequestsTo(RedirectRule redirectRule) {
        this.redirectAllRequestsTo = redirectRule;
    }

    public void setRoutingRules(List<RoutingRule> list) {
        this.routingRules = list;
    }

    public BucketWebsiteConfiguration withRedirectAllRequestsTo(RedirectRule redirectRule) {
        this.redirectAllRequestsTo = redirectRule;
        return this;
    }

    public BucketWebsiteConfiguration withRoutingRules(List<RoutingRule> list) {
        this.routingRules = list;
        return this;
    }

    public BucketWebsiteConfiguration(String str) {
        this.indexDocumentSuffix = str;
    }

    public BucketWebsiteConfiguration(String str, String str2) {
        this.indexDocumentSuffix = str;
        this.errorDocument = str2;
    }
}
