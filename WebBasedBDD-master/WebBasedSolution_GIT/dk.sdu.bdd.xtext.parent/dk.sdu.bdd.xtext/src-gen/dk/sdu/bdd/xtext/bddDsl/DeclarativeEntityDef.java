/**
 * generated by Xtext 2.32.0
 */
package dk.sdu.bdd.xtext.bddDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarative Entity Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityDef#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityDef#getSuperEntities <em>Super Entities</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityDef#getActions <em>Actions</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityDef#getStates <em>States</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityDef#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getDeclarativeEntityDef()
 * @model
 * @generated
 */
public interface DeclarativeEntityDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getDeclarativeEntityDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Entities</b></em>' reference list.
   * The list contents are of type {@link dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityDef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Entities</em>' reference list.
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getDeclarativeEntityDef_SuperEntities()
   * @model
   * @generated
   */
  EList<DeclarativeEntityDef> getSuperEntities();

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.bdd.xtext.bddDsl.ActionDef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getDeclarativeEntityDef_Actions()
   * @model containment="true"
   * @generated
   */
  EList<ActionDef> getActions();

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.bdd.xtext.bddDsl.StateDef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getDeclarativeEntityDef_States()
   * @model containment="true"
   * @generated
   */
  EList<StateDef> getStates();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.bdd.xtext.bddDsl.PropertyDef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getDeclarativeEntityDef_Properties()
   * @model containment="true"
   * @generated
   */
  EList<PropertyDef> getProperties();

} // DeclarativeEntityDef
