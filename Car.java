public class Car{
     final String brand;
     final String engineType;
    final String transmission;
    final String color;
    final Integer passengerCapacity;

    private Car(CarBuilder builder){
        this.brand = builder.brand;
        this.engineType = builder.engineType;
        this.transmission=builder.transmission;
        this.color = builder.color;
        this.passengerCapacity = builder.passengerCapacity;
        
    }
   public static class CarBuilder {
    private String brand;
    private String engineType;
    private String transmission;
    private String color;
    private Integer passengerCapacity;

    public CarBuilder brand(String brand){
        this.brand = brand;
        return this;

    }
    public CarBuilder engineType(String engineType){
        this.engineType = engineType;
        return this;

    }
    public CarBuilder transmission(String transmission){
        this.transmission = transmission;
        return this;
    }
    public CarBuilder color (String color){
        this.color = color;
        return this;
    }
    public CarBuilder passengerCapacity (Integer passengerCapacity){
        this.passengerCapacity = passengerCapacity;
        return this;
    }
    public Car build() {
        return new Car(this);
    }
   
    }
   }

