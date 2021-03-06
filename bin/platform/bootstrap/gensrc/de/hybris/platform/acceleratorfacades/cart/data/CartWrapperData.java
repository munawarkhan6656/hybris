/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:33 PM
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
package de.hybris.platform.acceleratorfacades.cart.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.order.data.CartData;

public  class CartWrapperData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CartWrapperData.cartData</code> property defined at extension <code>acceleratorfacades</code>. */
		
	private CartData cartData;

	/** <i>Generated property</i> for <code>CartWrapperData.errorMsg</code> property defined at extension <code>acceleratorfacades</code>. */
		
	private String errorMsg;

	/** <i>Generated property</i> for <code>CartWrapperData.successMsg</code> property defined at extension <code>acceleratorfacades</code>. */
		
	private String successMsg;
	
	public CartWrapperData()
	{
		// default constructor
	}
	
		
	
	public void setCartData(final CartData cartData)
	{
		this.cartData = cartData;
	}

		
	
	public CartData getCartData() 
	{
		return cartData;
	}
	
		
	
	public void setErrorMsg(final String errorMsg)
	{
		this.errorMsg = errorMsg;
	}

		
	
	public String getErrorMsg() 
	{
		return errorMsg;
	}
	
		
	
	public void setSuccessMsg(final String successMsg)
	{
		this.successMsg = successMsg;
	}

		
	
	public String getSuccessMsg() 
	{
		return successMsg;
	}
	


}
