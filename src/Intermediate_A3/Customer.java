package Intermediate_A3;

public class Customer {
    private String name;
    private String address;
    private int creditScore;

    Customer(String name, String address, int creditScore){
        this.name = name;
        this.address = address;
        this.creditScore = creditScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public int getCustomerCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) throws BadCreditScoreException{
        if(creditScore < 0 && creditScore > 5){
            throw new BadCreditScoreException();
        } else {
            this.creditScore = creditScore;
        }
    }
}
