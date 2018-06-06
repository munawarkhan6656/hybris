/*
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
package de.hybris.platform.core.enums;

import de.hybris.platform.core.HybrisEnumValue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Generated enum PhoneContactInfoType declared at extension core.
 * <p/>
 * Phone type.
 */
@SuppressWarnings("PMD")
public class PhoneContactInfoType implements HybrisEnumValue
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PhoneContactInfoType";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "PhoneContactInfoType";
	private static final ConcurrentMap<String, PhoneContactInfoType> cache = new ConcurrentHashMap<String, PhoneContactInfoType>();
	/**
	* Generated enum value for PhoneContactInfoType.MOBILE declared at extension core.
	*/
	public static final PhoneContactInfoType MOBILE = valueOf("MOBILE");
	
	/**
	* Generated enum value for PhoneContactInfoType.WORK declared at extension core.
	*/
	public static final PhoneContactInfoType WORK = valueOf("WORK");
	
	/**
	* Generated enum value for PhoneContactInfoType.HOME declared at extension core.
	*/
	public static final PhoneContactInfoType HOME = valueOf("HOME");
	
	
	/** The code of this enum.*/
	private final String code;
	private final String codeLowerCase;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private PhoneContactInfoType(final String code)
	{
		this.code = code.intern();
		this.codeLowerCase = this.code.toLowerCase().intern();
	}
	
	
	/**
	 * Compares this object to the specified object. The result is <code>true</code>
	 * if and only if the argument is not <code>null</code> and is an <code>PhoneContactInfoType
	 * </code> object that contains the enum value <code>code</code> as this object.
	 *  
	 * @param obj the object to compare with.
	 * @return <code>true</code> if the objects are the same;
	 *         <code>false</code> otherwise.
	 */
	@Override
	public boolean equals(final Object obj)
	{
		try
		{
			final HybrisEnumValue enum2 = (HybrisEnumValue) obj;
			return this == enum2
			|| (enum2 != null && !this.getClass().isEnum() && !enum2.getClass().isEnum()
			&& this.getType().equalsIgnoreCase(enum2.getType()) && this.getCode().equalsIgnoreCase(enum2.getCode()));
		}
		catch (final ClassCastException e)
		{
			return false;
		}
	}
	
	/**
	 * Gets the code of this enum value.
	 *  
	 * @return code of value
	 */
	@Override
	public String getCode()
	{
		return this.code;
	}
	
	/**
	 * Gets the type this enum value belongs to.
	 *  
	 * @return code of type
	 */
	@Override
	public String getType()
	{
		return SIMPLE_CLASSNAME;
	}
	
	/**
	 * Returns a hash code for this <code>PhoneContactInfoType</code>.
	 *  
	 * @return a hash code value for this object, equal to the enum value <code>code</code>
	 *         represented by this <code>PhoneContactInfoType</code> object.
	 */
	@Override
	public int hashCode()
	{
		return this.codeLowerCase.hashCode();
	}
	
	/**
	 * Returns the code representing this enum value.
	 *  
	 * @return a string representation of the value of this object.
	 */
	@Override
	public String toString()
	{
		return this.code.toString();
	}
	
	/**
	 * Returns a <tt>PhoneContactInfoType</tt> instance representing the specified enum value.
	 *  
	 * @param code an enum value
	 * @return a <tt>PhoneContactInfoType</tt> instance representing <tt>value</tt>. 
	 */
	public static PhoneContactInfoType valueOf(final String code)
	{
		final String key = code.toLowerCase();
		PhoneContactInfoType result = cache.get(key);
		if (result == null)
		{
			PhoneContactInfoType newValue = new PhoneContactInfoType(code);
			PhoneContactInfoType previous = cache.putIfAbsent(key, newValue);
			result = previous != null ? previous : newValue;
		}
		return result;
	}
	
}
