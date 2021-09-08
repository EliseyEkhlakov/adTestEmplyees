package api;

import io.reactivex.Observable;
import pojo.EmployeeResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("testTask.json")
     Observable<EmployeeResponse> getEmployees();
}
