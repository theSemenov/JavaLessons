package ru.lesson1.part2.airport;

public class Main {

    /**
     * Сделать чтоб програма заработала. И завершалась без ошибок
     * Запрещается брать объекты из других пакетов. Запрещается изменять объект Main.
     * Показать где объвляется объект main. В случае ошибки читать литературу с описаниями объектов/методов
     * Модифицировать объекты в этом пакете так чтоб в консоль выводилось название аэропорта.
     * Объяснить что было сделано. В чем была ошибка
     */
    public static void main(String[] args) {
        AirportDto airportDto = new AirportDto();
        airportDto.setName("Хитроу");
        System.out.println(airportDto.getName().toLowerCase());
        System.out.println(airportDto.getCode().toLowerCase());
    }
}
