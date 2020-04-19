package ru.lesson1.part4.airport;

/**
 * Вражеский самолет
 */
public class EnemyAircraft {

    public AirportDto targetAirport;

    private EnemyAircraft(AirportDto targetAirport) {
        this.targetAirport = targetAirport;
    }

    /**
     * Скинуть бомбу
     */
    public void throwBomb() {
        if (targetAirport.getLatitude() == null) {
            throw new IllegalArgumentException("Широта для аэропорта " + targetAirport.getName() + " не задана");
        }
        if (targetAirport.getLongitude() == null) {
            throw new IllegalArgumentException("Долгота для аэропорта " + targetAirport.getName() + " не задана");
        }
        System.out.println("Пизда аэропорту " + targetAirport.getName().toLowerCase());
    }
}
