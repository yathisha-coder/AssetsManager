package org.example;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost,String makeModel,int year,int odometer){
        super(description,dateAcquired,originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }
    public String getMakeModel(){
        return makeModel;
    }
    public void setMakeModel(String makeModel){
        this.makeModel = makeModel;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getOdometer(){
        return odometer;
    }
    public void setOdometer(int odometer){
        this.odometer = odometer;
    }
    @Override
    public double getValue() {
//        int currentYear = year.now().getValue();
//        int age = currentYear - year;
        double value = getOriginalCost();
        if (year>= 0 && year <= 3) {
           value -= value * (0.03 * year);
        } else if (year >= 4 && year <= 6) {
           value -= value * (0.06 * year);
        } else if (year >= 7 && year<=10) {
            value -= value * (0.08 * year);
        } else  {
           value = value -1000;
        }
        if (odometer > 100000){
            if(!makeModel.contains("Honda") &&
            !makeModel.contains("Toyota")){
                value *= 0.75;
            }
        }
        return value;
    }
}



