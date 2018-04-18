package persistence.entities;


import javax.persistence.*;

@Entity
public class VysledkyCas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "pocetakcii")
    private Integer actionCount;

    @Column(name = "potrebny_cas")
    private Float timeNeeded;

    public VysledkyCas() {
    }

    public VysledkyCas(Long id, Integer actionCount, Float timeNeeded) {
        Id = id;
        this.actionCount = actionCount;
        this.timeNeeded = timeNeeded;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getActionCount() {
        return actionCount;
    }

    public void setActionCount(Integer actionCount) {
        this.actionCount = actionCount;
    }

    public Float getTimeNeeded() {
        return timeNeeded;
    }

    public void setTimeNeeded(Float timeNeeded) {
        this.timeNeeded = timeNeeded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VysledkyCas that = (VysledkyCas) o;

        if (Id != null ? !Id.equals(that.Id) : that.Id != null) return false;
        if (actionCount != null ? !actionCount.equals(that.actionCount) : that.actionCount != null) return false;
        return timeNeeded != null ? timeNeeded.equals(that.timeNeeded) : that.timeNeeded == null;
    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (actionCount != null ? actionCount.hashCode() : 0);
        result = 31 * result + (timeNeeded != null ? timeNeeded.hashCode() : 0);
        return result;
    }
}
