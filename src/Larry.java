public class Larry extends Car {
    private int lifting;
    public Larry(int weight, int power, String marka,int lifting){
        super(weight,power,marka);
        this.lifting = lifting;
    }
    public void setLifpMark(String marka, int lifting){
        super.setMarka(marka);
        this.lifting = lifting;
    }
    public int getLifting(){
        return lifting;
    }
    public void setLifting(int lifting){
        this.lifting = lifting;
    }
    @Override
    public String toString(){
        return "marka: " + super.getMarka() + "\n" +
                "power: " + super.getPower() + "\n" +
                "weight: " + super.getWeight() + "\n" +
                "lifting: " + lifting;
    }
}