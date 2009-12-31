/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateableElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateBindingImpl#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateBindingImpl#getBoundElement <em>Bound Element</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateBindingImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateBindingImpl extends EObjectImpl implements TemplateBinding
{
  /**
   * The cached value of the '{@link #getParameterSubstitution() <em>Parameter Substitution</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterSubstitution()
   * @generated
   * @ordered
   */
  protected EList<TemplateParameterSubstitution> parameterSubstitution;

  /**
   * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignature()
   * @generated
   * @ordered
   */
  protected TemplateSignature signature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateBindingImpl()
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
    return Owl2fsPackage.Literals.TEMPLATE_BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateParameterSubstitution> getParameterSubstitution()
  {
    if (parameterSubstitution == null)
    {
      parameterSubstitution = new EObjectContainmentWithInverseEList<TemplateParameterSubstitution>(TemplateParameterSubstitution.class, this, Owl2fsPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING);
    }
    return parameterSubstitution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateableElement getBoundElement()
  {
    if (eContainerFeatureID() != Owl2fsPackage.TEMPLATE_BINDING__BOUND_ELEMENT) return null;
    return (TemplateableElement)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBoundElement(TemplateableElement newBoundElement, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newBoundElement, Owl2fsPackage.TEMPLATE_BINDING__BOUND_ELEMENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoundElement(TemplateableElement newBoundElement)
  {
    if (newBoundElement != eInternalContainer() || (eContainerFeatureID() != Owl2fsPackage.TEMPLATE_BINDING__BOUND_ELEMENT && newBoundElement != null))
    {
      if (EcoreUtil.isAncestor(this, newBoundElement))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newBoundElement != null)
        msgs = ((InternalEObject)newBoundElement).eInverseAdd(this, Owl2fsPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, TemplateableElement.class, msgs);
      msgs = basicSetBoundElement(newBoundElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.TEMPLATE_BINDING__BOUND_ELEMENT, newBoundElement, newBoundElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateSignature getSignature()
  {
    if (signature != null && signature.eIsProxy())
    {
      InternalEObject oldSignature = (InternalEObject)signature;
      signature = (TemplateSignature)eResolveProxy(oldSignature);
      if (signature != oldSignature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Owl2fsPackage.TEMPLATE_BINDING__SIGNATURE, oldSignature, signature));
      }
    }
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateSignature basicGetSignature()
  {
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignature(TemplateSignature newSignature)
  {
    TemplateSignature oldSignature = signature;
    signature = newSignature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.TEMPLATE_BINDING__SIGNATURE, oldSignature, signature));
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
      case Owl2fsPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterSubstitution()).basicAdd(otherEnd, msgs);
      case Owl2fsPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetBoundElement((TemplateableElement)otherEnd, msgs);
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
      case Owl2fsPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
        return ((InternalEList<?>)getParameterSubstitution()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
        return basicSetBoundElement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case Owl2fsPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
        return eInternalContainer().eInverseRemove(this, Owl2fsPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, TemplateableElement.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case Owl2fsPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
        return getParameterSubstitution();
      case Owl2fsPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
        return getBoundElement();
      case Owl2fsPackage.TEMPLATE_BINDING__SIGNATURE:
        if (resolve) return getSignature();
        return basicGetSignature();
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
      case Owl2fsPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
        getParameterSubstitution().clear();
        getParameterSubstitution().addAll((Collection<? extends TemplateParameterSubstitution>)newValue);
        return;
      case Owl2fsPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
        setBoundElement((TemplateableElement)newValue);
        return;
      case Owl2fsPackage.TEMPLATE_BINDING__SIGNATURE:
        setSignature((TemplateSignature)newValue);
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
      case Owl2fsPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
        getParameterSubstitution().clear();
        return;
      case Owl2fsPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
        setBoundElement((TemplateableElement)null);
        return;
      case Owl2fsPackage.TEMPLATE_BINDING__SIGNATURE:
        setSignature((TemplateSignature)null);
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
      case Owl2fsPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
        return parameterSubstitution != null && !parameterSubstitution.isEmpty();
      case Owl2fsPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
        return getBoundElement() != null;
      case Owl2fsPackage.TEMPLATE_BINDING__SIGNATURE:
        return signature != null;
    }
    return super.eIsSet(featureID);
  }

} //TemplateBindingImpl
