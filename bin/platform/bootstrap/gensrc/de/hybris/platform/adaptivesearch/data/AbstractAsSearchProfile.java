/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:38 PM
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
package de.hybris.platform.adaptivesearch.data;

import java.io.Serializable;

public  class AbstractAsSearchProfile  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AbstractAsSearchProfile.code</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>AbstractAsSearchProfile.indexType</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String indexType;
	
	public AbstractAsSearchProfile()
	{
		// default constructor
	}
	
		
	
	public void setCode(final String code)
	{
		this.code = code;
	}

		
	
	public String getCode() 
	{
		return code;
	}
	
		
	
	public void setIndexType(final String indexType)
	{
		this.indexType = indexType;
	}

		
	
	public String getIndexType() 
	{
		return indexType;
	}
	


}
