package com.iabdinur.tdd.groupcontroller;

import java.util.Map;

public class TraineeGroupManager implements GroupControllerService{
    private final DatabaseReader databaseReader;
    private final DatabaseWriter databaseWriter;

    public TraineeGroupManager(DatabaseReader databaseReader, DatabaseWriter databaseWriter) {
        this.databaseReader = databaseReader;
        this.databaseWriter = databaseWriter;
    }

    @Override
    public Map<String, Trainee> getAllTrainees() {
        return databaseReader.readGroup();
    }

    @Override
    public void removeTraineeByUsername(String traineeUsername) {
        databaseWriter.deleteTraineeByUsername(traineeUsername);
    }

    @Override
    public void addTrainee(Trainee trainee) {
        databaseWriter.addTrainee(trainee);
    }
}
