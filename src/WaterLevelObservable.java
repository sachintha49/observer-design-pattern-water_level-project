import java.util.ArrayList;
//this is an encapsulated class
public class WaterLevelObservable {
    // need to make an ArrayList from interface WaterLevelObserver(it is all other classes super interface
    private ArrayList<WaterLevelObserver> observerArrayList = new ArrayList<>();
    private int waterLevel;

    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        observerArrayList.add(waterLevelObserver);
    }

    public void notifyObservers(){
        for (WaterLevelObserver wtrLvlObsList : observerArrayList){
            wtrLvlObsList.update(waterLevel);
        }
    }

    public void setWaterLevel(int waterLevel){
        if (this.waterLevel != waterLevel){
            this.waterLevel = waterLevel;
            notifyObservers();
        }
    }
}
