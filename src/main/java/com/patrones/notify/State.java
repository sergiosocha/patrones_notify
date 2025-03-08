package com.patrones.notify;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClient;

public abstract class Steate{
    private final Notifier notifier;
    private final RestClient restClient;
    private String urlProveedor;

    public State(Notifier notifier){
        this.notifier = notifier;
    }
}




