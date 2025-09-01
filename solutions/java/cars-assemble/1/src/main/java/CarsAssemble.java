public class CarsAssemble {

    private static int CARS_PRODUCED_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {
        if(speed > 0 && speed < 5){
            return speed * CARS_PRODUCED_PER_HOUR;
        }
        else if(speed > 4 && speed < 9){
            return (speed * CARS_PRODUCED_PER_HOUR) * 0.90 ;
        }
        else if (speed == 9){
            return (speed * CARS_PRODUCED_PER_HOUR) * 0.8;
        }
        return (speed * CARS_PRODUCED_PER_HOUR) * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
