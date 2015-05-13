package com.book.service;

import com.book.entity.Autor;

import java.util.List;

/**
 * Created by rafael on 2015-05-06.
 */
public interface AutorService {
    List<Autor> getAllAutor();

    Autor getAutorById(Integer id);

    void saveOrUpdateAutor(Autor autor);

    void removeAutor(Autor autor);

    void removeAutorById (Integer id);

    void saveAutor (Autor autor);

    void updateAutor (Autor autor);
}
