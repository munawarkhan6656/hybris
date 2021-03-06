/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:31 PM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.commerceservices.search.solrfacetsearch.data;

import java.io.Serializable;

public  class IndexedPropertyValueData<INDEXED_PROPERTY_TYPE>  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>IndexedPropertyValueData<INDEXED_PROPERTY_TYPE>.indexedProperty</code> property defined at extension <code>commerceservices</code>. */
		
	private INDEXED_PROPERTY_TYPE indexedProperty;

	/** <i>Generated property</i> for <code>IndexedPropertyValueData<INDEXED_PROPERTY_TYPE>.value</code> property defined at extension <code>commerceservices</code>. */
		
	private String value;
	
	public IndexedPropertyValueData()
	{
		// default constructor
	}
	
		
	
	public void setIndexedProperty(final INDEXED_PROPERTY_TYPE indexedProperty)
	{
		this.indexedProperty = indexedProperty;
	}

		
	
	public INDEXED_PROPERTY_TYPE getIndexedProperty() 
	{
		return indexedProperty;
	}
	
		
	
	public void setValue(final String value)
	{
		this.value = value;
	}

		
	
	public String getValue() 
	{
		return value;
	}
	


}
