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
package com.zaloni.bedrock.assets.lookup;

import java.util.List;

import com.zaloni.bedrock.assets.vo.LookupResponse;
import com.zaloni.bedrock.assets.exception.LookupException;
import com.zaloni.bedrock.assets.vo.LookupRequest;
import com.zaloni.bedrock.assets.vo.Schema;

/**
 * An asset can have an attribute which associates to an Arena artifacts, or
 * asset instances or any external objects. In such case the asset definition
 * would have syntax to suggest if it needs a lookup implementation.
 * <p>
 * This interface provides ability to define pluggable lookup implementations to
 * add lookup support for other Arena artifacts, asset instances and any other
 * external objects (e.g. lookup users from Active Directory).
 * <p>
 * Below are the primary responsibility of the lookup implementation
 * <ul>
 * <li>list objects of a specified type based on the search criteria provided</li>
 * 
 * <li>define storage for the object for indexing</li>
 * 
 * <li>define searchable attributes of the object</li>
 * 
 * <li>define API to fetch details about the object</li>
 *</ul>
 */
public interface LookupService {
	
	/**
	 * Provides ability to list objects of a homogeneous category.
	 * <p>
	 * Performs a lookup based on the search criteria provided
	 * through {@linkplain LookupRequest} and returns {@linkplain LookupResponse}
	 * 
	 * @param lookupSearchVO
	 * @return
	 * @throws LookupException
	 */
	<U extends LookupRequest> LookupResponse doLookup(U lookupRequest) throws LookupException;
	
	/**
	 * Returns {@linkplain Schema} which includes fields that should appear in the lookup response
	 * 
	 * @return
	 */
	Schema getSchema();
	
	/**
	 * Return the name of the supported artifact/object type 
	 * 
	 * @return
	 */
	String getType();
	
	/**
	 * Ability to define searchable attributes for the object. Optional attribute to
	 * be returned to highlight any specific searchable attributes of the object.
	 * 
	 * @return list of attributes on which search can be performed
	 */
	default List<String> getSearchableAttributes() {
		throw new UnsupportedOperationException("Method not implemented");
	}
	
	/**
	 * Ability to define storage for the object for indexing. This is to be used to
	 * create the schema mapping in the ES storage layer. For example: specification
	 * of the identifier fields for storage layer can be defined through this.
	 * 
	 * @return fields that should be stored in ES index
	 */
	List<String> getIndexStorage();
	
	/**
	 * Ability to fetch details about the object. Optionally define
	 * the method to fetch details about each individual object instance.
	 * 
	 * @param arguments all the arguments that required to fetch the object detail
	 * 
	 * @return
	 */
	Object fetchObjectDetails(String ... arguments);
	
	/**
	 * Method to return the identifier key for the object through wich it can be referenced
	 * @return
	 */
	Object getReferenceKey();
	
}
