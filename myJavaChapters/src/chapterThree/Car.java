package chapterThree;

public class Car {
    private String model;
    private String year;
    private double price;
    private double discount;

    public Car(String model, String year, double price, double discount){
        this.model = model;
        this.year = year;
        this.price = price;
        this.discount = discount;
    }

//    public void setDiscount(double discount) {
//        discount = price - discount;
//        this.discount = discount;
//    }

    public double getDiscount(){
        discount = price - discount;
        return discount;
    }

//    public double applyDiscount(double discountAdded){
//        price = discount
//    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setYear(String year){
        this.year = year;
    }
    public String getYear(){
        return year;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

}
