package CellPhone;

//The builder that is required for the builder design pattern
public class PhoneBuilder {
    
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    //Customize the phone
    
    public PhoneBuilder setOs (String os){
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam (int ram){
        this.ram = ram;
        return this; 
    }

    public PhoneBuilder setProcessor (String processor){
        this.processor = processor;
        return this; 
    }

    public PhoneBuilder setscreenSize (double screenSize){
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery (int battery){
        this.battery = battery;
        return this;
    }

    //Creates the phone
    public Phone getPhone() {
        return new Phone(os, ram, processor, screenSize, battery);
    }

}
