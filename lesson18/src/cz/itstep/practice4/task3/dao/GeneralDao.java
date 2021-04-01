package cz.itstep.practice4.task3.dao;

import java.util.Collection;
import java.util.Optional;

public interface GeneralDao<ID, T> {

    /**
     * save or update when same entity exists
     *
     * @param entity entity for save
     * @return saved entity
     */
    T save(T entity);

    /**
     * get all entities
     *
     * @return list of entities or empty list
     */
    Collection<T> getAll();

    /**
     * get entity by id
     *
     * @param id entity id
     * @return entity or empty
     */
    Optional<T> get(ID id);

    /**
     * delete entity when exists
     *
     * @param id entity id
     * @return true when deleted otherwise false
     */
    boolean delete(ID id);
}
