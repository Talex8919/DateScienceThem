package kg.megacome.course;


import kg.megacome.course.Parent.Car;
import kg.megacome.course.Children.*;
import kg.megacome.course.ComparatorsCodes.*;
import kg.megacome.course.ComparatorsCodes.CostHyndai;
import kg.megacome.course.Enum.TypeOfCar;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        ZoneId zoneGer= ZoneId.of("Europe/Berlin");
        ZoneId zoneJap= ZoneId.of("Asia/Tokyo");
        ZoneId zoneKor= ZoneId.of("Asia/Seoul");
        ZoneId zoneUsa= ZoneId.of("America/St_Johns");

       LocalDate startDayofBmw7= LocalDate.of(2018,8,25);
       LocalDate endDateBmw7= LocalDate.of(2028, 8,25);
       Period warrantyPeriodBmw7 = Period.between(startDayofBmw7,endDateBmw7);

        LocalDate startDayofBmw3= LocalDate.of(2016,1,22);
        LocalDate endDateBmw3= LocalDate.of(2026, 1,22);
        Period warrantyPeriodBmw3 = Period.between(startDayofBmw3,endDateBmw3);

        LocalDate startDayofBmw3Gt= LocalDate.of(2020,9,15);
        LocalDate endDateBmw3Gt= LocalDate.of(2030, 9,15);
        Period warrantyPeriodBmw3Gt = Period.between(startDayofBmw3Gt,endDateBmw3Gt);

        LocalDate startDayofBmwX2= LocalDate.of(2017,6,19);
        LocalDate endDateBmwX2= LocalDate.of(2027, 6,19);
        Period warrantyPeriodBmwX2 = Period.between(startDayofBmwX2,endDateBmwX2);

        LocalDate startDayofBmwX10= LocalDate.of(2017,6,19);
        LocalDate endDateBmwX10= LocalDate.of(2027, 6,19);
        Period warrantyPeriodBmwX10 = Period.between(startDayofBmwX10,endDateBmwX10);

        ZonedDateTime zoneDateTimeBmwX10=ZonedDateTime.of(2020,9,15,8,30,30,4585,zoneGer);
        ZonedDateTime zoneDateTimeBmwX2=ZonedDateTime.of(2017,6,19,15,45,45,4585,zoneGer);
        ZonedDateTime zoneDateTimeBmw3Gt=ZonedDateTime.of(2020,9,15,8,30,30,4585,zoneGer);
        ZonedDateTime zoneDateTimeBmw3=ZonedDateTime.of(2016,1,22,18,25,30,1385,zoneGer);
        ZonedDateTime zoneDateTimeBmw7=ZonedDateTime.of(2018,8,25,15,59,30,1285,zoneGer);
        Bmw bmw7 = new Bmw("Bmw 7", zoneDateTimeBmw7,30500,"Germany",warrantyPeriodBmw7,true,"Metal-Red",TypeOfCar.COUPE);
        Bmw bmw3= new Bmw("Bmw 3",zoneDateTimeBmw3,45000, "Germany",warrantyPeriodBmw3,true, "Metalic-Blue", TypeOfCar.SEDAN);
        Bmw bmw3Gt= new Bmw("Bmw Grand Turizmo",zoneDateTimeBmw3Gt,75000, "Germany",warrantyPeriodBmw3Gt,true, "Black Metall", TypeOfCar.HATCHBACK  );
        Bmw x2= new Bmw("Bmw X 2 Crossover",zoneDateTimeBmwX2,100000, "Germany",warrantyPeriodBmwX2,false, "Mixed", TypeOfCar.SUV);
        Bmw x10= new Bmw("Bmw x10",zoneDateTimeBmwX10,150000, "Germany",warrantyPeriodBmwX10,false ,"Blood Red", TypeOfCar.SPORTCAR);


        ZonedDateTime zoneDateTimeCorola=ZonedDateTime.of(2019,5,30,13,46,30,8515,zoneJap);
        ZonedDateTime zoneDateTimeFortuner=ZonedDateTime.of(2017,4,29,16,35,12,3282,zoneJap);
        ZonedDateTime zoneDateTimeChr=ZonedDateTime.of(2015,11,17,15,16,40,9515,zoneJap);
        ZonedDateTime zoneDateTimeHighlander=ZonedDateTime.of(2020,10,19,10,39,29,4525,zoneJap);
        ZonedDateTime zoneDateTimeTrd=ZonedDateTime.of(2018,6,14,16,25,02,7825,zoneJap);




        LocalDate startDayCorola= LocalDate.of(2019,5,30);
        LocalDate endDateCorola= LocalDate.of(20279, 5,30);
        Period warrantyPeriodCorola = Period.between(startDayCorola,endDateCorola);

        LocalDate startDayFortuner= LocalDate.of(2017,4,29);
        LocalDate endDateFortuner= LocalDate.of(2027, 4,29);
        Period warrantyPeriodFortuner = Period.between(startDayFortuner,endDateFortuner);

        LocalDate startDayHighlander= LocalDate.of(2020,10,19);
        LocalDate endDateHighlander= LocalDate.of(2030, 10,19);
        Period warrantyPeriodHighlander = Period.between(startDayHighlander,endDateHighlander);

        LocalDate startDayChr= LocalDate.of(2015,11,17);
        LocalDate endDateChr= LocalDate.of(2025, 11,17);
        Period warrantyPeriodChr = Period.between(startDayChr,endDateChr);

        LocalDate startDayTrd= LocalDate.of(2018,6,14);
        LocalDate endDateTrd= LocalDate.of(2028, 6,14);
        Period warrantyPeriodTrd = Period.between(startDayTrd,endDateTrd);


        Toyota corolla= new Toyota(" Corolla -Toyota ",zoneDateTimeCorola,25000, "Japan",warrantyPeriodCorola,true, "Black", TypeOfCar.COUPE);
        Toyota fortuner= new Toyota(" Fortuner -Toyota",zoneDateTimeFortuner,75000, "Japan",warrantyPeriodFortuner,true, "Metalic-Blue", TypeOfCar.SUV);
        Toyota highlander= new Toyota(" Highlander- Toyota",zoneDateTimeHighlander,100000, "Japan",warrantyPeriodHighlander,false, "Black Metal", TypeOfCar.HATCHBACK  );
        Toyota chr= new Toyota(" CH-R- Toyota",zoneDateTimeChr,45000, "Japan",warrantyPeriodChr,false, "Mixed", TypeOfCar.SEDAN);
        Toyota trd= new Toyota("Trd - Toyota",zoneDateTimeTrd, 180000, "Japan",warrantyPeriodTrd,false,"Dark Purple", TypeOfCar.SPORTCAR);

        ZonedDateTime zoneDateTimeElantra=ZonedDateTime.of(2016,3,19,20,32,45,2565,zoneKor);
        ZonedDateTime zoneDateTimeCreta=ZonedDateTime.of(2019,2,28,17,35,12,8521,zoneKor);
        ZonedDateTime zoneDateTimeI30N=ZonedDateTime.of(2014,12,13,11,46,50,4528,zoneKor);
        ZonedDateTime zoneDateTimeGenesisCoupe=ZonedDateTime.of(2015,6,19,16,31,29,1568,zoneKor);
        ZonedDateTime zoneDateTimeHr300=ZonedDateTime.of(2020,8,4,16,21,41,9535,zoneKor);

        LocalDate startDayElantra= LocalDate.of(2016,3,19);
        LocalDate endDateElantra= LocalDate.of(2026, 3,19);
        Period warrantyElantra = Period.between(startDayElantra,endDateElantra);

        LocalDate startDayCreta= LocalDate.of(2019,2,28);
        LocalDate endDateCreta= LocalDate.of(2029, 2,28);
        Period warrantyPeriodCreta = Period.between(startDayCreta,endDateCreta);

        LocalDate startDayI30N= LocalDate.of(2014,12,13);
        LocalDate endDateI30N= LocalDate.of(2024, 12,13);
        Period warrantyPeriodI30N = Period.between(startDayI30N,endDateI30N);

        LocalDate startDayGenesisCoupe= LocalDate.of(2015,6,19);
        LocalDate endDateGenesisCoupe= LocalDate.of(2025, 6,19);
        Period warrantyPeriodGenesisCoupe = Period.between(startDayGenesisCoupe,endDateGenesisCoupe);

        LocalDate startDayHr300= LocalDate.of(2020,8,4);
        LocalDate endDateHr300= LocalDate.of(2030, 8,4);
        Period warrantyPeriodHr300 = Period.between(startDayHr300,endDateHr300);


        Hyundai elantra= new Hyundai("Hyundai Elantra",zoneDateTimeElantra,20000, "South Korea",warrantyElantra,true, "Black", TypeOfCar.COUPE);
        Hyundai creta= new Hyundai("Hyundai Creta",zoneDateTimeCreta,75000, "South Korea",warrantyPeriodCreta,true, "Metalic-Blue", TypeOfCar.SUV);
        Hyundai i30n= new Hyundai("Hyundai I30N",zoneDateTimeI30N,85000, "South Korea",warrantyPeriodI30N,true, "Black Metal", TypeOfCar.HATCHBACK  );
        Hyundai genesisCoupe= new Hyundai("Hyundai Genesis Coupe",zoneDateTimeGenesisCoupe,45000, "South Korea",warrantyPeriodGenesisCoupe,false, "Mixed", TypeOfCar.SEDAN);
        Hyundai hr300= new Hyundai( "Hyundai HR-300",zoneDateTimeHr300,180000, "Japan",warrantyPeriodHr300,true, "Dark Purple", TypeOfCar.SPORTCAR);

        ZonedDateTime zoneDateTimeRsx=ZonedDateTime.of(2016,6,28,21,22,35,3695,zoneUsa);
        ZonedDateTime zoneDateTimeTlx=ZonedDateTime.of(2018,7,19,16,45,30,8514,zoneUsa);
        ZonedDateTime zoneDateTimeMdx=ZonedDateTime.of(2020,5,6,16,41,50,2584,zoneUsa);
        ZonedDateTime zoneDateTimeRdx=ZonedDateTime.of(2019,1,20,15,47,52,4821,zoneUsa);
        ZonedDateTime zoneDateTimeNsx=ZonedDateTime.of(2016,8,30,19,24,41,2530,zoneUsa);

        LocalDate startDayRsx= LocalDate.of(2016,6,28);
        LocalDate endDateRsx= LocalDate.of(2026, 6,28);
        Period warrantyPeriodRsx = Period.between(startDayRsx,endDateRsx);

        LocalDate startDayTlx= LocalDate.of(2018,7,19);
        LocalDate endDateTlx= LocalDate.of(2028, 7,19);
        Period warrantyPerioTlx = Period.between(startDayTlx,endDateTlx);

        LocalDate startDayMdx= LocalDate.of(2020,5,6);
        LocalDate endDateMdx= LocalDate.of(2030, 5,6);
        Period warrantyPeriodMdx = Period.between(startDayMdx,endDateMdx);

        LocalDate startDayRdx= LocalDate.of(2019,1,20);
        LocalDate endDateRdx= LocalDate.of(2029, 1,20);
        Period warrantyPeriodRdx = Period.between(startDayRdx,endDateRdx);

        LocalDate startDayNsx= LocalDate.of(2016,8,30);
        LocalDate endDateNsx= LocalDate.of(2026, 8,30);
        Period warrantyPeriodNsx = Period.between(startDayNsx,endDateNsx);

        Acura rsx=new Acura("Acura RSX",zoneDateTimeRsx,20000, "USA",warrantyPeriodRsx,true, "Black", TypeOfCar.COUPE);
        Acura tlx= new Acura("Acura TLX",zoneDateTimeTlx,75000, "USA",warrantyPerioTlx,true, "Metalic-Blue", TypeOfCar.SUV);
        Acura mdx= new Acura("Acura MDX",zoneDateTimeMdx,85000, "USA",warrantyPeriodMdx,false, "Black Metal", TypeOfCar.HATCHBACK  );
        Acura rdx= new Acura("Acura RDX",zoneDateTimeRdx,45000, "USA",warrantyPeriodRdx,false, "Mixed", TypeOfCar.SEDAN);
        Acura nsx= new Acura("Acura NSX",zoneDateTimeNsx,180000, "USA",warrantyPeriodNsx,false, "Dark Purple", TypeOfCar.SPORTCAR);

     ArrayList<Bmw> bmwCars= new ArrayList<>();
        bmwCars.add(bmw7);
        bmwCars.add(bmw3);
        bmwCars.add(bmw3Gt);
        bmwCars.add(x2);
        bmwCars.add(x10);
      bmwCars.forEach(System.out::println);

        System.out.println("________________" );
List<Toyota>toyotaCars= new ArrayList<>();
        toyotaCars.add(corolla);
        toyotaCars.add(fortuner);
        toyotaCars.add(highlander);
        toyotaCars.add(chr);
        toyotaCars.add(trd);
toyotaCars.forEach(System.out::println);

        System.out.println("________________" );
        List<Hyundai>hyndaiCars= new ArrayList<>();
        hyndaiCars.add(elantra);
        hyndaiCars.add(creta);
        hyndaiCars.add(i30n);
        hyndaiCars.add(genesisCoupe);
        hyndaiCars.add(hr300);
hyndaiCars.forEach(System.out::println);
        System.out.println("________________" );
        List<Acura>acuraCars= new ArrayList<>();
        acuraCars.add(rdx);
        acuraCars.add(rsx);
        acuraCars.add(tlx);
        acuraCars.add(mdx);
        acuraCars.add(nsx);
        acuraCars.forEach(System.out::println);


        LinkedList<Acura> usaBrands = new LinkedList<>();
        usaBrands.add(rdx);
        usaBrands.add(rsx);
        usaBrands.add(tlx);
        usaBrands.add(mdx);
        usaBrands.add(nsx);

        Acura acura = usaBrands.element();
        System.out.println(acura);

        usaBrands.forEach(System.out::println);
        System.out.println("______________________ All CarsIn1List");
ArrayList<Car> cars= new ArrayList<>();
cars.addAll(acuraCars);
cars.addAll(hyndaiCars);
cars.addAll(toyotaCars);
cars.addAll(bmwCars);
cars.forEach(System.out::println);

        System.out.println("__________BMW sort by cost");

        Collections.sort(bmwCars, new CostComparBmw());
        for (Bmw costbmw: bmwCars){
            System.out.println(costbmw.getModel() +" "+costbmw.getCarCost()+" "+costbmw.getTypeOfBmw());
        }
        System.out.println("__________________Toyota Sort by ModelName");
   Collections.sort(toyotaCars, new ModelCompare());
            for(Toyota nameOfToyota:toyotaCars ){
                System.out.println(nameOfToyota.getModel() +" "+nameOfToyota.getModel());
            }

        System.out.println("_______ sort Hyndai by cost");
            Collections.sort(hyndaiCars,new CostHyndai());
                for (Hyundai costHynday: hyndaiCars){
                    System.out.println(costHynday.getCarCost()+" "+costHynday.getModel()+" "+ costHynday.getTypeHyundaiEnum()+" "+ costHynday.getWarranty());
                }


        System.out.println("______________ Sort by ZoneDateTime");
Collections.sort(acuraCars, new CompareYearsAcura() {
    @Override
    public int compare(Acura o1, Acura o2) {
        return 0;
    }
});
for(Acura compareYears: acuraCars){
    System.out.println(compareYears.getYear()+ " "+ compareYears.getTypeOfAcura()+" "+ compareYears.getModel());
}
        System.out.println("______________ Sort by Is Hybrid");
/*Collections.sort(toyotaCars , new isHibrydCompare() {
    @Override
    public int compare(Toyota o1, Toyota o2) {
        return 0;
    }
});*/


        System.out.println("_-----------_ masseraty List");

        ZoneId zoneItaly=ZoneId.of("Europe/Rome");

        LocalDate startDayoflavante= LocalDate.of(2019,10,25);
        LocalDate endDateLavante= LocalDate.of(2029, 10,25);
        Period warrantyPeriodLavante = Period.between(startDayoflavante,endDateLavante);
        System.out.println("_____________ LocalDate+ SimpleDateFormat + Calender");
        Calendar calLavente= new GregorianCalendar();
        calLavente.set(2018,Calendar.JANUARY,25);
LocalTime time=LocalTime.of(15,43,15);
LocalDateTime hasKyrgCarSaleBranch =  LocalDateTime.of(2020,Calendar.DECEMBER,15,15,35);

        String pattern1 = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormats = new SimpleDateFormat(pattern1);
        simpleDateFormats.setCalendar(calLavente);
        String calCalLavente = simpleDateFormats.format(calLavente.getTime());
        System.out.println("______________________________");

ZonedDateTime currentTimeOfExplode=  ZonedDateTime.now();
        Maserati lavante = new Maserati(TypeOfCar.SUV,calCalLavente,warrantyPeriodLavante,time,hasKyrgCarSaleBranch,currentTimeOfExplode,zoneItaly);
        System.out.println( "_____________________ZoneId");
        ZoneId zoneItalys=ZoneId.of("Europe/Copenhagen");
        System.out.println("______________");
        System.out.println("__________________________ LocalDate +Period");
        LocalDate startDayofQattroporte= LocalDate.of(2020,8,25);
        LocalDate endDateQattroporte= LocalDate.of(2030, 8,25);
        Period warrantyPeriodQattroporte = Period.between(startDayofQattroporte,endDateQattroporte);

        System.out.println("___________________________");
        GregorianCalendar calLQattroporte = new GregorianCalendar(2018, 6, 28,15,45,55);


        LocalTime timeCureent=LocalTime.of(13,03,55);

        LocalDateTime hasKzCarSaleBranch =  LocalDateTime.of(2020,Calendar.FEBRUARY,10,13,50);
        System.out.println("_____________ LocalDate+ SimpleDateFormat");
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormata = new SimpleDateFormat(pattern);
        simpleDateFormata.setCalendar(calLQattroporte);
        String caleKzCarSale = simpleDateFormata.format(calLQattroporte.getTime()) ;
        System.out.println("_________________");
        ZonedDateTime currentTimeOfExplodeOf=  ZonedDateTime.now();

        Maserati qattroporte= new Maserati(TypeOfCar.SEDAN,caleKzCarSale,warrantyPeriodQattroporte,timeCureent,hasKzCarSaleBranch,currentTimeOfExplodeOf,zoneItalys);

        ArrayList<Maserati>maseratisCar = new ArrayList<>();
        maseratisCar .add(lavante);
        maseratisCar.add(qattroporte);
        maseratisCar.forEach(System.out::println);

        System.out.println("_____________Methods");

        int date= LocalDate.now().getDayOfMonth();
        System.out.println(date);
        System.out.println("________");
        Instant example=Clock.system(zoneItalys).instant();
        System.out.println(example.toString());

        System.out.println("________ to UTC");

        Instant instant2 = Clock.systemUTC().instant();
        System.out.println(instant2.toString());
        System.out.println("_____________LocalDate");
        int dayofBmw= startDayofBmwX10.getDayOfYear();
        System.out.println(dayofBmw);
        Month month=startDayofBmwX10.getMonth();
        System.out.println("Month when  Bmw 7 is Manufactured " + month );
        System.out.println("_____________LocalDateTime");

        int dayOfM =hasKzCarSaleBranch.getDayOfMonth();
        int dayOfY=hasKzCarSaleBranch.getDayOfYear();
        Month month1 =hasKzCarSaleBranch.getMonth();
       DayOfWeek day= hasKzCarSaleBranch.getDayOfWeek();

        System.out.println("Day of  the month When it arrived "+ dayOfM);
        System.out.println("Day of the Year When it arrived "+dayOfY);
        System.out.println("(String)Month When it arrived "+ month1);
        System.out.println("(String) , Month when it arrived  "+ day);



        }
        }





