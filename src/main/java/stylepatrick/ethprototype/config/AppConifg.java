package stylepatrick.ethprototype.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter(AccessLevel.PROTECTED)
public class AppConifg {

    @Value("${infura.url}")
    private String infuraUrl;


}
