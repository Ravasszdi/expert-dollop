/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mian;

import modell.Films;
import view.ConsolView;

/**
 *
 * @author HarasztiMihály(SZF_N
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ConsolView(new Films(films)).view();
    }
    
}
