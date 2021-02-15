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

/**
 * This is the format of the response from a lookup implementation. It contains
 * the List of Object obtained after performing a search based on the input
 * search criteria. The Object that is being returned can have multiple fields.
 * The field within the object which should be shown in the UI has to be
 * mentioned by the <code>label</code>.
 * <p>
 * For example if we have Workflow object which contains fields - wfName and
 * wfCategory (shown as below). And in the UI if wfName has to be shown, then
 * the label has to be set as "wfName" <br>
 * [ <br>
 * &nbsp {"wfName": "Workflow1", "wfCategory": "Default"}, <br>
 * &nbsp {"wfName": "Workflow2", "wfCategory": "Default"}<br>
 * ]
 *
 */
public class LookupResponse {
	
	/*
	 * e.g.
	 * <br>
	 *  [	<br>
	 *	&nbsp	{"wfName": "Workflow1", "wfCategory": "Default"}, <br>
	 *	&nbsp	{"wfName": "Workflow2", "wfCategory": "Default"}<br>
	 *	]
	 */
	private List<? extends Object> items;
	
	/*
	 * This is the field which will be shown in the UI after selection.
	 */
	private String label;

	private long totalRecords;
	
	private int currentPage;
    
	private int chunkSize;
	

	public List<? extends Object> getItems() {
		return items;
	}

	/**
	 * e.g.<br>
	 *  [	<br>
	 *	&nbsp	{"wfName": "Workflow1", "wfCategory": "Default"}, <br>
	 *	&nbsp	{"wfName": "Workflow2", "wfCategory": "Default"}<br>
	 *	]
	 * 
	 * @param items
	 */
	public void setItems(List<? extends Object> items) {
		this.items = items;
	}

	public String getLabel() {
		return label;
	}

	/**
	 * This is the field which will be shown in the UI after selection.
	 * 
	 * @param label
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	public long getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(long totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getChunkSize() {
		return chunkSize;
	}

	public void setChunkSize(int chunkSize) {
		this.chunkSize = chunkSize;
	}

}
