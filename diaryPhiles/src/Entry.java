import java.time.LocalDateTime;

public class Entry {
    private String title;
    private LocalDateTime time = LocalDateTime.now(); //initialize time to update for now!
    private String gist;

    public Entry(String title, String gist) {
        this.title = title;
        this.gist = gist;
    }

    public void getTitle(String title){
        this.title = title;
    }
    public String setTitle(){
        return title;
    }

    public void getTime(LocalDateTime time){
        this.time = time;
    }
    public LocalDateTime time(){
        return time;
    }

    public void getGist(String gist){
        this.gist = gist;
    }
    public String gist(){
        return gist;
    }
}
