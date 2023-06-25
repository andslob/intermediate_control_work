package intermediate_control_work.java.interjava.global;

import intermediate_control_work.java.interjava.model.Toy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static intermediate_control_work.java.interjava.global.Vars.myFileName;

public class MyFileWriter {


    public static void writeToy(Toy winnerToy) {
        String result_string =
                winnerToy.getId() + System.lineSeparator() +
                        winnerToy.getName() + System.lineSeparator() +
                        winnerToy.getQuantity() + System.lineSeparator() +
                        winnerToy.getWeight() + System.lineSeparator();


        try {
            File myTxt = new File(myFileName);
            FileWriter fr = new FileWriter(myTxt);
            BufferedWriter br = new BufferedWriter(fr);

            br.write(result_string);
            br.close();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}