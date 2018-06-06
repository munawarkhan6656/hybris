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
package de.hybris.platform.adaptivesearch.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.adaptivesearch.model.AbstractAsBoostItemConfigurationModel;
import de.hybris.platform.adaptivesearch.model.AbstractAsConfigurableSearchConfigurationModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type AsExcludedItem first defined at extension adaptivesearch.
 */
@SuppressWarnings("all")
public class AsExcludedItemModel extends AbstractAsBoostItemConfigurationModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AsExcludedItem";
	
	/**<i>Generated relation code constant for relation <code>AsConfigurableSearchConfiguration2ExcludedItemRelation</code> defining source attribute <code>searchConfiguration</code> in extension <code>adaptivesearch</code>.</i>*/
	public final static String _ASCONFIGURABLESEARCHCONFIGURATION2EXCLUDEDITEMRELATION = "AsConfigurableSearchConfiguration2ExcludedItemRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>AsExcludedItem.searchConfigurationPOS</code> attribute defined at extension <code>adaptivesearch</code>. */
	public static final String SEARCHCONFIGURATIONPOS = "searchConfigurationPOS";
	
	/** <i>Generated constant</i> - Attribute key of <code>AsExcludedItem.searchConfiguration</code> attribute defined at extension <code>adaptivesearch</code>. */
	public static final String SEARCHCONFIGURATION = "searchConfiguration";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AsExcludedItemModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AsExcludedItemModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _item initial attribute declared by type <code>AbstractAsBoostItemConfiguration</code> at extension <code>adaptivesearch</code>
	 * @param _searchConfiguration initial attribute declared by type <code>AsExcludedItem</code> at extension <code>adaptivesearch</code>
	 * @param _uid initial attribute declared by type <code>AbstractAsBoostItemConfiguration</code> at extension <code>adaptivesearch</code>
	 * @param _uniqueIdx initial attribute declared by type <code>AbstractAsBoostItemConfiguration</code> at extension <code>adaptivesearch</code>
	 */
	@Deprecated
	public AsExcludedItemModel(final ItemModel _item, final AbstractAsConfigurableSearchConfigurationModel _searchConfiguration, final String _uid, final String _uniqueIdx)
	{
		super();
		setItem(_item);
		setSearchConfiguration(_searchConfiguration);
		setUid(_uid);
		setUniqueIdx(_uniqueIdx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>AbstractAsBoostItemConfiguration</code> at extension <code>adaptivesearch</code>
	 * @param _item initial attribute declared by type <code>AbstractAsBoostItemConfiguration</code> at extension <code>adaptivesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _searchConfiguration initial attribute declared by type <code>AsExcludedItem</code> at extension <code>adaptivesearch</code>
	 * @param _uid initial attribute declared by type <code>AbstractAsBoostItemConfiguration</code> at extension <code>adaptivesearch</code>
	 * @param _uniqueIdx initial attribute declared by type <code>AbstractAsBoostItemConfiguration</code> at extension <code>adaptivesearch</code>
	 */
	@Deprecated
	public AsExcludedItemModel(final CatalogVersionModel _catalogVersion, final ItemModel _item, final ItemModel _owner, final AbstractAsConfigurableSearchConfigurationModel _searchConfiguration, final String _uid, final String _uniqueIdx)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setItem(_item);
		setOwner(_owner);
		setSearchConfiguration(_searchConfiguration);
		setUid(_uid);
		setUniqueIdx(_uniqueIdx);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AsExcludedItem.searchConfiguration</code> attribute defined at extension <code>adaptivesearch</code>. 
	 * @return the searchConfiguration
	 */
	@Accessor(qualifier = "searchConfiguration", type = Accessor.Type.GETTER)
	public AbstractAsConfigurableSearchConfigurationModel getSearchConfiguration()
	{
		return getPersistenceContext().getPropertyValue(SEARCHCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AsExcludedItem.searchConfiguration</code> attribute defined at extension <code>adaptivesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the searchConfiguration
	 */
	@Accessor(qualifier = "searchConfiguration", type = Accessor.Type.SETTER)
	public void setSearchConfiguration(final AbstractAsConfigurableSearchConfigurationModel value)
	{
		getPersistenceContext().setPropertyValue(SEARCHCONFIGURATION, value);
	}
	
}
