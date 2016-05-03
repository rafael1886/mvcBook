package com.book.dao;

import com.book.entity.Autor;

import java.util.List;

/**
 * Created by rafael on 2015-05-06.
 */
public interface AutorDao {

    List getAll();

    Autor getById(Integer id);

    void saveOrUpdate(Autor autor);

    void remove(Autor autor);

    void removeById(Integer id);

    void save (Autor autor);

    void update (Autor autor);
}
