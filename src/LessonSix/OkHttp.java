package LessonSix;

import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OkHttp extends Data{

    static Data data = new Data();

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .followRedirects(true)
                .retryOnConnectionFailure(true)
                .build();

        String authBodyString = "{" +
                "\"username\": \"eprohorova505@gmail.com\", " +
                "\"password\": \"Pea1998pea\"" +
                "}";
        System.out.println(authBodyString);
        RequestBody authBody = RequestBody.create(authBodyString, MediaType.parse("application/json"));

        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/locations/v1/cities/search")
                .build();
        Response response = client.newCall(request).execute();

        String body = response.body().string();

        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.isRedirect());
        System.out.println(response.isSuccessful());
        System.out.println(response.protocol());
        System.out.println(response.receivedResponseAtMillis());

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("accuweather.com")
                .addPathSegment(data.getForecast())
                .addPathSegment(data.getApiVersion())
                .addPathSegment(data.getForecastType())
                .addPathSegment(data.getForecastPeriod())
                .addPathSegment(data.getSaintPetersburgKey())
                .addQueryParameter("apikey", data.getApiKey())
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

        System.out.println(url.toString());

        // При необходимости указать заголовки
        Request requesthttp = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        String jsonResponse = client.newCall(requesthttp).execute().body().string();
        System.out.println(jsonResponse);



    }
}
