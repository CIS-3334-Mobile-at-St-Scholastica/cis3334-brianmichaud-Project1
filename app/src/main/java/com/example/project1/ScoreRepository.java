package com.example.project1;

public class ScoreRepository {

    public void addScore(Hole newHole) {
        // ROOM -- Add insert into database
        ScoreDatabase.databaseWriteExecutor.execute(() -> {
            ScoreDao.insert(newHole);
            //Log.d ("CIS 3334", newPizza.toString());
        });
    }
}

