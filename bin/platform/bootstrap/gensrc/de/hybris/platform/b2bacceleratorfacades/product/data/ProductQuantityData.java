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
package de.hybris.platform.b2bacceleratorfacades.product.data;

import java.io.Serializable;

public  class ProductQuantityData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ProductQuantityData.sku</code> property defined at extension <code>b2bacceleratorfacades</code>. */
		
	private String sku;

	/** <i>Generated property</i> for <code>ProductQuantityData.quantity</code> property defined at extension <code>b2bacceleratorfacades</code>. */
		
	private Integer quantity;
	
	public ProductQuantityData()
	{
		// default constructor
	}
	
		
	
	public void setSku(final String sku)
	{
		this.sku = sku;
	}

		
	
	public String getSku() 
	{
		return sku;
	}
	
		
	
	public void setQuantity(final Integer quantity)
	{
		this.quantity = quantity;
	}

		
	
	public Integer getQuantity() 
	{
		return quantity;
	}
	


}
