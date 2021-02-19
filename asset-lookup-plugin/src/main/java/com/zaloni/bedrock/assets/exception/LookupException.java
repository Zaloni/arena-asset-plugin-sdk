/*
 * Copyright 2021 Zaloni Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zaloni.bedrock.assets.exception;

public class LookupException extends Exception{
	
	public enum LookupError{
		OBJECT_NOT_FOUND;
	}
	
	private LookupError lookupError;
	
	private LookupErrorContext lookupErrorContext;

	/**
	 * 
	 */
	private static final long serialVersionUID = -8185922542885302842L;

	public LookupException() {
		super();
	}

	public LookupException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public LookupException(String message) {
		super(message);
	}

	public LookupException(Throwable throwable) {
		super(throwable);
	}
	
	public LookupException(LookupError lookupError) {
		super(lookupError.toString());
		this.lookupError = lookupError;	
	}
	
	public LookupException(LookupError lookupError,LookupErrorContext lookupErrorContext) {
		super(lookupError.toString());
		this.lookupError = lookupError;	
		this.lookupErrorContext = lookupErrorContext;
	}

	public LookupError getLookupError() {
		return lookupError;
	}

	public void setLookupError(LookupError lookupError) {
		this.lookupError = lookupError;
	}

	public LookupErrorContext getLookupErrorContext() {
		return lookupErrorContext;
	}

	public void setLookupErrorContext(LookupErrorContext lookupErrorContext) {
		this.lookupErrorContext = lookupErrorContext;
	}	
}
