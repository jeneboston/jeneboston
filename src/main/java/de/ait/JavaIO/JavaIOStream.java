package de.ait.JavaIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class JavaIOStream {
    private static final Logger LOGGER = LoggerFactory.getLogger(de.ait.homework48.BankAccount.class);
    private static final String PATH = "D://JavaIO.txt";
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(PATH);
            inputStream.close();
        } catch (FileNotFoundException exception) {
            LOGGER.error("File {} not found", PATH);
            throw new RuntimeException(exception);
        } catch (IOException exception) {
            LOGGER.error("IO Exception while opening file {}", PATH);
            throw new RuntimeException(exception);
        } catch (Exception exception) {
            LOGGER.error("Exception while opening file {}", PATH);
        }
    }
}