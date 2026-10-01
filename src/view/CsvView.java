/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.nio.file.Files;
import java.nio.file.Path;
import modell.Film;
import modell.Films;

/**
 *
 * @author haraszti.mihaly
 */
public class CsvView {
    private Films modell;

    public CsvView(Films modell) {
        this.modell = modell;
    }
    
    public void view(){
        String csv = "Name;Runtime;Genre\n";
        for (Film film : this.modell.getFilms()){
            csv += "%s;%s;%s\n".formatted(film.getName(),film.getRunTimeMin(),film.getGenres());
        }
        Files.writeString(Path.of("films.csv"), csv);
    }
}
