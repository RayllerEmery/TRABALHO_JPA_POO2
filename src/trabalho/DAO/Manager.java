/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Rayller
 */
public class Manager {
    private static EntityManager em;

    public static EntityManager getEntityManager() {
        return em;
    }
    
    public void connect(String persistenceName){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(persistenceName);
        em = factory.createEntityManager();
    }
}
