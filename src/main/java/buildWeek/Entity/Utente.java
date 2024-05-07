package buildWeek.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "utenti")
public class Utente {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne(mappedBy = "utente")
    private boolean tessera;

    private String nome;

    private String cognome;

    @OneToMany(mappedBy = "utente")
    private List<Biglietto> biglietto;

    public Utente(Integer id, boolean tessera, String nome, String cognome) {
        this.id = id;
        this.tessera = tessera;
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isTessera() {
        return tessera;
    }

    public void setTessera(boolean tessera) {
        this.tessera = tessera;
    }
}
