package de.ait.JavaIO;

import java.io.IOException;

public class TestJavaIO {
    private static final String PATH = "D://JavaIO.txt";
    private static JavaReadWriteFile javaReadWriteFile;

    public static void main(String[] args) {
        javaReadWriteFile = new JavaReadWriteFile(PATH);

        try {
            javaReadWriteFile.writeFile("Hello!");
            javaReadWriteFile.readFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}