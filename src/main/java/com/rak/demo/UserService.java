package com.rak.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import com.mastercard.api.core.ApiConfig;
import com.mastercard.api.core.exception.ApiException;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.core.model.map.SmartMap;
import com.mastercard.api.core.security.oauth.OAuthAuthentication;
import com.mastercard.api.qkr.User;
import com.mastercard.api.qkr.UserSession;

@Service
public class UserService {

	static {
		try {
			String consumerKey = "La5Lqy7wWlkgaRe090Y07T4XRzsGICdF4HqeMgzv431d3541!00be8da0599a4dfb8e3140255fd74aef0000000000000000";
			String keyAlias = "keyalias";
			String keyPassword = "keystorepassword";
			Resource resource = new ClassPathResource("imports/QKRROCK-sandbox.p12");
			InputStream is = resource.getInputStream();
			ApiConfig.setAuthentication(new OAuthAuthentication(consumerKey, is, keyAlias, keyPassword));
			ApiConfig.setDebug(true);
			ApiConfig.setSandbox(true);
		} catch (FileNotFoundException e) {
			err("FileNotFound" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			err("FileNotFound" + e.getMessage());
		}
	}

	public UserResponse createUser(RakUser rakUser) {
		UserResponse userResp = new UserResponse();
		try {
			RequestMap map = new RequestMap();
			map.set("lastName", rakUser.getLastName());
			map.set("firstName", rakUser.getFirstName());
			map.set("emailAddress", rakUser.getEmailAddress());
			map.set("password", "qwerty1234");
			map.set("phoneNumber", rakUser.getPhoneNumber());
			map.set("securityQuestion", "In what town or city was your mother born?");
			map.set("taxNumber", rakUser.getTaxNumber());
			map.set("language", "en");
			map.set("countryOfResidence", "US");
			map.set("securityQuestionAnswer", "Dublin");
			map.set("phoneNumberCountryCode", "01");

			User response = User.create(map);

			userResp.setAccessTokenExpiry(response.get("accessToken.expires").toString());
			userResp.setInternalAccountId(response.get("internalAccountId").toString());
			userResp.setCallbackUrl(response.get("callbackUrl").toString());
			userResp.setUserAccessToken(response.get("accessToken.token").toString());

		} catch (ApiException e) {
			err("HttpStatus: " + e.getHttpStatus());
			err("Message: " + e.getMessage());
			err("ReasonCode: " + e.getReasonCode());
			err("Source: " + e.getSource());
			userResp.setErrorMessage("HttpStatus: " + e.getHttpStatus() + "    Message: " + e.getMessage()
					+ "   ReasonCode: " + e.getReasonCode() + "  Source: " + e.getSource());
		}
		return userResp;
	}

	public RakUser getUserProfile(String xAuthToken) {
		RakUser user = new RakUser();
		try {
			RequestMap map = new RequestMap();
			map.set("X-Auth-Token", xAuthToken);
			User response = User.query(map);

			user.setLastName(response.get("lastName").toString());
			user.setTaxNumber(response.get("taxNumber").toString());
			user.setMasterPassMarketingConsent(
					Boolean.getBoolean(response.get("masterPassMarketingConsent").toString()));
			user.setCountryOfResidence(response.get("countryOfResidence").toString());
			user.setAutomaticEmailReceipts(Boolean.getBoolean(response.get("automaticEmailReceipts").toString()));
			user.setPhoneNumberCountryCode(response.get("phoneNumberCountryCode").toString());
			user.setProfilePhotoUrl(response.get("profilePhotoUrl").toString());
			user.setFirstName(response.get("firstName").toString());
			user.setEmailAddress(response.get("emailAddress").toString());
			user.setPhoneNumber(response.get("phoneNumber").toString());
			user.setMasterPassUser(Boolean.getBoolean(response.get("masterPassUser").toString()));
			user.setRequestCvcInAddCard(Boolean.getBoolean(response.get("requestCvcInAddCard").toString()));
			user.setMarketingConsent(Boolean.getBoolean(response.get("marketingConsent").toString()));
			user.setId(response.get("id").toString());
			user.setRequestZipInAddCard(response.get("requestZipInAddCard").toString());

		} catch (ApiException e) {
			err("HttpStatus: " + e.getHttpStatus());
			err("Message: " + e.getMessage());
			err("ReasonCode: " + e.getReasonCode());
			err("Source: " + e.getSource());
			user.setErrorMessage("HttpStatus: " + e.getHttpStatus() + "    Message: " + e.getMessage()
					+ "   ReasonCode: " + e.getReasonCode() + "  Source: " + e.getSource());
		}

		return user;
	}

	public UserResponse getUserSession(String emailAddress) {
		UserResponse userResp = new UserResponse();

		try {
			RequestMap map1 = new RequestMap();
			map1.set("emailAddress", emailAddress);
			map1.set("password", "qwerty1234");
			UserSession response1 = UserSession.create(map1);
			String strAccessTokenExpiry = response1.get("accessToken.expires").toString();
			String strAccessTokenValue = response1.get("accessToken.token").toString();
			userResp.setAccessTokenExpiry(strAccessTokenExpiry);
			userResp.setUserAccessToken(strAccessTokenValue);
			return userResp;
		} catch (ApiException e) {
			err("HttpStatus: " + e.getHttpStatus());
			err("Message: " + e.getMessage());
			err("ReasonCode: " + e.getReasonCode());
			err("Source: " + e.getSource());
			userResp.setErrorMessage("HttpStatus: " + e.getHttpStatus() + "    Message: " + e.getMessage()
					+ "   ReasonCode: " + e.getReasonCode() + "  Source: " + e.getSource());
		}
		return userResp;
	}

	public UserResponse deleteUser(String xAuthToken) {
		UserResponse userResp = new UserResponse();
		try {
			RequestMap map = new RequestMap();
			map.set("X-Auth-Token", xAuthToken);
			User response = User.delete("from.register", map);
		} catch (ApiException e) {
			err("HttpStatus: " + e.getHttpStatus());
			err("Message: " + e.getMessage());
			err("ReasonCode: " + e.getReasonCode());
			err("Source: " + e.getSource());
			userResp.setErrorMessage("HttpStatus: " + e.getHttpStatus() + "    Message: " + e.getMessage()
					+ "   ReasonCode: " + e.getReasonCode() + "  Source: " + e.getSource());
		}
		return userResp;
	}

	public static void err(String message) {
		System.err.println(message);
	}

	public static void out(SmartMap response, String key) {
		System.out.println(key + "-->" + response.get(key));
	}
}
