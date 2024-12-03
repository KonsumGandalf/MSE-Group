/**
 */
package homeworkPizzaShop.impl;

import homeworkPizzaShop.HomeworkPizzaShopPackage;
import homeworkPizzaShop.StoreManagementSystem;
import homeworkPizzaShop.Webapplication;
import homeworkPizzaShop.Webpage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Webapplication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.impl.WebapplicationImpl#getStoremanagementsystem <em>Storemanagementsystem</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.WebapplicationImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.WebapplicationImpl#getWebpage <em>Webpage</em>}</li>
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
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWebpage() <em>Webpage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebpage()
	 * @generated
	 * @ordered
	 */
	protected EList<Webpage> webpage;

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
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.WEBAPPLICATION__DOMAIN,
					oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Webpage> getWebpage() {
		if (webpage == null) {
			webpage = new EObjectContainmentEList<Webpage>(Webpage.class, this,
					HomeworkPizzaShopPackage.WEBAPPLICATION__WEBPAGE);
		}
		return webpage;
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
		case HomeworkPizzaShopPackage.WEBAPPLICATION__WEBPAGE:
			return ((InternalEList<?>) getWebpage()).basicRemove(otherEnd, msgs);
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
		case HomeworkPizzaShopPackage.WEBAPPLICATION__DOMAIN:
			return getDomain();
		case HomeworkPizzaShopPackage.WEBAPPLICATION__WEBPAGE:
			return getWebpage();
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
		case HomeworkPizzaShopPackage.WEBAPPLICATION__DOMAIN:
			setDomain((String) newValue);
			return;
		case HomeworkPizzaShopPackage.WEBAPPLICATION__WEBPAGE:
			getWebpage().clear();
			getWebpage().addAll((Collection<? extends Webpage>) newValue);
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
		case HomeworkPizzaShopPackage.WEBAPPLICATION__DOMAIN:
			setDomain(DOMAIN_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.WEBAPPLICATION__WEBPAGE:
			getWebpage().clear();
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
		case HomeworkPizzaShopPackage.WEBAPPLICATION__DOMAIN:
			return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
		case HomeworkPizzaShopPackage.WEBAPPLICATION__WEBPAGE:
			return webpage != null && !webpage.isEmpty();
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
		result.append(" (domain: ");
		result.append(domain);
		result.append(')');
		return result.toString();
	}

} //WebapplicationImpl
