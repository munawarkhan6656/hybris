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
package de.hybris.platform.cmssmarteditwebservices.data;

import java.io.Serializable;
import de.hybris.platform.cmsfacades.data.MediaData;
import java.util.Map;

public  class ProductData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ProductData.uid</code> property defined at extension <code>cmssmarteditwebservices</code>. */
		
	private String uid;

	/** <i>Generated property</i> for <code>ProductData.code</code> property defined at extension <code>cmssmarteditwebservices</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>ProductData.name</code> property defined at extension <code>cmssmarteditwebservices</code>. */
		
	private Map<String,String> name;

	/** <i>Generated property</i> for <code>ProductData.description</code> property defined at extension <code>cmssmarteditwebservices</code>. */
		
	private Map<String,String> description;

	/** <i>Generated property</i> for <code>ProductData.thumbnail</code> property defined at extension <code>cmssmarteditwebservices</code>. */
		
	private MediaData thumbnail;

	/** <i>Generated property</i> for <code>ProductData.catalogId</code> property defined at extension <code>cmssmarteditwebservices</code>. */
		
	private String catalogId;

	/** <i>Generated property</i> for <code>ProductData.catalogVersion</code> property defined at extension <code>cmssmarteditwebservices</code>. */
		
	private String catalogVersion;
	
	public ProductData()
	{
		// default constructor
	}
	
		
	
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

		
	
	public String getUid() 
	{
		return uid;
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
	
		
	
	public void setThumbnail(final MediaData thumbnail)
	{
		this.thumbnail = thumbnail;
	}

		
	
	public MediaData getThumbnail() 
	{
		return thumbnail;
	}
	
		
	
	public void setCatalogId(final String catalogId)
	{
		this.catalogId = catalogId;
	}

		
	
	public String getCatalogId() 
	{
		return catalogId;
	}
	
		
	
	public void setCatalogVersion(final String catalogVersion)
	{
		this.catalogVersion = catalogVersion;
	}

		
	
	public String getCatalogVersion() 
	{
		return catalogVersion;
	}
	


}
