package stylepatrick.ethprototype.api;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.protocol.core.methods.response.EthBlockNumber;
import stylepatrick.ethprototype.client.EthereumClient;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EthereumApi {

    private final EthereumClient ethereumClient;

    @GetMapping(value = "eth/block")
    public EthBlockNumber ethBlockNumber() {
        return ethereumClient.getBlockNumber();
    }

    @GetMapping(value = "eth/accounts/{ethAddress}/balance")
    public BigDecimal ethBalance(
            @PathVariable(value = "ethAddress") String ethAddress
    ) {
        return ethereumClient.getEthBalance(ethAddress);
    }

    @GetMapping(value = "eth/token/balanceOf/{ethAddress}/{contractAddress}")
    public BigDecimal ethTokenBalanceOf(
            @PathVariable(value = "ethAddress") String ethAddress,
            @PathVariable(value = "contractAddress") String contractAddress
    ) {
        return ethereumClient.getTokenBalance(ethAddress, contractAddress);
    }


}
