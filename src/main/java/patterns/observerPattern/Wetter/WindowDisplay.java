package patterns.observerPattern.Wetter;

public class WindowDisplay implements Observers {

    int displayTemp;

    @Override
    public void update(WeatherStation infoStation) {
        displayTemp = infoStation.getTemperature();
        System.out.println("Window:\nNeue Temperatur: "+ displayTemp +"°");

        infoStation.deabonnieren(this);
    }

    public int getDisplayTemp() {
        return displayTemp;
    }

    public void showDisplayTemp() {
        System.out.println("Window:\nTemperatur: "+ displayTemp +"°");
    }
}
