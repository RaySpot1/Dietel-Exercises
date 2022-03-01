import java.util.ArrayList;

public class Diary {
    private String ownerName;
    private ArrayList<Entry> entries = new ArrayList<>();
    private String password;

    public Diary(String name, String secretKey){
        ownerName = name;
        password = secretKey;
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

    public void addNewGist(String title, String gistProper, String secretKey) {
        if(secretKey.equals(password)){
            Gist gist = new Gist(title, gistProper);
            gists.add(gist);
        } else{
            throw new IllegalArgumentException("Your password is wrong!");
        }
    }

    public Gist findGistByTitle(String gistTittle){
        for(Gist gist: gists){

        }
    }
}
