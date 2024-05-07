package buildWeek.Entity;

import buildWeek.Enum.Servizio;

import javax.persistence.*;

@Entity
@Table(name = "tratta")
public class Tratta {

    @Id
    @GeneratedValue
    @ManyToMany(mappedBy = "tratta")
    private Integer id;

    private String zonaPartenza;


    private String capolinea;


    private double tempoMedio;


    public Tratta(String zonaPartenza, String capolinea, double tempoMedio) {
        this.zonaPartenza = zonaPartenza;
        this.capolinea = capolinea;
        this.tempoMedio = tempoMedio;
    }

    public String getZonaPartenza() {
        return zonaPartenza;
    }

    public void setZonaPartenza(String zonaPartenza) {
        this.zonaPartenza = zonaPartenza;
    }

    public String getCapolinea() {
        return capolinea;
    }

    public void setCapolinea(String capolinea) {
        this.capolinea = capolinea;
    }

    public double getTempoMedio() {
        return tempoMedio;
    }

    public void setTempoMedio(double tempoMedio) {
        this.tempoMedio = tempoMedio;
    }


}
