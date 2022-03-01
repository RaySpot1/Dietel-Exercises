package chapterSix;


public class ParkingCharges {
    double[] companyTime = {1.00, 2.00, 3.00, 4.00, 5.00, 6.00, 7.00, 8.00, 9.00, 10.00, 11.00, 12.00};


    public double minChargesInThreeHour() {
        return 2.00;
    }

    public double afterThreeHoursCharge() {
        return 0.50;
    }

    public double maxChargeInTwentyFourHour() {
        return 10.00;
    }

    public void calculateCharges(double parkingTime){
        double parkingCharges;
        if(parkingTime < companyTime[2]){
            parkingCharges = minChargesInThreeHour();
            System.out.printf("\nDear customer, your Parking Charges = %.2f", parkingCharges);
        } else if (parkingTime < companyTime[11]){
            parkingCharges = afterThreeHoursCharge();
            System.out.printf("\nDear customer, your Parking Charges = %.2f", parkingCharges);
        } else if (parkingTime == companyTime[11]){
            parkingCharges = maxChargeInTwentyFourHour();
            System.out.printf("\nDear customer, your Parking Charges = %.2f", parkingCharges);
        } else{
            System.out.println("\nKindly provide hours between 1 - 12");
        }
    }


}
