/**
 */
package homeworkPizzaShop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getStatus()
 * @model
 * @generated
 */
public enum Status implements Enumerator {
	/**
	 * The '<em><b>In Prepartion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PREPARTION_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PREPARTION(1, "InPrepartion", "InPrepartion"),

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
	 * The '<em><b>In Delivery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_DELIVERY_VALUE
	 * @generated
	 * @ordered
	 */
	IN_DELIVERY(3, "InDelivery", "InDelivery"),

	/**
	 * The '<em><b>Ready For Pickup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY_FOR_PICKUP_VALUE
	 * @generated
	 * @ordered
	 */
	READY_FOR_PICKUP(4, "ReadyForPickup", "ReadyForPickup"),

	/**
	 * The '<em><b>Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(5, "Completed", "Completed");

	/**
	 * The '<em><b>In Prepartion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PREPARTION
	 * @model name="InPrepartion"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PREPARTION_VALUE = 1;

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
	 * The '<em><b>In Delivery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_DELIVERY
	 * @model name="InDelivery"
	 * @generated
	 * @ordered
	 */
	public static final int IN_DELIVERY_VALUE = 3;

	/**
	 * The '<em><b>Ready For Pickup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY_FOR_PICKUP
	 * @model name="ReadyForPickup"
	 * @generated
	 * @ordered
	 */
	public static final int READY_FOR_PICKUP_VALUE = 4;

	/**
	 * The '<em><b>Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED
	 * @model name="Completed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 5;

	/**
	 * An array of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Status[] VALUES_ARRAY = new Status[] { IN_PREPARTION, CANCELLED, IN_DELIVERY, READY_FOR_PICKUP,
			COMPLETED, };

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
	public static Status get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Status result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
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
	public static Status getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Status result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
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
	public static Status get(int value) {
		switch (value) {
		case IN_PREPARTION_VALUE:
			return IN_PREPARTION;
		case CANCELLED_VALUE:
			return CANCELLED;
		case IN_DELIVERY_VALUE:
			return IN_DELIVERY;
		case READY_FOR_PICKUP_VALUE:
			return READY_FOR_PICKUP;
		case COMPLETED_VALUE:
			return COMPLETED;
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
	private Status(int value, String name, String literal) {
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
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Status
