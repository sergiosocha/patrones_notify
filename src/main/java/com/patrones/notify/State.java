package com.patrones.notify;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClient;

public abstract State {

    private final Notifier notifier;
    private final RestClient restClient;
    private String urlProveedor;
    private String nombreProveedor;

    public State(Notifier notifier){

    }
}
