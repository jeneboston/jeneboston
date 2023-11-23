package de.ait.homework46;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


public class ArrayUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArrayUtil.class);
    private static String[] arrayCar = {"Audi", "BMW", "VW", "MB", "Seat"};

    public static void main(String[] args) {
        boolean resultExact = false;
        Scanner scanner = new Scanner(System.in);
        while (!resultExact) {


            System.out.println("Введите индекс элемента для извлечения: ");

            if (scanner.hasNextLine()) { // Проверка на наличие следующей строки
                String input = scanner.nextLine();

                try {
                    int element = Integer.parseInt(input);
                    if (element >= 0 && element < arrayCar.length) {
                        String elementValue = arrayCar[element];
                        System.out.println("Извлеченный элемент: " + elementValue);
                    } else {
                        LOGGER.error("Индекс выходит за границы массива.");
                    }
                } catch (NumberFormatException exception) {
                    LOGGER.error("Ошибка. Неправильный формат числа: {}", input);
                } catch (ArrayIndexOutOfBoundsException exception) {
                    LOGGER.error("Исключение: индекс выходит за границы массива.");
                }catch (Exception exception) {
                    LOGGER.error("Неизвестная ошибка", exception);
                }finally {
                    LOGGER.info("Операция поиска завершена.");
                }
            } else {
                LOGGER.error("Ошибка. Не удалось считать строку.");
            }

        }
        scanner.close();
    }
}