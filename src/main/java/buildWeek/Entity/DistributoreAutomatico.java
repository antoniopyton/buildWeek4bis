package buildWeek.Entity;

import buildWeek.Enum.StatoDistributori;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "distributori_automatici")
public class DistributoreAutomatico {

    @Id
    @GeneratedValue
    private Integer id;

    @Enumerated(EnumType.STRING)
    private StatoDistributori stato;

    @ManyToMany(mappedBy = "distributoriAutomatici")
    private List<BigliettoEAbbonamento> bigliettiEAbbonamenti;

    public DistributoreAutomatico(StatoDistributori stato) {
        this.stato = stato;
    }

    public DistributoreAutomatico() {}

    public StatoDistributori getStato() {
        return stato;
    }

    public void setStato(StatoDistributori stato) {
        this.stato = stato;
    }
}
