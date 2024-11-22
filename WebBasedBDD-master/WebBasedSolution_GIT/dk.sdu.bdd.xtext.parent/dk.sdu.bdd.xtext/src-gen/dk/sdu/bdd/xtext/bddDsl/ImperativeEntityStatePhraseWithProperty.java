/**
 * generated by Xtext 2.32.0
 */
package dk.sdu.bdd.xtext.bddDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperative Entity State Phrase With Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityStatePhraseWithProperty#getEntity <em>Entity</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityStatePhraseWithProperty#getState <em>State</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityStatePhraseWithProperty#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityStatePhraseWithProperty()
 * @model
 * @generated
 */
public interface ImperativeEntityStatePhraseWithProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(ImperativeEntityRef)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityStatePhraseWithProperty_Entity()
   * @model containment="true"
   * @generated
   */
  ImperativeEntityRef getEntity();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityStatePhraseWithProperty#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(ImperativeEntityRef value);

  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(ImperativeStateName)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityStatePhraseWithProperty_State()
   * @model
   * @generated
   */
  ImperativeStateName getState();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityStatePhraseWithProperty#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(ImperativeStateName value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(ImperativePropertyRef)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityStatePhraseWithProperty_Property()
   * @model containment="true"
   * @generated
   */
  ImperativePropertyRef getProperty();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityStatePhraseWithProperty#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(ImperativePropertyRef value);

} // ImperativeEntityStatePhraseWithProperty