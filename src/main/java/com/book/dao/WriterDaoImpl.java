package com.book.dao;

import com.book.entity.Writer;
import org.hibernate.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rafael on 2015-05-06.
 */
@Repository
public class WriterDaoImpl extends AbstractDao<Integer, Writer> implements WriterDao {

    private static final Logger logger = LoggerFactory.getLogger(WriterDaoImpl.class);

    public List<Writer> getAllWriter() {
        logger.info("Getting lists writers");
        return getSession().createCriteria(Writer.class).list();
    }

    public Writer getByIdWriter(Integer id) {
        Query query = getSession().createQuery("select a from " + Writer.class.getCanonicalName() + " a " +
                " where a.id = :id");
        query.setInteger("id", id);
        return (Writer) query.uniqueResult();
//        Writer writer = (Writer) sessionFactory.getCurrentSession().load(Writer.class, id);
//        logger.info("Writer loaded successfully, `" + writer);
//        return writer;
    }

    public void saveOrUpdateWriter(Writer writer) {
        getSession().saveOrUpdate(writer);
    }

    public void remove(Writer writer) {
        getSession().delete(writer);
        logger.info("Writer delete");
    }

    public void removeById(Integer id) {
        Query query = getSession().createSQLQuery("delete from writer where id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
        logger.info("Writer removed successfully, Writer details: " + id);
    }

    public void save(Writer writer) {
        getSession().save(writer);
        logger.info("Writer saveBook " + writer.getSurname());
    }

    public void update(Writer writer) {
        getSession().update(writer);
        logger.info("Writer updated successfully, Writer details:  " + writer);
    }
}
