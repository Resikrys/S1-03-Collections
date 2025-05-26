package s1_03_collections_lvl1_ex3;

import java.io.*;
import java.util.*;

public class Main {
    final static String filePath = "./countries.txt"; //OPTION 1: Usar txt desde carpeta raíz de proyecto
    //OPTION 2: cargar archivo desde /src
//    InputStream input = Main.class.getResourceAsStream("/s1_03_collections_lvl1_ex3/countries.txt");
//    BufferedReader br = new BufferedReader(new InputStreamReader(input));

    public static void main(String[] args) {
        Map<String, String> mapFromFile = HashMapFromTextFile();

        // Mostrar contenido del HashMap
        for (Map.Entry<String, String> entry : mapFromFile.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<String, String> HashMapFromTextFile() {
        Map<String, String> map = new HashMap<>();
        BufferedReader br = null;

        try {
            File file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                // Separar por " : " //Added in countries.txt
                String[] parts = line.split(":", 2);

                if (parts.length >= 2) {
                    String country = parts[0].trim();
                    String capital = parts[1].trim();

                    if (!country.isEmpty() && !capital.isEmpty()) {
                        map.put(country, capital);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return map;
    }
}

//Read each line of the document
//bf = new BufferedWriter( new FileWriter(file_name) );
//At each line, split the key-value pair by ":" and put it in the map
//return the map
//Exemple: https://www.geeksforgeeks.org/reading-text-file-into-java-hashmap/
//Scanner + loop 10 cops demanant resposta a un país random del map (comparar values)
//Scanner: String userName, String answer (loop 10 times)
//If answer correct (+1) if not (score es manté igual) -> sort map countries & compare answer
//Sumatori score into totalScore & store it into new map as value of key userName
//Crear clasificacio.txt + emmagatzemar/write nom usuari i totalScore
//Class player: userName i score + list Players map (key-name/value-score) & create classificacio
