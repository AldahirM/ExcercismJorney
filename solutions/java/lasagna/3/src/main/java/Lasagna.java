public class Lasagna {

    private static int EXPECTED_MINUTES_IN_OVEN = 40;
    private static int PREPARATION_TIME_PER_LAYER = 2;

    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_IN_OVEN;
    }
    
    public int remainingMinutesInOven(int timeInOven){
        return expectedMinutesInOven() - timeInOven;
    }
    
    public int preparationTimeInMinutes(int layers){
        return PREPARATION_TIME_PER_LAYER * layers;
    }
    
    public int totalTimeInMinutes(int layers, int timeInOven){
        return preparationTimeInMinutes(layers) + timeInOven;
    }
}
