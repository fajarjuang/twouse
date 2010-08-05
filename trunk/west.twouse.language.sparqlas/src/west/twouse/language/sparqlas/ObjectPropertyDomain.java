/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.ObjectPropertyDomain#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.ObjectPropertyDomain#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getObjectPropertyDomain()
 * @model
 * @generated
 */
public interface ObjectPropertyDomain extends ObjectPropertyAtom
{
  /**
   * Returns the value of the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Property Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Expression</em>' containment reference.
   * @see #setObjectPropertyExpression(ObjectPropertyExpression)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getObjectPropertyDomain_ObjectPropertyExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ObjectPropertyExpression getObjectPropertyExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.ObjectPropertyDomain#getObjectPropertyExpression <em>Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property Expression</em>' containment reference.
   * @see #getObjectPropertyExpression()
   * @generated
   */
  void setObjectPropertyExpression(ObjectPropertyExpression value);

  /**
   * Returns the value of the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' containment reference.
   * @see #setDomain(ClassExpression)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getObjectPropertyDomain_Domain()
   * @model containment="true" required="true"
   * @generated
   */
  ClassExpression getDomain();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.ObjectPropertyDomain#getDomain <em>Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' containment reference.
   * @see #getDomain()
   * @generated
   */
  void setDomain(ClassExpression value);

} // ObjectPropertyDomain