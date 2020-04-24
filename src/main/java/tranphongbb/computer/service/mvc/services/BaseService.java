package tranphongbb.computer.service.mvc.services;

import java.util.List;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

public interface BaseService<T> {

    List<T> findAll();

    T findById(int id);

    List<T> saveAll(List<T> ts);

    T save(T t);

    T delete(T t);

    T deleteById(int id);
}
