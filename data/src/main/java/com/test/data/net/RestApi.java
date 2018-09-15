package com.test.data.net;

import com.test.data.entity.DeleteResponse;
import com.test.data.entity.UserRequest;
import com.test.data.entity.UserResponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RestApi {

    @GET("data/User")
    Observable<List<UserResponse>> getAllUsers();

    @GET("data/User/{id}")
    Observable<UserResponse> getUser(@Path("id") String id);

    @POST("data/User/")
    Observable<UserResponse> updateUser(@Body UserRequest user);

    @DELETE("data/User/{id}")
    Observable<DeleteResponse> deleteUser(@Path("id") String id);
}
