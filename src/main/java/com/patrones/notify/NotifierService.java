package com.patrones.notify;


import com.patrones.notify.DTO.ProviderDTO;
import com.patrones.notify.DTO.ResponseDTO;
import org.springframework.stereotype.Service;

import java.security.Provider;


@Service
public class NotifierService {

    private State state = new State();


    public void setState(State state) {
        this.state = state;
    }

    public ResponseDTO notificarUsuario (){
        ProviderDTO responseTime = this.state.doNotify();
        return DTOGenerator.generateResponseDTO(responseTime ,requestTime);
    }

}
