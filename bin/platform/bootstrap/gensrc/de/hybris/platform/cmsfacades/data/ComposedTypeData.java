/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:40 PM
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
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;
import java.util.Map;

public  class ComposedTypeData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ComposedTypeData.code</code> property defined at extension <code>cmsfacades</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>ComposedTypeData.name</code> property defined at extension <code>cmsfacades</code>. */
		
	private Map<String,String> name;

	/** <i>Generated property</i> for <code>ComposedTypeData.description</code> property defined at extension <code>cmsfacades</code>. */
		
	private Map<String,String> description;
	
	public ComposedTypeData()
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
	
		
	
	public void setName(final Map<String,String> name)
	{
		this.name = name;
	}

		
	
	public Map<String,String> getName() 
	{
		return name;
	}
	
		
	
	public void setDescription(final Map<String,String> description)
	{
		this.description = description;
	}

		
	
	public Map<String,String> getDescription() 
	{
		return description;
	}
	


}
