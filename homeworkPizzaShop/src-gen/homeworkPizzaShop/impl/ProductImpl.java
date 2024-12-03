/**
 */
package homeworkPizzaShop.impl;

import homeworkPizzaShop.CartItem;
import homeworkPizzaShop.HomeworkPizzaShopPackage;
import homeworkPizzaShop.Product;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.impl.ProductImpl#getProductID <em>Product ID</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.ProductImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.ProductImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.ProductImpl#isInStock <em>In Stock</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.ProductImpl#getCartitem <em>Cartitem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends MinimalEObjectImpl.Container implements Product {
	/**
	 * The default value of the '{@link #getProductID() <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected static final int PRODUCT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProductID() <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected int productID = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInStock() <em>In Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInStock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_STOCK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInStock() <em>In Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInStock()
	 * @generated
	 * @ordered
	 */
	protected boolean inStock = IN_STOCK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCartitem() <em>Cartitem</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartitem()
	 * @generated
	 * @ordered
	 */
	protected EList<CartItem> cartitem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HomeworkPizzaShopPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getProductID() {
		return productID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductID(int newProductID) {
		int oldProductID = productID;
		productID = newProductID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.PRODUCT__PRODUCT_ID,
					oldProductID, productID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.PRODUCT__PRICE, oldPrice,
					price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.PRODUCT__TITLE, oldTitle,
					title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInStock() {
		return inStock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInStock(boolean newInStock) {
		boolean oldInStock = inStock;
		inStock = newInStock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.PRODUCT__IN_STOCK,
					oldInStock, inStock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CartItem> getCartitem() {
		if (cartitem == null) {
			cartitem = new EObjectResolvingEList<CartItem>(CartItem.class, this,
					HomeworkPizzaShopPackage.PRODUCT__CARTITEM);
		}
		return cartitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.PRODUCT__PRODUCT_ID:
			return getProductID();
		case HomeworkPizzaShopPackage.PRODUCT__PRICE:
			return getPrice();
		case HomeworkPizzaShopPackage.PRODUCT__TITLE:
			return getTitle();
		case HomeworkPizzaShopPackage.PRODUCT__IN_STOCK:
			return isInStock();
		case HomeworkPizzaShopPackage.PRODUCT__CARTITEM:
			return getCartitem();
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
		case HomeworkPizzaShopPackage.PRODUCT__PRODUCT_ID:
			setProductID((Integer) newValue);
			return;
		case HomeworkPizzaShopPackage.PRODUCT__PRICE:
			setPrice((Float) newValue);
			return;
		case HomeworkPizzaShopPackage.PRODUCT__TITLE:
			setTitle((String) newValue);
			return;
		case HomeworkPizzaShopPackage.PRODUCT__IN_STOCK:
			setInStock((Boolean) newValue);
			return;
		case HomeworkPizzaShopPackage.PRODUCT__CARTITEM:
			getCartitem().clear();
			getCartitem().addAll((Collection<? extends CartItem>) newValue);
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
		case HomeworkPizzaShopPackage.PRODUCT__PRODUCT_ID:
			setProductID(PRODUCT_ID_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.PRODUCT__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.PRODUCT__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.PRODUCT__IN_STOCK:
			setInStock(IN_STOCK_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.PRODUCT__CARTITEM:
			getCartitem().clear();
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
		case HomeworkPizzaShopPackage.PRODUCT__PRODUCT_ID:
			return productID != PRODUCT_ID_EDEFAULT;
		case HomeworkPizzaShopPackage.PRODUCT__PRICE:
			return price != PRICE_EDEFAULT;
		case HomeworkPizzaShopPackage.PRODUCT__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case HomeworkPizzaShopPackage.PRODUCT__IN_STOCK:
			return inStock != IN_STOCK_EDEFAULT;
		case HomeworkPizzaShopPackage.PRODUCT__CARTITEM:
			return cartitem != null && !cartitem.isEmpty();
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
		result.append(" (productID: ");
		result.append(productID);
		result.append(", price: ");
		result.append(price);
		result.append(", title: ");
		result.append(title);
		result.append(", inStock: ");
		result.append(inStock);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
