package product;

import javax.persistence.Basic;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Arrays;

@javax.persistence.Table(name = "PRODUCT_IMAGES", schema = "FODPRODUCT", catalog = "")
public class ProductImagesEntity {
    private Long productImageId;

    @Id
    @javax.persistence.Column(name = "PRODUCT_IMAGE_ID", nullable = false, precision = 0)
    public Long getProductImageId() {
        return productImageId;
    }

    public void setProductImageId(Long productImageId) {
        this.productImageId = productImageId;
    }

    private Long productId;

    @Basic
    @javax.persistence.Column(name = "PRODUCT_ID", nullable = false, precision = 0)
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    private String defaultViewFlag;

    @Basic
    @javax.persistence.Column(name = "DEFAULT_VIEW_FLAG", nullable = false, length = 1)
    public String getDefaultViewFlag() {
        return defaultViewFlag;
    }

    public void setDefaultViewFlag(String defaultViewFlag) {
        this.defaultViewFlag = defaultViewFlag;
    }

    private Long detailImageId;

    @Basic
    @javax.persistence.Column(name = "DETAIL_IMAGE_ID", nullable = true, precision = 0)
    public Long getDetailImageId() {
        return detailImageId;
    }

    public void setDetailImageId(Long detailImageId) {
        this.detailImageId = detailImageId;
    }

    private byte[] image;

    @Basic
    @javax.persistence.Column(name = "IMAGE", nullable = false)
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
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

        ProductImagesEntity that = (ProductImagesEntity) o;

        if (productImageId != null ? !productImageId.equals(that.productImageId) : that.productImageId != null)
            return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (defaultViewFlag != null ? !defaultViewFlag.equals(that.defaultViewFlag) : that.defaultViewFlag != null)
            return false;
        if (detailImageId != null ? !detailImageId.equals(that.detailImageId) : that.detailImageId != null)
            return false;
        if (!Arrays.equals(image, that.image)) return false;
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
        int result = productImageId != null ? productImageId.hashCode() : 0;
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (defaultViewFlag != null ? defaultViewFlag.hashCode() : 0);
        result = 31 * result + (detailImageId != null ? detailImageId.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(image);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (objectVersionId != null ? objectVersionId.hashCode() : 0);
        return result;
    }
}
