package s1_03_collections_lvl1_ex3;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
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
