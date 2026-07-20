package patterns.observerPattern.Wetter;

public class PhoneDisplay implements Observers {

    int displayTemp;

    @Override
    public void update(WeatherStation infoStation) {
        displayTemp = infoStation.getTemperature();
        System.out.println("Phone:\nNeue Temperatur: "+ displayTemp +"°");

    }

    public int getDisplayTemp() {
        return displayTemp;
    }

    public void showDisplayTemp() {
        System.out.println("Phone:\nTemperatur: "+ displayTemp +"°");
    }
}
