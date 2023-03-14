public class ServiceStation {
    public void check(Car car) {
        if (car != null) {
            checkWheeledTransport(car);
            checkEngine(car);
        }
    }
    public void check(Bicycle bicycle) {

        if (bicycle != null) {
           checkWheeledTransport(bicycle);
            }
        }

    public void check( Truck truck) {

         if (truck != null) {
            checkWheeledTransport(truck);
            }
            checkEngine(truck);
            truck.checkTrailer();
        }

    private void checkWheeledTransport(WheeledTransport wheeledTransport) {
        System.out.println("Обслуживаем " + wheeledTransport.getModelName());
        for (int i = 0; i < wheeledTransport.getWheelsCount(); i++) {
            wheeledTransport.updateTyre();
        }
    }
    private void checkEngine (Enginable enginable) {
        enginable.checkEngine();
    }

}
