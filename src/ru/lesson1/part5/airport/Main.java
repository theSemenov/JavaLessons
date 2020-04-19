package ru.lesson1.part5.airport;

public class Main {

    /**
     * Сделать чтоб програма заработала.
     * И завершалась без ошибок.
     * Есть класс EnemyAircraft - вражеский самолет. И у него есть метод throwBomb() - скинуть бомбу.
     * Цель разбомбить аропорты Хитроу, Внуково, Дубаи
     * Запрещается брать объекты из других пакетов.
     * Изменять EnemyAircraft запрещено.
     */
    public static void main(String[] args) {
        new EnemyAircraft().throwBomb();
        new EnemyAircraft("Хитроу").throwBomb();
    }
}
