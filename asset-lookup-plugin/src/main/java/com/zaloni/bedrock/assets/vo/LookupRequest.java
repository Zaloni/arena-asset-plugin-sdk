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

import java.util.List;
import java.util.Map;

/**
 * This is the request which is required by the lookup implementation. It
 * contains the searchString used to perform the lookup search. It also contains
 * chunkSize and currentPage to support pagination.
 *
 */
public class LookupRequest {
	
	private String searchString;
	
	private int chunkSize;
	
	private int currentPage;
	
	private Map<String, String> additionalAttributes;
	private List<Integer> projectIds;
	
	public LookupRequest() {
		super();
	}
	
	public LookupRequest(LookupRequest lookupSearchVO) {
		this.searchString = lookupSearchVO.getSearchString();
		this.chunkSize = lookupSearchVO.getChunkSize();
		this.currentPage = lookupSearchVO.getCurrentPage();
		this.projectIds = lookupSearchVO.getProjectIds();
	}

	public String getSearchString() {
		return searchString;
	}
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
	public int getChunkSize() {
		return chunkSize;
	}
	public void setChunkSize(int chunkSize) {
		this.chunkSize = chunkSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public List<Integer> getProjectIds() {
		return projectIds;
	}

	public void setProjectIds(List<Integer> projectIds) {
		this.projectIds = projectIds;
	}

	public Map<String, String> getAdditionalAttributes() {
		return additionalAttributes;
	}

	public void setAdditionalAttributes(Map<String, String> additionalAttributes) {
		this.additionalAttributes = additionalAttributes;
	}

	@Override
	public String toString() {
		return "LookupRequest [searchString=" + searchString + ", chunkSize=" + chunkSize + ", currentPage="
				+ currentPage + ", additionalAttributes=" + additionalAttributes + ", projectIds=" + projectIds + "]";
	}

	
}
