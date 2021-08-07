package stylepatrick.ethprototype.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@Configuration
@AllArgsConstructor
public class Web3jConfig {

    private final AppConifg appConifg;

    @Bean
    public Web3j createWeb3jClient() {
        return Web3j.build(new HttpService(appConifg.getInfuraUrl()));

    }
}
