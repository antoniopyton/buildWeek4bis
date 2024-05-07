package buildWeek.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "biglietti_e_abbonamenti")
public class BigliettoEAbbonamento {

    private Integer id;

    @ManyToMany
    @JoinTable(name = "biglabb_distrauto",
            joinColumns = @JoinColumn(name = "bigl_abb_id"),
            inverseJoinColumns = @JoinColumn(name = "distr_auto_id"))
    private List<DistributoreAutomatico> distributoriAutomatici;

    @ManyToMany
    @JoinTable(name = "biglabb_rivenditori",
            joinColumns = @JoinColumn(name = "bigl_abb_id"),
            inverseJoinColumns = @JoinColumn(name = "rivenditori_id"))
    private List<Rivenditore> rivenditori;

    public BigliettoEAbbonamento() {    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
