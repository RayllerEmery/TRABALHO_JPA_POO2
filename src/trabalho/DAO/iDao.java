/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.DAO;

import java.util.List;

/**
 *
 * @author Rayller
 */
public interface iDao <T>{
    public abstract  boolean save(T t);
    public abstract boolean delete(T t);
    public abstract List<T> listClient();
    public abstract List<T>searchClient(String nome);
    public abstract  boolean update(T t);
}
