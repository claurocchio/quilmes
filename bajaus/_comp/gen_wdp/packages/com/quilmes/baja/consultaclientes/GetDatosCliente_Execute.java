// ---------------------------------------------------------------------------
// This file has been generated by the Web Dynpro Code Generator.
// ---------------------------------------------------------------------------
package com.quilmes.baja.consultaclientes;


/**
 * "GetDatosCliente_Execute" Adaptive Webservice ModelClass implementation
 * Copyright (c) 2005 - 2006. All rights reserved.
 * SAP AG
 * @author       File created by Web Dynpro code generator
 */

public final class GetDatosCliente_Execute extends com.sap.tc.webdynpro.model.webservice.gci.WSTypedModelClass
{
  public GetDatosCliente_Execute(ConsultaClientes modelInstance) {
    super(modelInstance, "GetDatosCliente_Execute");
  }

  public ConsultaClientes getModelInstance() {
    return (ConsultaClientes) this.associatedModel();
  }
  
  private GetDatosCliente_Execute(ConsultaClientes modelInstance, com.sap.tc.cmi.model.ICMIModelClass genericModelClass) {
    super(modelInstance, genericModelClass);
  }

  /**
   * Returns the factory for this typed model class.
   */
  static com.sap.tc.webdynpro.model.webservice.gci.IWSTypedModelClassFactory createModelClassFactory() {
    return new com.sap.tc.webdynpro.model.webservice.gci.IWSTypedModelClassFactory() {
      public com.sap.tc.cmi.model.ICMIModelClass createModelClass(com.sap.tc.webdynpro.model.webservice.gci.WSTypedModel typedModel, com.sap.tc.cmi.model.ICMIModelClass genericModelClass) {
        return new GetDatosCliente_Execute((ConsultaClientes)typedModel, genericModelClass);
      }
    };
  }  



  /* ***************************************************************************
   *  ModelAttribute -> Cliid
   * **************************************************************************/
  /** getter for ModelAttribute -> Cliid 
   *  @return value of ModelAttribute Cliid */
  public int getCliid() {
    return super.getAttributeValueAsInt("Cliid");
  }
  /** setter for ModelAttribute -> Cliid 
   *  @param value new value for ModelAttribute Cliid */
  public void setCliid(int value) {
    super.setAttributeValueAsInt("Cliid", value);
  }
  /* ***************************************************************************
   *  ModelAttribute -> Empid
   * **************************************************************************/
  /** getter for ModelAttribute -> Empid 
   *  @return value of ModelAttribute Empid */
  public short getEmpid() {
    return super.getAttributeValueAsShort("Empid");
  }
  /** setter for ModelAttribute -> Empid 
   *  @param value new value for ModelAttribute Empid */
  public void setEmpid(short value) {
    super.setAttributeValueAsShort("Empid", value);
  }
  /* ***************************************************************************
   *  ModelAttribute -> Pais
   * **************************************************************************/
  /** getter for ModelAttribute -> Pais 
   *  @return value of ModelAttribute Pais */
  public java.lang.String getPais() {
    return (java.lang.String)super.getAttributeValue("Pais");
  }
  /** setter for ModelAttribute -> Pais 
   *  @param value new value for ModelAttribute Pais */
  public void setPais(java.lang.String value) {
    super.setAttributeValue("Pais", value);
  }
}

