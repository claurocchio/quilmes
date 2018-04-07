// ---------------------------------------------------------------------------
// This file has been generated by the Web Dynpro Code Generator.
// ---------------------------------------------------------------------------
package com.quilmes.baja.consultaclientes;


/**
 * "Response_Execute" Adaptive Webservice ModelClass implementation
 * Copyright (c) 2005 - 2006. All rights reserved.
 * SAP AG
 * @author       File created by Web Dynpro code generator
 */

public final class Response_Execute extends com.sap.tc.webdynpro.model.webservice.gci.WSTypedModelClass
{
  public Response_Execute(ConsultaClientes modelInstance) {
    super(modelInstance, "Response_Execute");
  }

  public ConsultaClientes getModelInstance() {
    return (ConsultaClientes) this.associatedModel();
  }
  
  private Response_Execute(ConsultaClientes modelInstance, com.sap.tc.cmi.model.ICMIModelClass genericModelClass) {
    super(modelInstance, genericModelClass);
  }

  /**
   * Returns the factory for this typed model class.
   */
  static com.sap.tc.webdynpro.model.webservice.gci.IWSTypedModelClassFactory createModelClassFactory() {
    return new com.sap.tc.webdynpro.model.webservice.gci.IWSTypedModelClassFactory() {
      public com.sap.tc.cmi.model.ICMIModelClass createModelClass(com.sap.tc.webdynpro.model.webservice.gci.WSTypedModel typedModel, com.sap.tc.cmi.model.ICMIModelClass genericModelClass) {
        return new Response_Execute((ConsultaClientes)typedModel, genericModelClass);
      }
    };
  }  


  /****************************************************************************
   * 1:1 Relation -> GetDatosClienteExecuteResponse
   ***************************************************************************/
  /** getter for 1:1 Relation Role -> GetDatosClienteExecuteResponse 
   *  @return value of ModelAttribute GetDatosClienteExecuteResponse */
  public com.quilmes.baja.consultaclientes.GetDatosCliente_ExecuteResponse getGetDatosClienteExecuteResponse() {
    return (com.quilmes.baja.consultaclientes.GetDatosCliente_ExecuteResponse)getRelatedModelObject("GetDatosClienteExecuteResponse");
  }
  
  /** setter for 1:1 Relation Role -> GetDatosClienteExecuteResponse 
   *  @param value new value for 1:1 Relation Role  GetDatosClienteExecuteResponse */
  public void setGetDatosClienteExecuteResponse(com.quilmes.baja.consultaclientes.GetDatosCliente_ExecuteResponse value) {
    setRelatedModelObject("GetDatosClienteExecuteResponse",value);
  }

}

