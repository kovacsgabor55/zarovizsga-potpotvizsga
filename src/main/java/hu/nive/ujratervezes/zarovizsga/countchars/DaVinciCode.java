package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {
    public int encode(String fileName, char searched) {

        if (searched != '0' && searched != '1' && searched != 'x') {
            throw new IllegalArgumentException("invalid seatched character: " + searched);
        }
        try (BufferedReader br = Files.newBufferedReader(Path.of(fileName))) {
            int count = 0;
            String line;
            while ((line = br.readLine()) != null) {
                count += countCharInLine(line, searched);
            }
            return count;
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot open file: " + fileName, e);
        }
    }

    private int countCharInLine(String line, char searched) {
        int count = 0;
        for (char item : line.toCharArray()) {
            if (item == searched) {
                count++;
            }
        }
        return count;
    }
}
