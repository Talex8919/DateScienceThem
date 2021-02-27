package kg.megacome.course.ComparatorsCodes;

import kg.megacome.course.Children.Toyota;

import java.util.Comparator;


public class ModelCompare implements Comparator<Toyota> {
        public int compare(Toyota toyotaModel1 ,Toyota toyotaModel2) {

            return toyotaModel1.getModel().compareTo(toyotaModel2.getModel()) ;
        }

    }

