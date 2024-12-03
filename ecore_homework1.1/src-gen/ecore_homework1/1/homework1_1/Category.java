/**
 */
package ecore_homework1.1.homework1_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getCategory()
 * @model
 * @generated
 */
public enum Category implements Enumerator
{
	/**
	 * The '<em><b>On  Sale</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON _SALE_VALUE
	 * @generated
	 * @ordered
	 */
	ON _SALE(0, "On Sale", "On Sale"),

	/**
	 * The '<em><b>Vegan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEGAN_VALUE
	 * @generated
	 * @ordered
	 */
	VEGAN(1, "Vegan", "Vegan"),

	/**
	 * The '<em><b>Vegetarian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEGETARIAN_VALUE
	 * @generated
	 * @ordered
	 */
	VEGETARIAN(2, "Vegetarian", "Vegetarian"),

	/**
	 * The '<em><b>Meat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAT_VALUE
	 * @generated
	 * @ordered
	 */
	MEAT(3, "Meat", "Meat"),

	/**
	 * The '<em><b>Snacks</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNACKS_VALUE
	 * @generated
	 * @ordered
	 */
	SNACKS(4, "Snacks", "Snacks"),

	/**
	 * The '<em><b>Gluten  Free</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLUTEN _FREE_VALUE
	 * @generated
	 * @ordered
	 */
	GLUTEN _FREE(5, "Gluten Free", "Gluten Free"),

	/**
	 * The '<em><b>Dessert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESSERT_VALUE
	 * @generated
	 * @ordered
	 */
	DESSERT(6, "Dessert", "Dessert"),

	/**
	 * The '<em><b>Softdrinks</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTDRINKS_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTDRINKS(7, "Softdrinks", "Softdrinks"),

	/**
	 * The '<em><b>Milkshake</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILKSHAKE_VALUE
	 * @generated
	 * @ordered
	 */
	MILKSHAKE(8, "Milkshake", "Milkshake");

	/**
	 * The '<em><b>On  Sale</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON _SALE
	 * @model name="On Sale"
	 * @generated
	 * @ordered
	 */
	public static final int ON _SALE_VALUE = 0;

	/**
	 * The '<em><b>Vegan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEGAN
	 * @model name="Vegan"
	 * @generated
	 * @ordered
	 */
	public static final int VEGAN_VALUE = 1;

	/**
	 * The '<em><b>Vegetarian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEGETARIAN
	 * @model name="Vegetarian"
	 * @generated
	 * @ordered
	 */
	public static final int VEGETARIAN_VALUE = 2;

	/**
	 * The '<em><b>Meat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAT
	 * @model name="Meat"
	 * @generated
	 * @ordered
	 */
	public static final int MEAT_VALUE = 3;

	/**
	 * The '<em><b>Snacks</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNACKS
	 * @model name="Snacks"
	 * @generated
	 * @ordered
	 */
	public static final int SNACKS_VALUE = 4;

	/**
	 * The '<em><b>Gluten  Free</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLUTEN _FREE
	 * @model name="Gluten Free"
	 * @generated
	 * @ordered
	 */
	public static final int GLUTEN _FREE_VALUE = 5;

	/**
	 * The '<em><b>Dessert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESSERT
	 * @model name="Dessert"
	 * @generated
	 * @ordered
	 */
	public static final int DESSERT_VALUE = 6;

	/**
	 * The '<em><b>Softdrinks</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTDRINKS
	 * @model name="Softdrinks"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTDRINKS_VALUE = 7;

	/**
	 * The '<em><b>Milkshake</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILKSHAKE
	 * @model name="Milkshake"
	 * @generated
	 * @ordered
	 */
	public static final int MILKSHAKE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Category[] VALUES_ARRAY =
		new Category[]
		{
			ON _SALE,
			VEGAN,
			VEGETARIAN,
			MEAT,
			SNACKS,
			GLUTEN _FREE,
			DESSERT,
			SOFTDRINKS,
			MILKSHAKE,
		};

	/**
	 * A public read-only list of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Category> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			Category result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			Category result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category get(int value)
	{
		switch (value)
		{
			case ON _SALE_VALUE: return ON _SALE;
			case VEGAN_VALUE: return VEGAN;
			case VEGETARIAN_VALUE: return VEGETARIAN;
			case MEAT_VALUE: return MEAT;
			case SNACKS_VALUE: return SNACKS;
			case GLUTEN _FREE_VALUE: return GLUTEN _FREE;
			case DESSERT_VALUE: return DESSERT;
			case SOFTDRINKS_VALUE: return SOFTDRINKS;
			case MILKSHAKE_VALUE: return MILKSHAKE;
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
	private Category(int value, String name, String literal)
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
	
} //Category
