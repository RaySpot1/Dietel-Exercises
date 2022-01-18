package chapterSeven;

public class Bike {
    private String bikeName;
    private boolean isOn;
//    private String turnOff;
    private int speed;
    private int gear;

    public Bike(String bikeName) {
       this.bikeName = bikeName;

    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }

    public void accelerate(int gear){
        if(gear == 1){
            speed += 1;
        }
        if(gear == 2){
            speed += 2;
        }
        if(gear == 3){
            speed += 3;
        }
        if(gear == 4){
            speed += 4;
        }
    }
    public void decelerate(int gear) {
        if(speed < 0){
            speed = 0;
        }
        if(gear == 1){
            speed--;
        }
        if(gear == 2){
            speed -= 2;
        }
        if(gear == 3){
            speed -= 3;
        }
        if(gear == 4){
            speed -= 4;
        }
    }

    public int getSpeed(){
        if(speed < 0) return 0;

        return speed;
    }
    public void setGear(){
        this.gear = gear;
        if(speed >= 0 && speed <= 20){
            gear = 2;
        } else {
            if(speed >= 21 && speed <= 40){
                gear = 3;
            } else {gear = 4;}
        }
    }

    public int getGear(){
        if(isOn)
            return gear;
        return 0;
    }

    @Override
    public String toString(){
        String bike = "";
        bike += bike + (isOn() ? "on" : "off") + "\n";
        bike += "Acceleration is" + getSpeed() + "\n";
        bike += "Gear is " + getGear() + "\n";
        return bike;
    }
}
