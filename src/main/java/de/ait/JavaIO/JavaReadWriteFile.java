package de.ait.JavaIO;

import java.io.*;

public class JavaReadWriteFile {
    private InputStream inputStream;
    private OutputStream outputStream;
    private String path;

    public JavaReadWriteFile(String path) {
        this.path = path;
    }

    public void readFile() throws IOException {
        try {
            inputStream = new FileInputStream(path);
            int data = inputStream.read();
            while (data != -1) {
                char content = (char) data;
                System.out.print(content);
                data = inputStream.read();
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public void writeFile(String stringToWrite) throws IOException {
        try {
            outputStream = new FileOutputStream(path);
            outputStream.write(stringToWrite.getBytes());
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}