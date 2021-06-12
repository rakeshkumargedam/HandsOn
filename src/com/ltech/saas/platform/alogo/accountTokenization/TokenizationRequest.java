package com.ltech.saas.platform.alogo.accountTokenization;

public
class TokenizationRequest {
	int trackingId;
	String data;

	public
	void setTrackingId(int trackingId) {
		this.trackingId = trackingId;
	}

	public
	int getTrackingId() {
		return trackingId;
	}

	public
	void setData(String data) {
		this.data = data;
	}

	public
	String getData() {
		return data;
	}
	public TokenizationRequest(int trackingId, String data){
		this.trackingId = trackingId;
		this.data = data;
	}
}
