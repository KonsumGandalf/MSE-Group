/**
 */
package ecore_homework1.1.homework1_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getStatus()
 * @model
 * @generated
 */
public enum Status implements Enumerator
{
	/**
	 * The '<em><b>LITERAL0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERAL0_VALUE
	 * @generated
	 * @ordered
	 */
	LITERAL0(0, "LITERAL0", "LITERAL0"),

	/**
	 * The '<em><b>In  Prepartion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN _PREPARTION_VALUE
	 * @generated
	 * @ordered
	 */
	IN _PREPARTION(1, "In Prepartion", "In Prepartion"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(2, "Cancelled", "Cancelled"),

	/**
	 * The '<em><b>In  Delivery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN _DELIVERY_VALUE
	 * @generated
	 * @ordered
	 */
	IN _DELIVERY(3, "In Delivery", "In Delivery"),

	/**
	 * The '<em><b>Ready for  Pickup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY FOR _PICKUP_VALUE
	 * @generated
	 * @ordered
	 */
	READY FOR _PICKUP(4, "Ready for Pickup", "Ready for Pickup"),

	/**
	 * The '<em><b>Completed </b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED _VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED (5, "Completed ", "Completed ");

	/**
	 * The '<em><b>LITERAL0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERAL0
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LITERAL0_VALUE = 0;

	/**
	 * The '<em><b>In  Prepartion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN _PREPARTION
	 * @model name="In Prepartion"
	 * @generated
	 * @ordered
	 */
	public static final int IN _PREPARTION_VALUE = 1;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLED
	 * @model name="Cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 2;

	/**
	 * The '<em><b>In  Delivery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN _DELIVERY
	 * @model name="In Delivery"
	 * @generated
	 * @ordered
	 */
	public static final int IN _DELIVERY_VALUE = 3;

	/**
	 * The '<em><b>Ready for  Pickup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY FOR _PICKUP
	 * @model name="Ready for Pickup"
	 * @generated
	 * @ordered
	 */
	public static final int READY FOR _PICKUP_VALUE = 4;

	/**
	 * The '<em><b>Completed </b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED 
	 * @model name="Completed "
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED _VALUE = 5;

	/**
	 * An array of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Status[] VALUES_ARRAY =
		new Status[]
		{
			LITERAL0,
			IN _PREPARTION,
			CANCELLED,
			IN _DELIVERY,
			READY FOR _PICKUP,
			COMPLETED ,
		};

	/**
	 * A public read-only list of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Status> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Status get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			Status result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Status getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			Status result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Status get(int value)
	{
		switch (value)
		{
			case LITERAL0_VALUE: return LITERAL0;
			case IN _PREPARTION_VALUE: return IN _PREPARTION;
			case CANCELLED_VALUE: return CANCELLED;
			case IN _DELIVERY_VALUE: return IN _DELIVERY;
			case READY FOR _PICKUP_VALUE: return READY FOR _PICKUP;
			case COMPLETED _VALUE: return COMPLETED ;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Status(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //Status
