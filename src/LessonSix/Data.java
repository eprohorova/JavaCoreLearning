package LessonSix;

public class Data {
    private String BaseHost = "developer.accuweather.com/";
    private String Forecast = "forecasts";
    private String ApiVersion = "v1";
    private String ForecastType = "daily";
    private String ForecastPeriod = "5day";
    private String SaintPetersburgKey = "Saint Petersburg";
    private String ApiKey = "nc9g8UXbSHisgBk0AqWfykwXAiiVutIM";

    public String getBaseHost() {
        return BaseHost;
    }

    public String getForecast() {
        return Forecast;
    }

    public String getApiVersion() {
        return ApiVersion;
    }

    public String getForecastType() {
        return ForecastType;
    }

    public String getForecastPeriod() {
        return ForecastPeriod;
    }

    public String getSaintPetersburgKey() {
        return SaintPetersburgKey;
    }

    public String getApiKey() {
        return ApiKey;
    }
}
