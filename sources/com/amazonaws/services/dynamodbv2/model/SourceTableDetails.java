package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class SourceTableDetails implements Serializable {
    private Long itemCount;
    private List<KeySchemaElement> keySchema;
    private ProvisionedThroughput provisionedThroughput;
    private String tableArn;
    private Date tableCreationDateTime;
    private String tableId;
    private String tableName;
    private Long tableSizeBytes;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SourceTableDetails)) {
            return false;
        }
        SourceTableDetails sourceTableDetails = (SourceTableDetails) obj;
        if ((sourceTableDetails.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        if (sourceTableDetails.getTableName() != null && !sourceTableDetails.getTableName().equals(getTableName())) {
            return false;
        }
        if ((sourceTableDetails.getTableId() == null) ^ (getTableId() == null)) {
            return false;
        }
        if (sourceTableDetails.getTableId() != null && !sourceTableDetails.getTableId().equals(getTableId())) {
            return false;
        }
        if ((sourceTableDetails.getTableArn() == null) ^ (getTableArn() == null)) {
            return false;
        }
        if (sourceTableDetails.getTableArn() != null && !sourceTableDetails.getTableArn().equals(getTableArn())) {
            return false;
        }
        if ((sourceTableDetails.getTableSizeBytes() == null) ^ (getTableSizeBytes() == null)) {
            return false;
        }
        if (sourceTableDetails.getTableSizeBytes() != null && !sourceTableDetails.getTableSizeBytes().equals(getTableSizeBytes())) {
            return false;
        }
        if ((sourceTableDetails.getKeySchema() == null) ^ (getKeySchema() == null)) {
            return false;
        }
        if (sourceTableDetails.getKeySchema() != null && !sourceTableDetails.getKeySchema().equals(getKeySchema())) {
            return false;
        }
        if ((sourceTableDetails.getTableCreationDateTime() == null) ^ (getTableCreationDateTime() == null)) {
            return false;
        }
        if (sourceTableDetails.getTableCreationDateTime() != null && !sourceTableDetails.getTableCreationDateTime().equals(getTableCreationDateTime())) {
            return false;
        }
        if ((sourceTableDetails.getProvisionedThroughput() == null) ^ (getProvisionedThroughput() == null)) {
            return false;
        }
        if (sourceTableDetails.getProvisionedThroughput() != null && !sourceTableDetails.getProvisionedThroughput().equals(getProvisionedThroughput())) {
            return false;
        }
        if ((sourceTableDetails.getItemCount() == null) ^ (getItemCount() == null)) {
            return false;
        }
        return sourceTableDetails.getItemCount() == null || sourceTableDetails.getItemCount().equals(getItemCount());
    }

    public Long getItemCount() {
        return this.itemCount;
    }

    public List<KeySchemaElement> getKeySchema() {
        return this.keySchema;
    }

    public ProvisionedThroughput getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    public String getTableArn() {
        return this.tableArn;
    }

    public Date getTableCreationDateTime() {
        return this.tableCreationDateTime;
    }

    public String getTableId() {
        return this.tableId;
    }

    public String getTableName() {
        return this.tableName;
    }

    public Long getTableSizeBytes() {
        return this.tableSizeBytes;
    }

    public int hashCode() {
        return (((((((((((((((getTableName() == null ? 0 : getTableName().hashCode()) + 31) * 31) + (getTableId() == null ? 0 : getTableId().hashCode())) * 31) + (getTableArn() == null ? 0 : getTableArn().hashCode())) * 31) + (getTableSizeBytes() == null ? 0 : getTableSizeBytes().hashCode())) * 31) + (getKeySchema() == null ? 0 : getKeySchema().hashCode())) * 31) + (getTableCreationDateTime() == null ? 0 : getTableCreationDateTime().hashCode())) * 31) + (getProvisionedThroughput() == null ? 0 : getProvisionedThroughput().hashCode())) * 31) + (getItemCount() != null ? getItemCount().hashCode() : 0);
    }

    public void setItemCount(Long l11) {
        this.itemCount = l11;
    }

    public void setKeySchema(Collection<KeySchemaElement> collection) {
        if (collection == null) {
            this.keySchema = null;
        } else {
            this.keySchema = new ArrayList(collection);
        }
    }

    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    public void setTableArn(String str) {
        this.tableArn = str;
    }

    public void setTableCreationDateTime(Date date) {
        this.tableCreationDateTime = date;
    }

    public void setTableId(String str) {
        this.tableId = str;
    }

    public void setTableName(String str) {
        this.tableName = str;
    }

    public void setTableSizeBytes(Long l11) {
        this.tableSizeBytes = l11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getTableName() != null) {
            sb2.append("TableName: " + getTableName() + ",");
        }
        if (getTableId() != null) {
            sb2.append("TableId: " + getTableId() + ",");
        }
        if (getTableArn() != null) {
            sb2.append("TableArn: " + getTableArn() + ",");
        }
        if (getTableSizeBytes() != null) {
            sb2.append("TableSizeBytes: " + getTableSizeBytes() + ",");
        }
        if (getKeySchema() != null) {
            sb2.append("KeySchema: " + getKeySchema() + ",");
        }
        if (getTableCreationDateTime() != null) {
            sb2.append("TableCreationDateTime: " + getTableCreationDateTime() + ",");
        }
        if (getProvisionedThroughput() != null) {
            sb2.append("ProvisionedThroughput: " + getProvisionedThroughput() + ",");
        }
        if (getItemCount() != null) {
            sb2.append("ItemCount: " + getItemCount());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public SourceTableDetails withItemCount(Long l11) {
        this.itemCount = l11;
        return this;
    }

    public SourceTableDetails withKeySchema(KeySchemaElement... keySchemaElementArr) {
        if (getKeySchema() == null) {
            this.keySchema = new ArrayList(keySchemaElementArr.length);
        }
        for (KeySchemaElement keySchemaElement : keySchemaElementArr) {
            this.keySchema.add(keySchemaElement);
        }
        return this;
    }

    public SourceTableDetails withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }

    public SourceTableDetails withTableArn(String str) {
        this.tableArn = str;
        return this;
    }

    public SourceTableDetails withTableCreationDateTime(Date date) {
        this.tableCreationDateTime = date;
        return this;
    }

    public SourceTableDetails withTableId(String str) {
        this.tableId = str;
        return this;
    }

    public SourceTableDetails withTableName(String str) {
        this.tableName = str;
        return this;
    }

    public SourceTableDetails withTableSizeBytes(Long l11) {
        this.tableSizeBytes = l11;
        return this;
    }

    public SourceTableDetails withKeySchema(Collection<KeySchemaElement> collection) {
        setKeySchema(collection);
        return this;
    }
}
