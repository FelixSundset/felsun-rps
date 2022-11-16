package parkingGarage;

public abstract class Vehicle {

    protected int yearOfManufacturing;

    protected String color;


    protected String licenseNum;

    public Vehicle(int yearOfManufacturing, String color, String licenseNum){
        this.yearOfManufacturing = yearOfManufacturing;
        this.color = color;
        this.licenseNum = licenseNum;
    }

    @Override
    public String toString(){
        return licenseNum;
    }

}
