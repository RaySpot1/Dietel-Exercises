import java.util.ArrayList;

public class Diary {
    private String ownerName;
    private ArrayList<Entry> entries = new ArrayList<>();
    private String password;

    public Diary(String name, String secretKey){
        ownerName = name;
        secretKey = password;
    }


    public void setEntries(ArrayList<Entry> entries) {
        this.entries = entries;
    }
    public ArrayList<Entry> getEntries() {
        return entries;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
