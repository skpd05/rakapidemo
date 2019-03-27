package com.rak.demo;

public class UserResponse {
    
	private String internalAccountId;
	private String callbackUrl;
	private String accessTokenExpiry;
	private String userAccessToken;
	private String errorMessage;
	/**
	 * @return the internalAccountId
	 */
	public String getInternalAccountId() {
		return internalAccountId;
	}
	/**
	 * @param internalAccountId the internalAccountId to set
	 */
	public void setInternalAccountId(String internalAccountId) {
		this.internalAccountId = internalAccountId;
	}
	/**
	 * @return the callbackUrl
	 */
	public String getCallbackUrl() {
		return callbackUrl;
	}
	/**
	 * @param callbackUrl the callbackUrl to set
	 */
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	/**
	 * @return the accessTokenExpiry
	 */
	public String getAccessTokenExpiry() {
		return accessTokenExpiry;
	}
	/**
	 * @param accessTokenExpiry the accessTokenExpiry to set
	 */
	public void setAccessTokenExpiry(String accessTokenExpiry) {
		this.accessTokenExpiry = accessTokenExpiry;
	}
	/**
	 * @return the userAccessToken
	 */
	public String getUserAccessToken() {
		return userAccessToken;
	}
	/**
	 * @param userAccessToken the userAccessToken to set
	 */
	public void setUserAccessToken(String userAccessToken) {
		this.userAccessToken = userAccessToken;
	}
	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	

}
