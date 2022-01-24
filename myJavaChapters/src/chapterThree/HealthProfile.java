package chapterThree;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int dayOfBirth, monthOfBirth, yearOfBirth;

    public HealthProfile(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getMaximumHearthRate(){
        return 220 - getAgeInYears();
    }


    public int getTargetHeartRange(){
        return getMaximumHearthRate() * 85/100;
    }

    public int getAgeInYears(){
        return 2022 - yearOfBirth;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }

    public void setMonthOfBirth(int monthOfBirth){
        this.monthOfBirth = monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth){
        this.dayOfBirth = dayOfBirth;
    }
}
