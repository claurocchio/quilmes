// ---------------------------------------------------------------------------
// This file has been generated by the Web Dynpro Code Generator.
// ---------------------------------------------------------------------------
package com.quilmes.baja.consultaclientes;


/**
 * "ArrayOfTerriClien" Adaptive Webservice ModelClass implementation
 * Copyright (c) 2005 - 2006. All rights reserved.
 * SAP AG
 * @author       File created by Web Dynpro code generator
 */

public final class ArrayOfTerriClien extends com.sap.tc.webdynpro.model.webservice.gci.WSTypedModelClass
{
  public ArrayOfTerriClien(ConsultaClientes modelInstance) {
    super(modelInstance, "ArrayOfTerriClien");
  }

  public ConsultaClientes getModelInstance() {
    return (ConsultaClientes) this.associatedModel();
  }
  
  private ArrayOfTerriClien(ConsultaClientes modelInstance, com.sap.tc.cmi.model.ICMIModelClass genericModelClass) {
    super(modelInstance, genericModelClass);
  }

  /**
   * Returns the factory for this typed model class.
   */
  static com.sap.tc.webdynpro.model.webservice.gci.IWSTypedModelClassFactory createModelClassFactory() {
    return new com.sap.tc.webdynpro.model.webservice.gci.IWSTypedModelClassFactory() {
      public com.sap.tc.cmi.model.ICMIModelClass createModelClass(com.sap.tc.webdynpro.model.webservice.gci.WSTypedModel typedModel, com.sap.tc.cmi.model.ICMIModelClass genericModelClass) {
        return new ArrayOfTerriClien((ConsultaClientes)typedModel, genericModelClass);
      }
    };
  }  

  /****************************************************************************
   *  1:n Relation -> TerriClien
   ***************************************************************************/

  /** getter for 1:n Relation Role -> TerriClien 
   *  @return java.util.List containing elements of 1:n Relation Role TerriClien */
  public java.util.List getTerriClien() {
    return (java.util.List)getRelatedModelObjects("TerriClien");
  }

  /** setter for 1:n Relation Role -> TerriClien 
   *  @param newList java.util.List replaces previous List of elements of 1:n Relation Role TerriClien */
  public void setTerriClien(java.util.List list) {
    setRelatedModelObjects("TerriClien", list);
  }

  /** adds an element to the 1:n Relation Role -> TerriClien 
   *  @param o object to be added to List of elements of 1:n Relation Role TerriClien
   *  @return true if element was added */
  public boolean addTerriClien(com.quilmes.baja.consultaclientes.TerriClien o) {
    return addRelatedModelObject("TerriClien", o);
  }

  /** removes the given element from the 1:n Relation Role -> TerriClien 
   *  @param o object to be removed from List of elements of 1:n Relation Role TerriClien 
   *  @return true if element existed and was removed */
  public boolean removeTerriClien(com.quilmes.baja.consultaclientes.TerriClien o)  {
    return removeRelatedModelObject("TerriClien", o);
  }


}

