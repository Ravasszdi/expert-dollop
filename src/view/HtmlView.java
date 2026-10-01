/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import modell.Film;
import modell.Films;

/**
 *
 * @author haraszti.mihaly
 */
public class HtmlView {

    private Films modell;

    public HtmlView(Films modell) {
        this.modell = modell;
    }

    public void view() throws IOException {
        String html_frame = "<!DOCTYPE html>\n"
                + "<html lang=\"hu\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "    <title>Veiw</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "%s\n"
                + "</body>\n"
                + "</html>";
        
        String table = "    <table>\n"
                + "        <tr>\n"
                + "            <th>Name</th>\n"
                + "            <th>RunTime</th>\n"
                + "            <th>Genre</th>\n"
                + "        </tr>\n"
                + "        %s\n"
                + "    </table>";
        
        String table_content = "";
        for (Film film : this.modell.getFilms()) {
            table_content += "<tr>\n";
            table_content += "<td>%s</td>\n".formatted(film.getName());
            table_content += "<td>%s</td>\n".formatted(film.getRunTimeMin());
            table_content += "<td>%s</td>\n".formatted(film.getGenres());
            table_content += "<tr>\n";
        }
        table = table.formatted(table_content);
        Files.writeString(Path.of("index.html"), html_frame.formatted(table));
    }
}
