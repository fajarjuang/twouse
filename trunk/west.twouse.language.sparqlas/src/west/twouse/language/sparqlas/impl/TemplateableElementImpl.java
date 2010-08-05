/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import west.twouse.language.sparqlas.SparqlasPackage;
import west.twouse.language.sparqlas.TemplateBinding;
import west.twouse.language.sparqlas.TemplateSignature;
import west.twouse.language.sparqlas.TemplateableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Templateable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.TemplateableElementImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.TemplateableElementImpl#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TemplateableElementImpl extends EObjectImpl implements TemplateableElement
{
  /**
   * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedTemplateSignature()
   * @generated
   * @ordered
   */
  protected TemplateSignature ownedTemplateSignature;

  /**
   * The cached value of the '{@link #getTemplateBinding() <em>Template Binding</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateBinding()
   * @generated
   * @ordered
   */
  protected EList<TemplateBinding> templateBinding;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateableElementImpl()
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
    return SparqlasPackage.Literals.TEMPLATEABLE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateSignature getOwnedTemplateSignature()
  {
    return ownedTemplateSignature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature, NotificationChain msgs)
  {
    TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
    ownedTemplateSignature = newOwnedTemplateSignature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature)
  {
    if (newOwnedTemplateSignature != ownedTemplateSignature)
    {
      NotificationChain msgs = null;
      if (ownedTemplateSignature != null)
        msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, SparqlasPackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
      if (newOwnedTemplateSignature != null)
        msgs = ((InternalEObject)newOwnedTemplateSignature).eInverseAdd(this, SparqlasPackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
      msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateBinding> getTemplateBinding()
  {
    if (templateBinding == null)
    {
      templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, SparqlasPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, SparqlasPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
    }
    return templateBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SparqlasPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
        if (ownedTemplateSignature != null)
          msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
        return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
      case SparqlasPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SparqlasPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
        return basicSetOwnedTemplateSignature(null, msgs);
      case SparqlasPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
        return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SparqlasPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
        return getOwnedTemplateSignature();
      case SparqlasPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
        return getTemplateBinding();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SparqlasPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
        setOwnedTemplateSignature((TemplateSignature)newValue);
        return;
      case SparqlasPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
        getTemplateBinding().clear();
        getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
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
      case SparqlasPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
        setOwnedTemplateSignature((TemplateSignature)null);
        return;
      case SparqlasPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
        getTemplateBinding().clear();
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
      case SparqlasPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
        return ownedTemplateSignature != null;
      case SparqlasPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
        return templateBinding != null && !templateBinding.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TemplateableElementImpl