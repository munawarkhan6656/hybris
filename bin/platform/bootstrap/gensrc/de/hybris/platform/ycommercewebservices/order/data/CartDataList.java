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
package de.hybris.platform.ycommercewebservices.order.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.order.data.CartData;
import java.util.List;

public  class CartDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CartDataList.carts</code> property defined at extension <code>ycommercewebservices</code>. */
		
	private List<CartData> carts;
	
	public CartDataList()
	{
		// default constructor
	}
	
		
	
	public void setCarts(final List<CartData> carts)
	{
		this.carts = carts;
	}

		
	
	public List<CartData> getCarts() 
	{
		return carts;
	}
	


}