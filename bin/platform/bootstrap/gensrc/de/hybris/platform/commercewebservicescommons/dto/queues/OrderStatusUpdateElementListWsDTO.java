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
package de.hybris.platform.commercewebservicescommons.dto.queues;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.queues.OrderStatusUpdateElementWsDTO;
import java.util.List;

public  class OrderStatusUpdateElementListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>OrderStatusUpdateElementListWsDTO.orderStatusUpdateElements</code> property defined at extension <code>commercewebservicescommons</code>. */
		
	private List<OrderStatusUpdateElementWsDTO> orderStatusUpdateElements;
	
	public OrderStatusUpdateElementListWsDTO()
	{
		// default constructor
	}
	
		
	
	public void setOrderStatusUpdateElements(final List<OrderStatusUpdateElementWsDTO> orderStatusUpdateElements)
	{
		this.orderStatusUpdateElements = orderStatusUpdateElements;
	}

		
	
	public List<OrderStatusUpdateElementWsDTO> getOrderStatusUpdateElements() 
	{
		return orderStatusUpdateElements;
	}
	


}
