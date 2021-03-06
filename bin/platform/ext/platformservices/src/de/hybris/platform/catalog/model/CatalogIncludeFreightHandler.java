/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.catalog.model;


import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;


public class CatalogIncludeFreightHandler implements DynamicAttributeHandler<Boolean, CatalogModel>
{
	@Override
	public Boolean get(final CatalogModel model)
	{
		final CatalogVersionModel activeCatalogVersion = model.getActiveCatalogVersion();
		if (activeCatalogVersion != null)
		{
			return activeCatalogVersion.getInclPacking();
		}
		return null;
	}

	@Override
	public void set(final CatalogModel model, final Boolean aBoolean)
	{
	}
}
