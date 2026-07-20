package patterns.observerPattern.Wetter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ObserverWetterTest {

    @Test
    public void testUpdateMethod() {
        WeatherStation weatherStation = new WeatherStation();
        WindowDisplay windowDisplay = new WindowDisplay();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        weatherStation.abonnieren(windowDisplay);
        weatherStation.abonnieren(phoneDisplay);

        weatherStation.getNewTemperature();
        int newTemp = weatherStation.getTemperature();

        assertEquals(newTemp, windowDisplay.getDisplayTemp());

    }

    @Test
    public void testDeabonnierenWindow() {
        WeatherStation weatherStation = new WeatherStation();
        WindowDisplay windowDisplay = new WindowDisplay();
        PhoneDisplay phoneDisplay = new PhoneDisplay();

        weatherStation.abonnieren(phoneDisplay);
        weatherStation.abonnieren(windowDisplay);


        weatherStation.getNewTemperature();

        assertFalse(weatherStation.observers.contains(windowDisplay));
    }
}
