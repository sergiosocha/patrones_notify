package com.patrones.notify;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NotificationClient {

    private final RestTemplate restTemplate = new RestTemplate();

    private static final String SERVICIO_A_URL = "http://localhost:8080/mock/servicioA";
    private static final String SERVICIO_B_URL = "http://localhost:8080/mock/servicioB";

    public String enviarNotificacion(String mensaje, String destino) {
        String url = destino.equalsIgnoreCase("servicioA") ? SERVICIO_A_URL : SERVICIO_B_URL;
        return restTemplate.postForObject(url, mensaje, String.class);
    }
}
