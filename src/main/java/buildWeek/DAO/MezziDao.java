package buildWeek.DAO;

import buildWeek.Entity.Mezzo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class MezziDao {

    private EntityManager em;

    public MezziDao(EntityManager em) {
        this.em = em;
    }

    public void save(Mezzo mezzo) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(mezzo);
        et.commit();
    }

    public Mezzo getMezziById (int id) {
        return em.find(Mezzo.class, id);
    }

    public void delete (int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();

        Mezzo mezzo = getMezziById(id);

        if (mezzo != null) {
            em.remove(mezzo);
        } else {
            System.out.println("Mezzo non presente");
        }

        et.commit();
    }


}
