package com.book.service;

import com.book.entity.Writer;

import java.util.List;

/**
 * Created by rafael on 2015-05-06.
 */
public interface WriterService {
    List<Writer> getAllWriter();

    Writer getWriterById(Integer id);

    void saveOrUpdateWriter(Writer writer);

    void removeWriter(Writer writer);

    void removeWriterById(Integer id);

    void saveWriter(Writer writer);

    void updateWriter(Writer writer);
}
