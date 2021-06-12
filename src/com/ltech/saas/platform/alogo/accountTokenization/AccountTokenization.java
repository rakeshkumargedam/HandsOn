package com.ltech.saas.platform.alogo.accountTokenization;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public
class AccountTokenization implements Serializable {

	public List<Account> secureAccounts(List<Account> accounts) {
		if (accounts != null && accounts.size() != 0) {
			Map<Integer, Account> accountMap = IntStream.range(0,
			                                                   accounts.size()).boxed().
					                                            collect(Collectors.toMap(Function.identity(), i -> accounts.get(i)));
			List<TokenizationRequest> tokenizationRequests =
					accountMap.keySet().stream().filter(trackingId -> accountMap.get(trackingId).isSensitive).
							map(id -> new TokenizationRequest(id,
							                                  accountMap.get(id).getAccountId())).collect(Collectors.toList());

			if (tokenizationRequests != null && tokenizationRequests.size() != 0) {
				List<TokenizationResponse> tokenizationResponses =
						new TokenizationService().tokenize(tokenizationRequests);
				tokenizationResponses.stream().forEach(
						tokenrsp -> accounts.get(tokenrsp.getTrackingId()).setAccountId(tokenrsp.getToken())
				);
			}
		}
		return accounts;
	}
}
