/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:37 PM
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
import de.hybris.platform.commercefacades.search.data.SearchQueryData;

public  class SearchStateData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SearchStateData.url</code> property defined at extension <code>commercefacades</code>. */
		
	private String url;

	/** <i>Generated property</i> for <code>SearchStateData.query</code> property defined at extension <code>commercefacades</code>. */
		
	private SearchQueryData query;
	
	public SearchStateData()
	{
		// default constructor
	}
	
		
	
	public void setUrl(final String url)
	{
		this.url = url;
	}

		
	
	public String getUrl() 
	{
		return url;
	}
	
		
	
	public void setQuery(final SearchQueryData query)
	{
		this.query = query;
	}

		
	
	public SearchQueryData getQuery() 
	{
		return query;
	}
	


}
