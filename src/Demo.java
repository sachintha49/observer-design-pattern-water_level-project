import javafx.application.Application;
import javafx.scene.control.Slider;
import java.util.Random;

public class Demo {
    public Slider sliderValue;

    public static void main(String[] args) {

        WaterLevelObservable waterLevelObservable = new WaterLevelObservable();
        waterLevelObservable.addWaterLevelObserver(new Alarm());
        waterLevelObservable.addWaterLevelObserver(new Display());
        waterLevelObservable.addWaterLevelObserver(new SMSSender());
        waterLevelObservable.addWaterLevelObserver(new SMSSender());

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int waterLevel = random.nextInt(100);
            waterLevelObservable.setWaterLevel(waterLevel);
        }

    }
}
