package kg.megacome.course.ComparatorsCodes;

import kg.megacome.course.Children.Hyundai;

import java.util.Comparator;


    public class CostHyndai  implements Comparator<Hyundai> {
        public int compare(Hyundai hyndaiCost1, Hyundai hyndaiCost2) {
            if (hyndaiCost1.getCarCost() == hyndaiCost2.getCarCost()) {
                return 0;
            } else if (hyndaiCost1.getCarCost() > hyndaiCost1.getCarCost()) {
                return 1;
            } else return -1;
        }
    }


