package com.arsalan.challenge.functions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FunctionsConfiguration {

	@Bean("add")
	public ValueFinderFunction addFunction() {
		return (g, r, c) -> g.getNthNumber(r) + g.getNthNumber(c);
	}

	@Bean("multiply")
	public ValueFinderFunction multiplyFunction() {
		return (g, r, c) -> g.getNthNumber(r) * g.getNthNumber(c);
	}

	@Bean("addPlus")
	public ValueFinderFunction addPlusFunction() {
		return (g, r, c) -> g.getNthNumber(r + c + 1);
	}

}
