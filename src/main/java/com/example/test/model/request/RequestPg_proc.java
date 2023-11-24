package com.example.test.model.request;

import com.example.test.model.connectDb.ConnectDbParamsImpl;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.lang.reflect.Array;

@Data
public class RequestPg_proc extends ConnectDbParamsImpl {
    @JsonProperty("proname")
    String proname;
    @JsonProperty("pronamespace")
    Array pronamespace;

}
