public class CarsAssemble {

    public double productionRatePerHour(int speed) {
       double carsInOneHour = 221.0;

       if (speed >= 5 && speed <= 8) {
           carsInOneHour = carsInOneHour * 0.9;
       } else if (speed == 9) {
           carsInOneHour = carsInOneHour * 0.8;
       }  else if (speed == 10) {
           carsInOneHour = carsInOneHour * 0.77;
       }

        return speed * carsInOneHour;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
