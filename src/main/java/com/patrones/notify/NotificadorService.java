package com.patrones.notify;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificadorService {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String SERVICIO_A_URL = "http://localhost:8080/mock/servicioA";
    private static final String SERVICIO_B_URL = "http://localhost:8080/mock/servicioB";

    @CircuitBreaker(name = "notificador", fallbackMethod = "fallbackNotificacion")
    public String enviarNotificacion(String mensaje, String destino) {
        String url = destino.equalsIgnoreCase("servicioA") ? SERVICIO_A_URL : SERVICIO_B_URL;
        String response = restTemplate.postForObject(url, mensaje, String.class);
        return "✅ Respuesta de " + destino + ": " + response;
    }

    public String fallbackNotificacion(String mensaje, String destino, Throwable t) {
        return "⚠️ ERROR: No se pudo enviar la notificación a " + destino + ". Reintento en progreso...";
    }
}
