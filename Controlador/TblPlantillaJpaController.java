package Controlador;

import Controlador.exceptions.NonexistentEntityException;
import Controlador.exceptions.PreexistingEntityException;
import Entidad.TblPlantilla;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author lcamp
 */
public class TblPlantillaJpaController implements Serializable {

    public TblPlantillaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public TblPlantillaJpaController() {
    }

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenciaProyecto");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TblPlantilla tblPlantilla) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tblPlantilla);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTblPlantilla(tblPlantilla.getCedula()) != null) {
                throw new PreexistingEntityException("TblPlantilla " + tblPlantilla + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TblPlantilla tblPlantilla) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();

            Integer id = tblPlantilla.getCedula();
            if (findTblPlantilla(id) == null) {
                throw new NonexistentEntityException("El id Ingresado " + id + " NO existe");
            } else {
                tblPlantilla = em.merge(tblPlantilla);
                em.getTransaction().commit();
            }

        } catch (Exception ex) {
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TblPlantilla tblPlantilla;
            try {
                tblPlantilla = em.getReference(TblPlantilla.class, id);
                tblPlantilla.getCedula();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tblPlantilla with id " + id + " no longer exists.", enfe);
            }
            em.remove(tblPlantilla);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TblPlantilla> findTblPlantillaEntities() {
        return findTblPlantillaEntities(true, -1, -1);
    }

    public List<TblPlantilla> findTblPlantillaEntities(int maxResults, int firstResult) {
        return findTblPlantillaEntities(false, maxResults, firstResult);
    }

    private List<TblPlantilla> findTblPlantillaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TblPlantilla.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public TblPlantilla findTblPlantilla(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TblPlantilla.class, id);
        } finally {
            em.close();
        }
    }

    public int getTblPlantillaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TblPlantilla> rt = cq.from(TblPlantilla.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
