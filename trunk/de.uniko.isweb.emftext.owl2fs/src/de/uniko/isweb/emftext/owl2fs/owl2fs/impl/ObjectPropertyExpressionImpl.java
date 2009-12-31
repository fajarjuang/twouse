/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyExpressionImpl#isIsFunctional <em>Is Functional</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyExpressionImpl#isIsReflexive <em>Is Reflexive</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyExpressionImpl#isIsInverseFunctional <em>Is Inverse Functional</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyExpressionImpl#isIsIrreflexive <em>Is Irreflexive</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyExpressionImpl#isIsSymmetric <em>Is Symmetric</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyExpressionImpl#isIsTransitive <em>Is Transitive</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyExpressionImpl#isIsAsysmmetric <em>Is Asysmmetric</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ObjectPropertyExpressionImpl extends EObjectImpl implements ObjectPropertyExpression
{
  /**
   * The default value of the '{@link #isIsFunctional() <em>Is Functional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsFunctional()
   * @generated
   * @ordered
   */
  protected static final boolean IS_FUNCTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsFunctional() <em>Is Functional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsFunctional()
   * @generated
   * @ordered
   */
  protected boolean isFunctional = IS_FUNCTIONAL_EDEFAULT;

  /**
   * The default value of the '{@link #isIsReflexive() <em>Is Reflexive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsReflexive()
   * @generated
   * @ordered
   */
  protected static final boolean IS_REFLEXIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsReflexive() <em>Is Reflexive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsReflexive()
   * @generated
   * @ordered
   */
  protected boolean isReflexive = IS_REFLEXIVE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsInverseFunctional() <em>Is Inverse Functional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInverseFunctional()
   * @generated
   * @ordered
   */
  protected static final boolean IS_INVERSE_FUNCTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsInverseFunctional() <em>Is Inverse Functional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInverseFunctional()
   * @generated
   * @ordered
   */
  protected boolean isInverseFunctional = IS_INVERSE_FUNCTIONAL_EDEFAULT;

  /**
   * The default value of the '{@link #isIsIrreflexive() <em>Is Irreflexive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsIrreflexive()
   * @generated
   * @ordered
   */
  protected static final boolean IS_IRREFLEXIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsIrreflexive() <em>Is Irreflexive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsIrreflexive()
   * @generated
   * @ordered
   */
  protected boolean isIrreflexive = IS_IRREFLEXIVE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsSymmetric() <em>Is Symmetric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSymmetric()
   * @generated
   * @ordered
   */
  protected static final boolean IS_SYMMETRIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsSymmetric() <em>Is Symmetric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSymmetric()
   * @generated
   * @ordered
   */
  protected boolean isSymmetric = IS_SYMMETRIC_EDEFAULT;

  /**
   * The default value of the '{@link #isIsTransitive() <em>Is Transitive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTransitive()
   * @generated
   * @ordered
   */
  protected static final boolean IS_TRANSITIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsTransitive() <em>Is Transitive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTransitive()
   * @generated
   * @ordered
   */
  protected boolean isTransitive = IS_TRANSITIVE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsAsysmmetric() <em>Is Asysmmetric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAsysmmetric()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ASYSMMETRIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAsysmmetric() <em>Is Asysmmetric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAsysmmetric()
   * @generated
   * @ordered
   */
  protected boolean isAsysmmetric = IS_ASYSMMETRIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectPropertyExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Owl2fsPackage.Literals.OBJECT_PROPERTY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsFunctional()
  {
    return isFunctional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsFunctional(boolean newIsFunctional)
  {
    boolean oldIsFunctional = isFunctional;
    isFunctional = newIsFunctional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_FUNCTIONAL, oldIsFunctional, isFunctional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsReflexive()
  {
    return isReflexive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsReflexive(boolean newIsReflexive)
  {
    boolean oldIsReflexive = isReflexive;
    isReflexive = newIsReflexive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_REFLEXIVE, oldIsReflexive, isReflexive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsInverseFunctional()
  {
    return isInverseFunctional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsInverseFunctional(boolean newIsInverseFunctional)
  {
    boolean oldIsInverseFunctional = isInverseFunctional;
    isInverseFunctional = newIsInverseFunctional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_INVERSE_FUNCTIONAL, oldIsInverseFunctional, isInverseFunctional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsIrreflexive()
  {
    return isIrreflexive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsIrreflexive(boolean newIsIrreflexive)
  {
    boolean oldIsIrreflexive = isIrreflexive;
    isIrreflexive = newIsIrreflexive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_IRREFLEXIVE, oldIsIrreflexive, isIrreflexive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsSymmetric()
  {
    return isSymmetric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsSymmetric(boolean newIsSymmetric)
  {
    boolean oldIsSymmetric = isSymmetric;
    isSymmetric = newIsSymmetric;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_SYMMETRIC, oldIsSymmetric, isSymmetric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsTransitive()
  {
    return isTransitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsTransitive(boolean newIsTransitive)
  {
    boolean oldIsTransitive = isTransitive;
    isTransitive = newIsTransitive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_TRANSITIVE, oldIsTransitive, isTransitive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAsysmmetric()
  {
    return isAsysmmetric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAsysmmetric(boolean newIsAsysmmetric)
  {
    boolean oldIsAsysmmetric = isAsysmmetric;
    isAsysmmetric = newIsAsysmmetric;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_ASYSMMETRIC, oldIsAsysmmetric, isAsysmmetric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_FUNCTIONAL:
        return isIsFunctional();
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_REFLEXIVE:
        return isIsReflexive();
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_INVERSE_FUNCTIONAL:
        return isIsInverseFunctional();
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_IRREFLEXIVE:
        return isIsIrreflexive();
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_SYMMETRIC:
        return isIsSymmetric();
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_TRANSITIVE:
        return isIsTransitive();
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_ASYSMMETRIC:
        return isIsAsysmmetric();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_FUNCTIONAL:
        setIsFunctional((Boolean)newValue);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_REFLEXIVE:
        setIsReflexive((Boolean)newValue);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_INVERSE_FUNCTIONAL:
        setIsInverseFunctional((Boolean)newValue);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_IRREFLEXIVE:
        setIsIrreflexive((Boolean)newValue);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_SYMMETRIC:
        setIsSymmetric((Boolean)newValue);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_TRANSITIVE:
        setIsTransitive((Boolean)newValue);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_ASYSMMETRIC:
        setIsAsysmmetric((Boolean)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_FUNCTIONAL:
        setIsFunctional(IS_FUNCTIONAL_EDEFAULT);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_REFLEXIVE:
        setIsReflexive(IS_REFLEXIVE_EDEFAULT);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_INVERSE_FUNCTIONAL:
        setIsInverseFunctional(IS_INVERSE_FUNCTIONAL_EDEFAULT);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_IRREFLEXIVE:
        setIsIrreflexive(IS_IRREFLEXIVE_EDEFAULT);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_SYMMETRIC:
        setIsSymmetric(IS_SYMMETRIC_EDEFAULT);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_TRANSITIVE:
        setIsTransitive(IS_TRANSITIVE_EDEFAULT);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_ASYSMMETRIC:
        setIsAsysmmetric(IS_ASYSMMETRIC_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_FUNCTIONAL:
        return isFunctional != IS_FUNCTIONAL_EDEFAULT;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_REFLEXIVE:
        return isReflexive != IS_REFLEXIVE_EDEFAULT;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_INVERSE_FUNCTIONAL:
        return isInverseFunctional != IS_INVERSE_FUNCTIONAL_EDEFAULT;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_IRREFLEXIVE:
        return isIrreflexive != IS_IRREFLEXIVE_EDEFAULT;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_SYMMETRIC:
        return isSymmetric != IS_SYMMETRIC_EDEFAULT;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_TRANSITIVE:
        return isTransitive != IS_TRANSITIVE_EDEFAULT;
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_ASYSMMETRIC:
        return isAsysmmetric != IS_ASYSMMETRIC_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isFunctional: ");
    result.append(isFunctional);
    result.append(", isReflexive: ");
    result.append(isReflexive);
    result.append(", isInverseFunctional: ");
    result.append(isInverseFunctional);
    result.append(", isIrreflexive: ");
    result.append(isIrreflexive);
    result.append(", isSymmetric: ");
    result.append(isSymmetric);
    result.append(", isTransitive: ");
    result.append(isTransitive);
    result.append(", isAsysmmetric: ");
    result.append(isAsysmmetric);
    result.append(')');
    return result.toString();
  }

} //ObjectPropertyExpressionImpl
