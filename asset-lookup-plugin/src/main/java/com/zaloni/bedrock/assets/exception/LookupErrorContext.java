package com.zaloni.bedrock.assets.exception;

public class LookupErrorContext{
	
	private String identifier;
	private String objectType;
	public LookupErrorContext(String identifier, String objectType) {	
		this.identifier = identifier;
		this.objectType = objectType;
	}
	public String getIdentifier() {
		return identifier;
	}
	public String getObjectType() {
		return objectType;
	}
}
