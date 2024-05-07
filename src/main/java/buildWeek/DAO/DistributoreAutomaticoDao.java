package buildWeek.DAO;

import buildWeek.Entity.Biglietto;
import buildWeek.Entity.DistributoreAutomatico;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class DistributoreAutomaticoDao {

    private EntityManager em;

    public DistributoreAutomaticoDao(EntityManager em) {
        this.em = em;
    }

    public void save(DistributoreAutomatico distributoreAutomatico) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(distributoreAutomatico);
        et.commit();
    }

    public DistributoreAutomatico getDistributoreById (int id) {
        return em.find(DistributoreAutomatico.class, id);
    }

    public void delete (int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();

        DistributoreAutomatico distributoreAutomatico = getDistributoreById(id);

        if (distributoreAutomatico != null) {
            em.remove(distributoreAutomatico);
        } else {
            System.out.println("Biglietto non presente");
        }

        et.commit();
    }

}
