public class App {
    public static void main(String [] args){
        VehicleFactory vFactory = new VehicleFactory();
        Vehicle vehicle = vFactory.getVehicle(VehicleType.TRUCK);
        vehicle.startEngine();

    }
}
