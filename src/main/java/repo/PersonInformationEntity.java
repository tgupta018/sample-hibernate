package repo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;
import java.sql.Time;

@Table(name = "PERSON_INFORMATION", schema = "FOD", catalog = "")
public class PersonInformationEntity {
    private Long customerId;
    private String principalName;
    private String title;
    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String city;
    private String postalCode;
    private String stateProvince;
    private String countryId;
    private Long longitude;
    private Long latitude;
    private String confirmedEmail;
    private String phoneNumber;
    private String mobilePhoneNumber;
    private Time registeredDate;
    private Long membershipId;
    private Long creditLimit;
    private Time dateOfBirth;
    private String maritalStatusCode;
    private String gender;
    private Long childrenUnder18;
    private Long approximateIncome;
    private String contactMethodCode;
    private String contactableFlag;
    private String contactByAffilliatesFlag;

    @Basic
    @Column(name = "CUSTOMER_ID", nullable = false, precision = 0)
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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
    @Column(name = "ADDRESS1", nullable = false, length = 40)
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Basic
    @Column(name = "ADDRESS2", nullable = true, length = 40)
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Basic
    @Column(name = "CITY", nullable = false, length = 40)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "POSTAL_CODE", nullable = true, length = 12)
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "STATE_PROVINCE", nullable = false, length = 40)
    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    @Basic
    @Column(name = "COUNTRY_ID", nullable = false, length = 2)
    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "LONGITUDE", nullable = true, precision = 0)
    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "LATITUDE", nullable = true, precision = 0)
    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
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
    @Column(name = "REGISTERED_DATE", nullable = true)
    public Time getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Time registeredDate) {
        this.registeredDate = registeredDate;
    }

    @Basic
    @Column(name = "MEMBERSHIP_ID", nullable = true, precision = 0)
    public Long getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Long membershipId) {
        this.membershipId = membershipId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonInformationEntity that = (PersonInformationEntity) o;

        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (principalName != null ? !principalName.equals(that.principalName) : that.principalName != null)
            return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) return false;
        if (stateProvince != null ? !stateProvince.equals(that.stateProvince) : that.stateProvince != null)
            return false;
        if (countryId != null ? !countryId.equals(that.countryId) : that.countryId != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (confirmedEmail != null ? !confirmedEmail.equals(that.confirmedEmail) : that.confirmedEmail != null)
            return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (mobilePhoneNumber != null ? !mobilePhoneNumber.equals(that.mobilePhoneNumber) : that.mobilePhoneNumber != null)
            return false;
        if (registeredDate != null ? !registeredDate.equals(that.registeredDate) : that.registeredDate != null)
            return false;
        if (membershipId != null ? !membershipId.equals(that.membershipId) : that.membershipId != null) return false;
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId != null ? customerId.hashCode() : 0;
        result = 31 * result + (principalName != null ? principalName.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (stateProvince != null ? stateProvince.hashCode() : 0);
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (confirmedEmail != null ? confirmedEmail.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (mobilePhoneNumber != null ? mobilePhoneNumber.hashCode() : 0);
        result = 31 * result + (registeredDate != null ? registeredDate.hashCode() : 0);
        result = 31 * result + (membershipId != null ? membershipId.hashCode() : 0);
        result = 31 * result + (creditLimit != null ? creditLimit.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (maritalStatusCode != null ? maritalStatusCode.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (childrenUnder18 != null ? childrenUnder18.hashCode() : 0);
        result = 31 * result + (approximateIncome != null ? approximateIncome.hashCode() : 0);
        result = 31 * result + (contactMethodCode != null ? contactMethodCode.hashCode() : 0);
        result = 31 * result + (contactableFlag != null ? contactableFlag.hashCode() : 0);
        result = 31 * result + (contactByAffilliatesFlag != null ? contactByAffilliatesFlag.hashCode() : 0);
        return result;
    }
}
