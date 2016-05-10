package com.book.dao;

import com.book.entity.Writer;

import java.util.List;

/**
 * Created by rafael on 2015-05-06.
 */
public interface WriterDao {

    List getAll();

    Writer getById(Integer id);

    void saveOrUpdate(Writer writer);

    void remove(Writer writer);

    void removeById(Integer id);

    void save (Writer writer);

    void update (Writer writer);
}
