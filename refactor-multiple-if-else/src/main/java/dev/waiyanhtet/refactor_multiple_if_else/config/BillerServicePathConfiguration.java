package dev.waiyanhtet.refactor_multiple_if_else.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "biller-service")
public class BillerServicePathConfiguration {

    private String atomPath;
    private String canalPlusPath;
}
