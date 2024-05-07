package buildWeek.Entity;

import buildWeek.Enum.CapienzaMezzo;
import buildWeek.Enum.Servizio;
import buildWeek.Enum.TipoMezzo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "mezzi")
public class Mezzo {

    @Id
    @GeneratedValue
    @OneToMany(mappedBy = "mezzi")
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Servizio servizio;

    @Enumerated(EnumType.STRING)
    private CapienzaMezzo capienza;

    @Enumerated(EnumType.STRING)
    private TipoMezzo tipoMezzo;

    @ManyToMany
    @JoinTable(name = "mezzo_tratta",
    joinColumns = @JoinColumn(name = "mezzo_id"),
    inverseJoinColumns = @JoinColumn(name = "tratta_id"))
    private Tratta tratta;

    @OneToMany(mappedBy = "mezzo")
    private List<Viaggio> viaggi;

    public Mezzo(Integer id, Servizio servizio, CapienzaMezzo capienza, TipoMezzo tipoMezzo) {
        this.id = id;
        this.servizio = servizio;
        this.capienza = capienza;
        this.tipoMezzo = tipoMezzo;
    }

    public Mezzo() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoMezzo getTipoMezzo() {
        return tipoMezzo;
    }

    public void setTipoMezzo(TipoMezzo tipoMezzo) {
        this.tipoMezzo = tipoMezzo;
    }

    public Servizio getServizio() {
        return servizio;
    }

    public void setServizio(Servizio servizio) {
        this.servizio = servizio;
    }

    public CapienzaMezzo getCapienza() {
        return capienza;
    }

    public void setCapienza(CapienzaMezzo capienza) {
        this.capienza = capienza;
    }
}
