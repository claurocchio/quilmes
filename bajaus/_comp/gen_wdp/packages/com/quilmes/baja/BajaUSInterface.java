// ---------------------------------------------------------------------------
// This file has been generated partially by the Web Dynpro Code Generator.
// MODIFY CODE ONLY IN SECTIONS ENCLOSED BY @@begin AND @@end.
// ALL OTHER CHANGES WILL BE LOST IF THE FILE IS REGENERATED.
// ---------------------------------------------------------------------------
package com.quilmes.baja;

// 
// IMPORTANT NOTE: 
// _ALL_ IMPORT STATEMENTS MUST BE PLACED IN THE FOLLOWING SECTION ENCLOSED
// BY @@begin imports AND @@end. FURTHERMORE, THIS SECTION MUST ALWAYS CONTAIN
// AT LEAST ONE IMPORT STATEMENT (E.G. THAT FOR IPrivateBajaUSInterface).
// OTHERWISE, USING THE ECLIPSE FUNCTION "Organize Imports" FOLLOWED BY
// A WEB DYNPRO CODE GENERATION (E.G. PROJECT BUILD) WILL RESULT IN THE LOSS
// OF IMPORT STATEMENTS.
//
//@@begin imports
import com.quilmes.baja.wdp.IPrivateBajaUSInterface;
import com.sap.caf.eu.gp.co.api.GPCallableObjectFactory;
import com.sap.caf.eu.gp.co.api.GPWebDynproResourceAccessor;
import com.sap.caf.eu.gp.co.api.IGPCOResultStateInfo;
import com.sap.caf.eu.gp.co.api.IGPExecutionContext;
import com.sap.caf.eu.gp.co.api.IGPTechnicalDescription;
import com.sap.caf.eu.gp.exception.api.GPEngineException;
import com.sap.caf.eu.gp.exception.api.GPInvocationException;
import com.sap.caf.eu.gp.exception.api.GPTechnicalCallableObjectException;
import com.sap.caf.eu.gp.structure.api.IGPAttributeInfo;
import com.sap.caf.eu.gp.structure.api.IGPStructure;
import com.sap.caf.eu.gp.structure.api.IGPStructureInfo;
import com.sap.tc.logging.Category;
import com.sap.tc.logging.Severity;
import com.sap.tc.webdynpro.progmodel.api.IWDTextAccessor;
//@@end

//@@begin documentation
//@@end

public class BajaUSInterface
{
  /**
   * Logging location.
   */
  private static final com.sap.tc.logging.Location logger = 
    com.sap.tc.logging.Location.getLocation(BajaUSInterface.class);

  static 
  {
    //@@begin id
    String id = "$Id$";
    //@@end
    com.sap.tc.logging.Location.getLocation("ID.com.sap.tc.webdynpro").infoT(id);
  }

  /**
   * Private access to the generated Web Dynpro counterpart 
   * for this controller class.  </p>
   *
   * Use <code>wdThis</code> to gain typed access to the context,
   * to trigger navigation via outbound plugs, to get and enable/disable
   * actions, fire declared events, and access used controllers and/or 
   * component usages.
   *
   * @see com.quilmes.baja.wdp.IPrivateBajaUSInterface for more details
   */
  private final IPrivateBajaUSInterface wdThis;

  /**
   * Root node of this controller's context. </p>
   *
   * Provides typed access not only to the elements of the root node 
   * but also to all nodes in the context (methods node<i>XYZ</i>()) 
   * and their currently selected element (methods current<i>XYZ</i>Element()). 
   * It also facilitates the creation of new elements for all nodes 
   * (methods create<i>XYZ</i>Element()). </p>
   *
   * @see com.quilmes.baja.wdp.IPrivateBajaUSInterface.IContextNode for more details.
   */
  private final IPrivateBajaUSInterface.IContextNode wdContext;

  /**
   * A shortcut for <code>wdThis.wdGetAPI()</code>. </p>
   * 
   * Represents the generic API of the generic Web Dynpro counterpart 
   * for this controller. </p>
   */
  private final com.sap.tc.webdynpro.progmodel.api.IWDController wdControllerAPI;
  
  /**
   * A shortcut for <code>wdThis.wdGetAPI().getComponent()</code>. </p>
   * 
   * Represents the generic API of the Web Dynpro component this controller 
   * belongs to. Can be used to access the message manager, the window manager,
   * to add/remove event handlers and so on. </p>
   */
  private final com.sap.tc.webdynpro.progmodel.api.IWDComponent wdComponentAPI;
  
  public BajaUSInterface(IPrivateBajaUSInterface wdThis)
  {
    this.wdThis = wdThis;
    this.wdContext = wdThis.wdGetContext();
    this.wdControllerAPI = wdThis.wdGetAPI();
    this.wdComponentAPI = wdThis.wdGetAPI().getComponent();
  }

  //@@begin javadoc:wdDoInit()
  /** Hook method called to initialize controller. */
  //@@end
  public void wdDoInit()
  {
    //@@begin wdDoInit()
    //@@end
  }

  //@@begin javadoc:wdDoExit()
  /** Hook method called to clean up controller. */
  //@@end
  public void wdDoExit()
  {
    //@@begin wdDoExit()
    //@@end
  }

  //@@begin javadoc:getDescription()
  /** Declared method. */
  //@@end
  public com.sap.caf.eu.gp.co.api.IGPTechnicalDescription getDescription( java.util.Locale locale )
  {
    //@@begin getDescription()

	try {
	IWDTextAccessor textAccessor = wdComponentAPI.getTextAccessor();
	GPWebDynproResourceAccessor resourceAccessor = new GPWebDynproResourceAccessor(textAccessor);
	IGPTechnicalDescription technicalDescription = GPCallableObjectFactory.createTechnicalDescription(
	"MDM_Clientes_Baja", "Modulo para baja de clientes", resourceAccessor, locale);
	
//	Pre-existing input structure (Parametros de Entrada)
	IGPStructureInfo input =
	technicalDescription.getInputStructureInfo();
	input.addAttribute("tipoUsuario", IGPAttributeInfo.BASE_STRING);
	input.addAttribute("codCliente", IGPAttributeInfo.BASE_SIGNED_INT);
	input.addAttribute("nroSolicitud", IGPAttributeInfo.BASE_SIGNED_LONG);
	
//	Pre-existing structure for output parameters (Parametros de Salida)
	IGPStructureInfo output = technicalDescription.getOutputStructureInfo();
//	Create the attributes in the output structure
	output.addAttribute("nroSolicitud", IGPAttributeInfo.BASE_SIGNED_LONG);
	
//	add result state
	IGPCOResultStateInfo result = technicalDescription.addResultState("Terminado");
	technicalDescription.addResultState("Rechazado");
	
	return technicalDescription;
	} catch (GPInvocationException e) {
	e.printStackTrace();
	wdComponentAPI.getMessageManager().reportWarning("Error GP: " + e.getMessage());
	logger.logT(Severity.ERROR, Category.APPLICATIONS, "Incorrect technical name");
	logger.traceThrowableT(Severity.ERROR, "Exception while creating technical description: ",e);
	return null;
	}

    //@@end
  }

  //@@begin javadoc:execute()
  /** Declared method. */
  //@@end
  public void execute( com.sap.caf.eu.gp.co.api.IGPExecutionContext executionContext )
  {
    //@@begin execute()
    String tipo = null;
    
	this.executionContext = executionContext;
	IWDTextAccessor textAccessor = wdComponentAPI.getTextAccessor();
	GPWebDynproResourceAccessor resourceAccesor = new GPWebDynproResourceAccessor(textAccessor);
	try {
		IGPStructure input = executionContext.getInputStructure();
		wdContext.currentContextElement().setNro_cliente(input.getAttributeAsInt("codCliente"));
		wdContext.currentContextElement().setNro_solicitud(input.getAttributeAsLong("nroSolicitud"));
		//Seteo si es master data o usuario final
		tipo = input.getAttributeAsString("tipoUsuario");
		if (tipo != null)
		{ if (tipo.trim().equals("Final") || tipo.trim().equals("final"))
			{ wdContext.currentContextElement().setTipo_usuario(null); }
	  	else
	  		{ wdContext.currentContextElement().setTipo_usuario("X"); }
		}	
		wdThis.wdGetBajaUSController().inicializar();
	} catch (GPInvocationException e) {
		e.printStackTrace();
		wdComponentAPI.getMessageManager().reportWarning("Error GP: " + e.getMessage());
		String localizedMessage = textAccessor.getText("ERROR_GETTING_PARAMETERS");
		wdThis.wdFireEventTechnicalException(
		new GPTechnicalCallableObjectException(logger, localizedMessage, e));
	}
    
    //@@end
  }

  //@@begin javadoc:complete()
  /** Declared method. */
  //@@end
  public void complete( java.lang.String status )
  {
    //@@begin complete()

	IWDTextAccessor textAccessor = wdComponentAPI.getTextAccessor();
	GPWebDynproResourceAccessor resourceAccesor = new GPWebDynproResourceAccessor(textAccessor);
	
	try {
		IGPStructure output = executionContext.getOutputStructure();
		output.setAttributeValue("nroSolicitud", wdContext.currentContextElement().getNro_solicitud());
		executionContext.setResultState(status);
		executionContext.processingComplete();
		
	} catch(GPInvocationException e) {
		e.printStackTrace();
		wdComponentAPI.getMessageManager().reportWarning("Error GP: " + e.getMessage());
		String localMsg = textAccessor.getText("ERROR_SETTING_PARAMETERS");
		wdThis.wdFireEventTechnicalException(new GPTechnicalCallableObjectException(logger,localMsg,e));
	} catch(GPEngineException ex) {
		ex.printStackTrace();
		wdComponentAPI.getMessageManager().reportWarning("Error GP: " + ex.getMessage());
		String localMsg = textAccessor.getText("INTERNAL_ERROR");
		wdThis.wdFireEventTechnicalException(new GPTechnicalCallableObjectException(logger,localMsg,ex));
	}
    
    //@@end
  }

  /*
   * The following code section can be used for any Java code that is 
   * not to be visible to other controllers/views or that contains constructs
   * currently not supported directly by Web Dynpro (such as inner classes or
   * member variables etc.). </p>
   *
   * Note: The content of this section is in no way managed/controlled
   * by the Web Dynpro Designtime or the Web Dynpro Runtime. 
   */
  //@@begin others
  private IGPExecutionContext executionContext;  
  //@@end
}
