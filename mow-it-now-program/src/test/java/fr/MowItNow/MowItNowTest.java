package fr.MowItNow;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Unit-level testing for MowItNow object.
 */
public class MowItNowTest {

    @Test
    public void shouldTestProgramMain() throws Exception {
        // Set up a stream to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        String[] args = {"src/test/java/fr/MowItNow/input.txt"};
        MowItNow.main(args);        
        // Restore the original System.out
        System.setOut(originalOut);

        String output = outputStream.toString().trim();
        String expectedOutput = "1 3 N 5 1 E";

        // Verify the output
        Assertions.assertEquals(expectedOutput, output);
    }
}
