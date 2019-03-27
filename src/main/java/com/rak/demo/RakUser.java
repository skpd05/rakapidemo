package com.rak.demo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;



public class RakUser {

	
	private String lastName;
	private String firstName;
	private String emailAddress;
	private String password;
	private String phoneNumber;
	private String securityQuestion;
	private String taxNumber;
	private String language;
	private String countryOfResidence;
	private String securityQuestionAnswer;
	private String phoneNumberCountryCode;
	private String profilePhotoUrl;
	private String id;
	private String requestZipInAddCard;
	
	private boolean masterPassMarketingConsent;
	private boolean automaticEmailReceipts;
	private boolean masterPassUser;
	private boolean requestCvcInAddCard;
	private boolean marketingConsent;
	
	private String errorMessage;
	

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the securityQuestion
	 */
	public String getSecurityQuestion() {
		return securityQuestion;
	}

	/**
	 * @param securityQuestion the securityQuestion to set
	 */
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	/**
	 * @return the taxNumber
	 */
	public String getTaxNumber() {
		return taxNumber;
	}

	/**
	 * @param taxNumber the taxNumber to set
	 */
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the countryOfResidence
	 */
	public String getCountryOfResidence() {
		return countryOfResidence;
	}

	/**
	 * @param countryOfResidence the countryOfResidence to set
	 */
	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}

	/**
	 * @return the securityQuestionAnswer
	 */
	public String getSecurityQuestionAnswer() {
		return securityQuestionAnswer;
	}

	/**
	 * @param securityQuestionAnswer the securityQuestionAnswer to set
	 */
	public void setSecurityQuestionAnswer(String securityQuestionAnswer) {
		this.securityQuestionAnswer = securityQuestionAnswer;
	}

	/**
	 * @return the phoneNumberCountryCode
	 */
	public String getPhoneNumberCountryCode() {
		return phoneNumberCountryCode;
	}

	/**
	 * @param phoneNumberCountryCode the phoneNumberCountryCode to set
	 */
	public void setPhoneNumberCountryCode(String phoneNumberCountryCode) {
		this.phoneNumberCountryCode = phoneNumberCountryCode;
	}

	/**
	 * @return the profilePhotoUrl
	 */
	public String getProfilePhotoUrl() {
		return profilePhotoUrl;
	}

	/**
	 * @param profilePhotoUrl the profilePhotoUrl to set
	 */
	public void setProfilePhotoUrl(String profilePhotoUrl) {
		this.profilePhotoUrl = profilePhotoUrl;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the requestZipInAddCard
	 */
	public String getRequestZipInAddCard() {
		return requestZipInAddCard;
	}

	/**
	 * @param requestZipInAddCard the requestZipInAddCard to set
	 */
	public void setRequestZipInAddCard(String requestZipInAddCard) {
		this.requestZipInAddCard = requestZipInAddCard;
	}

	/**
	 * @return the masterPassMarketingConsent
	 */
	public boolean isMasterPassMarketingConsent() {
		return masterPassMarketingConsent;
	}

	/**
	 * @param masterPassMarketingConsent the masterPassMarketingConsent to set
	 */
	public void setMasterPassMarketingConsent(boolean masterPassMarketingConsent) {
		this.masterPassMarketingConsent = masterPassMarketingConsent;
	}

	/**
	 * @return the automaticEmailReceipts
	 */
	public boolean isAutomaticEmailReceipts() {
		return automaticEmailReceipts;
	}

	/**
	 * @param automaticEmailReceipts the automaticEmailReceipts to set
	 */
	public void setAutomaticEmailReceipts(boolean automaticEmailReceipts) {
		this.automaticEmailReceipts = automaticEmailReceipts;
	}

	/**
	 * @return the masterPassUser
	 */
	public boolean isMasterPassUser() {
		return masterPassUser;
	}

	/**
	 * @param masterPassUser the masterPassUser to set
	 */
	public void setMasterPassUser(boolean masterPassUser) {
		this.masterPassUser = masterPassUser;
	}

	/**
	 * @return the requestCvcInAddCard
	 */
	public boolean isRequestCvcInAddCard() {
		return requestCvcInAddCard;
	}

	/**
	 * @param requestCvcInAddCard the requestCvcInAddCard to set
	 */
	public void setRequestCvcInAddCard(boolean requestCvcInAddCard) {
		this.requestCvcInAddCard = requestCvcInAddCard;
	}

	/**
	 * @return the marketingConsent
	 */
	public boolean isMarketingConsent() {
		return marketingConsent;
	}

	/**
	 * @param marketingConsent the marketingConsent to set
	 */
	public void setMarketingConsent(boolean marketingConsent) {
		this.marketingConsent = marketingConsent;
	}

	public RakUser() {
	}

	public RakUser(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Customer[ firstName='%s', lastName='%s']",  firstName, lastName);
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