package chapterNine;

public class MyShoppingList {
    private String[] productName=new String[4];
    private String[] capacity = new String[0];
    private int size;
//    private String


    public MyShoppingList(int size){
        this.size = size;
    }

    public String[] getProductName() {
        return productName;
    }
    public void setProductName(String[] productName) {

        this.productName = productName;
    }

    public String[] getCapacity() {

        return capacity;
    }
    public void setCapacity(String[] capacity) {
        if(productName.length == getSize()){
            capacity=productName;
            productName = new String[productName.length *2];
        }
        this.capacity = capacity;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void canAddToList(String value) {
        setCapacity(capacity);
        for (int i = 0; i < productName.length; i++) {
            if(productName[i] == null){
                productName[i] = value;
                size++;
                break;
            }
        }
    }
}
