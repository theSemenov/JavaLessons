package ru.lesson1.part6.airport;

import java.util.List;

public class Main {

    /**
     * Сделать чтоб програма заработала. И завершалась без ошибок.
     * Сделать чтоб каждый созданный аэропорт печатал в консоль сообщение о себе "Печатаю: код {код} название {название}"
     * Запрещается брать объекты из других пакетов.
     * Запрещается изменять код ниже комментария "Далше код изменять запрещено"
     */
    public static void main(String[] args) throws Exception {
        List<AirportDto> airportDtoList;

        AirportDto airportDto = new AirportDto();
        airportDto.setCode("1");
        airportDto.setCode("Аэропорт" + 1);

        String airport1Code = airportDto.getCode();
        String airport1Name = airportDto.getName();
        System.out.println("Печатаю: код" + airport1Code + " название " + airport1Name);


        // Далше код изменять запрещено
        if (airportDtoList.size() != 20) {
            throw new Exception("Не верное количество аэропортов");
        }
    }
}
