import java.time.LocalDate;

public class Meat extends Material implements Discount {
    double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost() * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        LocalDate currentDay = LocalDate.now();
        if ((getExpiryDate().equals(currentDay.plusDays(3))) || (getExpiryDate().isBefore(currentDay.plusDays(3)))) {
            return getCost() - (getCost() * 0.4);
        } else if ((getExpiryDate().equals(currentDay.plusDays(5))) || (getExpiryDate().isBefore(currentDay.plusDays(5)))) {
            return getCost() - (getCost() * 0.3);
        } else {
            return getCost();
        }
    }

    @Override
    public String toString() {
        return "Meat{"+
                super.toString() +
                ", weight=" + weight +
                ", realMoney=" +getRealMoney()+
                '}';
    }
}
