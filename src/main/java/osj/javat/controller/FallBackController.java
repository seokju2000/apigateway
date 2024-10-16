package osj.javat.controller;

import org.springframework.cloud.gateway.support.ServerWebExchangeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ServerWebExchange;

@RequestMapping("/fallback")
public class FallBackController {
	
	@GetMapping("/authFailure")
	public void ServiceFallback(ServerWebExchange exchange) {
		Throwable t = exchange.getAttribute(ServerWebExchangeUtils.CIRCUITBREAKER_EXECUTION_EXCEPTION_ATTR);
	}
}
