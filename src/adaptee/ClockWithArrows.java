package adaptee;

public class ClockWithArrows {

    public ClockWithArrows(double secondsAngle, double minuteAngle, double hoursAngle) {
        this.minuteAngle = minuteAngle;
        this.hoursAngle = hoursAngle;
        this.secondsAngle = secondsAngle;
    }

    private double minuteAngle;

    private double hoursAngle;

    private double secondsAngle;

    public void setMinuteAngle(double minuteAngle) {
        this.minuteAngle = minuteAngle;
    }

    public void setHoursAngle(double hoursAngle) {
        this.hoursAngle = hoursAngle;
    }

    public void setSecondsAngle(double secondsAngle) {
        this.secondsAngle = secondsAngle;
    }

    public void showTimeByAngles() {
        long seconds = Math.round(secondsAngle / 6.0);
        long minutes = Math.round(minuteAngle / 6.0);
        long hours = (long) Math.floor(hoursAngle / 15.0);
        String hh = hours < 10 ? "0" + hours : "" + hours;
        String mm = minutes < 10 ? "0" + minutes : "" + minutes;
        String ss = seconds < 10 ? "0" + seconds : "" + seconds;
        System.out.println(hh + ":" + mm + ":" + ss);
    }

    public String getTimeByAngles() {
        long seconds = Math.round(secondsAngle / 6.0);
        long minutes = Math.round(minuteAngle / 6.0);
        long hours = (long) Math.floor(hoursAngle / 15.0);
        String hh = hours < 10 ? "0" + hours : "" + hours;
        String mm = minutes < 10 ? "0" + minutes : "" + minutes;
        String ss = seconds < 10 ? "0" + seconds : "" + seconds;
        System.out.println(hh + ":" + mm + ":" + ss);
        return hh + ":" + mm + ":" + ss;
    }

}
