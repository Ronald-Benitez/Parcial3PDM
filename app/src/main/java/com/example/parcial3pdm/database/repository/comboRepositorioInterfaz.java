package com.example.parcial3pdm.database.repository;

import com.example.parcial3pdm.database.dao.comboDao;
import com.example.parcial3pdm.database.entity.combo;

import java.util.List;

public class comboRepositorioInterfaz implements comboRepositorio{
    comboDao dao;

    public comboRepositorioInterfaz(comboDao dao){this.dao=dao;}


    @Override
    public void insert(combo Combo) {
        dao.insert(Combo);
    }

    @Override
    public void update(combo Combo) {
        dao.update(Combo);
    }

    @Override
    public void delete(combo Combo) {
        dao.delete(Combo);
    }

    @Override
    public combo getComboById(int id) {
        return dao.getComboById(id);
    }

    @Override
    public List<combo> getAll() {
        return dao.getAll();
    }
}
