/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:32 PM
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
package de.hybris.platform.promotionengineservices.promotionengine.report.data;

import java.io.Serializable;
import de.hybris.platform.promotions.model.PromotionResultModel;
import de.hybris.platform.util.DiscountValue;

public  class PromotionEngineResult  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PromotionEngineResult.code</code> property defined at extension <code>promotionengineservices</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>PromotionEngineResult.name</code> property defined at extension <code>promotionengineservices</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>PromotionEngineResult.description</code> property defined at extension <code>promotionengineservices</code>. */
		
	private String description;

	/** <i>Generated property</i> for <code>PromotionEngineResult.discountValue</code> property defined at extension <code>promotionengineservices</code>. */
		
	private DiscountValue discountValue;

	/** <i>Generated property</i> for <code>PromotionEngineResult.promotionResult</code> property defined at extension <code>promotionengineservices</code>. */
		
	private PromotionResultModel promotionResult;

	/** <i>Generated property</i> for <code>PromotionEngineResult.fired</code> property defined at extension <code>promotionengineservices</code>. */
		
	private boolean fired;
	
	public PromotionEngineResult()
	{
		// default constructor
	}
	
		
	
	public void setCode(final String code)
	{
		this.code = code;
	}

		
	
	public String getCode() 
	{
		return code;
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	
		
	
	public void setDescription(final String description)
	{
		this.description = description;
	}

		
	
	public String getDescription() 
	{
		return description;
	}
	
		
	
	public void setDiscountValue(final DiscountValue discountValue)
	{
		this.discountValue = discountValue;
	}

		
	
	public DiscountValue getDiscountValue() 
	{
		return discountValue;
	}
	
		
	
	public void setPromotionResult(final PromotionResultModel promotionResult)
	{
		this.promotionResult = promotionResult;
	}

		
	
	public PromotionResultModel getPromotionResult() 
	{
		return promotionResult;
	}
	
		
	
	public void setFired(final boolean fired)
	{
		this.fired = fired;
	}

		
	
	public boolean isFired() 
	{
		return fired;
	}
	


}
