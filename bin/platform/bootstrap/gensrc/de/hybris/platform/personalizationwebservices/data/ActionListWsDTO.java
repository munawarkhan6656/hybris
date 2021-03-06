/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:34 PM
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
package de.hybris.platform.personalizationwebservices.data;

import java.io.Serializable;
import de.hybris.platform.personalizationfacades.data.ActionData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * List of actions
 */
@ApiModel(value="actionList", description="List of actions")
public  class ActionListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ActionListWsDTO.actions</code> property defined at extension <code>personalizationwebservices</code>. */
	@ApiModelProperty(name="actions") 	
	private List<ActionData> actions;
	
	public ActionListWsDTO()
	{
		// default constructor
	}
	
		
	
	public void setActions(final List<ActionData> actions)
	{
		this.actions = actions;
	}

		
	
	public List<ActionData> getActions() 
	{
		return actions;
	}
	


}
