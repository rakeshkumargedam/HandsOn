package com.ltech.saas.platform.alogo.accountTokenization;

public
class TokenizationResponse {
	int trackingId;
	String token;
	public void setTrackingId(int trackingId) {
		this.trackingId= trackingId;
	}
	public int getTrackingId(){
		return trackingId;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getToken() {
		return token;
	}

	public TokenizationResponse(int trackingId, String token){
		this.trackingId = trackingId;
		this.token = token;
	}
}
