package repo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Table(name = "DISCOUNTS_BASE", schema = "FOD", catalog = "")
public class DiscountsBaseEntity {
    private Long discountId;

    @Id
    @Column(name = "DISCOUNT_ID", nullable = false, precision = 0)
    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    private String discountTypeCode;

    @Basic
    @Column(name = "DISCOUNT_TYPE_CODE", nullable = false, length = 30)
    public String getDiscountTypeCode() {
        return discountTypeCode;
    }

    public void setDiscountTypeCode(String discountTypeCode) {
        this.discountTypeCode = discountTypeCode;
    }

    private Long discountAmount;

    @Basic
    @Column(name = "DISCOUNT_AMOUNT", nullable = false, precision = 0)
    public Long getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
    }

    private String applyAsPercentageFlag;

    @Basic
    @Column(name = "APPLY_AS_PERCENTAGE_FLAG", nullable = false, length = 1)
    public String getApplyAsPercentageFlag() {
        return applyAsPercentageFlag;
    }

    public void setApplyAsPercentageFlag(String applyAsPercentageFlag) {
        this.applyAsPercentageFlag = applyAsPercentageFlag;
    }

    private String easyCode;

    @Basic
    @Column(name = "EASY_CODE", nullable = true, length = 20)
    public String getEasyCode() {
        return easyCode;
    }

    public void setEasyCode(String easyCode) {
        this.easyCode = easyCode;
    }

    private String addFreeShippingFlag;

    @Basic
    @Column(name = "ADD_FREE_SHIPPING_FLAG", nullable = false, length = 1)
    public String getAddFreeShippingFlag() {
        return addFreeShippingFlag;
    }

    public void setAddFreeShippingFlag(String addFreeShippingFlag) {
        this.addFreeShippingFlag = addFreeShippingFlag;
    }

    private String onetimeDiscountFlag;

    @Basic
    @Column(name = "ONETIME_DISCOUNT_FLAG", nullable = false, length = 1)
    public String getOnetimeDiscountFlag() {
        return onetimeDiscountFlag;
    }

    public void setOnetimeDiscountFlag(String onetimeDiscountFlag) {
        this.onetimeDiscountFlag = onetimeDiscountFlag;
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

        DiscountsBaseEntity that = (DiscountsBaseEntity) o;

        if (discountId != null ? !discountId.equals(that.discountId) : that.discountId != null) return false;
        if (discountTypeCode != null ? !discountTypeCode.equals(that.discountTypeCode) : that.discountTypeCode != null)
            return false;
        if (discountAmount != null ? !discountAmount.equals(that.discountAmount) : that.discountAmount != null)
            return false;
        if (applyAsPercentageFlag != null ? !applyAsPercentageFlag.equals(that.applyAsPercentageFlag) : that.applyAsPercentageFlag != null)
            return false;
        if (easyCode != null ? !easyCode.equals(that.easyCode) : that.easyCode != null) return false;
        if (addFreeShippingFlag != null ? !addFreeShippingFlag.equals(that.addFreeShippingFlag) : that.addFreeShippingFlag != null)
            return false;
        if (onetimeDiscountFlag != null ? !onetimeDiscountFlag.equals(that.onetimeDiscountFlag) : that.onetimeDiscountFlag != null)
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
        int result = discountId != null ? discountId.hashCode() : 0;
        result = 31 * result + (discountTypeCode != null ? discountTypeCode.hashCode() : 0);
        result = 31 * result + (discountAmount != null ? discountAmount.hashCode() : 0);
        result = 31 * result + (applyAsPercentageFlag != null ? applyAsPercentageFlag.hashCode() : 0);
        result = 31 * result + (easyCode != null ? easyCode.hashCode() : 0);
        result = 31 * result + (addFreeShippingFlag != null ? addFreeShippingFlag.hashCode() : 0);
        result = 31 * result + (onetimeDiscountFlag != null ? onetimeDiscountFlag.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (objectVersionId != null ? objectVersionId.hashCode() : 0);
        return result;
    }
}
