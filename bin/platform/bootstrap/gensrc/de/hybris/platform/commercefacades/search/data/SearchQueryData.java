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
package de.hybris.platform.commercefacades.search.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.search.data.SearchFilterQueryData;
import java.util.List;

public  class SearchQueryData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SearchQueryData.value</code> property defined at extension <code>commercefacades</code>. */
		
	private String value;

	/** <i>Generated property</i> for <code>SearchQueryData.filterQueries</code> property defined at extension <code>commercefacades</code>. */
		
	private List<SearchFilterQueryData> filterQueries;
	
	public SearchQueryData()
	{
		// default constructor
	}
	
		
	
	public void setValue(final String value)
	{
		this.value = value;
	}

		
	
	public String getValue() 
	{
		return value;
	}
	
		
	
	public void setFilterQueries(final List<SearchFilterQueryData> filterQueries)
	{
		this.filterQueries = filterQueries;
	}

		
	
	public List<SearchFilterQueryData> getFilterQueries() 
	{
		return filterQueries;
	}
	


}
