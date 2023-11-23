package de.ait.JavaIO;

import java.io.File;
import java.io.IOException;

public class JavaFiles {
    public static void main(String[] args) throws IOException {
        // Указываем путь к файлу
        File fileOne = new File("C:/Users/user/IdeaProjects/Pinchuk/JavaFile.txt");
        fileOne.createNewFile();
        // Получаем путь к файлу и его абсолютный путь
        String path = fileOne.getPath();
        String pathAbsolute = fileOne.getAbsolutePath();

        // Выводим информацию о путях
        System.out.println(path);
        System.out.println(pathAbsolute);

        // Создаем новый файл
        File fileTwo = new File("D://JavaIO.txt");

        try {
            // Проверяем, что файл успешно создан
            if (fileTwo.createNewFile()) {
                System.out.println("File 'JavaIO.txt' created successfully.");
            } else {
                System.out.println("File 'JavaIO.txt' already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}