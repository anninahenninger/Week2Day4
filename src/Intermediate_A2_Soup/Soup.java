package Intermediate_A2_Soup;

public class Soup {
    private String name;
    private String portionVolume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSoupPortionVolume(){
        return portionVolume;
    }

    public void setPortionVolume(String portionVolume) {
        this.portionVolume = portionVolume;
    }

    public Soup(String name, String portionVolume){
        this.name = name;
        this.portionVolume = portionVolume;
    }
}
