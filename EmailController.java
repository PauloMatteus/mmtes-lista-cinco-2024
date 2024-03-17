package com.demo.enviossss;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

        @RequestMapping("/envio-email")
        public String email() {
                return "Email enviado com Sucesso";
        }
}
