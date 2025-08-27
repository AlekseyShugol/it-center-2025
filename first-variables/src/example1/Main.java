package example1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();    // объявление переменной "now" типа "Date" и её
        // инициализация ссылкой на созданный объект класса
        // "Date"
        System.out.println(now);  // методы print() и println() могут выводить любые
        // переменные, в том числе и ссылочные
        String message = "Hello"; // объявление переменной "message" типа "String" и её
        // инициализация ссылкой на созданную строку
        System.out.println(message);
        Date date = now;          // копирование ссылки на существующий объект
        System.out.println(date);
        System.out.println(message.length()); // вызов метода length() для строкового
        // объекта, который возвращает количество
        // символов в строке
        String str = null;        // пустая ссылка типа "String"
        System.out.println(str);
    }
}