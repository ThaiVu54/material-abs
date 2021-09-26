import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    private double quantity;


    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour (){
    }

    @Override
    public double getAmount() {
        return quantity*getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }


    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        if ((getExpiryDate().equals(now.plusMonths(2))) || (getExpiryDate().isBefore(now.plusMonths(2)))) {
            return getCost() - (getCost() * 0.4);
        } else if ((getExpiryDate().equals(now.plusMonths(4))) || (getExpiryDate().isBefore(now.plusMonths(4)))) {
            return getCost() - (getCost() * 0.2);
        } else {
            return getCost();
        }
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                super.toString() +
                ", quantity=" + quantity +
                ", realMoney=" + getRealMoney() +
                '}';
    }
}
