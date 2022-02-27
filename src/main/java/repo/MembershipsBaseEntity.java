package repo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Collection;

@Table(name = "MEMBERSHIPS_BASE", schema = "FOD", catalog = "")
public class MembershipsBaseEntity {
    private Long membershipId;
    private String membershipTypeCode;
    private Long contactId;
    private String createdBy;
    private Time creationDate;
    private String lastUpdatedBy;
    private Time lastUpdateDate;
    private Long objectVersionId;
    private Collection<MembershipTranslationsEntity> membershipTranslationsByMembershipId;

    @Id
    @Column(name = "MEMBERSHIP_ID", nullable = false, precision = 0)
    public Long getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Long membershipId) {
        this.membershipId = membershipId;
    }

    @Basic
    @Column(name = "MEMBERSHIP_TYPE_CODE", nullable = false, length = 30)
    public String getMembershipTypeCode() {
        return membershipTypeCode;
    }

    public void setMembershipTypeCode(String membershipTypeCode) {
        this.membershipTypeCode = membershipTypeCode;
    }

    @Basic
    @Column(name = "CONTACT_ID", nullable = false, precision = 0)
    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
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

        MembershipsBaseEntity that = (MembershipsBaseEntity) o;

        if (membershipId != null ? !membershipId.equals(that.membershipId) : that.membershipId != null) return false;
        if (membershipTypeCode != null ? !membershipTypeCode.equals(that.membershipTypeCode) : that.membershipTypeCode != null)
            return false;
        if (contactId != null ? !contactId.equals(that.contactId) : that.contactId != null) return false;
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
        result = 31 * result + (membershipTypeCode != null ? membershipTypeCode.hashCode() : 0);
        result = 31 * result + (contactId != null ? contactId.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (objectVersionId != null ? objectVersionId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "membershipsBaseByMembershipId")
    public Collection<MembershipTranslationsEntity> getMembershipTranslationsByMembershipId() {
        return membershipTranslationsByMembershipId;
    }

    public void setMembershipTranslationsByMembershipId(Collection<MembershipTranslationsEntity> membershipTranslationsByMembershipId) {
        this.membershipTranslationsByMembershipId = membershipTranslationsByMembershipId;
    }
}
