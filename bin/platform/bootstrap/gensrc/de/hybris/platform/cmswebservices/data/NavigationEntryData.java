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
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;

public  class NavigationEntryData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>NavigationEntryData.itemId</code> property defined at extension <code>cmswebservices</code>. */
		
	private String itemId;

	/** <i>Generated property</i> for <code>NavigationEntryData.itemType</code> property defined at extension <code>cmswebservices</code>. */
		
	private String itemType;

	/** <i>Generated property</i> for <code>NavigationEntryData.itemSuperType</code> property defined at extension <code>cmswebservices</code>. */
		
	private String itemSuperType;
	
	public NavigationEntryData()
	{
		// default constructor
	}
	
		
	
	public void setItemId(final String itemId)
	{
		this.itemId = itemId;
	}

		
	
	public String getItemId() 
	{
		return itemId;
	}
	
		
	
	public void setItemType(final String itemType)
	{
		this.itemType = itemType;
	}

		
	
	public String getItemType() 
	{
		return itemType;
	}
	
		
	
	public void setItemSuperType(final String itemSuperType)
	{
		this.itemSuperType = itemSuperType;
	}

		
	
	public String getItemSuperType() 
	{
		return itemSuperType;
	}
	


}
