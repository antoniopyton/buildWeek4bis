package buildWeek.Entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "viaggi")
public class Viaggio {

    @Id
    @GeneratedValue
    private Integer id;

    private LocalTime oraPartenza;

    private LocalTime oraArrivo;

    @OneToOne
    @JoinColumn(name = "biglietto_id")
    private Biglietto biglietto;

    @ManyToOne
    @JoinColumn(name = "abbonamento_id")
    private Abbonamento abbonamento;

    @ManyToOne
    @JoinColumn(name = "mezzo_id")
    private Mezzo mezzo;
}
