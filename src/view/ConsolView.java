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
 * @author HarasztiMihály(SZF_N
 */
public class ConsolView {
    private Films modell;

    public ConsolView(Films modell) {
        this.modell = modell;
    }

    public void view(){
        List<Film> films = modell.getFilms();
        for (int i = 0; i < films.size(); i++) {
            System.out.println(films.get(i));
        }
    }
    
}
