package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AfishaRepositoryTest {

    AfishaRepository repo = new AfishaRepository();

    @Test
    void shouldFindAll() {
        Movie[] expected = {new Movie(1, "Bladshort", "action"),
                new Movie(2, "Onward", "cartoon"),
                new Movie(3, "Belgrad Hotel", "comedy"),
                new Movie(4, "Gentlemen", "action"),
                new Movie(5, "The Invisible Man", "thriller"),
                new Movie(6,"Troll's tour", "cartoon"),
                new Movie(7, "Number One", "comedy")};

        Movie[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSave() {
        repo.save(repo.movie);
        Movie[] expected = {new Movie(1, "Bladshort", "action"),
                new Movie(2, "Onward", "cartoon"),
                new Movie(3, "Belgrad Hotel", "comedy"),
                new Movie(4, "Gentlemen", "action"),
                new Movie(5, "The Invisible Man", "thriller"),
                new Movie(6,"Troll's tour", "cartoon"),
                new Movie(7, "Number One", "comedy"),
                new Movie(8, "Sonic the Hedgehog", "comedy")};
        Movie[] actual = repo.findAll();
        assertArrayEquals(expected, actual);


    }

    @Test
    void shouldFindByID() {
        Movie expected = new Movie(4, "Gentlemen", "action");
        Movie actual = repo.findByID(4);
        assertEquals(expected, actual);


    }

    @Test
    void shouldRemoveById() {
        repo.removeById(5);
        Movie[] expected = {new Movie(1, "Bladshort", "action"),
                new Movie(2, "Onward", "cartoon"),
                new Movie(3, "Belgrad Hotel", "comedy"),
                new Movie(4, "Gentlemen", "action"),
                new Movie(6,"Troll's tour", "cartoon"),
                new Movie(7, "Number One", "comedy")};
        Movie[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldRemoveByIdIfIDDoesNotExist() {
        repo.removeById(11);
        Movie[] expected = {new Movie(1, "Bladshort", "action"),
                new Movie(2, "Onward", "cartoon"),
                new Movie(3, "Belgrad Hotel", "comedy"),
                new Movie(4, "Gentlemen", "action"),
                new Movie(5, "The Invisible Man", "thriller"),
                new Movie(6,"Troll's tour", "cartoon"),
                new Movie(7, "Number One", "comedy")};
        Movie[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }



    @Test
    void shouldRemoveAll() {
        repo.removeAll();
        Movie[] expected = {};
        Movie[] actual = repo.findAll();
        assertArrayEquals(expected, actual);

    }
}