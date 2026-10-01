/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import modell.Film;
import modell.Films;

/**
 *
 * @author haraszti.mihaly
 */
public class TableView {
    private Films modell;

    public TableView(Films modell) {
        this.modell = modell;
    }
    
    public void view(){
        for(Film film : this.modell.getFilms()){
            System.out.println("||%s|%s|%s||".formatted(film.getName(),film.getRunTimeMin(),film.getGenres()));
        }
    }
}
