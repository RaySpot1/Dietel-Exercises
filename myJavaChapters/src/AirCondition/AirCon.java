package AirCondition;

public class AirCon {
    private String onButton;
    private String offButton;

    //cold temperature settings
    private String coldTemperature;
    private String increaseColdTemperature;
    private String reduceColdTemperature;

    //hot temperature settings
    private String hotTemperature;
    private String increaseHotTemperature;
    private String reduceHotTemperature;


    public AirCon(String turnOn, String turnOff, String cold, String colder, String lessCold, String hot, String hotter, String lessHot){
        onButton = turnOn;
        offButton = turnOff;

        //cold
        coldTemperature = cold;
        this.increaseColdTemperature = colder;
        this.reduceColdTemperature = lessCold;

//        hot
        hotTemperature = hot;
        this.increaseHotTemperature = hotter;
        this.reduceHotTemperature = lessHot;
    }

    public String getAcOnStatus() {
        return onButton;
    }

    public String getAcOffStatus() {
        return offButton;
    }

    public String getColdTemperatureStatus() {
        return coldTemperature;
    }
    public void coldIncrement(boolean coldIncreased){
        int convert = Integer.parseInt(coldTemperature);
        if(coldIncreased){
            convert++;
        }
    }



    public String getHotTemperatureStatus() {
        return hotTemperature;
    }

    public int increaseOver30(int acNumberInput) {
        int acDisplayNumberLimit = 30;
        if (acNumberInput >= acDisplayNumberLimit)
            System.out.println(acDisplayNumberLimit);
        return acDisplayNumberLimit;
    }
}




