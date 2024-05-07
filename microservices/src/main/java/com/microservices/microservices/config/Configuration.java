package com.microservices.microservices.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("define-besta")//tem que definir o nome de acesso da propriedade de configuração
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Configuration {
    private int besta;
    private int meioBesta;
    private int BestaQuadrada;

}
