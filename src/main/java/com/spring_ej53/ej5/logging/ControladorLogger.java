package com.spring_ej53.ej5.logging;//package com.spring_ej53.ej5.logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorLogger {

    @GetMapping("/ejercicioLogger")
    public String index(){
        log.trace("Mensaje a nivel de TRACE");
        log.debug("Mensaje a nivel de DEBUG");
        log.info("Mensaje a nivel de INFO");
        log.warn("Mensaje a nivel de WARNING");
        log.error("Mensaje a nivel de ERROR");

        return "Comprueba los logs para ver el resultado";
    }

}




