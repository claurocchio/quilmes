// ---------------------------------------------------------------------------
// This file has been generated by the Web Dynpro Code Generator.
// ---------------------------------------------------------------------------
package com.quilmes.baja_cliente;


/**
 * "BajaCliente_ExecuteResponse" Adaptive Webservice ModelClass implementation
 * Copyright (c) 2005 - 2006. All rights reserved.
 * SAP AG
 * @author       File created by Web Dynpro code generator
 */

public final class BajaCliente_ExecuteResponse extends com.sap.tc.webdynpro.model.webservice.gci.WSTypedModelClass
{
  public BajaCliente_ExecuteResponse(BajaCliente modelInstance) {
    super(modelInstance, "BajaCliente_ExecuteResponse");
  }

  public BajaCliente getModelInstance() {
    return (BajaCliente) this.associatedModel();
  }
  
  private BajaCliente_ExecuteResponse(BajaCliente modelInstance, com.sap.tc.cmi.model.ICMIModelClass genericModelClass) {
    super(modelInstance, genericModelClass);
  }

  /**
   * Returns the factory for this typed model class.
   */
  static com.sap.tc.webdynpro.model.webservice.gci.IWSTypedModelClassFactory createModelClassFactory() {
    return new com.sap.tc.webdynpro.model.webservice.gci.IWSTypedModelClassFactory() {
      public com.sap.tc.cmi.model.ICMIModelClass createModelClass(com.sap.tc.webdynpro.model.webservice.gci.WSTypedModel typedModel, com.sap.tc.cmi.model.ICMIModelClass genericModelClass) {
        return new BajaCliente_ExecuteResponse((BajaCliente)typedModel, genericModelClass);
      }
    };
  }  


  /****************************************************************************
   * 1:1 Relation -> Mensajes
   ***************************************************************************/
  /** getter for 1:1 Relation Role -> Mensajes 
   *  @return value of ModelAttribute Mensajes */
  public com.quilmes.baja_cliente.Mensajes getMensajes() {
    return (com.quilmes.baja_cliente.Mensajes)getRelatedModelObject("Mensajes");
  }
  
  /** setter for 1:1 Relation Role -> Mensajes 
   *  @param value new value for 1:1 Relation Role  Mensajes */
  public void setMensajes(com.quilmes.baja_cliente.Mensajes value) {
    setRelatedModelObject("Mensajes",value);
  }

}
