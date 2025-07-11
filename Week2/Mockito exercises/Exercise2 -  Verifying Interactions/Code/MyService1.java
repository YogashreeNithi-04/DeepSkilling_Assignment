package com.example;

public class MyService1 {
    private ExternalApi1 api;

    public MyService1(ExternalApi1 api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}