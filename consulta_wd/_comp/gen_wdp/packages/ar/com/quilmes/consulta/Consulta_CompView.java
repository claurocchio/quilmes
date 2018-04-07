// ---------------------------------------------------------------------------
// This file has been generated partially by the Web Dynpro Code Generator.
// MODIFY CODE ONLY IN SECTIONS ENCLOSED BY @@begin AND @@end.
// ALL OTHER CHANGES WILL BE LOST IF THE FILE IS REGENERATED.
// ---------------------------------------------------------------------------
package ar.com.quilmes.consulta;

// 
// IMPORTANT NOTE: 
// _ALL_ IMPORT STATEMENTS MUST BE PLACED IN THE FOLLOWING SECTION ENCLOSED
// BY @@begin imports AND @@end. FURTHERMORE, THIS SECTION MUST ALWAYS CONTAIN
// AT LEAST ONE IMPORT STATEMENT (E.G. THAT FOR IPrivateConsulta_CompView).
// OTHERWISE, USING THE ECLIPSE FUNCTION "Organize Imports" FOLLOWED BY
// A WEB DYNPRO CODE GENERATION (E.G. PROJECT BUILD) WILL RESULT IN THE LOSS
// OF IMPORT STATEMENTS.
//
//@@begin imports
import java.rmi.RemoteException;
import java.util.Iterator;

import ar.com.quilmes.consulta.wdp.IPrivateConsulta_CompView;

import com.sap.caf.eu.gp.context.api.GPContextFactory;
import com.sap.caf.eu.gp.context.api.IGPUserContext;
import com.sap.caf.eu.gp.exception.api.GPEngineException;
import com.sap.caf.eu.gp.exception.api.GPInvocationException;
import com.sap.caf.eu.gp.process.api.GPProcessFactory;
import com.sap.caf.eu.gp.process.api.IGPProcess;
import com.sap.caf.eu.gp.process.api.IGPProcessInstance;
import com.sap.caf.eu.gp.process.rt.api.IGPProcessRoleInstanceList;
import com.sap.caf.eu.gp.process.rt.api.IGPRuntimeManager;
import com.sap.caf.eu.gp.structure.api.GPStructureFactory;
import com.sap.caf.eu.gp.structure.api.IGPStructure;
import com.sap.security.api.IUser;
import com.sap.security.api.UMException;
import com.sap.tc.webdynpro.clientserver.navigation.api.WDPortalNavigation;
import com.sap.tc.webdynpro.clientserver.navigation.api.WDPortalNavigationHistoryMode;
import com.sap.tc.webdynpro.clientserver.navigation.api.WDPortalNavigationMode;
import com.sap.tc.webdynpro.services.sal.um.api.IWDClientUser;
import com.sap.tc.webdynpro.services.sal.um.api.WDClientUser;
import com.sap.tc.webdynpro.services.sal.um.api.WDUMException;

//@@end

//@@begin documentation
//@@end

public class Consulta_CompView
{
  /**
   * Logging location.
   */
  private static final com.sap.tc.logging.Location logger = 
    com.sap.tc.logging.Location.getLocation(Consulta_CompView.class);

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
   * @see ar.com.quilmes.consulta.wdp.IPrivateConsulta_CompView for more details
   */
  private final IPrivateConsulta_CompView wdThis;

  /**
   * Root node of this controller's context. </p>
   *
   * Provides typed access not only to the elements of the root node 
   * but also to all nodes in the context (methods node<i>XYZ</i>()) 
   * and their currently selected element (methods current<i>XYZ</i>Element()). 
   * It also facilitates the creation of new elements for all nodes 
   * (methods create<i>XYZ</i>Element()). </p>
   *
   * @see ar.com.quilmes.consulta.wdp.IPrivateConsulta_CompView.IContextNode for more details.
   */
  private final IPrivateConsulta_CompView.IContextNode wdContext;

  /**
   * A shortcut for <code>wdThis.wdGetAPI()</code>. </p>
   * 
   * Represents the generic API of the generic Web Dynpro counterpart 
   * for this controller. </p>
   */
  private final com.sap.tc.webdynpro.progmodel.api.IWDViewController wdControllerAPI;
  
  /**
   * A shortcut for <code>wdThis.wdGetAPI().getComponent()</code>. </p>
   * 
   * Represents the generic API of the Web Dynpro component this controller 
   * belongs to. Can be used to access the message manager, the window manager,
   * to add/remove event handlers and so on. </p>
   */
  private final com.sap.tc.webdynpro.progmodel.api.IWDComponent wdComponentAPI;
  
  public Consulta_CompView(IPrivateConsulta_CompView wdThis)
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
    String sociedad = null;
	String rol = "AR_CL_SOL_MINORISTAS";
	Iterator grupos;
	int cant_rol = 0;

	//Obtengo datos del usuario
	try {
		IWDClientUser wdClientUser = WDClientUser.getCurrentUser();
		IUser sapUser = wdClientUser.getSAPUser();	
		if (sapUser != null) {
			grupos = sapUser.getParentGroups(true);
			while (grupos.hasNext()) {
				String grupo = (String) grupos.next();
				//Busco los roles de la aplicacion
				if (grupo.indexOf("AR_CL_") > 0)
				{ cant_rol = cant_rol + 1; 	}
			}
		}
	} 	 
	catch (WDUMException e) {
		e.printStackTrace();
	} 
	
	if (cant_rol < 1)
	{ wdComponentAPI.getMessageManager().reportWarning("No tiene permiso para ejecutar la aplicación. Solicite los roles necesarios!");
	  wdContext.currentContextElement().setOk(false); 	}
	else
	{ wdContext.currentContextElement().setOk(true); 	}
	
	
	//Obtengo el pais (lo obtengo del Parametro Rol)
	try {
		wdContext.nodeRol().bind(wdThis.wdGetConsulta_CompController().getConsultasInternasBean().getParametrosXRol(rol));
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		wdComponentAPI.getMessageManager().reportException("Error BI: " + e.getMessage(),false);
	}

	if (wdContext.nodeRol().size()>0)
	{	sociedad =  wdContext.currentRolElement().getSociedad(); }
	else
	{ 	wdComponentAPI.getMessageManager().reportWarning("El rol: "+rol+", no tiene los parametros cargados!");
		wdContext.currentContextElement().setOk(false);
	}     
    
    //Obtengo tipos de documentos
    try {
		wdContext.nodeTipoDocumento().bind(wdThis.wdGetConsulta_CompController().getConsultasExternasBean().getTipoDocumento(sociedad,sociedad));
		wdContext.nodeTipoDocumento().setLeadSelection(-1);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
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

  //@@begin javadoc:wdDoModifyView
  /**
   * Hook method called to modify a view just before rendering.
   * This method conceptually belongs to the view itself, not to the
   * controller (cf. MVC pattern).
   * It is made static to discourage a way of programming that
   * routinely stores references to UI elements in instance fields
   * for access by the view controller's event handlers, and so on.
   * The Web Dynpro programming model recommends that UI elements can
   * only be accessed by code executed within the call to this hook method.
   *
   * @param wdThis Generated private interface of the view's controller, as
   *        provided by Web Dynpro. Provides access to the view controller's
   *        outgoing controller usages, etc.
   * @param wdContext Generated interface of the view's context, as provided
   *        by Web Dynpro. Provides access to the view's data.
   * @param view The view's generic API, as provided by Web Dynpro.
   *        Provides access to UI elements.
   * @param firstTime Indicates whether the hook is called for the first time
   *        during the lifetime of the view.
   */
  //@@end
  public static void wdDoModifyView(IPrivateConsulta_CompView wdThis, IPrivateConsulta_CompView.IContextNode wdContext, com.sap.tc.webdynpro.progmodel.api.IWDView view, boolean firstTime)
  {
    //@@begin wdDoModifyView
    //@@end
  }

  //@@begin javadoc:onPlugentradaconsulta(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onPlugentradaconsulta(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onPlugentradaconsulta(ServerEvent)
    //@@end
  }

  //@@begin javadoc:onActionbuscar(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActionbuscar(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActionbuscar(ServerEvent)
    int nro_cli = wdContext.currentContextElement().getNro_cliente();
    String nro_doc = wdContext.currentContextElement().getNro_documento();
    String raz_soc = wdContext.currentContextElement().getRazon_social();
    int tip_doc = -1;

    if (wdContext.currentTipoDocumentoElement()!=null)
    { tip_doc = wdContext.currentTipoDocumentoElement().getId(); }

	if (nro_cli<=0 && nro_doc==null && raz_soc==null && tip_doc<0) 
	{ wdComponentAPI.getMessageManager().reportWarning("Debe ingresar algún concepto de búsqueda"); }
	else { 
		if ((nro_doc!=null && tip_doc<0)||(nro_doc==null && tip_doc>=0))
		{ wdComponentAPI.getMessageManager().reportWarning("Debe ingresar Tipo y Numero de documento"); }
		else { wdThis.wdFirePlugSalida_consulta(); }
		}
    //@@end
  }

  //@@begin javadoc:onActioncrear(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActioncrear(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActioncrear(ServerEvent)
	String pcd = "pcd:portal_content/com.quilmes.fdl_contenido_para_quilmes/AltadeClientes/Iviews/java_sap_com_caf~eu~gp~ui~rt_com_sap_caf_eu_gp_ui_rt_Runtime";	
 	IWDClientUser thisUser;
  	IGPProcess process;

  	try {
		thisUser = WDClientUser.getCurrentUser();
  		IUser user = thisUser.getSAPUser();
  		IGPUserContext userContext = GPContextFactory.getContextManager().createUserContext(user);

  		//process = GPProcessFactory.getDesigntimeManager().getActiveTemplate("79E1D990230411DF9BC5001321209630", userContext);
		process = GPProcessFactory.getDesigntimeManager().getActiveTemplate("91E8FBD0286411DF9D30001321209630", userContext);
		
  		IGPRuntimeManager rtm = GPProcessFactory.getRuntimeManager();

  		IGPProcessRoleInstanceList roles = rtm.createProcessRoleInstanceList();
  		int rolenum = process.getRoleInfoCount();
  		for (int i = 0; i < rolenum; i++) {
  			String roleName = null;
  			roleName = process.getRoleInfo(i).getRoleName();
  			roles.createProcessRoleInstance(roleName).addUser(user);
  		}

  		IGPStructure input= GPStructureFactory.getStructure(process.getInputParameters());
  		input.setAttributeValue("tipoUsuario.3.1", "Final");
  		input.setAttributeValue("codCliente.2", 0);
  		input.setAttributeValue("tipoAplicacion.5", "A");
  		input.setAttributeValue("Input_parameter.1","A");
		input.setAttributeValue("rol", "AR_CL_SOL_MINORISTAS");

  		IGPProcessInstance prInstance = rtm.startProcess(
  			process, //process
			"Portal de Clientes", //user defined process title
			"Alta de Clientes", //user defined process description
 			user, //initiator
 			roles, //process roles
  			input, //process input structure
  			user );

  		WDPortalNavigation.navigateAbsolute(
  			pcd,
  			WDPortalNavigationMode.SHOW_INPLACE,
 			WDPortalNavigationHistoryMode.NO_DUPLICATIONS,
 			"processId="+prInstance.getID() );

  		} catch (WDUMException e) {
 			 e.printStackTrace();
  		} catch (GPInvocationException e) {
  			e.printStackTrace();
  		} catch (GPEngineException e) {
  			e.printStackTrace();
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
  //@@end
}

// ---- content of obsolete user coding area(s) ----
//@@begin obsolete:onActioninternet(ServerEvent)
//    
//	IWDRequest req = WDProtocolAdapter.getProtocolAdapter().getRequestObject();
//	int localPort = req.getServerPort();
//	String localhost = req.getServerName();
//	String server = "http://"+localhost+":"+localPort;
//	String url = server+"/webdynpro/dispatcher/sap.com/caf~eu~gp~ui~inst/AInstantiation?process.template.id=C32C48F0170C11DFB26E001321209630&tipoUsuario=Final&codCliente=&process.autostart=t&tipoAplicacion.3=";	
//	wdContext.currentContextElement().setUrl(url);
//	
///*	String procInstanceID = "252811501B0A11DFA109001321209630";
//	
//	WDPortalNavigation.navigateAbsolute("ROLES://portal_content/com.quilmes.fdl_contenido_para_quilmes/com.quilmes.zaltaclientes/com.quilmes.Iviews/com.quilmes.java_sap_com_caf~eu~gp~ui~rt_com_sap_caf_eu_gp_ui_rt_Runtime", 
//		WDPortalNavigationMode.SHOW_INPLACE, 
//		WDPortalNavigationHistoryMode.NO_DUPLICATIONS, 
//		"processId="+procInstanceID); 	
//*/		
//		
//    //wdThis.wdFirePlugInternet();    
//	
//	
//		
//@@end
//@@begin obsolete:javadoc:onActioninternet(ServerEvent)
//  /** Declared validating event handler. */
//@@end
//@@begin obsolete:onActionInternet(ServerEvent)
//	//wdThis.wdFirePlugToInternet();
//@@end
//@@begin obsolete:javadoc:onActionInternet(ServerEvent)
//  /** Declared validating event handler. */
//@@end
