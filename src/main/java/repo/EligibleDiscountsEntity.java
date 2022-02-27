package repo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Time;

@Table(name = "ELIGIBLE_DISCOUNTS", schema = "FOD", catalog = "")
@IdClass(repo.EligibleDiscountsEntityPK.class)
public class EligibleDiscountsEntity {
    private Long membershipId;

    @Id
    @Column(name = "MEMBERSHIP_ID", nullable = false, precision = 0)
    public Long getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Long membershipId) {
        this.membershipId = membershipId;
    }

    private Long discountId;

    @Id
    @Column(name = "DISCOUNT_ID", nullable = false, precision = 0)
    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    private Time validFromDate;

    @Basic
    @Column(name = "VALID_FROM_DATE", nullable = true)
    public Time getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate(Time validFromDate) {
        this.validFromDate = validFromDate;
    }

    private Time validToDate;

    @Basic
    @Column(name = "VALID_TO_DATE", nullable = true)
    public Time getValidToDate() {
        return validToDate;
    }

    public void setValidToDate(Time validToDate) {
        this.validToDate = validToDate;
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

        EligibleDiscountsEntity that = (EligibleDiscountsEntity) o;

        if (membershipId != null ? !membershipId.equals(that.membershipId) : that.membershipId != null) return false;
        if (discountId != null ? !discountId.equals(that.discountId) : that.discountId != null) return false;
        if (validFromDate != null ? !validFromDate.equals(that.validFromDate) : that.validFromDate != null)
            return false;
        if (validToDate != null ? !validToDate.equals(that.validToDate) : that.validToDate != null) return false;
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
        int result = membershipId != null ? membershipId.hashCode() : 0;
        result = 31 * result + (discountId != null ? discountId.hashCode() : 0);
        result = 31 * result + (validFromDate != null ? validFromDate.hashCode() : 0);
        result = 31 * result + (validToDate != null ? validToDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (objectVersionId != null ? objectVersionId.hashCode() : 0);
        return result;
    }
}
