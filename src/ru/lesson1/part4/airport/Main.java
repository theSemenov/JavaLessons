package ru.lesson1.part4.airport;

public class Main {

    /**
     * Сделать чтоб програма заработала. И завершалась без ошибок. Запрещается брать объекты из других пакетов.
     *
     */
    public static void main(String[] args) {
        AirportDto airportDto1 = new AirportDto("1", "Мюнхен");
        airportDto1.setName("Хитроу");
        System.out.println(airportDto1.getName());

        AirportDto airportDto2 = new AirportDto();
        airportDto2.setCode("1");
        airportDto2.setName("Хитроу");
        System.out.println(airportDto2.getName());
    }
}
