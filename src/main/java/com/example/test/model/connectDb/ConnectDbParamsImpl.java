package com.example.test.model.connectDb;

import lombok.Data;

@Data
public class ConnectDbParamsImpl implements ConnectDbParams {
    String Url;
    String User;
    String Password;

}
