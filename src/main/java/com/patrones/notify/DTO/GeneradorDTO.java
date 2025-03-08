package com.patrones.notify.DTO;



public class GeneradorDTO {

    public static ResponseDTO generateResponseDTO(ProviderDTO providerDTO, String requestTime) {
        String result = " Fallido ";

        if(!"500".equals(providerDTO.code())){
            result = "Exitoso ";
        }

        return new ResponseDTO(result, providerDTO.code(), providerDTO.provider(), requestTime, providerDTO.retries());
    }

    public static ProviderDTO generateProviderDTO(String provider, String code, String body, int retries) {
        return new ProviderDTO(provider, code, body, retries);
    }

    public static ResultDTO generateResultDTO(boolean successful, ProviderDTO providerDTO) {
        return new ResultDTO(successful, providerDTO);
    }


}
