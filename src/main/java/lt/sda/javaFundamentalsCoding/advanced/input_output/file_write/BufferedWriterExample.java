package lt.sda.javaFundamentalsCoding.advanced.input_output.file_write;

import lt.sda.javaFundamentalsCoding.advanced.input_output.InputOutputUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(InputOutputUtils.RESULT_FILE_LOCATION))) {
            String text = "Siandien yra sekmadienis \nTemperatura jau pliusine";
            bufferedWriter.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
