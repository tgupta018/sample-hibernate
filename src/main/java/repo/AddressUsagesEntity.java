package repo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Table(name = "ADDRESS_USAGES", schema = "FOD", catalog = "")
public class AddressUsagesEntity {
    private Long addressUsagesId;

    @Id
    @Column(name = "ADDRESS_USAGES_ID", nullable = false, precision = 0)
    public Long getAddressUsagesId() {
        return addressUsagesId;
    }

    public void setAddressUsagesId(Long addressUsagesId) {
        this.addressUsagesId = addressUsagesId;
    }

    private Long associatedOwnerId;

    @Basic
    @Column(name = "ASSOCIATED_OWNER_ID", nullable = false, precision = 0)
    public Long getAssociatedOwnerId() {
        return associatedOwnerId;
    }

    public void setAssociatedOwnerId(Long associatedOwnerId) {
        this.associatedOwnerId = associatedOwnerId;
    }

    private String ownerTypeCode;

    @Basic
    @Column(name = "OWNER_TYPE_CODE", nullable = false, length = 30)
    public String getOwnerTypeCode() {
        return ownerTypeCode;
    }

    public void setOwnerTypeCode(String ownerTypeCode) {
        this.ownerTypeCode = ownerTypeCode;
    }

    private Long addressId;

    @Basic
    @Column(name = "ADDRESS_ID", nullable = false, precision = 0)
    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    private String usageTypeCode;

    @Basic
    @Column(name = "USAGE_TYPE_CODE", nullable = false, length = 30)
    public String getUsageTypeCode() {
        return usageTypeCode;
    }

    public void setUsageTypeCode(String usageTypeCode) {
        this.usageTypeCode = usageTypeCode;
    }

    private String expiredFlag;

    @Basic
    @Column(name = "EXPIRED_FLAG", nullable = false, length = 1)
    public String getExpiredFlag() {
        return expiredFlag;
    }

    public void setExpiredFlag(String expiredFlag) {
        this.expiredFlag = expiredFlag;
    }

    private String createdBy;

    @Basic
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    private Time creationDate;

    @Basic
    @Column(name = "CREATION_DATE", nullable = false)
    public Time getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Time creationDate) {
        this.creationDate = creationDate;
    }

    private String lastUpdatedBy;

    @Basic
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    private Time lastUpdateDate;

    @Basic
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    public Time getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Time lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    private Long objectVersionId;

    @Basic
    @Column(name = "OBJECT_VERSION_ID", nullable = false, precision = 0)
    public Long getObjectVersionId() {
        return objectVersionId;
    }

    public void setObjectVersionId(Long objectVersionId) {
        this.objectVersionId = objectVersionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressUsagesEntity that = (AddressUsagesEntity) o;

        if (addressUsagesId != null ? !addressUsagesId.equals(that.addressUsagesId) : that.addressUsagesId != null)
            return false;
        if (associatedOwnerId != null ? !associatedOwnerId.equals(that.associatedOwnerId) : that.associatedOwnerId != null)
            return false;
        if (ownerTypeCode != null ? !ownerTypeCode.equals(that.ownerTypeCode) : that.ownerTypeCode != null)
            return false;
        if (addressId != null ? !addressId.equals(that.addressId) : that.addressId != null) return false;
        if (usageTypeCode != null ? !usageTypeCode.equals(that.usageTypeCode) : that.usageTypeCode != null)
            return false;
        if (expiredFlag != null ? !expiredFlag.equals(that.expiredFlag) : that.expiredFlag != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(that.lastUpdatedBy) : that.lastUpdatedBy != null)
            return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (objectVersionId != null ? !objectVersionId.equals(that.objectVersionId) : that.objectVersionId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = addressUsagesId != null ? addressUsagesId.hashCode() : 0;
        result = 31 * result + (associatedOwnerId != null ? associatedOwnerId.hashCode() : 0);
        result = 31 * result + (ownerTypeCode != null ? ownerTypeCode.hashCode() : 0);
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        result = 31 * result + (usageTypeCode != null ? usageTypeCode.hashCode() : 0);
        result = 31 * result + (expiredFlag != null ? expiredFlag.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (objectVersionId != null ? objectVersionId.hashCode() : 0);
        return result;
    }
}
