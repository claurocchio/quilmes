// ---------------------------------------------------------------------------
// This file has been generated by the Web Dynpro Code Generator.
// DO NOT MODIFY! CHANGES WILL BE LOST IF THE FILE IS REGENERATED.
// ---------------------------------------------------------------------------
package ar.com.quilmes.consulta.wdp;

import com.sap.tc.webdynpro.progmodel.api.*;
import com.sap.tc.webdynpro.progmodel.gci.*;
import com.sap.tc.webdynpro.progmodel.context.*;
import com.sap.tc.webdynpro.services.exceptions.WDRuntimeException;

public interface IExternalConsulta_CompInterface {

  /*
   * Event identifiers.
   */ 
    
  /** Event constant. */
  public static IWDEventId WD_EVENT_TECHNICAL_EXCEPTION = new com.sap.tc.webdynpro.progmodel.gci.impl.GCIEventId("TechnicalException", "Consulta_CompInterface", "Consulta_CompInterface");
  
  /**
   * Provides access to the generic API of this controller.
   */
  IWDController wdGetAPI();

  /** Declared method. */
  com.sap.caf.eu.gp.co.api.IGPTechnicalDescription getDescription( java.util.Locale locale );

  /** Declared method. */
  void execute( com.sap.caf.eu.gp.co.api.IGPExecutionContext executionContext );

  /** Declared method. */
  void complete( );

}