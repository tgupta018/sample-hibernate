package repo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Time;

@Table(name = "MEMBERSHIP_TRANSLATIONS", schema = "FOD", catalog = "")
public class MembershipTranslationsEntity {
    private Long membershipTranslationsId;
    private Long membershipId;
    private String membershipName;
    private String description;
    private String language;
    private String sourceLanguage;
    private String createdBy;
    private Time creationDate;
    private String lastUpdatedBy;
    private Time lastUpdateDate;
    private Long objectVersionId;
    private MembershipsBaseEntity membershipsBaseByMembershipId;

    @Id
    @Column(name = "MEMBERSHIP_TRANSLATIONS_ID", nullable = false, precision = 0)
    public Long getMembershipTranslationsId() {
        return membershipTranslationsId;
    }

    public void setMembershipTranslationsId(Long membershipTranslationsId) {
        this.membershipTranslationsId = membershipTranslationsId;
    }

    @Basic
    @Column(name = "MEMBERSHIP_ID", nullable = false, precision = 0)
    public Long getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Long membershipId) {
        this.membershipId = membershipId;
    }

    @Basic
    @Column(name = "MEMBERSHIP_NAME", nullable = false, length = 120)
    public String getMembershipName() {
        return membershipName;
    }

    public void setMembershipName(String membershipName) {
        this.membershipName = membershipName;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 2000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "LANGUAGE", nullable = false, length = 30)
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "SOURCE_LANGUAGE", nullable = false, length = 15)
    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
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

        MembershipTranslationsEntity that = (MembershipTranslationsEntity) o;

        if (membershipTranslationsId != null ? !membershipTranslationsId.equals(that.membershipTranslationsId) : that.membershipTranslationsId != null)
            return false;
        if (membershipId != null ? !membershipId.equals(that.membershipId) : that.membershipId != null) return false;
        if (membershipName != null ? !membershipName.equals(that.membershipName) : that.membershipName != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (sourceLanguage != null ? !sourceLanguage.equals(that.sourceLanguage) : that.sourceLanguage != null)
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
        int result = membershipTranslationsId != null ? membershipTranslationsId.hashCode() : 0;
        result = 31 * result + (membershipId != null ? membershipId.hashCode() : 0);
        result = 31 * result + (membershipName != null ? membershipName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (sourceLanguage != null ? sourceLanguage.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (objectVersionId != null ? objectVersionId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "MEMBERSHIP_ID", referencedColumnName = "MEMBERSHIP_ID", nullable = false, table = "MEMBERSHIP_TRANSLATIONS")
    public MembershipsBaseEntity getMembershipsBaseByMembershipId() {
        return membershipsBaseByMembershipId;
    }

    public void setMembershipsBaseByMembershipId(MembershipsBaseEntity membershipsBaseByMembershipId) {
        this.membershipsBaseByMembershipId = membershipsBaseByMembershipId;
    }
}
