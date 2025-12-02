public class JedliksToyCar {
    public int meters = 0;
    public int battery = 100;

    public static JedliksToyCar buy() {

        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", meters);

    }

    public String batteryDisplay() {
        if (this.battery > 0) {
            return String.format("Battery at %d%%", battery);
        }  else {
            return "Battery empty";
        }

    }

    public void drive() {
        if (this.battery > 0) {
            this.battery -= 1;
            this.meters += 20;
        }

    }
}
