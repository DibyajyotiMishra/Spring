package springmvc.service;

import springmvc.dao.ResponseDao;
import springmvc.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {
    @Autowired
    private ResponseDao responseDao;
    public int save(Response response) {
        return this.responseDao.save(response);
    }
}
