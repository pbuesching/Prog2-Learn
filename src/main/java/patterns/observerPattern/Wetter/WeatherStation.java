package patterns.observerPattern.Wetter;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class WeatherStation {

    List<Observers> observers;
    int temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
        temperature = 20;
    }

    public void getNewTemperature() {
        temperature = new Random().nextInt(40);
        updateObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public void abonnieren(Observers o) {
        observers.add(o);
    }

    public void deabonnieren(Observers o) {
        observers.remove(o);
    }

    public void updateObservers() {
        //Eigne Liste für die Iteration erstellen, da es während der Itaration zu veränderungen in der Globalen Liste kommen kann (z.b. Deabonnieren)
        List<Observers> observersList = new ArrayList<>(observers);
        for (Observers o : observersList) {
            o.update(this);
        }
    }
}
