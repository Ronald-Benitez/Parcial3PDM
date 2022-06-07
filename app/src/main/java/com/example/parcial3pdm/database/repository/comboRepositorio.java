package com.example.parcial3pdm.database.repository;

import com.example.parcial3pdm.database.entity.combo;

import java.util.List;

public interface comboRepositorio {
    void insert(combo Combo);
    void update(combo Combo);
    void delete(combo Combo);
    combo getComboById(int id);
    List<combo> getAll();
}
