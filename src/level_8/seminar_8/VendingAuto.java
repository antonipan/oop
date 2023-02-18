package level_8.seminar_8;

import java.util.*;

public class VendingAuto {
    private List <Product> list;
    private int maxCell;
    private int cell;


    public VendingAuto (int maxCell) {
        this.maxCell = maxCell;
        this.list = new LinkedList<>();
        this.cell = 0;
    }
    /* добавление продукта */
    public void addProductToVending (Product product) {
        if (cell < maxCell) {
            cell++;
            list.add(product);
        } else {
            System.out.println("the vending machine is full");
        }
    }
    // получить количество свободных позиций
    public void getFreeCell () {
        System.out.println ("Free cell is: " + (maxCell - cell));
    }

    // считает стоиость всех продуктов в автомате
    public void getCostAllProduct () {
        double summ = 0;
        for (Product product : list
             ) {
            summ = summ + product.getCost();
        }
        System.out.printf("Summa = %f", summ);
    }

    public void buyProduct () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вставьте купюру в купюроприёмник: ");
        double cuper = Double.parseDouble(scanner.nextLine());
        boolean swich = false;
        for (Product product : list
             ) {
            if (cuper > product.getCost()) {
                System.out.print(product);
                swich = true;
            }
        }
        if (swich) {
            System.out.println("Выберете продукт из списка написав его как в названии");
            String nn = scanner.nextLine();
            for (Product product : list
                 ) {
                if (product.getName().equals(nn)) {
                    list.remove(product);
                    cuper = cuper - product.getCost();
                    cell--;
                    break;
                }
            }
        } else {
            System.out.println("Вам не хватает средств");
        }
        System.out.println("Ваши средства " + cuper);
    }
    @Override
    public String toString() {
        String lis = list.toString();
        return lis;
    }
}
