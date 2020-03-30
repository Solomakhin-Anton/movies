package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    private int quantityOfFilms = 5;

    Movie[] list = {new Movie(1, "Bladshort", "action"),
            new Movie(2, "Onward", "cartoon"),
            new Movie(3, "Belgrad Hotel", "comedy"),
            new Movie(4, "Gentlemen", "action"),
            new Movie(5, "The Invisible Man", "Thriller"),
            new Movie(6,"Troll's tour", "cartoon"),
            new Movie(7, "Number One", "comedy")};

    Movie movie = new Movie(8, "Sonic the Hedgehog", "comedy");

    public Movie[] addFilm(Movie movie) {
        int length = list.length + 1;
        Movie[] addedFilm = new Movie[length];
        for (int i = 0; i < list.length; i++) {
            addedFilm[i] = list[i];
        }
        int lastIndex = addedFilm.length - 1;
        addedFilm[lastIndex] = movie;
        list = addedFilm;
        System.out.println(list);
        return list;

    }


    public Movie[] showFilms() {
        for (int i = list.length - 1; i > list.length - (quantityOfFilms + 1) & i >= 0; i--) {
            System.out.print(list[i]);
        }
        return new Movie[0];
    }
}
