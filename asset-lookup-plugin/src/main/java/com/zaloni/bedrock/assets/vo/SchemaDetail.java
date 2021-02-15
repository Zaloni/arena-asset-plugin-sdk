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
package com.zaloni.bedrock.assets.vo;

import com.zaloni.bedrock.assets.lookup.LookupService;

/**
 * Describes the individual field that would appear in the lookup response
 * 
 * @see LookupService
 */
public class SchemaDetail {
	
	private String attributeName;
	private DataType dataType;
	
	public String getAttributeName() {
		return attributeName;
	}


	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}


	public DataType getDataType() {
		return dataType;
	}


	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}
	
	public enum DataType {
        STRING,
        DATETIME,
        NUMBER;
    }

}
