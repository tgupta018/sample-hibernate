package repo;

import javax.persistence.Basic;
import java.sql.Time;
import java.sql.Timestamp;

@javax.persistence.Table(name = "API_REQUEST", schema = "FOD", catalog = "")
public class ApiRequestEntity {
    private Long rqstId;

    @Basic
    @javax.persistence.Column(name = "RQST_ID", nullable = false, precision = 0)
    public Long getRqstId() {
        return rqstId;
    }

    public void setRqstId(Long rqstId) {
        this.rqstId = rqstId;
    }

    private Long prtnrId;

    @Basic
    @javax.persistence.Column(name = "PRTNR_ID", nullable = true, precision = 0)
    public Long getPrtnrId() {
        return prtnrId;
    }

    public void setPrtnrId(Long prtnrId) {
        this.prtnrId = prtnrId;
    }

    private Long column3;

    @Basic
    @javax.persistence.Column(name = "COLUMN3", nullable = true, precision = 0)
    public Long getColumn3() {
        return column3;
    }

    public void setColumn3(Long column3) {
        this.column3 = column3;
    }

    private Long rqstStatId;

    @Basic
    @javax.persistence.Column(name = "RQST_STAT_ID", nullable = false, precision = 0)
    public Long getRqstStatId() {
        return rqstStatId;
    }

    public void setRqstStatId(Long rqstStatId) {
        this.rqstStatId = rqstStatId;
    }

    private Long transId;

    @Basic
    @javax.persistence.Column(name = "TRANS_ID", nullable = true, precision = 0)
    public Long getTransId() {
        return transId;
    }

    public void setTransId(Long transId) {
        this.transId = transId;
    }

    private String corltnId;

    @Basic
    @javax.persistence.Column(name = "CORLTN_ID", nullable = true, length = 20)
    public String getCorltnId() {
        return corltnId;
    }

    public void setCorltnId(String corltnId) {
        this.corltnId = corltnId;
    }

    private String extReqId;

    @Basic
    @javax.persistence.Column(name = "EXT_REQ_ID", nullable = true, length = 20)
    public String getExtReqId() {
        return extReqId;
    }

    public void setExtReqId(String extReqId) {
        this.extReqId = extReqId;
    }

    private String verId;

    @Basic
    @javax.persistence.Column(name = "VER_ID", nullable = true, length = 20)
    public String getVerId() {
        return verId;
    }

    public void setVerId(String verId) {
        this.verId = verId;
    }

    private Timestamp ntwrkSndTime;

    @Basic
    @javax.persistence.Column(name = "NTWRK_SND_TIME", nullable = true)
    public Timestamp getNtwrkSndTime() {
        return ntwrkSndTime;
    }

    public void setNtwrkSndTime(Timestamp ntwrkSndTime) {
        this.ntwrkSndTime = ntwrkSndTime;
    }

    private Timestamp ntwrkRcvTime;

    @Basic
    @javax.persistence.Column(name = "NTWRK_RCV_TIME", nullable = true)
    public Timestamp getNtwrkRcvTime() {
        return ntwrkRcvTime;
    }

    public void setNtwrkRcvTime(Timestamp ntwrkRcvTime) {
        this.ntwrkRcvTime = ntwrkRcvTime;
    }

    private Time rqstDt;

    @Basic
    @javax.persistence.Column(name = "RQST_DT", nullable = false)
    public Time getRqstDt() {
        return rqstDt;
    }

    public void setRqstDt(Time rqstDt) {
        this.rqstDt = rqstDt;
    }

    private Timestamp crteDt;

    @Basic
    @javax.persistence.Column(name = "CRTE_DT", nullable = false)
    public Timestamp getCrteDt() {
        return crteDt;
    }

    public void setCrteDt(Timestamp crteDt) {
        this.crteDt = crteDt;
    }

    private String crteBy;

    @Basic
    @javax.persistence.Column(name = "CRTE_BY", nullable = false, length = 20)
    public String getCrteBy() {
        return crteBy;
    }

    public void setCrteBy(String crteBy) {
        this.crteBy = crteBy;
    }

    private Timestamp updtDt;

    @Basic
    @javax.persistence.Column(name = "UPDT_DT", nullable = false)
    public Timestamp getUpdtDt() {
        return updtDt;
    }

    public void setUpdtDt(Timestamp updtDt) {
        this.updtDt = updtDt;
    }

    private String updtBy;

    @Basic
    @javax.persistence.Column(name = "UPDT_BY", nullable = false, length = 20)
    public String getUpdtBy() {
        return updtBy;
    }

    public void setUpdtBy(String updtBy) {
        this.updtBy = updtBy;
    }

    private Long rqstRefId;

    @Basic
    @javax.persistence.Column(name = "RQST_REF_ID", nullable = true, precision = 0)
    public Long getRqstRefId() {
        return rqstRefId;
    }

    public void setRqstRefId(Long rqstRefId) {
        this.rqstRefId = rqstRefId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiRequestEntity that = (ApiRequestEntity) o;

        if (rqstId != null ? !rqstId.equals(that.rqstId) : that.rqstId != null) return false;
        if (prtnrId != null ? !prtnrId.equals(that.prtnrId) : that.prtnrId != null) return false;
        if (column3 != null ? !column3.equals(that.column3) : that.column3 != null) return false;
        if (rqstStatId != null ? !rqstStatId.equals(that.rqstStatId) : that.rqstStatId != null) return false;
        if (transId != null ? !transId.equals(that.transId) : that.transId != null) return false;
        if (corltnId != null ? !corltnId.equals(that.corltnId) : that.corltnId != null) return false;
        if (extReqId != null ? !extReqId.equals(that.extReqId) : that.extReqId != null) return false;
        if (verId != null ? !verId.equals(that.verId) : that.verId != null) return false;
        if (ntwrkSndTime != null ? !ntwrkSndTime.equals(that.ntwrkSndTime) : that.ntwrkSndTime != null) return false;
        if (ntwrkRcvTime != null ? !ntwrkRcvTime.equals(that.ntwrkRcvTime) : that.ntwrkRcvTime != null) return false;
        if (rqstDt != null ? !rqstDt.equals(that.rqstDt) : that.rqstDt != null) return false;
        if (crteDt != null ? !crteDt.equals(that.crteDt) : that.crteDt != null) return false;
        if (crteBy != null ? !crteBy.equals(that.crteBy) : that.crteBy != null) return false;
        if (updtDt != null ? !updtDt.equals(that.updtDt) : that.updtDt != null) return false;
        if (updtBy != null ? !updtBy.equals(that.updtBy) : that.updtBy != null) return false;
        if (rqstRefId != null ? !rqstRefId.equals(that.rqstRefId) : that.rqstRefId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rqstId != null ? rqstId.hashCode() : 0;
        result = 31 * result + (prtnrId != null ? prtnrId.hashCode() : 0);
        result = 31 * result + (column3 != null ? column3.hashCode() : 0);
        result = 31 * result + (rqstStatId != null ? rqstStatId.hashCode() : 0);
        result = 31 * result + (transId != null ? transId.hashCode() : 0);
        result = 31 * result + (corltnId != null ? corltnId.hashCode() : 0);
        result = 31 * result + (extReqId != null ? extReqId.hashCode() : 0);
        result = 31 * result + (verId != null ? verId.hashCode() : 0);
        result = 31 * result + (ntwrkSndTime != null ? ntwrkSndTime.hashCode() : 0);
        result = 31 * result + (ntwrkRcvTime != null ? ntwrkRcvTime.hashCode() : 0);
        result = 31 * result + (rqstDt != null ? rqstDt.hashCode() : 0);
        result = 31 * result + (crteDt != null ? crteDt.hashCode() : 0);
        result = 31 * result + (crteBy != null ? crteBy.hashCode() : 0);
        result = 31 * result + (updtDt != null ? updtDt.hashCode() : 0);
        result = 31 * result + (updtBy != null ? updtBy.hashCode() : 0);
        result = 31 * result + (rqstRefId != null ? rqstRefId.hashCode() : 0);
        return result;
    }
}
