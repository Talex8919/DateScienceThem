package kg.megacome.course.ComparatorsCodes;

import kg.megacome.course.Children.*;

import java.util.Comparator;


public class CostComparBmw  implements Comparator<Bmw> {
    public int compare(Bmw bmwCost1 , Bmw bmwCost2){
        if(bmwCost1.getCarCost()== bmwCost2.getCarCost()){
            return 0;
        }
        else if (bmwCost1.getCarCost()> bmwCost2.getCarCost()){
            return 1;
        }
        else return -1;
    }
}