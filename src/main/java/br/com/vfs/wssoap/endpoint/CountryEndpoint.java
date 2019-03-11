package br.com.vfs.wssoap.endpoint;

import br.com.vfs.wssoap.dto.Country;
import br.com.vfs.wssoap.dto.Currency;
import br.com.vfs.wssoap.dto.GetCountryRequest;
import br.com.vfs.wssoap.dto.GetCountryResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CountryEndpoint {

    private static final String NAMESPACE_URI = "dto.wssoap.vfs.com.br";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        Country country = new Country();
        country.setCapital("capital top");
        country.setName(request.getName());
        country.setPopulation(10000000);
        country.setCurrency(Currency.PLN);
        response.setCountry(country);
        return response;
    }
}
