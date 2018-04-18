package persistence.entities;

import javax.persistence.*;

@Entity
public class Trenovacia {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "phone_id")
    private Long phoneId;

    @Column(name = "user_ID")
    private Long userId;

    @Column(name = "document_ID")
    private Long documentId;

    @Column(name = "finger_orientation")
    private Float fingerOrientation;

    @Column(name = "Vect_time")
    private Float vectorTime;

    @Column(name = "Vect_distance")
    private Float vectorDistance;

    @Column(name = "Vect_pressur")
    private Float vectorPressure;

    @Column(name = "Vect_covered")
    private Float vectorCovered;

    public Trenovacia() {
    }

    public Trenovacia(Long id, Long phoneId, Long userId, Long documentId, Float fingerOrientation, Float vectorTime, Float vectorDistance, Float vectorPressure, Float vectorCovered) {
        Id = id;
        this.phoneId = phoneId;
        this.userId = userId;
        this.documentId = documentId;
        this.fingerOrientation = fingerOrientation;
        this.vectorTime = vectorTime;
        this.vectorDistance = vectorDistance;
        this.vectorPressure = vectorPressure;
        this.vectorCovered = vectorCovered;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public Float getFingerOrientation() {
        return fingerOrientation;
    }

    public void setFingerOrientation(Float fingerOrientation) {
        this.fingerOrientation = fingerOrientation;
    }

    public Float getVectorTime() {
        return vectorTime;
    }

    public void setVectorTime(Float vectorTime) {
        this.vectorTime = vectorTime;
    }

    public Float getVectorDistance() {
        return vectorDistance;
    }

    public void setVectorDistance(Float vectorDistance) {
        this.vectorDistance = vectorDistance;
    }

    public Float getVectorPressure() {
        return vectorPressure;
    }

    public void setVectorPressure(Float vectorPressure) {
        this.vectorPressure = vectorPressure;
    }

    public Float getVectorCovered() {
        return vectorCovered;
    }

    public void setVectorCovered(Float vectorCovered) {
        this.vectorCovered = vectorCovered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trenovacia that = (Trenovacia) o;

        if (Id != null ? !Id.equals(that.Id) : that.Id != null) return false;
        if (phoneId != null ? !phoneId.equals(that.phoneId) : that.phoneId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (documentId != null ? !documentId.equals(that.documentId) : that.documentId != null) return false;
        if (fingerOrientation != null ? !fingerOrientation.equals(that.fingerOrientation) : that.fingerOrientation != null)
            return false;
        if (vectorTime != null ? !vectorTime.equals(that.vectorTime) : that.vectorTime != null) return false;
        if (vectorDistance != null ? !vectorDistance.equals(that.vectorDistance) : that.vectorDistance != null)
            return false;
        if (vectorPressure != null ? !vectorPressure.equals(that.vectorPressure) : that.vectorPressure != null)
            return false;
        return vectorCovered != null ? vectorCovered.equals(that.vectorCovered) : that.vectorCovered == null;
    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (phoneId != null ? phoneId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (documentId != null ? documentId.hashCode() : 0);
        result = 31 * result + (fingerOrientation != null ? fingerOrientation.hashCode() : 0);
        result = 31 * result + (vectorTime != null ? vectorTime.hashCode() : 0);
        result = 31 * result + (vectorDistance != null ? vectorDistance.hashCode() : 0);
        result = 31 * result + (vectorPressure != null ? vectorPressure.hashCode() : 0);
        result = 31 * result + (vectorCovered != null ? vectorCovered.hashCode() : 0);
        return result;
    }
}