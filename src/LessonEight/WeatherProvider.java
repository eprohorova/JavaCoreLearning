package LessonEight;

import LessonSeven.Periods;

import java.io.IOException;

public interface WeatherProvider {
    WeatherData getWeather(Periods periods) throws IOException;

    WeatherData getAllFromDb() throws IOException;
}
