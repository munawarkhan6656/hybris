/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:35 PM
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
package de.hybris.platform.addonsupport.data;

import java.io.Serializable;

public  class AddonExtensionMetadata  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AddonExtensionMetadata.baseExtensionName</code> property defined at extension <code>addonsupport</code>. */
		
	private String baseExtensionName;

	/** <i>Generated property</i> for <code>AddonExtensionMetadata.suffixChannel</code> property defined at extension <code>addonsupport</code>. */
		
	private boolean suffixChannel;
	
	public AddonExtensionMetadata()
	{
		// default constructor
	}
	
		
	
	public void setBaseExtensionName(final String baseExtensionName)
	{
		this.baseExtensionName = baseExtensionName;
	}

		
	
	public String getBaseExtensionName() 
	{
		return baseExtensionName;
	}
	
		
	
	public void setSuffixChannel(final boolean suffixChannel)
	{
		this.suffixChannel = suffixChannel;
	}

		
	
	public boolean isSuffixChannel() 
	{
		return suffixChannel;
	}
	


}
