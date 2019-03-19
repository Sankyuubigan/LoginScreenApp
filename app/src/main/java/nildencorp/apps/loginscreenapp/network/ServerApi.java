package nildencorp.apps.loginscreenapp.network;

import nildencorp.apps.loginscreenapp.model.ResponseObject;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ServerApi {
    String BASE_URL = "https://samples.openweathermap.org/data/2.5/";

    @GET("weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22")
    Call<ResponseObject> getWeather();


}