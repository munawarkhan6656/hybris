/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:41 PM
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
import de.hybris.platform.cmswebservices.data.AbstractCMSComponentData;
import de.hybris.platform.webservicescommons.dto.PaginationWsDTO;
import java.util.List;

public  class ComponentItemListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ComponentItemListData.componentItems</code> property defined at extension <code>cmswebservices</code>. */
		
	private List<AbstractCMSComponentData> componentItems;

	/** <i>Generated property</i> for <code>ComponentItemListData.pagination</code> property defined at extension <code>cmswebservices</code>. */
		
	private PaginationWsDTO pagination;
	
	public ComponentItemListData()
	{
		// default constructor
	}
	
		
	
	public void setComponentItems(final List<AbstractCMSComponentData> componentItems)
	{
		this.componentItems = componentItems;
	}

		
	
	public List<AbstractCMSComponentData> getComponentItems() 
	{
		return componentItems;
	}
	
		
	
	public void setPagination(final PaginationWsDTO pagination)
	{
		this.pagination = pagination;
	}

		
	
	public PaginationWsDTO getPagination() 
	{
		return pagination;
	}
	


}
