package ru.lesson1.part1.airport;

public class Main {

    /**
     * Сделать чтоб програма заработала. И завершалась без ошибок.
     * Запрещается брать объекты из других пакетов.
     * Для информации читать что такое объекты и как их создавать. Объяснить сигнатуру (конструкцию) создания объекта
     * Модифицировать объекты в этом пакете так чтоб в консоль выводилось название аэропорта.
     * Объяснить что было сделано. В чем была ошибка
     */
    public static void main(String[] args) {
        AirportDto airportDto;
        airportDto.setName("Хитроу");
        System.out.println(airportDto.getName());
    }
}
