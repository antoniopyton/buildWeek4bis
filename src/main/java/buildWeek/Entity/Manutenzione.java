package buildWeek.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.List;

public class Manutenzione  {

    @Id
    @GeneratedValue
    private Integer id;

    private LocalDate dataInizio;

    private LocalDate dataFine;

    @ManyToOne
    @JoinColumn(name = "id_mezzo")
    private List<Mezzo> mezzi;

}
