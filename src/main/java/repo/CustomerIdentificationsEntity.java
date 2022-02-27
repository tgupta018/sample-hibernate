package repo;

import javax.persistence.Basic;
import javax.persistence.Id;
import java.sql.Time;

@javax.persistence.Table(name = "CUSTOMER_IDENTIFICATIONS", schema = "FOD", catalog = "")
public class CustomerIdentificationsEntity {
    private Long customerId;

    @Id
    @javax.persistence.Column(name = "CUSTOMER_ID", nullable = false, precision = 0)
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    private String idTypeCode;

    @Basic
    @javax.persistence.Column(name = "ID_TYPE_CODE", nullable = false, length = 30)
    public String getIdTypeCode() {
        return idTypeCode;
    }

    public void setIdTypeCode(String idTypeCode) {
        this.idTypeCode = idTypeCode;
    }

    private String idDetail;

    @Basic
    @javax.persistence.Column(name = "ID_DETAIL", nullable = false, length = 20)
    public String getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(String idDetail) {
        this.idDetail = idDetail;
    }

    private String additionalInformation;

    @Basic
    @javax.persistence.Column(name = "ADDITIONAL_INFORMATION", nullable = true, length = 1000)
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    private String verifiedFlag;

    @Basic
    @javax.persistence.Column(name = "VERIFIED_FLAG", nullable = false, length = 1)
    public String getVerifiedFlag() {
        return verifiedFlag;
    }

    public void setVerifiedFlag(String verifiedFlag) {
        this.verifiedFlag = verifiedFlag;
    }

    private Time verifiedDate;

    @Basic
    @javax.persistence.Column(name = "VERIFIED_DATE", nullable = true)
    public Time getVerifiedDate() {
        return verifiedDate;
    }

    public void setVerifiedDate(Time verifiedDate) {
        this.verifiedDate = verifiedDate;
    }

    private String verificationMethodCode;

    @Basic
    @javax.persistence.Column(name = "VERIFICATION_METHOD_CODE", nullable = true, length = 30)
    public String getVerificationMethodCode() {
        return verificationMethodCode;
    }

    public void setVerificationMethodCode(String verificationMethodCode) {
        this.verificationMethodCode = verificationMethodCode;
    }

    private String createdBy;

    @Basic
    @javax.persistence.Column(name = "CREATED_BY", nullable = false, length = 60)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    private Time creationDate;

    @Basic
    @javax.persistence.Column(name = "CREATION_DATE", nullable = false)
    public Time getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Time creationDate) {
        this.creationDate = creationDate;
    }

    private String lastUpdatedBy;

    @Basic
    @javax.persistence.Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    private Time lastUpdateDate;

    @Basic
    @javax.persistence.Column(name = "LAST_UPDATE_DATE", nullable = false)
    public Time getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Time lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    private Long objectVersionId;

    @Basic
    @javax.persistence.Column(name = "OBJECT_VERSION_ID", nullable = false, precision = 0)
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

        CustomerIdentificationsEntity that = (CustomerIdentificationsEntity) o;

        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (idTypeCode != null ? !idTypeCode.equals(that.idTypeCode) : that.idTypeCode != null) return false;
        if (idDetail != null ? !idDetail.equals(that.idDetail) : that.idDetail != null) return false;
        if (additionalInformation != null ? !additionalInformation.equals(that.additionalInformation) : that.additionalInformation != null)
            return false;
        if (verifiedFlag != null ? !verifiedFlag.equals(that.verifiedFlag) : that.verifiedFlag != null) return false;
        if (verifiedDate != null ? !verifiedDate.equals(that.verifiedDate) : that.verifiedDate != null) return false;
        if (verificationMethodCode != null ? !verificationMethodCode.equals(that.verificationMethodCode) : that.verificationMethodCode != null)
            return false;
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
        int result = customerId != null ? customerId.hashCode() : 0;
        result = 31 * result + (idTypeCode != null ? idTypeCode.hashCode() : 0);
        result = 31 * result + (idDetail != null ? idDetail.hashCode() : 0);
        result = 31 * result + (additionalInformation != null ? additionalInformation.hashCode() : 0);
        result = 31 * result + (verifiedFlag != null ? verifiedFlag.hashCode() : 0);
        result = 31 * result + (verifiedDate != null ? verifiedDate.hashCode() : 0);
        result = 31 * result + (verificationMethodCode != null ? verificationMethodCode.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (objectVersionId != null ? objectVersionId.hashCode() : 0);
        return result;
    }
}
