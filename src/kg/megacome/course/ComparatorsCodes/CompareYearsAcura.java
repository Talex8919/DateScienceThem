package kg.megacome.course.ComparatorsCodes;

import kg.megacome.course.Children.Acura;

import java.util.Comparator;

public abstract class CompareYearsAcura implements Comparator<Acura> {
    public long yearSelection(Acura zoneDateTime1, Acura zoneDateTime2) {

        return zoneDateTime1.getYear().compareTo(zoneDateTime2.getYear());
    }
}
