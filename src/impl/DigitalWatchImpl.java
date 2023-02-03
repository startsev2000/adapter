package impl;

import api.DigitalWatch;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalWatchImpl implements DigitalWatch {

    private long hours;

    private long minutes;

    private long seconds;

    public DigitalWatchImpl(long hours, long minutes, long seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHours(long hours) {
        this.hours = hours;
    }

    public void setMinutes(long minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(long seconds) {
        this.seconds = seconds;
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
        String hh = hours < 10 ? "0" + hours : "" + hours;
        String mm = minutes < 10 ? "0" + minutes : "" + minutes;
        String ss = seconds < 10 ? "0" + seconds : "" + seconds;
        System.out.println(hh + ":" + mm + ":" + ss);
        return hh + ":" + mm + ":" + ss;
    }

    @Override
    public void showTime() {
        String hh = hours < 10 ? "0" + hours : "" + hours;
        String mm = minutes < 10 ? "0" + minutes : "" + minutes;
        String ss = seconds < 10 ? "0" + seconds : "" + seconds;
        System.out.println(hh + ":" + mm + ":" + ss);
    }


}
