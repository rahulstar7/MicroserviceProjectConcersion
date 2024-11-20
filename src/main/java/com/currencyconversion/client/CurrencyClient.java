package com.currencyconversion.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.currencyconversion.model.CurrencyConversion;


@FeignClient(name="CURRENCY-EXCHANGE",url = "localhost:8595")
public interface CurrencyClient {

	@GetMapping(value="/currency/from/{from}/to/{to}")
	public CurrencyConversion currencyExchangeConversion(@PathVariable String from , @PathVariable String to);
	
	
	
	
	
}
