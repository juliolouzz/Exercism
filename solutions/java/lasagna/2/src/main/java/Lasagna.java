public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }

     public int remainingMinutesInOven(int howLongInOven) {
        return expectedMinutesInOven() - howLongInOven;
    }

    public int preparationTimeInMinutes(int numLayers) {
        return numLayers * 2;
    }

    public int totalTimeInMinutes(int numLayers, int howLongInOven) {
        return preparationTimeInMinutes(numLayers) + howLongInOven;
    }
}
