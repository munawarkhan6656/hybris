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
import de.hybris.platform.adaptivesearch.model.AbstractAsSearchProfileModel;
import de.hybris.platform.adaptivesearch.model.AsSimpleSearchConfigurationModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;

/**
 * Generated model class for type AsSimpleSearchProfile first defined at extension adaptivesearch.
 */
@SuppressWarnings("all")
public class AsSimpleSearchProfileModel extends AbstractAsSearchProfileModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AsSimpleSearchProfile";
	
	/** <i>Generated constant</i> - Attribute key of <code>AsSimpleSearchProfile.searchConfigurations</code> attribute defined at extension <code>adaptivesearch</code>. */
	public static final String SEARCHCONFIGURATIONS = "searchConfigurations";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AsSimpleSearchProfileModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AsSimpleSearchProfileModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractAsSearchProfile</code> at extension <code>adaptivesearch</code>
	 * @param _indexType initial attribute declared by type <code>AbstractAsSearchProfile</code> at extension <code>adaptivesearch</code>
	 */
	@Deprecated
	public AsSimpleSearchProfileModel(final String _code, final String _indexType)
	{
		super();
		setCode(_code);
		setIndexType(_indexType);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>AbstractAsSearchProfile</code> at extension <code>adaptivesearch</code>
	 * @param _code initial attribute declared by type <code>AbstractAsSearchProfile</code> at extension <code>adaptivesearch</code>
	 * @param _indexType initial attribute declared by type <code>AbstractAsSearchProfile</code> at extension <code>adaptivesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public AsSimpleSearchProfileModel(final CatalogVersionModel _catalogVersion, final String _code, final String _indexType, final ItemModel _owner)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setIndexType(_indexType);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AsSimpleSearchProfile.searchConfigurations</code> attribute defined at extension <code>adaptivesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the searchConfigurations
	 */
	@Accessor(qualifier = "searchConfigurations", type = Accessor.Type.GETTER)
	public List<AsSimpleSearchConfigurationModel> getSearchConfigurations()
	{
		return getPersistenceContext().getPropertyValue(SEARCHCONFIGURATIONS);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AsSimpleSearchProfile.searchConfigurations</code> attribute defined at extension <code>adaptivesearch</code>. 
	 *  
	 * @param value the searchConfigurations
	 */
	@Accessor(qualifier = "searchConfigurations", type = Accessor.Type.SETTER)
	public void setSearchConfigurations(final List<AsSimpleSearchConfigurationModel> value)
	{
		getPersistenceContext().setPropertyValue(SEARCHCONFIGURATIONS, value);
	}
	
}
