package persistence.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Vysledky {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotNull
    @Column(nullable = false, name = "metoda")
    private String method;

    @Column(name = "spravne")
    private Float correct;

    @Column(name = "vsetky")
    private Float all;

    @Column(name = "percenta")
    private Float percent;

    @NotNull
    @Column(nullable = false, name = "kombinácia_charakteristík")
    private String combinationOfCharacteristic;

    @Column(name = "pocetakcii")
    private Long numberOfActions;

    public Vysledky() {
    }

    public Vysledky(Long id, String method, Float correct, Float all, Float percent, String combinationOfCharacteristic, Long numberOfActions) {
        Id = id;
        this.method = method;
        this.correct = correct;
        this.all = all;
        this.percent = percent;
        this.combinationOfCharacteristic = combinationOfCharacteristic;
        this.numberOfActions = numberOfActions;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Float getCorrect() {
        return correct;
    }

    public void setCorrect(Float correct) {
        this.correct = correct;
    }

    public Float getAll() {
        return all;
    }

    public void setAll(Float all) {
        this.all = all;
    }

    public Float getPercent() {
        return percent;
    }

    public void setPercent(Float percent) {
        this.percent = percent;
    }

    public String getCombinationOfCharacteristic() {
        return combinationOfCharacteristic;
    }

    public void setCombinationOfCharacteristic(String combinationOfCharacteristic) {
        this.combinationOfCharacteristic = combinationOfCharacteristic;
    }

    public Long getNumberOfActions() {
        return numberOfActions;
    }

    public void setNumberOfActions(Long numberOfActions) {
        this.numberOfActions = numberOfActions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vysledky results = (Vysledky) o;

        if (!method.equals(results.method)) return false;
        if (correct != null ? !correct.equals(results.correct) : results.correct != null) return false;
        if (all != null ? !all.equals(results.all) : results.all != null) return false;
        if (percent != null ? !percent.equals(results.percent) : results.percent != null) return false;
        if (!combinationOfCharacteristic.equals(results.combinationOfCharacteristic)) return false;
        return numberOfActions != null ? numberOfActions.equals(results.numberOfActions) : results.numberOfActions == null;
    }

    @Override
    public int hashCode() {
        int result = method.hashCode();
        result = 31 * result + (correct != null ? correct.hashCode() : 0);
        result = 31 * result + (all != null ? all.hashCode() : 0);
        result = 31 * result + (percent != null ? percent.hashCode() : 0);
        result = 31 * result + combinationOfCharacteristic.hashCode();
        result = 31 * result + (numberOfActions != null ? numberOfActions.hashCode() : 0);
        return result;
    }
}
