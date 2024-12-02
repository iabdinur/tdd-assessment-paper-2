package com.iabdinur.tdd.groupcontroller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class GroupControllerServiceTest {
    private GroupControllerService underTest;

    private final DatabaseReader databaseReader = mock(DatabaseReader.class);
    private final DatabaseWriter databaseWriter = mock(DatabaseWriter.class);
    private final GroupControllerService groupControllerService = new TraineeGroupManager(databaseReader, databaseWriter);


    @Test
    void itShouldTestGetAllTrainee() {
        // Given
        Map<String, Trainee> mockMap = Map.of("john", new Trainee("john", "John Doe"));
        // When
        when(databaseReader.readGroup()).thenReturn(mockMap);
        Map<String, Trainee> result = groupControllerService.getAllTrainees();
        assertEquals(mockMap, result);
        // Then
    }

    @Test
    void itShouldTestRemoveTraineeByUsername() {
        // Given
        Map<String, Trainee> mockMap = Map.of("john", new Trainee("john", "John Doe"));

        // When
        groupControllerService.removeTraineeByUsername("john");
        // Then
        Mockito.verify(databaseWriter, times(1)).deleteTraineeByUsername("john");
    }

    @Test
    void itShouldTestAddTrainee() {

        Trainee trainee = new Trainee("jane", "Jane Doe");
        // Given

        // When
        groupControllerService.addTrainee(trainee);

        // Then
        Mockito.verify(databaseWriter, times(1)).addTrainee(trainee);
    }
}
