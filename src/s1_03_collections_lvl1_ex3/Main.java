package s1_03_collections_lvl1_ex3;

import java.io.*;
import java.util.*;

public class Main {
    final static String filePath = "./countries.txt"; //OPTION 1: Use txt from project's route directory
    //OPTION 2: cargar archivo desde /src
//    InputStream input = Main.class.getResourceAsStream("/s1_03_collections_lvl1_ex3/countries.txt");
//    BufferedReader br = new BufferedReader(new InputStreamReader(input));
    final static String scoreFilePath = "./classification.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player name: ");
        String playerName = scanner.next();
        Player player = new Player(playerName);

        // Read HashMap from file
        Map<String, String> mapFromFile = HashMapFromTextFile();

        // Show HashMap content
//        for (Map.Entry<String, String> entry : mapFromFile.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        // Obtain countres list (map keys)
        List<String> countries = new ArrayList<>(mapFromFile.keySet());
        Collections.shuffle(countries); // Random questions

        System.out.println("Game start!");

        // Ask 10 times
        for (int i = 0; i < 10 && i < countries.size(); i++) {
            String country = countries.get(i);
            String correctCapital = mapFromFile.get(country);

            System.out.print("Capital of " + country + "? ");
            String answer = scanner.nextLine().trim();

            if (answer.equalsIgnoreCase(correctCapital)) {
                System.out.println("Correct!");
                player.addPoint();
            } else {
                System.out.println("Incorrect! The answer is: " + correctCapital);
            }
        }

        System.out.println("Final score of " + player.getName() + ": " + player.getTotalScore());


        //Save score in classification.txt
        saveScore(player);

        scanner.close();
    }

    public static Map<String, String> HashMapFromTextFile() {
        Map<String, String> map = new HashMap<>();
        BufferedReader br = null;

        try {
            File file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                // Split by " : " //Added in countries.txt
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

    public static void saveScore(Player player) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(scoreFilePath, true))) {
            writer.write(player.getName() + ": " + player.getTotalScore());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error! Score not saved.");
            e.printStackTrace();
        }
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
