package com.mrbarin.microservicios.retrievetransactionuser.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mrbarin.microservicios.retrievetransactionuser.api.dto.request.RequestRetrieveTransaction;
import com.mrbarin.microservicios.retrievetransactionuser.api.dto.response.ResponseTransactions;

@FeignClient(url="http://RETRIEVE-CURRENT-TRANSACTION/",name="RetrieveCurrentTransactionClient")
public interface RetrieveCurrentTransactionClient {
	
	@PostMapping(value="/retrieve-current-information",consumes= MediaType.APPLICATION_JSON_VALUE)
	public ResponseTransactions getTransactions(@RequestBody RequestRetrieveTransaction request);
}