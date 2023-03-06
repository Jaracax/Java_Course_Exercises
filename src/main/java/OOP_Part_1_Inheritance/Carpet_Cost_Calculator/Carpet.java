package OOP_Part_1_Inheritance.Carpet_Cost_Calculator;

public class Carpet {
    private double cost;

    public Carpet (double cost){
        if (cost < 0){
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }
    public double getCost() {
        return cost;
    }
}
