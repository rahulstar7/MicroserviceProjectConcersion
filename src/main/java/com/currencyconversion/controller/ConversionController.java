package com.currencyconversion.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currencyconversion.client.CurrencyClient;
import com.currencyconversion.model.CurrencyConversion;

@RestController
public class ConversionController {

	@Autowired
	private CurrencyClient client;

	@GetMapping(value = "/currencyconversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion conversionMulti(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity)

	{

		CurrencyConversion exchange = client.currencyExchangeConversion(from, to);
System.out.println(exchange);
		if (!ObjectUtils.isEmpty(exchange.getConversionMulti())) {
			CurrencyConversion conversion = new CurrencyConversion();

			conversion.setConversionMulti(exchange.getConversionMulti());
			conversion.setTotalConversion(quantity.multiply(exchange.getConversionMulti()));

			return conversion;
		} else {
			CurrencyConversion conversion = new CurrencyConversion();

			conversion.setConversionMulti(exchange.getConversionMulti());
			conversion.setTo(to);
			conversion.setFrom(from);
			conversion.setEnv(exchange.getEnv());
			conversion.setId(exchange.getId());
			conversion.setQuantity(quantity);
			conversion.setTotalConversion(quantity.multiply(exchange.getConversionMulti()));
			
			return conversion;
		}

	}

}
