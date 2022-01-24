package chapterThree;

public class PetroleumPurchase {
    private String location;
    private String petrolType;
    private double quantity;
    private double litre;
    private double discount;
//    private double netAmount;

    public PetroleumPurchase(String location, String petrolType, double quantity, double litre, double discount){
        this.location = location;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.litre = litre;
        this.discount = discount;
    }

    public void getPurchaseAmount(double purchaseAmount){
        if(purchaseAmount > 0) {
            quantity = (purchaseAmount * litre - discount);
        }
    }
    public double getPurchase() {
        return quantity;
    }

    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }

    public void setPetrolType(String petrolType){
        this.petrolType = petrolType;
    }
    public String getPetrolType(){
        return petrolType;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public double getQuantity(){
        return quantity;
    }

    public void setLitre(double litre){
        this.litre = litre;
    }
    public double getLitre(){
        return litre;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }
    public double getDiscount(){
        return discount;
    }
}
