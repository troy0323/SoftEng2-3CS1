public class CarAssemble{
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder()
        .engineType("Diesel")
        .transmission("Manual")
        .color("Black")
        .passengerCapacity(4)
        .brand("Honda")
        .build();

        System.out.println(car1.brand);
        System.out.println(car1.engineType);
        System.out.println(car1.transmission);
        System.out.println(car1.color);
        System.out.println(car1.passengerCapacity);
    }
}