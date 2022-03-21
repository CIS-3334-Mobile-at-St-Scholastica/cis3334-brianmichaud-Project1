package com.example.project1;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface ScoreDao {

    @Query("SELECT * FROM Scores")

    @Insert
    static void insert(Hole hole) {

    }

}
