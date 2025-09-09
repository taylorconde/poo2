package tech.pinho.banco.repository;

import java.util.List;

public interface Repository<T, E> {

    T save(T obj);

    T update(T obj);

    void delete(T obj);

    List<T> findAll();

    T findById(E id);
}
