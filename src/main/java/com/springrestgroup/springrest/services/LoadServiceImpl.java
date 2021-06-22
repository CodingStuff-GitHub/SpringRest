package com.springrestgroup.springrest.services;

import com.springrestgroup.springrest.dao.LoadDao;
import com.springrestgroup.springrest.entities.Load;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadServiceImpl implements LoadService {
    private final LoadDao loadDao;

    public LoadServiceImpl(LoadDao loadDao) {
        this.loadDao = loadDao;
    }

    @Override
    public List<Load> GetLoad() {
        return loadDao.findAll();
    }

    @Override
    public Load addLoad(Load load) {
        loadDao.save(load);
        return load;
    }

    @Override
    public Load updateLoad(Load load) {
        loadDao.save(load);
        return load;
    }

    @Override
    public void deleteLoad(int id) {
        loadDao.delete(loadDao.getById(id));
    }

    @Override
    public Load GetLoad(int id) {
        return loadDao.getById(id);
    }
}
