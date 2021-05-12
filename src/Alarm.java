public class Alarm implements WaterLevelObserver {
    @Override
    public void update(int waterLevel) {
        System.out.println(waterLevel >= 50 ? "Alarm ON":"Alarm OFF");
    }
}
