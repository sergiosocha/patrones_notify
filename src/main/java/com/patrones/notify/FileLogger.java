package com.patrones.notify;

import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class FileLogger {

    private static final String LOG_FILE = "notificaciones.log";

    public void logNotificacion(String destino, String mensaje, String respuesta) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            writer.write(String.format("[%s] Enviado a: %s | Mensaje: %s | Respuesta: %s%n",
                    timestamp, destino, mensaje, respuesta));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
