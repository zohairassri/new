package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class BucketTaggingConfiguration implements Serializable {
    private List<TagSet> tagSets;

    public BucketTaggingConfiguration() {
        this.tagSets = null;
        this.tagSets = new ArrayList(1);
    }

    public List<TagSet> getAllTagSets() {
        return this.tagSets;
    }

    public TagSet getTagSet() {
        return this.tagSets.get(0);
    }

    public TagSet getTagSetAtIndex(int i11) {
        return this.tagSets.get(i11);
    }

    public void setTagSets(Collection<TagSet> collection) {
        this.tagSets.clear();
        this.tagSets.addAll(collection);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append("TagSets: " + getAllTagSets());
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public BucketTaggingConfiguration withTagSets(TagSet... tagSetArr) {
        this.tagSets.clear();
        for (TagSet tagSet : tagSetArr) {
            this.tagSets.add(tagSet);
        }
        return this;
    }

    public BucketTaggingConfiguration(Collection<TagSet> collection) {
        this.tagSets = null;
        ArrayList arrayList = new ArrayList(1);
        this.tagSets = arrayList;
        arrayList.addAll(collection);
    }
}
