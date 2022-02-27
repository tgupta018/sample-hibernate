package repo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Collection;

@Table(name = "PRODUCT_CATEGORIES_BASE", schema = "FOD", catalog = "")
public class ProductCategoriesBaseEntity {
    private Long categoryId;
    private Long parentCategoryId;
    private String categoryLockedFlag;
    private Long representativeProductId;
    private String createdBy;
    private Time creationDate;
    private String lastUpdatedBy;
    private Time lastUpdateDate;
    private Long objectVersionId;
    private ProductCategoriesBaseEntity productCategoriesBaseByParentCategoryId;
    private Collection<ProductCategoriesBaseEntity> productCategoriesBasesByCategoryId;

    @Id
    @Column(name = "CATEGORY_ID", nullable = false, precision = 0)
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "PARENT_CATEGORY_ID", nullable = true, precision = 0)
    public Long getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    @Basic
    @Column(name = "CATEGORY_LOCKED_FLAG", nullable = false, length = 1)
    public String getCategoryLockedFlag() {
        return categoryLockedFlag;
    }

    public void setCategoryLockedFlag(String categoryLockedFlag) {
        this.categoryLockedFlag = categoryLockedFlag;
    }

    @Basic
    @Column(name = "REPRESENTATIVE_PRODUCT_ID", nullable = true, precision = 0)
    public Long getRepresentativeProductId() {
        return representativeProductId;
    }

    public void setRepresentativeProductId(Long representativeProductId) {
        this.representativeProductId = representativeProductId;
    }

    @Basic
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "CREATION_DATE", nullable = false)
    public Time getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Time creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Basic
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    public Time getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Time lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

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

        ProductCategoriesBaseEntity that = (ProductCategoriesBaseEntity) o;

        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (parentCategoryId != null ? !parentCategoryId.equals(that.parentCategoryId) : that.parentCategoryId != null)
            return false;
        if (categoryLockedFlag != null ? !categoryLockedFlag.equals(that.categoryLockedFlag) : that.categoryLockedFlag != null)
            return false;
        if (representativeProductId != null ? !representativeProductId.equals(that.representativeProductId) : that.representativeProductId != null)
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
        int result = categoryId != null ? categoryId.hashCode() : 0;
        result = 31 * result + (parentCategoryId != null ? parentCategoryId.hashCode() : 0);
        result = 31 * result + (categoryLockedFlag != null ? categoryLockedFlag.hashCode() : 0);
        result = 31 * result + (representativeProductId != null ? representativeProductId.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (objectVersionId != null ? objectVersionId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "PARENT_CATEGORY_ID", referencedColumnName = "CATEGORY_ID", table = "PRODUCT_CATEGORIES_BASE")
    public ProductCategoriesBaseEntity getProductCategoriesBaseByParentCategoryId() {
        return productCategoriesBaseByParentCategoryId;
    }

    public void setProductCategoriesBaseByParentCategoryId(ProductCategoriesBaseEntity productCategoriesBaseByParentCategoryId) {
        this.productCategoriesBaseByParentCategoryId = productCategoriesBaseByParentCategoryId;
    }

    @OneToMany(mappedBy = "productCategoriesBaseByParentCategoryId")
    public Collection<ProductCategoriesBaseEntity> getProductCategoriesBasesByCategoryId() {
        return productCategoriesBasesByCategoryId;
    }

    public void setProductCategoriesBasesByCategoryId(Collection<ProductCategoriesBaseEntity> productCategoriesBasesByCategoryId) {
        this.productCategoriesBasesByCategoryId = productCategoriesBasesByCategoryId;
    }
}
