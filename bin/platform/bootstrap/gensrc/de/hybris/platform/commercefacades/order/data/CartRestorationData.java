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
package de.hybris.platform.commercefacades.order.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.order.data.CartModificationData;
import java.util.List;

public  class CartRestorationData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CartRestorationData.modifications</code> property defined at extension <code>commercefacades</code>. */
		
	private List<CartModificationData> modifications;
	
	public CartRestorationData()
	{
		// default constructor
	}
	
		
	
	public void setModifications(final List<CartModificationData> modifications)
	{
		this.modifications = modifications;
	}

		
	
	public List<CartModificationData> getModifications() 
	{
		return modifications;
	}
	


}
