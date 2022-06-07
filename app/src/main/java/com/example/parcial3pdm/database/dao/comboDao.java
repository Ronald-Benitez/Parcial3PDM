package com.example.parcial3pdm.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.parcial3pdm.database.entity.combo;

import java.util.List;

@Dao
public interface comboDao {
    @Query("SELECT * FROM combo")
    List<combo> getAll();

    @Query("SELECT * FROM combo WHERE id=:id")
    combo getComboById(int id);

    @Insert
    void insert(combo Combo);

    @Update
    void update(combo Combo);

    @Delete
    void delete(combo Combo);
}
