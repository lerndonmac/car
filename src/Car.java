public class Car {
    private int weight;
    private int power;
    private String marka;

    public Car (int weight, int power, String marka){
        this.weight = weight;
        this.power = power;
        this.marka = marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getWeight() {
        return weight;
    }
    public int getPower() {
        return power;
    }
    public String getMarka() {
        return marka;
    }
    public void setPower(int power){
        this.power = power;
    }
    @Override
    public String toString(){
        return "";
    }
}
