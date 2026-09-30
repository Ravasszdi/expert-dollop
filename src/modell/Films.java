/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import modell.Film;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author HarasztiMihály(SZF_N
 */
public class Films {
    private ArrayList<Film> films;

    public Films(ArrayList<Film> films) {
        this.films = films;
    }
    
    public void addFilm(Film film){
        this.films.add(film);
    }

    public List<Film> getFilms() {
        return new ArrayList<>(films);
    }
    



    
    
    
    
}
