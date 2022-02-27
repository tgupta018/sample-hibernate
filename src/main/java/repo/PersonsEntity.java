package repo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Time;

@Table(name = "PERSONS", schema = "FOD", catalog = "")
public class PersonsEntity {
    private Long personId;
    private String principalName;
    private String title;
    private String firstName;
    private String lastName;
    private String personTypeCode;
    private String provisionedFlag;
    private Time registeredDate;
    private String email;
    private String confirmedEmail;
    private String phoneNumber;
    private String mobilePhoneNumber;
    private Long creditLimit;
    private Time dateOfBirth;
    private String maritalStatusCode;
    private String gender;
    private Long childrenUnder18;
    private Long approximateIncome;
    private String contactMethodCode;
    private String contactableFlag;
    private String contactByAffilliatesFlag;
    private String createdBy;
    private Time creationDate;
    private String lastUpdatedBy;
    private Time lastUpdateDate;
    private Long objectVersionId;
    private Long supplierId;
    private Long primaryAddressId;
    private Long membershipId;
    private MembershipsBaseEntity membershipsBaseByMembershipId;

    @Id
    @Column(name = "PERSON_ID", nullable = false, precision = 0)
    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "PRINCIPAL_NAME", nullable = false, length = 60)
    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    @Basic
    @Column(name = "TITLE", nullable = true, length = 12)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "FIRST_NAME", nullable = true, length = 30)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LAST_NAME", nullable = true, length = 30)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "PERSON_TYPE_CODE", nullable = false, length = 30)
    public String getPersonTypeCode() {
        return personTypeCode;
    }

    public void setPersonTypeCode(String personTypeCode) {
        this.personTypeCode = personTypeCode;
    }

    @Basic
    @Column(name = "PROVISIONED_FLAG", nullable = true, length = 1)
    public String getProvisionedFlag() {
        return provisionedFlag;
    }

    public void setProvisionedFlag(String provisionedFlag) {
        this.provisionedFlag = provisionedFlag;
    }

    @Basic
    @Column(name = "REGISTERED_DATE", nullable = true)
    public Time getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Time registeredDate) {
        this.registeredDate = registeredDate;
    }

    @Basic
    @Column(name = "EMAIL", nullable = false, length = 25)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "CONFIRMED_EMAIL", nullable = true, length = 25)
    public String getConfirmedEmail() {
        return confirmedEmail;
    }

    public void setConfirmedEmail(String confirmedEmail) {
        this.confirmedEmail = confirmedEmail;
    }

    @Basic
    @Column(name = "PHONE_NUMBER", nullable = true, length = 20)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "MOBILE_PHONE_NUMBER", nullable = true, length = 20)
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    @Basic
    @Column(name = "CREDIT_LIMIT", nullable = true, precision = 2)
    public Long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Long creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Basic
    @Column(name = "DATE_OF_BIRTH", nullable = true)
    public Time getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Time dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "MARITAL_STATUS_CODE", nullable = false, length = 30)
    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;
    }

    @Basic
    @Column(name = "GENDER", nullable = false, length = 1)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "CHILDREN_UNDER_18", nullable = true, precision = 0)
    public Long getChildrenUnder18() {
        return childrenUnder18;
    }

    public void setChildrenUnder18(Long childrenUnder18) {
        this.childrenUnder18 = childrenUnder18;
    }

    @Basic
    @Column(name = "APPROXIMATE_INCOME", nullable = true, precision = 0)
    public Long getApproximateIncome() {
        return approximateIncome;
    }

    public void setApproximateIncome(Long approximateIncome) {
        this.approximateIncome = approximateIncome;
    }

    @Basic
    @Column(name = "CONTACT_METHOD_CODE", nullable = true, length = 30)
    public String getContactMethodCode() {
        return contactMethodCode;
    }

    public void setContactMethodCode(String contactMethodCode) {
        this.contactMethodCode = contactMethodCode;
    }

    @Basic
    @Column(name = "CONTACTABLE_FLAG", nullable = false, length = 1)
    public String getContactableFlag() {
        return contactableFlag;
    }

    public void setContactableFlag(String contactableFlag) {
        this.contactableFlag = contactableFlag;
    }

    @Basic
    @Column(name = "CONTACT_BY_AFFILLIATES_FLAG", nullable = false, length = 1)
    public String getContactByAffilliatesFlag() {
        return contactByAffilliatesFlag;
    }

    public void setContactByAffilliatesFlag(String contactByAffilliatesFlag) {
        this.contactByAffilliatesFlag = contactByAffilliatesFlag;
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

        PersonsEntity that = (PersonsEntity) o;

        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (principalName != null ? !principalName.equals(that.principalName) : that.principalName != null)
            return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (personTypeCode != null ? !personTypeCode.equals(that.personTypeCode) : that.personTypeCode != null)
            return false;
        if (provisionedFlag != null ? !provisionedFlag.equals(that.provisionedFlag) : that.provisionedFlag != null)
            return false;
        if (registeredDate != null ? !registeredDate.equals(that.registeredDate) : that.registeredDate != null)
            return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (confirmedEmail != null ? !confirmedEmail.equals(that.confirmedEmail) : that.confirmedEmail != null)
            return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (mobilePhoneNumber != null ? !mobilePhoneNumber.equals(that.mobilePhoneNumber) : that.mobilePhoneNumber != null)
            return false;
        if (creditLimit != null ? !creditLimit.equals(that.creditLimit) : that.creditLimit != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(that.dateOfBirth) : that.dateOfBirth != null) return false;
        if (maritalStatusCode != null ? !maritalStatusCode.equals(that.maritalStatusCode) : that.maritalStatusCode != null)
            return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (childrenUnder18 != null ? !childrenUnder18.equals(that.childrenUnder18) : that.childrenUnder18 != null)
            return false;
        if (approximateIncome != null ? !approximateIncome.equals(that.approximateIncome) : that.approximateIncome != null)
            return false;
        if (contactMethodCode != null ? !contactMethodCode.equals(that.contactMethodCode) : that.contactMethodCode != null)
            return false;
        if (contactableFlag != null ? !contactableFlag.equals(that.contactableFlag) : that.contactableFlag != null)
            return false;
        if (contactByAffilliatesFlag != null ? !contactByAffilliatesFlag.equals(that.contactByAffilliatesFlag) : that.contactByAffilliatesFlag != null)
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
        int result = personId != null ? personId.hashCode() : 0;
        result = 31 * result + (principalName != null ? principalName.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (personTypeCode != null ? personTypeCode.hashCode() : 0);
        result = 31 * result + (provisionedFlag != null ? provisionedFlag.hashCode() : 0);
        result = 31 * result + (registeredDate != null ? registeredDate.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (confirmedEmail != null ? confirmedEmail.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (mobilePhoneNumber != null ? mobilePhoneNumber.hashCode() : 0);
        result = 31 * result + (creditLimit != null ? creditLimit.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (maritalStatusCode != null ? maritalStatusCode.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (childrenUnder18 != null ? childrenUnder18.hashCode() : 0);
        result = 31 * result + (approximateIncome != null ? approximateIncome.hashCode() : 0);
        result = 31 * result + (contactMethodCode != null ? contactMethodCode.hashCode() : 0);
        result = 31 * result + (contactableFlag != null ? contactableFlag.hashCode() : 0);
        result = 31 * result + (contactByAffilliatesFlag != null ? contactByAffilliatesFlag.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (objectVersionId != null ? objectVersionId.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "SUPPLIER_ID", nullable = true, precision = 0)
    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column(name = "PRIMARY_ADDRESS_ID", nullable = true, precision = 0)
    public Long getPrimaryAddressId() {
        return primaryAddressId;
    }

    public void setPrimaryAddressId(Long primaryAddressId) {
        this.primaryAddressId = primaryAddressId;
    }

    @Basic
    @Column(name = "MEMBERSHIP_ID", nullable = true, precision = 0)
    public Long getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Long membershipId) {
        this.membershipId = membershipId;
    }

    @ManyToOne
    @JoinColumn(name = "MEMBERSHIP_ID", referencedColumnName = "MEMBERSHIP_ID", table = "PERSONS")
    public MembershipsBaseEntity getMembershipsBaseByMembershipId() {
        return membershipsBaseByMembershipId;
    }

    public void setMembershipsBaseByMembershipId(MembershipsBaseEntity membershipsBaseByMembershipId) {
        this.membershipsBaseByMembershipId = membershipsBaseByMembershipId;
    }
}
