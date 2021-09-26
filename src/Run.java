import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Material c1 = new CrispyFlour("1", "thai", LocalDate.of(1998, 1, 18), 20000, 2);
        Material c2 = new CrispyFlour("2", "flour 2", LocalDate.of(2022, 2, 1), 21000, 1);
        Material c3 = new CrispyFlour("3", "flour 3", LocalDate.of(2023, 3, 1), 23000, 5);
        Material c4 = new CrispyFlour("4", "flour 4", LocalDate.of(2025, 4, 1), 24000, 3);
        Material c5 = new CrispyFlour("5", "flour 5", LocalDate.of(2025, 5, 1), 25000, 2);

        Material m1 = new Meat("6", "meat 1", LocalDate.of(2000, 9, 8), 25000, 4);
        Material m2 = new Meat("7", "meat 2", LocalDate.of(2000, 9, 8), 25000, 4);
        Material m3 = new Meat("8", "meat 3", LocalDate.of(2000, 9, 8), 25000, 4);
        Material m4 = new Meat("9", "meat 4", LocalDate.of(2000, 9, 8), 25000, 4);
        Material m5 = new Meat("10", "meat 5", LocalDate.of(2000, 9, 8), 25000, 4);
//        System.out.println(c1);
        List<Material> materialList = new ArrayList<>();
        materialList.add(c1);
        materialList.add(c2);
        materialList.add(c3);
        materialList.add(c4);
        materialList.add(c5);
        materialList.add(m1);
        materialList.add(m2);
        materialList.add(m3);
        materialList.add(m4);
        materialList.add(m5);

        MaterialManager materialManager = new MaterialManager();
        materialManager.setMaterialList(materialList);

        materialManager.displayMaterial();
        materialManager.deleteMaterial(c2);
        materialManager.displayMaterial();
        Material c6 = new CrispyFlour("11", "flour 5", LocalDate.of(2025, 5, 1), 25000, 2);
        materialManager.addMaterial(c6);
        materialManager.displayMaterial();
        }
    }