import java.time.LocalDate;

public abstract class Material {
    private String id;
    private String Name;
    private LocalDate manufacturingDate;
    private int cost;

    public Material() {
    }

    public Material(String id, String name, LocalDate manufacturingDate, int cost) {
        this.id = id;
        Name = name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public abstract double getAmount();
    public abstract LocalDate getExpiryDate();

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost;
    }
}
