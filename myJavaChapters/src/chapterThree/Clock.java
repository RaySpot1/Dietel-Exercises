package chapterThree;

public class Clock {
    private int hour;
    private int minutes;
    private int seconds;
    public String ampm;

//    public void setAmpm(String ampm){
//
//        this.ampm = ampm;
//    }

    public String getAmpm(){
        if(hour > 12){
            return "pm";
        } else
            return "am";
    }

    public String displayTime(){
        return hour + ":" + minutes + ":" + seconds + " " + getAmpm();
    }


    public Clock(int hour, int minutes, int seconds){
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHour(int hour){
        if(hour > 23) {
            hour = 0;
        }
        this.hour = hour;
    }
    public int getHour(){
        return hour;
    }

    public void setMinutes(int minutes){
        if(minutes > 59){
            minutes = 0;
        }
        this.minutes = minutes;
    }
    public int getMinutes(){
        return minutes;
    }

    public void setSeconds(int seconds){
        if(seconds > 59){
            seconds = 0;
        }
        this.seconds = seconds;
    }
    public int getSeconds(){
        return seconds;
    }
}
