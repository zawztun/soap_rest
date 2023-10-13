package com.example.consumingwebservice.country;

import io.spring.guides.gs_producing_web_service.GetCountryRequest;
import io.spring.guides.gs_producing_web_service.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CountryEndPoint {
    private static final String NAMESPACE_URL =  "http://spring.io/guides/gs-producing-web-service";
    private  CountryRepostory countryRepostory;

@Autowired
    public CountryEndPoint(CountryRepostory countryRepostory) {
        this.countryRepostory = countryRepostory;
    }
@PayloadRoot(namespace = NAMESPACE_URL,localPart = "getCountryRequest")
@ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request){
            GetCountryResponse response = new GetCountryResponse();
            response.setCountry(countryRepostory.findCountry(request.getName()));
            return response;
    }
}
