import day01trebuchet.CalibrationDecoder;

import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        CalibrationDecoder decoder = new CalibrationDecoder();

        String[] input = getResourceContent("01_input");

        System.out.println(decoder.decode(input));
    }

    private static String[] getResourceContent(String fileName) throws Exception {
        ClassLoader classLoader = Main.class.getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        try (InputStream inputStream = new FileInputStream(file)) {
            String result = new BufferedReader(new InputStreamReader(inputStream))
                    .lines()
                    .collect(Collectors.joining("\n"));
            return result.split("\n");
        }
    }
}