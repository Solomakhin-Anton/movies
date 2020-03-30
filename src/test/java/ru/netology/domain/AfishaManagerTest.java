package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class AfishaManagerTest {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager manager;
    Movie firstForTest = new Movie(11, "The Irishman", "action");
    Movie secondForTest = new Movie(12, "Gisaengchung", "thriller");
    Movie thirdForTest = new Movie(13, "Ford v Ferrari", "drama");


    @Test
    void addFilm() {
        Movie[] returned = new Movie[]{firstForTest, secondForTest};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).save(thirdForTest);
        manager.addFilm(thirdForTest);
        Movie[] expected = new Movie[]{firstForTest, secondForTest,thirdForTest};
        Movie[] actual = manager.showAll();
        assertArrayEquals(expected, actual);
    }
}