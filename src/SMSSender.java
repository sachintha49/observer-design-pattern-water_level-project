public class SMSSender implements WaterLevelObserver{

    @Override
    public void update(int waterLevel) {
        System.out.println("Sending water level : "+waterLevel);
    }
}
