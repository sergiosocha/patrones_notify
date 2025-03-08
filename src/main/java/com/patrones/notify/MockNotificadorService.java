package com.patrones.notify;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MockNotificadorService {

    @PostMapping("/servicioA")
    public String servicioA(@RequestBody String mensaje) {
        System.out.println("📨 Notificación a ServicioA: " + mensaje);
        return "ServicioA 200";
    }

    @PostMapping("/servicioB")
    public String servicioB(@RequestBody String mensaje) {
        System.out.println("📨 Notificación a ServicioB: " + mensaje);
        return "ServicioB 200";
    }
}
