package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AfishaManager {
    private AfishaRepository repo = new AfishaRepository();
    private int quantityOfFilms = 3;
    public AfishaManager(AfishaRepository repository) {
        this.repo = repository;
    }

    public void addFilm(Movie movie) {
        repo.save(movie);
    }

    public Movie[] showFilms() {
        int c = 0;
        Movie[] listNew = new Movie[quantityOfFilms];
        Movie[] all = repo.findAll();
        for (int i = all.length - 1; i > all.length - (quantityOfFilms + 1) & i >= 0; i--) {
            listNew[c] = all[i];
            System.out.print(all[i]);
            c++;
        }

        return listNew;
    }

    public Movie[] showAll() {
        Movie[] all = repo.findAll();
        return all;
    }

}
