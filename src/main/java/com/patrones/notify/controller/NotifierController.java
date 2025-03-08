package com.patrones.notify.controller;


import com.patrones.notify.DTO.ResponseDTO;
import com.patrones.notify.NotifierService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NotifierController {

    private final NotifierService notifierService;

    public NotifierController(NotifierService notifierService) {
        this.notifierService = notifierService;

    }

    @CrossOrigin(origins = "*")
    @GetMapping("/notificar/{requestTime}")
    public ResponseDTO notifyRequest(@PathVariable String requestTime) {
        return notifierService.notificarUsuario(requestTime);
    }

}
