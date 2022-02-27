package repo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Table(name = "ORDERS", schema = "FOD", catalog = "")
public class OrdersEntity {
    private Long orderId;
    private Time orderDate;
    private Time orderShippedDate;
    private String orderStatusCode;
    private Long orderTotal;
    private Long customerId;
    private String shipToName;
    private Long shipToAddressId;
    private String shipToPhoneNumber;
    private Long shippingOptionId;
    private Long paymentOptionId;
    private Long discountId;
    private Long couponId;
    private String freeShippingFlag;
    private String customerCollectFlag;
    private Long collectionWarehouseId;
    private String giftwrapFlag;
    private String giftwrapMessage;
    private String createdBy;
    private Time creationDate;
    private String lastUpdatedBy;
    private Time lastUpdateDate;
    private Long objectVersionId;

    @Id
    @Column(name = "ORDER_ID", nullable = false, precision = 0)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "ORDER_DATE", nullable = false)
    public Time getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Time orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "ORDER_SHIPPED_DATE", nullable = true)
    public Time getOrderShippedDate() {
        return orderShippedDate;
    }

    public void setOrderShippedDate(Time orderShippedDate) {
        this.orderShippedDate = orderShippedDate;
    }

    @Basic
    @Column(name = "ORDER_STATUS_CODE", nullable = false, length = 30)
    public String getOrderStatusCode() {
        return orderStatusCode;
    }

    public void setOrderStatusCode(String orderStatusCode) {
        this.orderStatusCode = orderStatusCode;
    }

    @Basic
    @Column(name = "ORDER_TOTAL", nullable = false, precision = 2)
    public Long getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Long orderTotal) {
        this.orderTotal = orderTotal;
    }

    @Basic
    @Column(name = "CUSTOMER_ID", nullable = false, precision = 0)
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "SHIP_TO_NAME", nullable = true, length = 120)
    public String getShipToName() {
        return shipToName;
    }

    public void setShipToName(String shipToName) {
        this.shipToName = shipToName;
    }

    @Basic
    @Column(name = "SHIP_TO_ADDRESS_ID", nullable = false, precision = 0)
    public Long getShipToAddressId() {
        return shipToAddressId;
    }

    public void setShipToAddressId(Long shipToAddressId) {
        this.shipToAddressId = shipToAddressId;
    }

    @Basic
    @Column(name = "SHIP_TO_PHONE_NUMBER", nullable = true, length = 20)
    public String getShipToPhoneNumber() {
        return shipToPhoneNumber;
    }

    public void setShipToPhoneNumber(String shipToPhoneNumber) {
        this.shipToPhoneNumber = shipToPhoneNumber;
    }

    @Basic
    @Column(name = "SHIPPING_OPTION_ID", nullable = false, precision = 0)
    public Long getShippingOptionId() {
        return shippingOptionId;
    }

    public void setShippingOptionId(Long shippingOptionId) {
        this.shippingOptionId = shippingOptionId;
    }

    @Basic
    @Column(name = "PAYMENT_OPTION_ID", nullable = true, precision = 0)
    public Long getPaymentOptionId() {
        return paymentOptionId;
    }

    public void setPaymentOptionId(Long paymentOptionId) {
        this.paymentOptionId = paymentOptionId;
    }

    @Basic
    @Column(name = "DISCOUNT_ID", nullable = true, precision = 0)
    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    @Basic
    @Column(name = "COUPON_ID", nullable = true, precision = 0)
    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    @Basic
    @Column(name = "FREE_SHIPPING_FLAG", nullable = false, length = 1)
    public String getFreeShippingFlag() {
        return freeShippingFlag;
    }

    public void setFreeShippingFlag(String freeShippingFlag) {
        this.freeShippingFlag = freeShippingFlag;
    }

    @Basic
    @Column(name = "CUSTOMER_COLLECT_FLAG", nullable = false, length = 1)
    public String getCustomerCollectFlag() {
        return customerCollectFlag;
    }

    public void setCustomerCollectFlag(String customerCollectFlag) {
        this.customerCollectFlag = customerCollectFlag;
    }

    @Basic
    @Column(name = "COLLECTION_WAREHOUSE_ID", nullable = true, precision = 0)
    public Long getCollectionWarehouseId() {
        return collectionWarehouseId;
    }

    public void setCollectionWarehouseId(Long collectionWarehouseId) {
        this.collectionWarehouseId = collectionWarehouseId;
    }

    @Basic
    @Column(name = "GIFTWRAP_FLAG", nullable = false, length = 1)
    public String getGiftwrapFlag() {
        return giftwrapFlag;
    }

    public void setGiftwrapFlag(String giftwrapFlag) {
        this.giftwrapFlag = giftwrapFlag;
    }

    @Basic
    @Column(name = "GIFTWRAP_MESSAGE", nullable = true, length = 2000)
    public String getGiftwrapMessage() {
        return giftwrapMessage;
    }

    public void setGiftwrapMessage(String giftwrapMessage) {
        this.giftwrapMessage = giftwrapMessage;
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

        OrdersEntity that = (OrdersEntity) o;

        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;
        if (orderShippedDate != null ? !orderShippedDate.equals(that.orderShippedDate) : that.orderShippedDate != null)
            return false;
        if (orderStatusCode != null ? !orderStatusCode.equals(that.orderStatusCode) : that.orderStatusCode != null)
            return false;
        if (orderTotal != null ? !orderTotal.equals(that.orderTotal) : that.orderTotal != null) return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (shipToName != null ? !shipToName.equals(that.shipToName) : that.shipToName != null) return false;
        if (shipToAddressId != null ? !shipToAddressId.equals(that.shipToAddressId) : that.shipToAddressId != null)
            return false;
        if (shipToPhoneNumber != null ? !shipToPhoneNumber.equals(that.shipToPhoneNumber) : that.shipToPhoneNumber != null)
            return false;
        if (shippingOptionId != null ? !shippingOptionId.equals(that.shippingOptionId) : that.shippingOptionId != null)
            return false;
        if (paymentOptionId != null ? !paymentOptionId.equals(that.paymentOptionId) : that.paymentOptionId != null)
            return false;
        if (discountId != null ? !discountId.equals(that.discountId) : that.discountId != null) return false;
        if (couponId != null ? !couponId.equals(that.couponId) : that.couponId != null) return false;
        if (freeShippingFlag != null ? !freeShippingFlag.equals(that.freeShippingFlag) : that.freeShippingFlag != null)
            return false;
        if (customerCollectFlag != null ? !customerCollectFlag.equals(that.customerCollectFlag) : that.customerCollectFlag != null)
            return false;
        if (collectionWarehouseId != null ? !collectionWarehouseId.equals(that.collectionWarehouseId) : that.collectionWarehouseId != null)
            return false;
        if (giftwrapFlag != null ? !giftwrapFlag.equals(that.giftwrapFlag) : that.giftwrapFlag != null) return false;
        if (giftwrapMessage != null ? !giftwrapMessage.equals(that.giftwrapMessage) : that.giftwrapMessage != null)
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
        int result = orderId != null ? orderId.hashCode() : 0;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (orderShippedDate != null ? orderShippedDate.hashCode() : 0);
        result = 31 * result + (orderStatusCode != null ? orderStatusCode.hashCode() : 0);
        result = 31 * result + (orderTotal != null ? orderTotal.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (shipToName != null ? shipToName.hashCode() : 0);
        result = 31 * result + (shipToAddressId != null ? shipToAddressId.hashCode() : 0);
        result = 31 * result + (shipToPhoneNumber != null ? shipToPhoneNumber.hashCode() : 0);
        result = 31 * result + (shippingOptionId != null ? shippingOptionId.hashCode() : 0);
        result = 31 * result + (paymentOptionId != null ? paymentOptionId.hashCode() : 0);
        result = 31 * result + (discountId != null ? discountId.hashCode() : 0);
        result = 31 * result + (couponId != null ? couponId.hashCode() : 0);
        result = 31 * result + (freeShippingFlag != null ? freeShippingFlag.hashCode() : 0);
        result = 31 * result + (customerCollectFlag != null ? customerCollectFlag.hashCode() : 0);
        result = 31 * result + (collectionWarehouseId != null ? collectionWarehouseId.hashCode() : 0);
        result = 31 * result + (giftwrapFlag != null ? giftwrapFlag.hashCode() : 0);
        result = 31 * result + (giftwrapMessage != null ? giftwrapMessage.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (objectVersionId != null ? objectVersionId.hashCode() : 0);
        return result;
    }
}
