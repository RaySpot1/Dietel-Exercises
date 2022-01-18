package chapterSix;

public class Native {
    private int scvId;
    private String name;


    public Native(String name, int scvId){
        this.name = name;
        this.scvId = scvId;
    }

    public String getScvId() {
        return "scvId00" + scvId;
    }

    public void setScvId(int scvId) {
        this.scvId = scvId;
    }

    public String getName(){
        return name;
    }
}
