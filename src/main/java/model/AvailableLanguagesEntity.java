package model;

import javax.persistence.Basic;
import javax.persistence.Id;
import java.sql.Time;

@javax.persistence.Table(name = "AVAILABLE_LANGUAGES", schema = "FOD", catalog = "")
public class AvailableLanguagesEntity {
    private String language;

    @Id
    @javax.persistence.Column(name = "LANGUAGE", nullable = false, length = 30)
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    private String defaultFlag;

    @Basic
    @javax.persistence.Column(name = "DEFAULT_FLAG", nullable = false, length = 1)
    public String getDefaultFlag() {
        return defaultFlag;
    }

    public void setDefaultFlag(String defaultFlag) {
        this.defaultFlag = defaultFlag;
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

        AvailableLanguagesEntity that = (AvailableLanguagesEntity) o;

        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (defaultFlag != null ? !defaultFlag.equals(that.defaultFlag) : that.defaultFlag != null) return false;
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
        int result = language != null ? language.hashCode() : 0;
        result = 31 * result + (defaultFlag != null ? defaultFlag.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (objectVersionId != null ? objectVersionId.hashCode() : 0);
        return result;
    }
}
