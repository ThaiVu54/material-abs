import java.util.List;

public class MaterialManager {
    private List<Material> materialList; //todo tao ra mang rong

    public MaterialManager() {
    }

    public MaterialManager(List<Material> materialList) {
        this.materialList = materialList;
    }

    public List<Material> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<Material> materialList) {
        this.materialList = materialList;
    }

    public void addMaterial(Material material) {
        materialList.add(material);
    }

    public void deleteMaterial(Material material) {
        materialList.remove(material);
    }

    public void displayMaterial() {
        System.out.println("material create now: ");
        for (Material material : materialList) {
            System.out.println(material);
        }
    }

//    public double differenceDiscount(double currentDiscount, double noDiscount ){
//        return
//    }

}
