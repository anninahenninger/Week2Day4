package Intermediate_A2_Soup;

public class Menu {
    private Soup soup;
    private String mainDish;
    private String desert;

    public String getSoup() {
        return soup.getName();
    }

    public void setSoup(Soup soup) {
        this.soup = soup;
    }

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getDesert() {
        return desert;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public Menu(Soup soup, String mainDish, String desert){
        this.soup = soup;
        this.mainDish = mainDish;
        this.desert = desert;
    }
    public String getPortionVolume() throws NoSoupVolumeDefined {
        if (this.soup.getSoupPortionVolume() == null) {
            throw new NoSoupVolumeDefined();
        } else {
            return this.soup.getSoupPortionVolume();
        }
    }
}
