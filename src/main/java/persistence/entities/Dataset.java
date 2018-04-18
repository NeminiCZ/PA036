package persistence.entities;

import javax.persistence.*;

@Entity
public class Dataset {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "phone_id")
    private Long phoneId;

    @Column(name = "user_ID")
    private Long userId;

    @Column(name = "document_ID")
    private Long documentId;

    @Column(name = "time")
    private Long time;

    @Column(name = "action")
    private Integer action;

    @Column(name = "phone_orientation")
    private Boolean phoneOrientation;

    @Column(name = "X_coodidinate")
    private Integer xCoordinate;

    @Column(name = "Y_coodidinate")
    private Integer yCoordinate;

    @Column(name = "pressur")
    private Float pressure;

    @Column(name = "area_covered")
    private Float areaCovered;

    @Column(name = "finger_orientation")
    private Float fingerOrientation;

    public Dataset() {
    }

    public Dataset(Long id, Long phoneId, Long userId, Long documentId, Long time, Integer action, Boolean phoneOrientation, Integer xCoordinate, Integer yCoordinate, Float pressure, Float areaCovered, Float fingerOrientation) {
        Id = id;
        this.phoneId = phoneId;
        this.userId = userId;
        this.documentId = documentId;
        this.time = time;
        this.action = action;
        this.phoneOrientation = phoneOrientation;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.pressure = pressure;
        this.areaCovered = areaCovered;
        this.fingerOrientation = fingerOrientation;
    }

    public Long getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Long phoneId) {
        this.phoneId = phoneId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public Boolean getPhoneOrientation() {
        return phoneOrientation;
    }

    public void setPhoneOrientation(Boolean phoneOrientation) {
        this.phoneOrientation = phoneOrientation;
    }

    public Integer getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(Integer xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public Integer getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(Integer yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public Float getAreaCovered() {
        return areaCovered;
    }

    public void setAreaCovered(Float areaCovered) {
        this.areaCovered = areaCovered;
    }

    public Float getFingerOrientation() {
        return fingerOrientation;
    }

    public void setFingerOrientation(Float fingerOrientation) {
        this.fingerOrientation = fingerOrientation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dataset dataset = (Dataset) o;

        if (Id != null ? !Id.equals(dataset.Id) : dataset.Id != null) return false;
        if (phoneId != null ? !phoneId.equals(dataset.phoneId) : dataset.phoneId != null) return false;
        if (userId != null ? !userId.equals(dataset.userId) : dataset.userId != null) return false;
        if (documentId != null ? !documentId.equals(dataset.documentId) : dataset.documentId != null) return false;
        if (time != null ? !time.equals(dataset.time) : dataset.time != null) return false;
        if (action != null ? !action.equals(dataset.action) : dataset.action != null) return false;
        if (phoneOrientation != null ? !phoneOrientation.equals(dataset.phoneOrientation) : dataset.phoneOrientation != null)
            return false;
        if (xCoordinate != null ? !xCoordinate.equals(dataset.xCoordinate) : dataset.xCoordinate != null) return false;
        if (yCoordinate != null ? !yCoordinate.equals(dataset.yCoordinate) : dataset.yCoordinate != null) return false;
        if (pressure != null ? !pressure.equals(dataset.pressure) : dataset.pressure != null) return false;
        if (areaCovered != null ? !areaCovered.equals(dataset.areaCovered) : dataset.areaCovered != null) return false;
        return fingerOrientation != null ? fingerOrientation.equals(dataset.fingerOrientation) : dataset.fingerOrientation == null;
    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (phoneId != null ? phoneId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (documentId != null ? documentId.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (phoneOrientation != null ? phoneOrientation.hashCode() : 0);
        result = 31 * result + (xCoordinate != null ? xCoordinate.hashCode() : 0);
        result = 31 * result + (yCoordinate != null ? yCoordinate.hashCode() : 0);
        result = 31 * result + (pressure != null ? pressure.hashCode() : 0);
        result = 31 * result + (areaCovered != null ? areaCovered.hashCode() : 0);
        result = 31 * result + (fingerOrientation != null ? fingerOrientation.hashCode() : 0);
        return result;
    }
}
