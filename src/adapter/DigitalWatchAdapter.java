package adapter;

import api.DigitalWatch;
import adaptee.ClockWithArrows;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalWatchAdapter implements DigitalWatch {

    private final ClockWithArrows clock;

    public DigitalWatchAdapter(ClockWithArrows clock) {
        this.clock = clock;
    }

    public ClockWithArrows getClock() {
        return clock;
    }

    @Override
    public void showCurrentTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime now = LocalTime.now();
        System.out.println(dtf.format(now));
    }

    @Override
    public void showCurrentTimeUntilDate(String date) throws InterruptedException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime until = LocalTime.parse(date, dtf);
        LocalTime now = LocalTime.now();
        while (now.isBefore(until)) {
            System.out.println(dtf.format(now));
            Thread.sleep(1000);
            now = LocalTime.now();
        }
    }

    @Override
    public String getTime() {
        return clock.getTimeByAngles();
    }

    @Override
    public void showTime() {
        clock.showTimeByAngles();
    }

}
