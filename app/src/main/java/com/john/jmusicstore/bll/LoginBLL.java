package com.john.jmusicstore.bll;

import com.john.jmusicstore.api.UserAPI;
import com.john.jmusicstore.server_response.SignUpResponse;
import com.john.jmusicstore.url.URL;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class LoginBLL {
    boolean isSuccessful = false;

    public boolean checkUser(String phone, String password) {

        UserAPI usersAPI = URL.getInstance().create(UserAPI.class);
        Call<SignUpResponse> usersCall = usersAPI.checkUser(phone, password);

        try {
            Response<SignUpResponse> loginResponse = usersCall.execute();
            if (loginResponse.isSuccessful()) {
                URL.token += loginResponse.body().getToken();
                isSuccessful = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isSuccessful;
    }
}
