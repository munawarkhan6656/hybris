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
package de.hybris.platform.commerceservices.address.data;

import java.io.Serializable;

/**
 * POJO representation of an address field error.
 */
public  class AddressFieldErrorData<FIELD_TYPE, ERROR_CODE>  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AddressFieldErrorData<FIELD_TYPE, ERROR_CODE>.fieldType</code> property defined at extension <code>commerceservices</code>. */
		
	private FIELD_TYPE fieldType;

	/** <i>Generated property</i> for <code>AddressFieldErrorData<FIELD_TYPE, ERROR_CODE>.errorCode</code> property defined at extension <code>commerceservices</code>. */
		
	private ERROR_CODE errorCode;
	
	public AddressFieldErrorData()
	{
		// default constructor
	}
	
		
	
	public void setFieldType(final FIELD_TYPE fieldType)
	{
		this.fieldType = fieldType;
	}

		
	
	public FIELD_TYPE getFieldType() 
	{
		return fieldType;
	}
	
		
	
	public void setErrorCode(final ERROR_CODE errorCode)
	{
		this.errorCode = errorCode;
	}

		
	
	public ERROR_CODE getErrorCode() 
	{
		return errorCode;
	}
	


}
