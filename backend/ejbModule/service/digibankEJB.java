package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.digibankEntity;

/**
 * Session Bean implementation class digibankEJB
 */
@Stateless
@LocalBean
public class digibankEJB {


	@PersistenceContext
	private EntityManager em;
	
    public digibankEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNew(digibankEntity digibankEntity)
    {
    	System.out.println("============================");
    	System.out.println(digibankEntity.getname());
    	em.persist(digibankEntity);
    	System.out.println("============================");
    }

}
