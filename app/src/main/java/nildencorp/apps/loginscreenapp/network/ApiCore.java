package nildencorp.apps.loginscreenapp.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCore {
    public static ServerApi getApiClient() {

        //        OkHttpClient.Builder builder = new OkHttpClient.Builder()
//                .connectTimeout(15, TimeUnit.SECONDS)
//                .writeTimeout(60, TimeUnit.SECONDS)
//                .readTimeout(60, TimeUnit.SECONDS)
//                .retryOnConnectionFailure(true);
//        OkHttpClient mHttpClient = builder.build();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ServerApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return retrofit.create(ServerApi.class);
    }
}
