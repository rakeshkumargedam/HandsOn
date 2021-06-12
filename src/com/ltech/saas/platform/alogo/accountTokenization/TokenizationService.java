package com.ltech.saas.platform.alogo.accountTokenization;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public
class TokenizationService {

	// tokenization method - 1 call may typically take 1 second for a
	// list of 100 requests
public
	List <TokenizationResponse> tokenize(List<TokenizationRequest> requestList) {
	List<TokenizationResponse> responseList =
			new ArrayList<TokenizationResponse>();
	responseList =
			requestList.stream().map(
					request -> new TokenizationResponse(request.getTrackingId(),"tkn_".concat(request.getData()))).
					collect(Collectors.toList());
	return responseList;
}
}
