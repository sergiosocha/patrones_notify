package com.patrones.notify.controller;

import com.patrones.notify.NotificadorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notificar")
public class NotificadorController {

    private final NotificadorService notificadorService;

    public NotificadorController(NotificadorService notificadorService) {
        this.notificadorService = notificadorService;
    }

    @PostMapping("/{destino}")
    public String notificar(@PathVariable String destino, @RequestBody String mensaje) {
        return notificadorService.enviarNotificacion(mensaje, destino);
    }
}
