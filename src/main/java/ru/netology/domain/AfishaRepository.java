package ru.netology.domain;

public class AfishaRepository {
    private Movie[] list = {new Movie(1, "Bladshort", "action"),
            new Movie(2, "Onward", "cartoon"),
            new Movie(3, "Belgrad Hotel", "comedy"),
            new Movie(4, "Gentlemen", "action"),
            new Movie(5, "The Invisible Man", "thriller"),
            new Movie(6,"Troll's tour", "cartoon"),
            new Movie(7, "Number One", "comedy")};

    Movie movie = new Movie(8, "Sonic the Hedgehog", "comedy");

    Movie[] findAll() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        return list;
    }

    void save(Movie movie) {
        int length = list.length + 1;
        Movie[] addedFilm = new Movie[length];
        for (int i = 0; i < list.length; i++) {
            addedFilm[i] = list[i];
        }
        int lastIndex = addedFilm.length - 1;
        addedFilm[lastIndex] = movie;
        list = addedFilm;
    }

    Movie findByID(int id) {
        for (Movie item : list) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }


    void removeById(int id) {
        boolean b = false;
        for (Movie item : list) {
            if (item.getId() == id) {
                b = true;
                break;
            }
        }
        if (b) {
            int length = list.length - 1;
            Movie[] newArray = new Movie[length];
            int index = 0;
            for (Movie item : list) {
                if (item.getId() != id) {
                    newArray[index] = item;
                    index++;
                }
            }
            list = newArray;
        }
    }

    void removeAll() {
        list= new Movie[0];

    }
}
