/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author HarasztiMihály(SZF_N
 */
public class Film {
    private String name;
    private float runTimeMin;
    private Genres genres;

    public Film(String name, float runTimeMin, Genres genres) {
        this.name = name;
        this.runTimeMin = runTimeMin;
        this.genres = genres;
    }

    public Film() {
        this("A Minecraft Movei", 101.0f, Genres.ADVENTURA);
    }

    public String getName() {
        return name;
    }

    public float getRunTimeMin() {
        return runTimeMin;
    }

    public Genres getGenres() {
        return genres;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Film{" + "name=" + name + ", runTimeMin=" + runTimeMin + ", genres=" + genres + '}';
    }
    
    
}
