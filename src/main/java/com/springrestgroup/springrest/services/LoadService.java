package com.springrestgroup.springrest.services;

import com.springrestgroup.springrest.entities.Load;

import java.util.List;

public interface LoadService {
    List<Load> GetLoad();

    Load addLoad(Load load);

    Load updateLoad(Load load);

    void deleteLoad(int parseInt);

    Load GetLoad(int id);
}
