public class Display implements WaterLevelObserver{
    @Override
    public void update(int waterLevel) {
        System.out.println("Water level is :"+waterLevel);
     }
}
