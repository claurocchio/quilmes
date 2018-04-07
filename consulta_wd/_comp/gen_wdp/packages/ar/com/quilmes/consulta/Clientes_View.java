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
// AT LEAST ONE IMPORT STATEMENT (E.G. THAT FOR IPrivateClientes_View).
// OTHERWISE, USING THE ECLIPSE FUNCTION "Organize Imports" FOLLOWED BY
// A WEB DYNPRO CODE GENERATION (E.G. PROJECT BUILD) WILL RESULT IN THE LOSS
// OF IMPORT STATEMENTS.
//
//@@begin imports
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Calendar;

import ar.com.quilmes.consulta.models_eliminar_cc.CuentaCorriente;
import ar.com.quilmes.consulta.models_eliminar_cc.GetCtaCteCliente_Execute;
import ar.com.quilmes.consulta.models_eliminar_cc.Request_Execute;
import ar.com.quilmes.consulta.wdp.IPrivateClientes_View;

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
import com.sap.security.api.IUserAccount;
import com.sap.security.api.UMException;
import com.sap.tc.webdynpro.clientserver.navigation.api.WDPortalNavigation;
import com.sap.tc.webdynpro.clientserver.navigation.api.WDPortalNavigationHistoryMode;
import com.sap.tc.webdynpro.clientserver.navigation.api.WDPortalNavigationMode;
import com.sap.tc.webdynpro.model.webservice.api.WDWSModelExecuteException;
import com.sap.tc.webdynpro.services.sal.um.api.IWDClientUser;
import com.sap.tc.webdynpro.services.sal.um.api.WDClientUser;
import com.sap.tc.webdynpro.services.sal.um.api.WDUMException;
//@@end

//@@begin documentation
//@@end

public class Clientes_View
{
  /**
   * Logging location.
   */
  private static final com.sap.tc.logging.Location logger = 
    com.sap.tc.logging.Location.getLocation(Clientes_View.class);

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
   * @see ar.com.quilmes.consulta.wdp.IPrivateClientes_View for more details
   */
  private final IPrivateClientes_View wdThis;

  /**
   * Root node of this controller's context. </p>
   *
   * Provides typed access not only to the elements of the root node 
   * but also to all nodes in the context (methods node<i>XYZ</i>()) 
   * and their currently selected element (methods current<i>XYZ</i>Element()). 
   * It also facilitates the creation of new elements for all nodes 
   * (methods create<i>XYZ</i>Element()). </p>
   *
   * @see ar.com.quilmes.consulta.wdp.IPrivateClientes_View.IContextNode for more details.
   */
  private final IPrivateClientes_View.IContextNode wdContext;

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
  
  public Clientes_View(IPrivateClientes_View wdThis)
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
	String usuario = null;
	String pais = null;
	String rol = "AR_CL_SOL_MINORISTAS";
	short empresa = 0;

	//Fecha del dia
	Calendar cal = Calendar.getInstance();
	java.sql.Date fecha = new java.sql.Date(cal.getTime().getTime());
	
	//Obtengo el usuario
	try {
		IWDClientUser wdClientUser = WDClientUser.getCurrentUser();
		IUser sapUser = wdClientUser.getSAPUser();
		if (sapUser != null) {
			IUserAccount[] acct = sapUser.getUserAccounts();
			if (acct[0] != null) {
				usuario = acct[0].getDisplayName(); }
		} 	
	} 
	catch (WDUMException e) {
		e.printStackTrace();
	} catch (UMException e) {
		e.printStackTrace();
	}
	   
	//Obtengo el pais (lo obtengo del Parametro Rol)
	try {
		wdContext.nodeRol().bind(wdThis.wdGetConsulta_CompController().getConsultasInternasBean().getParametrosXRol(rol));
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
	}	   
	if (wdContext.nodeRol()!=null)
	{	pais = wdContext.currentRolElement().getSociedad().substring(2,4);
		empresa = new BigDecimal(wdContext.currentRolElement().getSociedad().substring(0,2)).shortValue();
	}
	else
	{ 	wdComponentAPI.getMessageManager().reportWarning("El rol: "+rol+", no tiene los parametros cargados!");
		return;
	}
	
  	//Paso los datos a las variables de contexto
  	wdContext.currentContextElement().setPais(pais);
  	wdContext.currentContextElement().setUsuario(usuario);
  	wdContext.currentContextElement().setEmpresa(empresa);

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
  public static void wdDoModifyView(IPrivateClientes_View wdThis, IPrivateClientes_View.IContextNode wdContext, com.sap.tc.webdynpro.progmodel.api.IWDView view, boolean firstTime)
  {
    //@@begin wdDoModifyView
   
    //@@end
  }

  //@@begin javadoc:onPlugentradaclientes(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onPlugentradaclientes(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onPlugentradaclientes(ServerEvent)
	int nro_c = wdContext.currentContextElement().getNro_cli();
	String raz_soc = wdContext.currentContextElement().getRazon_soc();
	String nro_doc = wdContext.currentContextElement().getNro_doc();
	int tip_doc = -1;
	
	if (wdContext.currentTipoDocumentoElement()!=null)
	{ tip_doc = wdContext.currentTipoDocumentoElement().getId(); }

//  Busco por numero de Cliente
	if (nro_c > 0) {
		try { wdContext.nodeClientes().bind(wdThis.wdGetConsulta_CompController().getConsultasExternasBean().getClienteXNumero("01AR","01AR",800,nro_c)); } 
		catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 	}
			//Linea para imprimir el error de catch
			//wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());}
		}
	else { //	Busco por documento y por Razon Social	
		if (nro_doc != null ) {
			try {
				wdContext.nodeClientes().bind(wdThis.wdGetConsulta_CompController().getConsultasExternasBean().getClienteXDocumento("01AR","01AR",800,nro_doc,tip_doc)); } 
			catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();  }			
		}
		else {
			int ok = 0;
			int ok2;
			String aux;
			String aux2;
			//Reemplazo los "*" por "%"
			while (ok >= 0)
			{	ok = raz_soc.indexOf("*");
				if ( ok >= 0 )
				{ ok2 = ok + 1;
			  	aux = raz_soc.substring(0,ok);
			  	aux2 = raz_soc.substring(ok2);
			  	raz_soc = aux + "%" + aux2;  }
			}
			
			try { wdContext.nodeClientes().bind(wdThis.wdGetConsulta_CompController().getConsultasExternasBean().getClienteXRazonSocial("01AR","01AR",800,raz_soc)); } 
			catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); }
		}
	}
	
	// Menaje de resultado
	if (wdContext.currentClientesElement()==null)
	{ 	wdContext.currentContextElement().setHabilitar(false);
		wdComponentAPI.getMessageManager().reportWarning("No se encontraron clientes con los conceptos ingresados"); } 
	else
	{	 wdContext.currentContextElement().setHabilitar(true);
		wdComponentAPI.getMessageManager().reportSuccess("Clientes encontrados: " + wdContext.nodeClientes().size()); }   
	
    //@@end
  }

  //@@begin javadoc:onActionvolver(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActionvolver(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActionvolver(ServerEvent)
    wdThis.wdFirePlugSalidaclientes();
    //@@end
  }

  //@@begin javadoc:onActionmodificar(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActionmodificar(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActionmodificar(ServerEvent)
    int nro_cli = wdContext.currentClientesElement().getId();
    
    if ( nro_cli <= 0 ) 
    { wdComponentAPI.getMessageManager().reportWarning("No seleccionó cliente"); }
    else 
    { 
		//Disparo GP
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
			input.setAttributeValue("codCliente.2", nro_cli);
			input.setAttributeValue("tipoAplicacion.5", "M");
			input.setAttributeValue("Input_parameter.1","M");
			input.setAttributeValue("rol", "AR_CL_SOL_MINORISTAS");		
			
			IGPProcessInstance prInstance = rtm.startProcess(
				process, //process
				"Portal de Clientes", //user defined process title
				"Modificacion de Clientes", //user defined process description
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
	
    }
		
//"http://dbabwd00.bue.quilmes.com.ar:50000/irj/portal/IniciarProceso?DynamicParameter=process.template.id%3D34CDE820F96B11DE9E07001321209630%26crear%3Dtrue%26LIFNR%3D0000000001%26BYPASS%3D1%26A_NAME_1%3DRJGIL%26A_DATE_SOL%3D01012009"); }
    
    //@@end
  }

  //@@begin javadoc:onActioneliminar(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActioneliminar(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActioneliminar(ServerEvent)
	int nro_cli = wdContext.currentClientesElement().getId();
	int retorno = -1;
	String pais = wdContext.currentContextElement().getPais();
	String usuario = wdContext.currentContextElement().getUsuario();
	short empresa = wdContext.currentContextElement().getEmpresa();
	double saldocta = 0;
	double saldodoc = 0;
	double saldopen = 0;
	double saldotre = 0;
	double saldotve = 0;
	
	
	if (pais == null)
	{ wdComponentAPI.getMessageManager().reportWarning("Faltan cargar pais en los datos del usuario");
	  return; }

	
	if ( nro_cli <= 0 ) 
		{ wdComponentAPI.getMessageManager().reportWarning("No seleccionó cliente"); }
	else {
		// Verifico si esta ok para eliminar
		try { retorno = wdThis.wdGetConsulta_CompController().getConsultasExternasBean().validarEsCuentaMadre("01AR", "01AR", nro_cli); } 
		catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 	}	
		
		//wdComponentAPI.getMessageManager().reportWarning("cuenta madre: " + retorno);
		
		// Verifico si es cuenta Madre
		if (retorno > 1) 
			 { wdComponentAPI.getMessageManager().reportWarning("No puede continuar con la solicitud de baja. El cliente posee sucursales activas"); }
	 	else { 	//Verifico si posee deudas de cuenta corriente
			try { //Llamo al web services
				CuentaCorriente model = new CuentaCorriente();
				Request_Execute requestE = new Request_Execute(model);
				GetCtaCteCliente_Execute getDatos = new GetCtaCteCliente_Execute(model);

				getDatos.setCliid(nro_cli);
				getDatos.setEmpid(empresa);
				getDatos.setPais(pais);

				requestE.setGetCtaCteClienteExecute(getDatos);

				wdContext.nodeCuentaCorriente().bind(requestE);
				wdContext.currentCuentaCorrienteElement().modelObject().execute();
				wdContext.nodeGetCtaCteClienteExecuteResponse().invalidate();

				} catch (WDWSModelExecuteException e) {
				//	   TODO Auto-generated catch block
					e.printStackTrace();
					wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getStackTraceString());
				}
				
				//Obtengo los saldos del ws
				saldocta = wdContext.currentGetCtaCteClienteExecuteResponseElement().getClisdoctc();
				saldodoc = wdContext.currentGetCtaCteClienteExecuteResponseElement().getClisdodoct();
				saldopen = wdContext.currentGetCtaCteClienteExecuteResponseElement().getSdoped();
				saldotre = wdContext.currentGetCtaCteClienteExecuteResponseElement().getTotrech();
				saldotve = wdContext.currentGetCtaCteClienteExecuteResponseElement().getTotvenc();
				
				if ((saldocta > 0 || saldodoc > 0 || saldopen > 0 || saldotre > 0 || saldotve > 0) && (retorno == 1)) //cuenta unica
				{ wdComponentAPI.getMessageManager().reportWarning("No puede continuar con la solicitud de baja. El Cliente tiene deuda en Cuenta Corriente."); }
				else
				{	
					if (saldocta > 0 || saldodoc > 0 || saldopen > 0 || saldotre > 0 || saldotve > 0)
					{ wdComponentAPI.getMessageManager().reportWarning("El Cliente tiene deuda en Cuenta Corriente. Debe transferir deuda a Cuenta Madre"); }
									
					wdComponentAPI.getMessageManager().reportSuccess("Cliente OK para borrado.");
					
					//Disparo GP
					String pcd = "pcd:portal_content/com.quilmes.fdl_contenido_para_quilmes/AltadeClientes/Iviews/java_sap_com_caf~eu~gp~ui~rt_com_sap_caf_eu_gp_ui_rt_Runtime";	
					IWDClientUser thisUser;
					IGPProcess process;

					try {
						thisUser = WDClientUser.getCurrentUser();
						IUser user = thisUser.getSAPUser();
						IGPUserContext userContext = GPContextFactory.getContextManager().createUserContext(user);

						//process = GPProcessFactory.getDesigntimeManager().getActiveTemplate("252811501B0A11DFA109001321209630", userContext);
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
						input.setAttributeValue("codCliente.2", nro_cli);
						input.setAttributeValue("tipoAplicacion.5", "B");
						input.setAttributeValue("Input_parameter.1","B");
						input.setAttributeValue("rol", "AR_CL_SOL_MINORISTAS");						
						
						IGPProcessInstance prInstance = rtm.startProcess(
							process, //process
							"Portal de Clientes", //user defined process title
							"Baja de Clientes", //user defined process description
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

				} 
	 	}
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
