package api;

public interface DigitalWatch {

    void showCurrentTime();

    void showCurrentTimeUntilDate(String date) throws InterruptedException;

    String getTime();

    void showTime();

}
