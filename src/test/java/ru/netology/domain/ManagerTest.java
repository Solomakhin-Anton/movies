package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Manager manager = new Manager();
    Movie movie = new Movie(8, "Sonic the Hedgehog", "comedy");

    @Test
    void addFilm() {
        Movie[] actual = manager.addFilm(movie);
        Movie[] expected = {new Movie(1, "Bladshort", "action"),
                new Movie(2, "Onward", "cartoon"),
                new Movie(3, "Belgrad Hotel", "comedy"),
                new Movie(4, "Gentlemen", "action"),
                new Movie(5, "The Invisible Man", "Thriller"),
                new Movie(6,"Troll's tour", "cartoon"),
                new Movie(7, "Number One", "comedy"),
                new Movie(8, "Sonic the Hedgehog", "comedy")};
        assertArrayEquals(expected, actual);
    }

    @Test
    void showFilms() {
        manager.addFilm(movie);
        Movie[] movie = manager.showFilms();
    }
}