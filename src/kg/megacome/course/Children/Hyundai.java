package kg.megacome.course.Children;

import kg.megacome.course.Parent.Car;
import kg.megacome.course.Enum.TypeOfCar;

import java.time.Period;
import java.time.ZonedDateTime;

public class Hyundai extends Car {

    private TypeOfCar TypeHyundaiEnum;

    public TypeOfCar getTypeHyundaiEnum() {
        return TypeHyundaiEnum;
    }

    public void setTypeHyundaiEnum(TypeOfCar typeHyundaiEnum) {
        TypeHyundaiEnum = typeHyundaiEnum;
    }


    public Hyundai(TypeOfCar typeHyundaiEnum) {
        TypeHyundaiEnum = typeHyundaiEnum;
    }

    public Hyundai(String model, ZonedDateTime year, int carCost, String country, Period warranty, boolean isHybrid, String color, TypeOfCar typeHyundaiEnum) {
        super(model, year, carCost, country, warranty, isHybrid, color);
        TypeHyundaiEnum = typeHyundaiEnum;
    }
}
