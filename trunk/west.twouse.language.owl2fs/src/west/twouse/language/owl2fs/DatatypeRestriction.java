/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DatatypeRestriction#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DatatypeRestriction#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDatatypeRestriction()
 * @model
 * @generated
 */
public interface DatatypeRestriction extends DataRange, Expression
{
  /**
   * Returns the value of the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datatype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype</em>' containment reference.
   * @see #setDatatype(Datatype)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDatatypeRestriction_Datatype()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  Datatype getDatatype();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DatatypeRestriction#getDatatype <em>Datatype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype</em>' containment reference.
   * @see #getDatatype()
   * @generated
   */
  void setDatatype(Datatype value);

  /**
   * Returns the value of the '<em><b>Restrictions</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.FacetConstraintPair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restrictions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restrictions</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDatatypeRestriction_Restrictions()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  EList<FacetConstraintPair> getRestrictions();

} // DatatypeRestriction