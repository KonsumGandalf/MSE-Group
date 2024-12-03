/**
 */
package homeworkPizzaShop.impl;

import homeworkPizzaShop.HomeworkPizzaShopPackage;
import homeworkPizzaShop.StoreManagementSystem;
import homeworkPizzaShop.Webapplication;
import homeworkPizzaShop.Website;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Webapplication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.impl.WebapplicationImpl#getStoremanagementsystem <em>Storemanagementsystem</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.WebapplicationImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.WebapplicationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebapplicationImpl extends MinimalEObjectImpl.Container implements Webapplication {
	/**
	 * The cached value of the '{@link #getStoremanagementsystem() <em>Storemanagementsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoremanagementsystem()
	 * @generated
	 * @ordered
	 */
	protected StoreManagementSystem storemanagementsystem;

	/**
	 * The cached value of the '{@link #getWebsite() <em>Website</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected Website website;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebapplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HomeworkPizzaShopPackage.Literals.WEBAPPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoreManagementSystem getStoremanagementsystem() {
		return storemanagementsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStoremanagementsystem(StoreManagementSystem newStoremanagementsystem,
			NotificationChain msgs) {
		StoreManagementSystem oldStoremanagementsystem = storemanagementsystem;
		storemanagementsystem = newStoremanagementsystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HomeworkPizzaShopPackage.WEBAPPLICATION__STOREMANAGEMENTSYSTEM, oldStoremanagementsystem,
					newStoremanagementsystem);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoremanagementsystem(StoreManagementSystem newStoremanagementsystem) {
		if (newStoremanagementsystem != storemanagementsystem) {
			NotificationChain msgs = null;
			if (storemanagementsystem != null)
				msgs = ((InternalEObject) storemanagementsystem).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HomeworkPizzaShopPackage.WEBAPPLICATION__STOREMANAGEMENTSYSTEM, null,
						msgs);
			if (newStoremanagementsystem != null)
				msgs = ((InternalEObject) newStoremanagementsystem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HomeworkPizzaShopPackage.WEBAPPLICATION__STOREMANAGEMENTSYSTEM, null,
						msgs);
			msgs = basicSetStoremanagementsystem(newStoremanagementsystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					HomeworkPizzaShopPackage.WEBAPPLICATION__STOREMANAGEMENTSYSTEM, newStoremanagementsystem,
					newStoremanagementsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Website getWebsite() {
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebsite(Website newWebsite, NotificationChain msgs) {
		Website oldWebsite = website;
		website = newWebsite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HomeworkPizzaShopPackage.WEBAPPLICATION__WEBSITE, oldWebsite, newWebsite);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebsite(Website newWebsite) {
		if (newWebsite != website) {
			NotificationChain msgs = null;
			if (website != null)
				msgs = ((InternalEObject) website).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HomeworkPizzaShopPackage.WEBAPPLICATION__WEBSITE, null, msgs);
			if (newWebsite != null)
				msgs = ((InternalEObject) newWebsite).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HomeworkPizzaShopPackage.WEBAPPLICATION__WEBSITE, null, msgs);
			msgs = basicSetWebsite(newWebsite, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.WEBAPPLICATION__WEBSITE,
					newWebsite, newWebsite));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.WEBAPPLICATION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.WEBAPPLICATION__STOREMANAGEMENTSYSTEM:
			return basicSetStoremanagementsystem(null, msgs);
		case HomeworkPizzaShopPackage.WEBAPPLICATION__WEBSITE:
			return basicSetWebsite(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.WEBAPPLICATION__STOREMANAGEMENTSYSTEM:
			return getStoremanagementsystem();
		case HomeworkPizzaShopPackage.WEBAPPLICATION__WEBSITE:
			return getWebsite();
		case HomeworkPizzaShopPackage.WEBAPPLICATION__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.WEBAPPLICATION__STOREMANAGEMENTSYSTEM:
			setStoremanagementsystem((StoreManagementSystem) newValue);
			return;
		case HomeworkPizzaShopPackage.WEBAPPLICATION__WEBSITE:
			setWebsite((Website) newValue);
			return;
		case HomeworkPizzaShopPackage.WEBAPPLICATION__NAME:
			setName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.WEBAPPLICATION__STOREMANAGEMENTSYSTEM:
			setStoremanagementsystem((StoreManagementSystem) null);
			return;
		case HomeworkPizzaShopPackage.WEBAPPLICATION__WEBSITE:
			setWebsite((Website) null);
			return;
		case HomeworkPizzaShopPackage.WEBAPPLICATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.WEBAPPLICATION__STOREMANAGEMENTSYSTEM:
			return storemanagementsystem != null;
		case HomeworkPizzaShopPackage.WEBAPPLICATION__WEBSITE:
			return website != null;
		case HomeworkPizzaShopPackage.WEBAPPLICATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WebapplicationImpl
