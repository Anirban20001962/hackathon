package com.example.bookingapp.response;

public class DataResponse {
    public String msg;
    public Object data;

    public DataResponse(String msg, Object data) {
        this.msg = msg;
        this.data = data;
    }
}
