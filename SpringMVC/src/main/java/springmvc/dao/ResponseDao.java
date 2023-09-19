package springmvc.dao;

import springmvc.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class ResponseDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public int save(Response response) {
        return (Integer) this.hibernateTemplate.save(response);
    }
}
