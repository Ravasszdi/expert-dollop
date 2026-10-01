/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mian;

import java.util.ArrayList;
import java.util.List;
import modell.Films;
import modell.Film;
import view.ConsolView;
import view.HtmlView;
import view.TableView;

/**
 *
 * @author HarasztiMihály(SZF_N
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Film[] list = {
            new Film(),
            new Film()
        };
        new HtmlView(new Films(list)).view();
    }
    
}
