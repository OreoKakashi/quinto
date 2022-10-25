package exerciciodemo;

import org.joda.time.*;

public class WorldTime {
    /**
     * Método que recebe um país e indica a sua hora local
     * @param zona país a ser utilizado
     */
    public void getTimeByCountry(DateTimeZone zona) {
        DateTime a = new DateTime();
        long instant = DateTime.now().getMillis();
        String name = zona.getName(instant);
        System.out.println(name + "(" + a.withZone(zona).getHourOfDay()+":"+
        a.withZone(zona).getMinuteOfHour() + ")");
    }
}
