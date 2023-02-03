import adaptee.ClockWithArrows;
import adapter.DigitalWatchAdapter;
import impl.DigitalWatchImpl;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Simple digital watch
        DigitalWatchImpl watch = new DigitalWatchImpl(12, 38, 46);
        watch.showCurrentTime();
        watch.showTime();
        watch.showCurrentTimeUntilDate("19:38:59");

        watch.setHours(7);
        watch.setMinutes(2);
        watch.setSeconds(1);
        watch.showCurrentTime();
        watch.showTime();

        // Simple analog clock only with angles of arrows
        ClockWithArrows clock = new ClockWithArrows(278.0, 162.0, 32.0);
        clock.showTimeByAngles();

        clock.setHoursAngle(19.0);
        clock.setMinuteAngle(102.0);
        clock.setSecondsAngle(359);
        clock.showTimeByAngles();

        // Object that adaptate analog clock
        DigitalWatchAdapter analogClockAdapter = new DigitalWatchAdapter(clock);
        analogClockAdapter.showCurrentTime();
        analogClockAdapter.showTime();
        analogClockAdapter.showCurrentTimeUntilDate("19:39:59");

        analogClockAdapter.getClock().setHoursAngle(31.0);
        analogClockAdapter.getClock().setMinuteAngle(211.0);
        analogClockAdapter.getClock().setSecondsAngle(89.0);
        analogClockAdapter.showCurrentTime();
        analogClockAdapter.showTime();
        analogClockAdapter.showCurrentTimeUntilDate("19:41:59");

    }
}