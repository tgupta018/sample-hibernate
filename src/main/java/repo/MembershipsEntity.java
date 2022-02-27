package repo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "MEMBERSHIPS", schema = "FOD", catalog = "")
public class MembershipsEntity {
    private Long membershipId;
    private String membershipTypeCode;
    private String membershipName;
    private String description;
    private Long contactId;

    @Basic
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
    @Column(name = "CONTACT_ID", nullable = false, precision = 0)
    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MembershipsEntity that = (MembershipsEntity) o;

        if (membershipId != null ? !membershipId.equals(that.membershipId) : that.membershipId != null) return false;
        if (membershipTypeCode != null ? !membershipTypeCode.equals(that.membershipTypeCode) : that.membershipTypeCode != null)
            return false;
        if (membershipName != null ? !membershipName.equals(that.membershipName) : that.membershipName != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (contactId != null ? !contactId.equals(that.contactId) : that.contactId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = membershipId != null ? membershipId.hashCode() : 0;
        result = 31 * result + (membershipTypeCode != null ? membershipTypeCode.hashCode() : 0);
        result = 31 * result + (membershipName != null ? membershipName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (contactId != null ? contactId.hashCode() : 0);
        return result;
    }
}
