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
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;
import de.hybris.platform.cmsfacades.data.AbstractPageData;
import java.util.List;

public  class ClonePageData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ClonePageData.pageData</code> property defined at extension <code>cmsfacades</code>. */
		
	private AbstractPageData pageData;

	/** <i>Generated property</i> for <code>ClonePageData.cloneComponents</code> property defined at extension <code>cmsfacades</code>. */
		
	private boolean cloneComponents;

	/** <i>Generated property</i> for <code>ClonePageData.restrictions</code> property defined at extension <code>cmsfacades</code>. */
		
	private List<String> restrictions;
	
	public ClonePageData()
	{
		// default constructor
	}
	
		
	
	public void setPageData(final AbstractPageData pageData)
	{
		this.pageData = pageData;
	}

		
	
	public AbstractPageData getPageData() 
	{
		return pageData;
	}
	
		
	
	public void setCloneComponents(final boolean cloneComponents)
	{
		this.cloneComponents = cloneComponents;
	}

		
	
	public boolean isCloneComponents() 
	{
		return cloneComponents;
	}
	
		
	
	public void setRestrictions(final List<String> restrictions)
	{
		this.restrictions = restrictions;
	}

		
	
	public List<String> getRestrictions() 
	{
		return restrictions;
	}
	


}
