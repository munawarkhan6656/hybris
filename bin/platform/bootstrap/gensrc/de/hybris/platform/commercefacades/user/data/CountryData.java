/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:39 PM
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
package de.hybris.platform.commercefacades.user.data;

import java.io.Serializable;

public  class CountryData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CountryData.isocode</code> property defined at extension <code>commercefacades</code>. */
		
	private String isocode;

	/** <i>Generated property</i> for <code>CountryData.name</code> property defined at extension <code>commercefacades</code>. */
		
	private String name;
	
	public CountryData()
	{
		// default constructor
	}
	
		
	
	public void setIsocode(final String isocode)
	{
		this.isocode = isocode;
	}

		
	
	public String getIsocode() 
	{
		return isocode;
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	


}
