/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 5, 2018 12:47:08 PM                     ---
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
 *  
 */
package de.hybris.platform.promotions.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.promotions.model.PromotionNullActionModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type CachedPromotionNullAction first defined at extension promotions.
 */
@SuppressWarnings("all")
public class CachedPromotionNullActionModel extends PromotionNullActionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CachedPromotionNullAction";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CachedPromotionNullActionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CachedPromotionNullActionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CachedPromotionNullActionModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
}
