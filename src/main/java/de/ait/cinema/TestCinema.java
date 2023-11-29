package de.ait.cinema;

import java.util.ArrayList;
import java.util.List;

public class TestCinema {
    public static void main(String[] args) {
        List<String> actorsFilmTerminator = new ArrayList<>();
        FeatureFilm featureFilmTerminator = new FeatureFilm("Терминатор 2: Судный день",
                137, 10, "Фантастический боевик",
                "Джеймс Кэмерон", actorsFilmTerminator);
    }
}
