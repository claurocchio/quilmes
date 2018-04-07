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
// AT LEAST ONE IMPORT STATEMENT (E.G. THAT FOR IPrivateBaja_View).
// OTHERWISE, USING THE ECLIPSE FUNCTION "Organize Imports" FOLLOWED BY
// A WEB DYNPRO CODE GENERATION (E.G. PROJECT BUILD) WILL RESULT IN THE LOSS
// OF IMPORT STATEMENTS.
//
//@@begin imports

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.HashSet;

import ar.com.quilmes.bue.mdm_clientes.model.internas.Adjunto;
import ar.com.quilmes.bue.mdm_clientes.model.internas.Frecuencia;
import ar.com.quilmes.bue.mdm_clientes.model.internas.TerritorioTabla;
import ar.com.quilmes.bue.mdm_clientes.model.internas.Ticket;

import com.quilmes.baja.consultaclientes.ConsultaClientes;
import com.quilmes.baja.consultaclientes.GetDatosCliente_Execute;
import com.quilmes.baja.consultaclientes.Request_Execute;
import com.quilmes.baja.wdp.IPrivateBaja_View;
import com.quilmes.baja.wdp.IPrivateBaja_View.IDatosElement;
import com.quilmes.baja_cc.CuentaCorriente;
import com.quilmes.baja_cc.GetCtaCteCliente_Execute;
import com.quilmes.baja_cc.RequestCC_Execute;
import com.quilmes.baja_cliente.BajaCliente;
import com.quilmes.baja_cliente.BajaCliente_Execute;
import com.quilmes.baja_cliente.RequestB_Execute;
import com.quilmes.baja_envases.Envases;
import com.quilmes.baja_envases.GetSaldoEnvases_Execute;
import com.quilmes.baja_envases.RequestE_Execute;
import com.sap.security.api.IUser;
import com.sap.security.api.IUserAccount;
import com.sap.security.api.UMException;
import com.sap.tc.webdynpro.model.webservice.api.WDWSModelExecuteException;
import com.sap.tc.webdynpro.progmodel.api.WDVisibility;
import com.sap.tc.webdynpro.progmodel.repository.IWDWindowInfo;
import com.sap.tc.webdynpro.services.sal.um.api.IWDClientUser;
import com.sap.tc.webdynpro.services.sal.um.api.WDClientUser;
import com.sap.tc.webdynpro.services.sal.um.api.WDUMException;
import com.sap.tc.webdynpro.services.session.api.IWDWindow;
import com.sapportals.portal.security.usermanagement.UserManagementException;
import com.sapportals.wcm.repository.AccessDeniedException;
import com.sapportals.wcm.repository.IResource;
import com.sapportals.wcm.repository.IResourceContext;
import com.sapportals.wcm.repository.IResourceFactory;
import com.sapportals.wcm.repository.NotSupportedException;
import com.sapportals.wcm.repository.ResourceContext;
import com.sapportals.wcm.repository.ResourceException;
import com.sapportals.wcm.repository.ResourceFactory;
import com.sapportals.wcm.util.uri.RID;
import com.sapportals.wcm.util.usermanagement.WPUMFactory;
//@@end

//@@begin documentation
//@@end

public class Baja_View
{
  /**
   * Logging location.
   */
  private static final com.sap.tc.logging.Location logger = 
    com.sap.tc.logging.Location.getLocation(Baja_View.class);

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
   * @see com.quilmes.baja.wdp.IPrivateBaja_View for more details
   */
  private final IPrivateBaja_View wdThis;

  /**
   * Root node of this controller's context. </p>
   *
   * Provides typed access not only to the elements of the root node 
   * but also to all nodes in the context (methods node<i>XYZ</i>()) 
   * and their currently selected element (methods current<i>XYZ</i>Element()). 
   * It also facilitates the creation of new elements for all nodes 
   * (methods create<i>XYZ</i>Element()). </p>
   *
   * @see com.quilmes.baja.wdp.IPrivateBaja_View.IContextNode for more details.
   */
  private final IPrivateBaja_View.IContextNode wdContext;

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
  
  public Baja_View(IPrivateBaja_View wdThis)
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
  public static void wdDoModifyView(IPrivateBaja_View wdThis, IPrivateBaja_View.IContextNode wdContext, com.sap.tc.webdynpro.progmodel.api.IWDView view, boolean firstTime)
  {
    //@@begin wdDoModifyView
    
    //@@end
  }

  //@@begin javadoc:onPlugentradabaja(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onPlugentradabaja(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onPlugentradabaja(ServerEvent)
    
    //@@end
  }

  //@@begin javadoc:onActioneliminar(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActioneliminar(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActioneliminar(ServerEvent)
	int nro_cli = wdContext.currentDatosElement().getNro_cliente();
	String raz_soc = wdContext.currentDatosElement().getRazon_social();
	String pais = wdContext.currentContextElement().getPaisUsuario();
	String usuario = wdContext.currentContextElement().getUsuario();
	short empresa = wdContext.currentContextElement().getEmpresa();
	String esquema = wdContext.currentContextElement().getEsquema();
	int segmento = wdContext.currentContextElement().getSegmento();
	String master = wdContext.currentContextElement().getMaster();
	double saldoenv = 0;
	String tipo_sol = "B";
	long nro_sol = wdContext.currentContextElement().getNro_sol();
	
	
	//Verifico datos del usuario
	if (pais == null)
	{wdComponentAPI.getMessageManager().reportWarning("Faltan cargar pais en los datos del usuario");
	return;}

	//Fecha del dia
	Calendar cal = Calendar.getInstance();
	java.sql.Date fecha = new java.sql.Date(cal.getTime().getTime());	


	//Verifico transferencia de deuda y campos obligatorios (Solo US)
	if (master==null)
	{	saldoenv = wdContext.currentDatosElement().getSaldo_env();

		//Verifico long campo otros
		if (wdContext.currentDatosElement().getMot_baja()!=null)
		{ if (wdContext.currentDatosElement().getMot_baja().length() > 30)
			{	wdComponentAPI.getMessageManager().reportWarning("Campo Motivo Otros solo permite hasta 30 caracteres");	
				return;
			}
		}
		
		//Verifico los campos obligatorios
		if (wdContext.currentMotivoBajaElement()!=null)
		{ if (wdContext.currentMotivoBajaElement().getDescripcion()==null)
			{ wdComponentAPI.getMessageManager().reportWarning("Debe cargar Motivo de Baja valido");	
			return;}
		}
		else { wdComponentAPI.getMessageManager().reportWarning("Debe cargar Motivo de Baja");
			return;
		}
		
		if (saldoenv>0 && wdContext.currentDatosElement().getPosee_d()==false)
		{ wdComponentAPI.getMessageManager().reportWarning("El cliente posee deuda de envases, debe transferir deuda");
		return; }

		if(wdContext.currentDatosElement().getPosee_d()==true && saldoenv<=0)
		{ wdComponentAPI.getMessageManager().reportWarning("El cliente NO posee deuda de envases, no debe transferir");
		  wdContext.currentContextElement().setVerifico(false);
		return; }

		if(wdContext.currentDatosElement().getTransfiere()!=0 && saldoenv<=0)
		{ wdComponentAPI.getMessageManager().reportWarning("El cliente NO posee deuda de envases, no debe ingresar cliente a transferir");
		  wdContext.currentContextElement().setVerifico(false);
		return; }

		if(wdContext.currentDatosElement().getTransfiere()!=0 && wdContext.currentDatosElement().getAlta_baja()==true)
		{ wdComponentAPI.getMessageManager().reportWarning("Si es Alta-Baja, no debe ingresar cliente a transferir");
		  wdContext.currentContextElement().setVerifico(false);
		return; }
		
		if(wdContext.currentDatosElement().getPosee_d()==true && wdContext.currentDatosElement().getAlta_baja()==false)
		{ if (wdContext.currentDatosElement().getTransfiere()==0)
			{ wdComponentAPI.getMessageManager().reportWarning("Debe cargar Cliente a transferir Deuda");
				return;	}
		  else {
				if (wdContext.currentContextElement().getVerifico()==false)	  	
			  	{ wdComponentAPI.getMessageManager().reportWarning("Debe verificar Cliente a transferir Deuda");
			  		return;	  	}
			  }
		}
	}
	

  //Llamo al pop up de observaciones
  wdContext.currentContextElement().setEleccion("E");
  wdThis.wdGetBajaUSController().BuscarPop();
  //Luego llamara al metodo Finalizar
  
/*
		//Termina y se envia a Master data o borra si es Master Data
		if (master==null && nro_sol==0 ) 
		{ 		 
		  //Guardo los datos en base Portal	- US
		  //Paso los datos modificados a la estructura el ticket
		  Ticket ticket = new Ticket();
		  
		  if (wdContext.currentDatosElement().getMot_baja()!=null)
		  { ticket.setMotivoBaja(wdContext.currentDatosElement().getMot_baja());  }
		  else 
		  	{ if (wdContext.currentMotivoBajaElement().getDescripcion()!=null)
		  		{ ticket.setMotivoBaja(wdContext.currentMotivoBajaElement().getDescripcion()); }
		  	}
		  if (wdContext.currentDatosElement().getPosee_d()==true) 	
		  { ticket.setTransfDeudaEnv("S"); }	
		  else	{ ticket.setTransfDeudaEnv("N");	}	  
		  if (wdContext.currentDatosElement().getTransfiere()!=0)
			  { ticket.setCodClienteTransfiereDeuda(new Integer(wdContext.currentDatosElement().getTransfiere())); }
		  if (wdContext.currentDatosElement().getAlta_baja()==true) 	
		  { ticket.setEsAltaBaja("S"); }
		  else	{ ticket.setEsAltaBaja("N");	}
		  if (wdContext.currentDatosElement().getHistorico()==true) 	
		  { ticket.setTransfiereHistoricoVentas("S"); }
		  else	{ ticket.setTransfiereHistoricoVentas("N");	}
		  if (wdContext.currentDatosElement().getNcliente_ccq()!=0)
			  { ticket.setCodNuevoClienteCCQ(new Integer(wdContext.currentDatosElement().getNcliente_ccq())); }
		  if (wdContext.currentDatosElement().getNro_cliente()!=0) 
			  { ticket.setCodCliente(new Integer(wdContext.currentDatosElement().getNro_cliente())); } 
			ticket.setRazonSocial(wdContext.currentDatosElement().getRazon_social());
			ticket.setCodTipoDocumento(new Integer(wdContext.currentDatosElement().getTipo_documento()));
			ticket.setNumeroDocumento(wdContext.currentDatosElement().getDocumento());
		  if (wdContext.currentDatosElement().getSubcanal()!=0)
			  { ticket.setSubCanalMkt(new Integer(wdContext.currentDatosElement().getSubcanal())); } 
			ticket.setLocalidadDesc(wdContext.currentDatosElement().getLocalidad());
			ticket.setCalle(wdContext.currentDatosElement().getCalle());
			ticket.setNumero(wdContext.currentDatosElement().getNumero());
			ticket.setPuerta(wdContext.currentDatosElement().getPuerta());
			ticket.setProvinciaDesc(wdContext.currentDatosElement().getProvincia());
			ticket.setCodProvincia(new Integer(wdContext.currentProvinciasElement().getId()));
			ticket.setCp(wdContext.currentDatosElement().getCp());
			ticket.setTelefono(wdContext.currentDatosElement().getTelefono());
			ticket.setEmail(wdContext.currentDatosElement().getEmail());

		  if (wdContext.currentDatosclientesElement().getAceptaDesUniPed()!=null)
		  { ticket.setAceptaDesdUnifPedido(wdContext.currentDatosclientesElement().getAceptaDesUniPed()); } 
		  ticket.setAutVentaAlochol(wdContext.currentDatosclientesElement().getAutVtaAlcohol());
		  ticket.setCodCategCliente(wdContext.currentDatosclientesElement().getCategoria());
		  ticket.setCodCliente(new Integer(wdContext.currentDatosclientesElement().getCodCliente()));;
		  ticket.setCodCuentaMadre(new Integer(wdContext.currentDatosclientesElement().getCuentaMadre()));
		  ticket.setCodFormaAtencion(new Integer(wdContext.currentDatosclientesElement().getFormaAtencion()));
		  ticket.setCodLocalidad(wdContext.currentDatosclientesElement().getLocalidad());
		  ticket.setCoordenadaX(wdContext.currentDatosclientesElement().getCoordenadaX());
		  ticket.setCoordenadaY(wdContext.currentDatosclientesElement().getCoordenadaY());
		  
		  if (wdContext.currentContextElement().getVerifico()==true) {
			ticket.setCuitTrDeuda(wdContext.currentCliente_tElement().getDocumento());
			ticket.setDireccionTrDeuda(wdContext.currentCliente_tElement().getDomicilio());
			ticket.setLocalidadTrDeuda(wdContext.currentCliente_tElement().getLocalidad_Id());
			ticket.setRazonSocialClTrDeuda(wdContext.currentCliente_tElement().getRazonSocial());							  	
		  }

		  ticket.setEmail(wdContext.currentDatosclientesElement().getEmail());
		  ticket.setEsExcluivo(wdContext.currentDatosclientesElement().getEsExclusivo());
		  ticket.setEsquema(esquema);
		  ticket.setEstadoTicket("1");
		  ticket.setExcIIBBFechaDesde(wdContext.currentDatosclientesElement().getIIBBFchDesde());
		  ticket.setExcIIBBFechaHasta(wdContext.currentDatosclientesElement().getIIBBFchHasta());
		  ticket.setExcIvaFechaDesde(wdContext.currentDatosclientesElement().getIvaFchDesde());
		  ticket.setExcIvaFechaHasta(wdContext.currentDatosclientesElement().getIvaFchHasta());
		  ticket.setFechaCreacion(fecha);
		  ticket.setFechaVencimientoLicencia(wdContext.currentDatosclientesElement().getFechaVencLicencia());
		  ticket.setFormaEntregaCtaCte(wdContext.currentDatosclientesElement().getFrmEntregaCtaCte());
		  ticket.setFormaPago(new Integer(wdContext.currentDatosclientesElement().getFormaPago()));
		  ticket.setImprimeRemito(wdContext.currentDatosclientesElement().getImprimeRemito());
		  ticket.setListaPrecioBasico(new Integer(wdContext.currentDatosclientesElement().getListaPrcBasico()));
		  ticket.setListaPrecioMaximo(new Integer(wdContext.currentDatosclientesElement().getListaPrcMaxima()));
		  ticket.setLocalidadDesc(wdContext.currentDatosclientesElement().getLocalidad());
		  ticket.setMesajeFactura(wdContext.currentDatosclientesElement().getMensajeFactura());
		  ticket.setMoneda(wdContext.currentDatosclientesElement().getMoneda());
		  ticket.setNombreFantasia(wdContext.currentDatosclientesElement().getNombreFant());
		  ticket.setNroIIBB(wdContext.currentDatosclientesElement().getNroIIBB());
		  ticket.setNroLicVentaAlochol(wdContext.currentDatosclientesElement().getNroLicVtaAlcohol());

		  ticket.setObservacionesMd(wdContext.currentDatosElement().getObservac_md());
		  ticket.setObservacionesUs(wdContext.currentContextElement().getObservac());
		  ticket.setPagaSeguro(wdContext.currentDatosclientesElement().getPagaSeguro());
		  ticket.setPerfilCliente(wdContext.currentDatosclientesElement().getPerfilCliente());
		  ticket.setPorcExcIIBB(new BigDecimal(wdContext.currentDatosclientesElement().getPrjExcepcionIIBB()));
		  ticket.setPorcExcIva(new BigDecimal(wdContext.currentDatosclientesElement().getPrjPersepcionIva()));
		  ticket.setProvinciaDesc(wdContext.currentProvinciasElement().getDesc());
		  ticket.setRazonSocialAbreviada(wdContext.currentDatosclientesElement().getRazonABV());
		  
		  if (wdContext.currentContextElement().getCarpeta()!=null)
		  { ticket.setCarpeta(wdContext.currentContextElement().getCarpeta()); } 		  
		  if (wdContext.currentContextElement().getRepositorio()!=null)
		  { ticket.setRepositorio(wdContext.currentContextElement().getRepositorio()); } 
		    
		  ticket.setSegmentoVta(new Integer(segmento));
		  ticket.setSociedad(wdContext.currentRolElement().getSociedad());
		  ticket.setSubCanalMktDesc(wdContext.currentSubcanalesElement().getDesc());
		  ticket.setTelefono(wdContext.currentDatosclientesElement().getTelefono());
		  ticket.setTienePromocion(wdContext.currentDatosclientesElement().getTienePromocion());
		  ticket.setTipoClienteContab(new Integer(wdContext.currentDatosclientesElement().getTpoClienteContable()));
		  ticket.setTipoCobranza(new Integer(wdContext.currentDatosclientesElement().getTipoDeCobranza()));
		  ticket.setTipoDocumentoDesc(wdContext.currentTipoDocumentoElement().getDesc());
		  ticket.setTipoEmpresa(wdContext.currentDatosclientesElement().getTpoEmpresa());
		  ticket.setTipoIIBB(wdContext.currentDatosclientesElement().getTipoIIBB());
		  ticket.setRamo(new Integer(wdContext.currentDatosclientesElement().getRamo()));
		  ticket.setTipoSolicitud(tipo_sol);
		  ticket.setTipoVtaFsEnvases(new Integer(wdContext.currentDatosclientesElement().getTpoVtaFSxEnv()));
		  ticket.setTipoVtaFsMercaderia(new Integer(wdContext.currentDatosclientesElement().getTpoVtaFSxMerc()));
		  ticket.setUsuarioSolicitante(usuario);
	
		  //Territorios
		  ticket.setTerritorios(new HashSet());
		  for (int i = 0; i < wdContext.nodeTerriClien().size(); i++) {
		  	TerritorioTabla terr = new TerritorioTabla();
			terr.setFrecuencias(new HashSet());
			//Frecuencias
			for (int j = 0; j < wdContext.nodeTerriClien().getTerriClienElementAt(i).nodeFrecuencia().nodeFrecuencia2().size(); j++) {
				Frecuencia frecuencia = new Frecuencia();
				frecuencia.setTerritorio(terr);
				frecuencia.setCodDiaSemana(new Integer(wdContext.nodeTerriClien().getTerriClienElementAt(i).nodeFrecuencia().nodeFrecuencia2().getFrecuencia2ElementAt(j).getDiaSemana()));
				frecuencia.setDiaSemanaDesc(wdContext.nodeTerriClien().getTerriClienElementAt(i).nodeFrecuencia().nodeFrecuencia2().getFrecuencia2ElementAt(j).getDiaSemana_desc());
				frecuencia.setTipoFrecuencia(wdContext.nodeTerriClien().getTerriClienElementAt(i).nodeFrecuencia().nodeFrecuencia2().getFrecuencia2ElementAt(j).getTipoFrecuencia());
				frecuencia.setCodCliVisitAntes(new Integer((int)wdContext.nodeTerriClien().getTerriClienElementAt(i).nodeFrecuencia().nodeFrecuencia2().getFrecuencia2ElementAt(j).getClienteVisitaAntes()));
				terr.addFrecuencia(frecuencia);
			}	
		  	terr.setTicket(ticket);
		  	terr.setCodTerritorio(new Integer(wdContext.nodeTerriClien().getTerriClienElementAt(i).getCodTerritorio()));
		  	terr.setCanalVenta(wdContext.currentRolElement().getCanalVenta());
		  	terr.setCentroDespacho(wdContext.nodeTerriClien().getTerriClienElementAt(i).getCentrodesp());
		  	ticket.addTerritorios(terr);
		  }

		  //Adjuntos
		  ticket.setAdjuntos(new HashSet());
		  for (int i = 0; i < wdContext.nodeAdjunto().size(); i++) {
			Adjunto adj = new Adjunto();
			adj.setTicket(ticket);
			adj.setArchivo(wdContext.nodeAdjunto().getAdjuntoElementAt(i).getNombre());
			ticket.addAdjuntos(adj);
		  }		  

		  //Llamo al metodo de insertar a BD
		 try { nro_sol = wdThis.wdGetBajaUSController().getConsultasInternasBean().insertTicket(ticket); }
		 catch (RemoteException e) {
			  // TODO Auto-generated catch block
			  e.printStackTrace(); 	
			  //Linea para imprimir el error de catch
			  wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage()); 
			  }
			  	  
		  wdComponentAPI.getMessageManager().reportSuccess("Se envio el cliente: " + nro_cli + " " + raz_soc + " para darse de baja"); 
		  }
		  
		else
		
		  {	//Elimino - Master Data 
			// Paso los datos modificados a la estructura el ticket
			if (master != null)
			{	//Master Data
				nro_sol = ticket.getNroSolicitud();			
				ticket.setUsuarioAprobador(usuario);
				ticket.setObservacionesMd(wdContext.currentContextElement().getObservac());
				ticket.setEstadoTicket("3");
				ticket.setFechaCierre(fecha);
				ticket.setSegmentoVta(new Integer(segmento)); 
				
				//Llamo al metodo de modificar en BD
			   try { wdThis.wdGetBajaUSController().getConsultasInternasBean().updateTicket(ticket); }
			   catch (RemoteException e) {
					e.printStackTrace(); 	
					wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
					return; }
		
				// Llamo WS de baja			
				try { //Llamo al web services de baja
					BajaCliente model = new BajaCliente();
					RequestB_Execute requestE = new RequestB_Execute(model);
					BajaCliente_Execute bajaDatos = new BajaCliente_Execute(model);

					bajaDatos.setCliid(nro_cli);
					bajaDatos.setEmpid(empresa);
					bajaDatos.setPais(pais);

					requestE.setBajaClienteExecute(bajaDatos);
					wdContext.nodeBajaCliente().bind(requestE);
		
					wdContext.currentBajaClienteElement().modelObject().execute();
					wdContext.nodeBajaClienteExecuteResponse().invalidate();

					} catch (WDWSModelExecuteException e) {
						e.printStackTrace();
						wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getStackTraceString());
					}
					
					//Obtengo el mensaje del WS				
					String mensaje = wdContext.currentMensajesMensajesItem2Element().getMsgErrDesc();
					wdComponentAPI.getMessageManager().reportSuccess("Borrado: " + mensaje);					
				
				}
			else 
				{ //Usuario RECHAZADO - creo nuevo tck ////////////////
				if (wdContext.currentDatosElement().getMot_baja()!=null)
					{ ticket.setMotivoBaja(wdContext.currentDatosElement().getMot_baja());  }
				else 
				 	{ if (wdContext.currentMotivoBajaElement().getDescripcion()!=null)
					  { ticket.setMotivoBaja(wdContext.currentMotivoBajaElement().getDescripcion()); }
				  	}
				if (wdContext.currentDatosElement().getPosee_d()==true) 	
					{ ticket.setTransfDeudaEnv("S"); }	
				else	{ ticket.setTransfDeudaEnv("N");	}	  
				if (wdContext.currentDatosElement().getTransfiere()!=0)
					{ ticket.setCodClienteTransfiereDeuda(new Integer(wdContext.currentDatosElement().getTransfiere())); }
				if (wdContext.currentDatosElement().getAlta_baja()==true) 	
					{ ticket.setEsAltaBaja("S"); }
				else	{ ticket.setEsAltaBaja("N");	}
				if (wdContext.currentDatosElement().getHistorico()==true) 	
					{ ticket.setTransfiereHistoricoVentas("S"); }
				else	{ ticket.setTransfiereHistoricoVentas("N");	}
				//Cliente tranfiere				
				if (wdContext.currentContextElement().getVerifico()==true) {
				  ticket.setCuitTrDeuda(wdContext.currentCliente_tElement().getDocumento());
				  ticket.setDireccionTrDeuda(wdContext.currentCliente_tElement().getDomicilio());
				  ticket.setLocalidadTrDeuda(wdContext.currentCliente_tElement().getLocalidad_Id());
				  ticket.setRazonSocialClTrDeuda(wdContext.currentCliente_tElement().getRazonSocial());							  	
				}
				ticket.setEstadoTicket("1");
				ticket.setFechaCreacion(fecha);				
				ticket.setObservacionesMd(wdContext.currentDatosElement().getObservac_md());
				ticket.setObservacionesUs(wdContext.currentContextElement().getObservac());
				
				if (wdContext.currentContextElement().getCarpeta()!=null)
					{ ticket.setCarpeta(wdContext.currentContextElement().getCarpeta()); } 		  
				if (wdContext.currentContextElement().getRepositorio()!=null)
					{ ticket.setRepositorio(wdContext.currentContextElement().getRepositorio()); } 				
				
				//Carpeta nueva
				String carpeta = "TMP_" + fecha.getTime();
				carpeta.trim();		
				//Repositorio nuevo
				String repositorio = null;
				try { repositorio = wdThis.wdGetBajaUSController().getConsultasInternasBean().getRepositorio();  }
				catch (RemoteException e) {
					e.printStackTrace();
					wdComponentAPI.getMessageManager().reportException("Error BI: " + e.getMessage(),false);
					return; }	
				//Url nueva		
				String url = "/" + repositorio + "/" + ticket.getEsquema().trim() + "/" + ticket.getSegmentoVta() + "/" + carpeta + "/";		
				
				if (wdContext.nodeAdjunto().size()>0 || wdContext.nodeAdjuntos().size()>0 )
				{	//Creo Carpeta Nueva 			
					traerResource(url, true);  }
				else {  carpeta = null;  }
				
				//Adjuntos
				String archivo = null;
				ticket.setAdjuntos(new HashSet());
				
				if (wdContext.nodeAdjunto().size() > 0)
				{ 	for (int i = 0; i < wdContext.nodeAdjunto().size(); i++) {
				  	Adjunto adj = new Adjunto();
				  	adj.setTicket(ticket);
				  	archivo = wdContext.nodeAdjunto().getAdjuntoElementAt(i).getNombre();
				  	adj.setArchivo(archivo);
				  	ticket.addAdjuntos(adj);
				  
				  	wdComponentAPI.getMessageManager().reportSuccess("Ori_a:" + "/" + ticket.getRepositorio() + "/" + ticket.getEsquema() + "/" + ticket.getSegmentoVta() + "/" + ticket.getCarpeta() + "/" + archivo);
				  	wdComponentAPI.getMessageManager().reportSuccess("Cop_a:" + url + archivo);
				
				  	//Traspaso Archivos a nueva carpeta
				  	IResource existente = traerResource("/" + ticket.getRepositorio() + "/" + ticket.getEsquema() + "/" + ticket.getSegmentoVta() + "/" + ticket.getCarpeta() + "/" + archivo, false);
				  	RID rid = RID.getRID(url + archivo);
				  	try {
						existente.copy(rid, null);
				  	} catch (NotSupportedException e) {
						e.printStackTrace();
				  	} catch (AccessDeniedException e) {
						e.printStackTrace();
				  	} catch (ResourceException e) {
					  	e.printStackTrace();
				  	}	
					}		  
				}	
				else //Cargo lo que tenga el tck (porque no entro adjuntos)
				{	for (int i = 0; i < wdContext.nodeAdjuntos().size(); i++) {
					Adjunto adj = new Adjunto();
					adj.setTicket(ticket);
					archivo = wdContext.nodeAdjuntos().getAdjuntosElementAt(i).getArchivo();
					adj.setArchivo(archivo);
					ticket.addAdjuntos(adj);
				  
					wdComponentAPI.getMessageManager().reportSuccess("Ori:" + "/" + ticket.getRepositorio() + "/" + ticket.getEsquema() + "/" + ticket.getSegmentoVta() + "/" + ticket.getCarpeta() + "/" + archivo);
					wdComponentAPI.getMessageManager().reportSuccess("Cop:" + url + archivo);
				
					//Traspaso Archivos a nueva carpeta
					IResource existente = traerResource("/" + ticket.getRepositorio() + "/" + ticket.getEsquema() + "/" + ticket.getSegmentoVta() + "/" + ticket.getCarpeta() + "/" + archivo, false);
					RID rid = RID.getRID(url + archivo);
					try {
						existente.copy(rid, null);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					} catch (AccessDeniedException e) {
						e.printStackTrace();
					} catch (ResourceException e) {
						e.printStackTrace();
					}	
					}		  
				}
				
				//Territorios
				ticket.setTerritorios(new HashSet());
				for (int i = 0; i < wdContext.nodeTerritorios_tck().size(); i++) {
				  TerritorioTabla terr = new TerritorioTabla();
				  terr.setFrecuencias(new HashSet());
				  //Frecuencias
				  for (int j = 0; j < wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).nodeFrecuencias().size(); j++) {
					  Frecuencia frecuencia = new Frecuencia();
					  frecuencia.setTerritorio(terr);
					  frecuencia.setCodDiaSemana(wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).nodeFrecuencias().getFrecuenciasElementAt(j).getCodDiaSemana());
					  frecuencia.setDiaSemanaDesc(wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).nodeFrecuencias().getFrecuenciasElementAt(j).getDiaSemanaDesc());
					  frecuencia.setTipoFrecuencia(wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).nodeFrecuencias().getFrecuenciasElementAt(j).getTipoFrecuencia());
					  frecuencia.setCodCliVisitAntes(wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).nodeFrecuencias().getFrecuenciasElementAt(j).getCodCliVisitAntes());
					  terr.addFrecuencia(frecuencia);
				  }
				  terr.setTicket(ticket);
				  terr.setCodTerritorio(wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).getCodTerritorio());
				  terr.setCanalVenta(wdContext.currentRolElement().getCanalVenta());
				  terr.setCentroDespacho(wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).getCentroDespacho());
				  ticket.addTerritorios(terr);
				}
				
				ticket.setNroSolicitud(0);
				ticket.setNroTicketCrm(null);
				ticket.setCarpeta(carpeta);
				ticket.setRepositorio(repositorio);
			
				//Llamo al metodo de insertar a BD
			   try { nro_sol = wdThis.wdGetBajaUSController().getConsultasInternasBean().insertTicket(ticket); }
			   catch (RemoteException e) {
					e.printStackTrace(); 	
					wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage()); }
			  
				wdComponentAPI.getMessageManager().reportSuccess("Se envio el cliente: " + nro_cli + " " + raz_soc + " para darse de baja"); 
				//wdComponentAPI.getMessageManager().reportSuccess("Solicitud copia: " + nro_sol); 					  							
			}  	 	
	}
	
	
	//Llamo al metodo Complete de la interfaz (parametro de salida)
	wdContext.currentContextElement().setNro_sol(nro_sol);
	wdThis.wdGetBajaUSInterfaceController().complete("Terminado");

*/

    //@@end
  }

  //@@begin javadoc:onActionrechazar(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActionrechazar(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActionrechazar(ServerEvent)

	//Llamo al pop up de observaciones
  	wdContext.currentContextElement().setEleccion("R");
  	wdThis.wdGetBajaUSController().BuscarPop();
	//Luego llamara al metodo Finalizar
	
    //@@end
  }

  //@@begin javadoc:onActionverificar(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActionverificar(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActionverificar(ServerEvent)
	int nro_c = wdContext.currentDatosElement().getTransfiere();
	

//	Busco por numero de Cliente
	if (nro_c > 0) {
		try { wdContext.nodeCliente_t().bind(wdThis.wdGetBajaUSController().getConsultasExternasBean().getClienteXNumero("01AR","01AR",800,nro_c)); } 
		catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
			//Linea para imprimir el error de catch
			wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage()); }
		}
	else { wdComponentAPI.getMessageManager().reportWarning("No cargo cliente para transferencia"); 
		return; }	
	
	
	// Menaje de resultado
	if (wdContext.currentCliente_tElement()==null)
	{ 	//wdContext.currentContextElement().setHabilitar(false);
		wdComponentAPI.getMessageManager().reportWarning("No se encontro cliente de transferencia"); 
		wdContext.currentContextElement().setVerifico(false);} 
	else
	{	 //wdContext.currentContextElement().setHabilitar(true);
		wdComponentAPI.getMessageManager().reportSuccess("Cliente de transferencia encontrado"); 
		wdContext.currentContextElement().setVerifico(true); }   	
	    
    //@@end
  }

  //@@begin javadoc:onActionadjuntar(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActionadjuntar(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActionadjuntar(ServerEvent)
    wdThis.wdFirePlugSalidabaja_a();
    //@@end
  }

  //@@begin javadoc:onPlugentradabaja_adj(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onPlugentradabaja_adj(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onPlugentradabaja_adj(ServerEvent)
    //@@end
  }

  //@@begin javadoc:onActionmotivo_otro(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActionmotivo_otro(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActionmotivo_otro(ServerEvent)
    wdContext.currentDatosElement().setMot_baja(null);
    
	int indice = wdContext.nodeMotivoBaja().getLeadSelection();
	
    if (indice>=0)
    {
    	if (wdContext.currentMotivoBajaElement().getDescripcion().equals("Otros"))
	    { wdContext.currentContextElement().setOk_otros(true); }
    	else
	    { wdContext.currentContextElement().setOk_otros(false); }
    }
    //@@end
  }

  //@@begin javadoc:Inicializar(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void Inicializar(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin Inicializar(ServerEvent)
    
	String pais = null;
	String usuario = null;
	short empresa = 0;
	String rol = "AR_CL_SOL_MINORISTAS";
	String sociedad = null;
	String esquema = null;
	int segmento = 0;
	boolean bool = false;
	double saldocta = 0;
	double saldodoc = 0;
	double saldopen = 0;
	double saldotre = 0;
	double saldotve = 0;
	double saldoenv = 0;
	String tip_vta = null;
	
//////Seteo si es Master Data o Usuario
	int nro_cli = 0;
	long nro_sol = 0;
	String master = null;
	int nro = wdContext.currentContextElement().getNumero();
	master = wdContext.currentContextElement().getMaster();

	if (master == null)
	{	master = null;
		nro_cli = wdContext.currentContextElement().getNumero();	
		nro_sol = wdContext.currentContextElement().getNro_sol();	}
	else {
		master = "X";
		nro_sol = wdContext.currentContextElement().getNro_sol();	}	
	
	
	//Seteo campo de verificacion cliente
	wdContext.currentContextElement().setVerifico(false);	

		
	if (master != null) {
		//Para master data
		wdContext.currentContextElement().setGrisado(false);
		wdContext.currentContextElement().setGrisado_us(true);
		wdContext.currentContextElement().setMD(WDVisibility.VISIBLE);
		wdContext.currentContextElement().setUS(WDVisibility.NONE);
		wdContext.currentContextElement().setUS_MD(WDVisibility.NONE);
		wdContext.currentContextElement().setMD_US(WDVisibility.VISIBLE);		
	}
	else{//Para Usuario
		wdContext.currentContextElement().setGrisado(true);
		wdContext.currentContextElement().setGrisado_us(false);
		wdContext.currentContextElement().setMD(WDVisibility.NONE);	
		wdContext.currentContextElement().setUS(WDVisibility.VISIBLE);
		if (nro_sol !=0)
		{ wdContext.currentContextElement().setUS_MD(WDVisibility.NONE);
		  wdContext.currentContextElement().setMD_US(WDVisibility.VISIBLE);
		}
		else 
		{ wdContext.currentContextElement().setUS_MD(WDVisibility.VISIBLE);
		  wdContext.currentContextElement().setMD_US(WDVisibility.NONE);
		}
	}

	//Fecha del dia
	Calendar cal = Calendar.getInstance();
	java.sql.Date fecha = new java.sql.Date(cal.getTime().getTime());
	
	//Obtengo datos del usuario
	try {
		IWDClientUser wdClientUser = WDClientUser.getCurrentUser();
		IUser sapUser = wdClientUser.getSAPUser();	
		if (sapUser != null) {
			IUserAccount[] acct = sapUser.getUserAccounts();
			if (acct[0] != null) {
			usuario = acct[0].getDisplayName(); }
		} 	} 
	catch (WDUMException e) {
//		TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UMException e) {
//	   TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Obtengo el pais (lo obtengo del Parametro Rol)
	try {
		wdContext.nodeRol().bind(wdThis.wdGetBajaUSController().getConsultasInternasBean().getParametrosXRol(rol));
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		wdComponentAPI.getMessageManager().reportException("Error BI: " + e.getMessage(),false);
	}	
	sociedad =  wdContext.currentRolElement().getSociedad();  
	pais = wdContext.currentRolElement().getSociedad().substring(2,4);
	empresa = new BigDecimal(wdContext.currentRolElement().getSociedad().substring(0,2)).shortValue();	
	esquema = wdContext.currentRolElement().getEsquema();
	segmento = wdContext.currentRolElement().getSegmentoVta().intValue();
	
	//Paso los datos a las variables de contexto
	wdContext.currentContextElement().setPaisUsuario(pais);
	wdContext.currentContextElement().setUsuario(usuario);
	wdContext.currentContextElement().setEmpresa(empresa);
	wdContext.currentContextElement().setNro_sol(nro_sol);
	wdContext.currentContextElement().setMaster(master);
	wdContext.currentContextElement().setRol_user(rol);
	wdContext.currentContextElement().setSociedad(sociedad);
	wdContext.currentContextElement().setEsquema(esquema);
	wdContext.currentContextElement().setSegmento(segmento);
	

	if (pais == null)
	{wdComponentAPI.getMessageManager().reportWarning("Falta cargar pais en los datos del usuario");
	 wdContext.currentContextElement().setBaja_ok(false);
	return;}
	

	
//////Obtengo los Datos (por Consulta o Ticket)		
		if (master==null && nro_sol==0) {

			if ( nro_cli <= 0 ) 
				{ wdComponentAPI.getMessageManager().reportWarning("No selecciono cliente"); 
				return;}
			else 
				{ wdComponentAPI.getMessageManager().reportSuccess("Cliente: " + nro_cli); }
			
			try { //Llamo al web services (Obtengo los datos del cliente)
				ConsultaClientes model = new ConsultaClientes();
				Request_Execute requestE = new Request_Execute(model);
				GetDatosCliente_Execute getDatos = new GetDatosCliente_Execute(model);

				getDatos.setCliid(nro_cli);
				getDatos.setEmpid(empresa);
				getDatos.setPais(pais);
	
				requestE.setGetDatosClienteExecute(getDatos);
				wdContext.nodeConsultaClientes().bind(requestE);
			
				// Metodos para logueo (este WS no lleva)
				//wdContext.currentConsultaClientesElement().modelObject().setInvokerProperty(Stub.USERNAME_PROPERTY,  "wsuser");
				//wdContext.currentConsultaClientesElement().modelObject().setInvokerProperty(Stub.PASSWORD_PROPERTY,  "welcome1");
			
				wdContext.currentConsultaClientesElement().modelObject().execute();
				wdContext.nodeGetDatosClienteExecuteResponse().invalidate();
		
				} catch (WDWSModelExecuteException e) {
				//	   TODO Auto-generated catch block
					e.printStackTrace();
					wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getStackTraceString());
				}

				
				//Verifico si posee deudas de cuenta corriente
				try { //Llamo al web services
					  CuentaCorriente model = new CuentaCorriente();
					  RequestCC_Execute requestE = new RequestCC_Execute(model);
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
				tip_vta  = wdContext.currentGetCtaCteClienteExecuteResponseElement().getFmapgoabv();

				//wdComponentAPI.getMessageManager().reportWarning("Mensaje CC: " + wdContext.currentMensajesMensajesItem4Element().getMsgErrDesc());
				//wdComponentAPI.getMessageManager().reportWarning("Saldos CC: " + nro_cli + "-" + saldocta + "-" + saldodoc + "-" + saldopen);
	
				if (saldocta > 0 || saldodoc > 0 || saldopen > 0 || saldotre > 0 || saldotve > 0)
				{ wdComponentAPI.getMessageManager().reportWarning("No puede continuar con la solicitud de baja. El Cliente tiene deuda en Cuenta Corriente.");
				  return; 
				 }  	

				
				//Verifico si tiene deudas de envases
				try { //Llamo al web services
					Envases model = new Envases();
					RequestE_Execute requestE = new RequestE_Execute(model);
					GetSaldoEnvases_Execute getDatos = new GetSaldoEnvases_Execute(model);

					getDatos.setFechadesde(fecha);
					getDatos.setFechahasta(fecha);
					getDatos.setParcodenvase(0);
					getDatos.setDistribuidor(nro_cli);
					getDatos.setPais(pais);
					getDatos.setSociedad(empresa);
					getDatos.setUsuario(usuario);
		
					requestE.setGetSaldoEnvasesExecute(getDatos);
					wdContext.nodeEnvases().bind(requestE);
		
					// Metodos para logueo
					//wdContext.currentEnvasesElement().modelObject().setInvokerProperty(Stub.USERNAME_PROPERTY,  "wsuser");
					//wdContext.currentEnvasesElement().modelObject().setInvokerProperty(Stub.PASSWORD_PROPERTY,  "welcome1");
		
					wdContext.currentEnvasesElement().modelObject().execute();
					wdContext.nodeGetSaldoEnvasesExecuteResponse().invalidate();

					} catch (WDWSModelExecuteException e) {
					//	   TODO Auto-generated catch block
						e.printStackTrace();
						wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
					}

				//Obtengo saldo final de envases
				saldoenv = wdContext.currentSaldoenvasesElement().getSalTotFin();
				//wdComponentAPI.getMessageManager().reportSuccess("Saldo: " + saldoenv);

				if (saldoenv > 0)
				{ wdComponentAPI.getMessageManager().reportWarning("Este Cliente tiene deuda en Envases. Debe transferir deuda."); 	 }  

				//Habilito boton eliminar
				wdContext.currentContextElement().setBaja_ok(true);
			
				//Cargo Combo de Motivo de Baja
				try {
					wdContext.nodeMotivoBaja().bind(wdThis.wdGetBajaUSController().getConsultasInternasBean().getMotivoBaja());
					wdContext.nodeMotivoBaja().setLeadSelection(-1);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				//Obtengo tipos de documentos
				try {
					wdContext.nodeTipoDocumento().bind(wdThis.wdGetBajaUSController().getConsultasExternasBean().getTipoDocumento(sociedad,sociedad));
					wdContext.nodeTipoDocumento().setLeadSelection(-1);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
				}		
				//Selecciono el del cliente
				for (int i = 0; i < wdContext.nodeTipoDocumento().size(); i++) {
					if (wdContext.nodeTipoDocumento().getTipoDocumentoElementAt(i).getId() == wdContext.currentDatosclientesElement().getTipoDocumento())
					{wdContext.nodeTipoDocumento().setLeadSelection(i);	}
				}  

				//Obtengo Subcanales
				try {
					wdContext.nodeSubcanales().bind(wdThis.wdGetBajaUSController().getConsultasExternasBean().getSubCanalDeMarketing(segmento,esquema));
					wdContext.nodeSubcanales().setLeadSelection(-1);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
				//Selecciono el del cliente
				for (int i = 0; i < wdContext.nodeSubcanales().size(); i++) {
					if (wdContext.nodeSubcanales().getSubcanalesElementAt(i).getId() == wdContext.currentDatosclientesElement().getSubCanalMkt())
					{ wdContext.nodeSubcanales().setLeadSelection(i);	}
				}  		

				//Obtengo Provincias
				try {
					wdContext.nodeProvincias().bind(wdThis.wdGetBajaUSController().getConsultasExternasBean().getProvincia(esquema,pais));
					wdContext.nodeProvincias().setLeadSelection(-1);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
				//Selecciono el del cliente
				for (int i = 0; i < wdContext.nodeProvincias().size(); i++) {
					if (wdContext.nodeProvincias().getProvinciasElementAt(i).getId() == wdContext.currentDatosclientesElement().getDepartamento())
					{ wdContext.nodeProvincias().setLeadSelection(i);	}
				}  		
			
			//Obtengo dias de la semana
			try {
				wdContext.nodeDias().bind(wdThis.wdGetBajaUSController().getConsultasExternasBean().getDiaDeLaSemana(esquema));
				wdContext.nodeDias().setLeadSelection(-1);
			} catch (RemoteException e) {
				e.printStackTrace();
				wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
			}				

			//Obtengo centros de despachos
			try {
				wdContext.nodeCentroDespacho().bind(wdThis.wdGetBajaUSController().getConsultasExternasBean().getCentroDeDespacho(esquema));
				wdContext.nodeCentroDespacho().setLeadSelection(-1);
			} catch (RemoteException e) {
				e.printStackTrace();
				wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
			}				
			
			String dia_desc = null;
			String ter_desc = null;
			String cen_desc = null;
			String can_desc = null;
			int territ = 0;
			int canal = 0;
			//Territorios
			for (int i = 0; i < wdContext.nodeTerriClien().size(); i++) {
				//Obtengo territorio desc.
				territ = wdContext.nodeTerriClien().getTerriClienElementAt(i).getCodTerritorio();
				try {
					wdContext.nodeTerrittorio().bind(wdThis.wdGetBajaUSController().getConsultasExternasBean().getTerritoriosPorCliente(esquema,sociedad,territ));
				} catch (RemoteException e) {
					e.printStackTrace();
					wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
				}
				if (wdContext.currentTerrittorioElement()!=null)
				{ 	ter_desc = wdContext.currentTerrittorioElement().getTerritorioDesc();
					wdContext.nodeTerriClien().getTerriClienElementAt(i).setTerritorio_desc(ter_desc);			
				}
				//Selecciono desc centro despacho cliente
				for (int l = 0; l < wdContext.nodeCentroDespacho().size(); l++) {
					if (wdContext.nodeCentroDespacho().getCentroDespachoElementAt(l).getId().trim().equals(wdContext.nodeTerriClien().getTerriClienElementAt(i).getCentrodesp().trim()))
					{ cen_desc = wdContext.nodeCentroDespacho().getCentroDespachoElementAt(l).getDesc(); }
				}  	
				wdContext.nodeTerriClien().getTerriClienElementAt(i).setCentro_desc(cen_desc);		
				//Selecciono desc canal venta
				canal = wdContext.nodeTerriClien().getTerriClienElementAt(i).getCanalVenta();
				try {
					can_desc = wdThis.wdGetBajaUSController().getConsultasExternasBean().getCanalDeVenta(esquema,canal);
				} catch (RemoteException e) {
					e.printStackTrace();
					wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
				}
				if (can_desc!=null)
					{ wdContext.nodeTerriClien().getTerriClienElementAt(i).setCanal_desc(can_desc); }				
				
			  //Frecuencias
			  for (int j = 0; j < wdContext.nodeTerriClien().getTerriClienElementAt(i).nodeFrecuencia().nodeFrecuencia2().size(); j++) {
				//Selecciono desc dias del cliente
				for (int k = 0; k < wdContext.nodeDias().size(); k++) {
					if (wdContext.nodeDias().getDiasElementAt(k).getId() == wdContext.nodeTerriClien().getTerriClienElementAt(i).nodeFrecuencia().nodeFrecuencia2().getFrecuencia2ElementAt(j).getDiaSemana())
					{ dia_desc = wdContext.nodeDias().getDiasElementAt(k).getDesc(); }
				}  	
				wdContext.nodeTerriClien().getTerriClienElementAt(i).nodeFrecuencia().nodeFrecuencia2().getFrecuencia2ElementAt(j).setDiaSemana_desc(dia_desc);
			  }
			}
			
				//Cargo estructura de salida
				IDatosElement element = wdContext.nodeDatos().createDatosElement(); //Debo inicializar el nodo
				
				//element.setMot_baja(wdContext.currentMotivoBajaElement().getDescripcion());
				element.setNro_cliente(wdContext.currentDatosclientesElement().getCodCliente());
				element.setRazon_social(wdContext.currentDatosclientesElement().getRazonSocial());
				element.setTipo_documento(wdContext.currentDatosclientesElement().getTipoDocumento());
				element.setDocumento(wdContext.currentDatosclientesElement().getNroDocumento());
				element.setSubcanal(wdContext.currentDatosclientesElement().getSubCanalMkt());
				element.setLocalidad(wdContext.currentDatosclientesElement().getLocalidad());
				element.setCalle(wdContext.currentDatosclientesElement().getDomicilio());
				element.setNumero(wdContext.currentDatosclientesElement().getNumero());
				//element.setPuerta(wdContext.currentDatosclientesElement().getDepartamento());
				element.setProvincia(new Integer(wdContext.currentDatosclientesElement().getDepartamento()).toString());
				element.setCp(wdContext.currentDatosclientesElement().getCP());
				element.setTelefono(wdContext.currentDatosclientesElement().getTelefono());
				element.setEmail(wdContext.currentDatosclientesElement().getEmail());	
				element.setSaldo_env(saldoenv);
				element.setSaldo_cc(saldocta);
				element.setSaldo_doc(saldodoc);
				element.setSaldo_env(saldoenv);
				element.setSaldo_pp(saldopen);
				element.setSaldo_rech(saldotre);
				element.setSaldo_venc(saldotve);
				element.setTipo_vta(tip_vta);									
				
				wdContext.nodeDatos().addElement(element);		
			}		
			
		else
		
			{ //Busco los datos guardados con numero de ticket -- MD
			try { ticket =  wdThis.wdGetBajaUSController().getConsultasInternasBean().getTicketXNroSolicitud(nro_sol);
				wdContext.nodeTicket().bind(ticket); } 
			catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 	
				wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
				return; }
			
			if (wdContext.currentTicketElement()==null)
				{ wdComponentAPI.getMessageManager().reportWarning("Error al traer tck");	
				return;}
			
			//Asigno el numero de cliente obtenido del tck
			nro_cli = wdContext.currentTicketElement().getCodCliente().intValue();
			
			
			//Verifico si posee deudas de cuenta corriente
			try { //Llamo al web services
				  CuentaCorriente model = new CuentaCorriente();
				  RequestCC_Execute requestE = new RequestCC_Execute(model);
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
			tip_vta  = wdContext.currentGetCtaCteClienteExecuteResponseElement().getFmapgoabv();

			//wdComponentAPI.getMessageManager().reportWarning("Mensaje CC: " + wdContext.currentMensajesMensajesItem4Element().getMsgErrDesc());
			//wdComponentAPI.getMessageManager().reportWarning("Mensaje CC: " + nro_cli + "-" + saldocta + "-" + saldodoc + "-" + saldopen);
	
			if (saldocta > 0 || saldodoc > 0 || saldopen > 0 || saldotre > 0 || saldotve > 0)
			{ wdComponentAPI.getMessageManager().reportWarning("Este Cliente tiene deuda en Cuenta Corriente.");
			  //wdContext.currentContextElement().setMD(WDVisibility.NONE); 
			 }  	

			//Verifico si tiene deudas de envases
			try { //Llamo al web services
				Envases model = new Envases();
				RequestE_Execute requestE = new RequestE_Execute(model);
				GetSaldoEnvases_Execute getDatos = new GetSaldoEnvases_Execute(model);

				getDatos.setFechadesde(fecha);
				getDatos.setFechahasta(fecha);
				getDatos.setParcodenvase(0);
				getDatos.setDistribuidor(nro_cli);
				getDatos.setPais(pais);
				getDatos.setSociedad(empresa);
				getDatos.setUsuario(usuario);
		
				requestE.setGetSaldoEnvasesExecute(getDatos);
				wdContext.nodeEnvases().bind(requestE);

				wdContext.currentEnvasesElement().modelObject().execute();
				wdContext.nodeGetSaldoEnvasesExecuteResponse().invalidate();

				} catch (WDWSModelExecuteException e) {
				//	   TODO Auto-generated catch block
					e.printStackTrace();
					wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
				}
	
				//Obtengo saldo final de envases
				saldoenv = wdContext.currentSaldoenvasesElement().getSalTotFin();
				//wdComponentAPI.getMessageManager().reportSuccess("Saldo: " + saldoenv);

			 if (saldoenv > 0)
			 { wdComponentAPI.getMessageManager().reportWarning("Este Cliente tiene deuda en Envases."); 
			   //wdContext.currentContextElement().setMD(WDVisibility.NONE);
			  }
			   					  			
			//Habilito boton eliminar
			wdContext.currentContextElement().setBaja_ok(true);
			
			
			//Obtengo tipos de documentos
			try {
				wdContext.nodeTipoDocumento().bind(wdThis.wdGetBajaUSController().getConsultasExternasBean().getTipoDocumento(sociedad,sociedad));
				wdContext.nodeTipoDocumento().setLeadSelection(-1);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			//Selecciono el del cliente
			for (int i = 0; i < wdContext.nodeTipoDocumento().size(); i++) {
				if (wdContext.nodeTipoDocumento().getTipoDocumentoElementAt(i).getId() == wdContext.currentTicketElement().getCodTipoDocumento().intValue())
				{wdContext.nodeTipoDocumento().setLeadSelection(i);	}
			}  			

			//Obtengo Subcanales
			try {
				wdContext.nodeSubcanales().bind(wdThis.wdGetBajaUSController().getConsultasExternasBean().getSubCanalDeMarketing(segmento,esquema));
				wdContext.nodeSubcanales().setLeadSelection(-1);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			//Selecciono el del cliente
			for (int i = 0; i < wdContext.nodeSubcanales().size(); i++) {
				if (wdContext.nodeSubcanales().getSubcanalesElementAt(i).getId() == wdContext.currentTicketElement().getSubCanalMkt().intValue())
				{wdContext.nodeSubcanales().setLeadSelection(i);	}
			}  			

			//Obtengo Provincias
			try {
				wdContext.nodeProvincias().bind(wdThis.wdGetBajaUSController().getConsultasExternasBean().getProvincia(esquema,pais));
				wdContext.nodeProvincias().setLeadSelection(-1);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			//Selecciono el del cliente
			for (int i = 0; i < wdContext.nodeProvincias().size(); i++) {
				if (wdContext.nodeProvincias().getProvinciasElementAt(i).getId() == wdContext.currentTicketElement().getCodProvincia().intValue())
				{wdContext.nodeProvincias().setLeadSelection(i);	}
			} 

			//Obtengo dias de la semana
			try {
				wdContext.nodeDias().bind(wdThis.wdGetBajaUSController().getConsultasExternasBean().getDiaDeLaSemana(esquema));
				wdContext.nodeDias().setLeadSelection(-1);
			} catch (RemoteException e) {
				e.printStackTrace();
				wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
			}				

			//Obtengo centros de despachos
			try {
				wdContext.nodeCentroDespacho().bind(wdThis.wdGetBajaUSController().getConsultasExternasBean().getCentroDeDespacho(esquema));
				wdContext.nodeCentroDespacho().setLeadSelection(-1);
			} catch (RemoteException e) {
				e.printStackTrace();
				wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
			}				
			
			String ter_desc = null;
			String cen_desc = null;
			String can_desc = null;
			int territ = 0;
			int canal = 0;
			//Territorios
			for (int i = 0; i < wdContext.nodeTerritorios_tck().size(); i++) {
				//Obtengo territorio desc.
				territ = wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).getCodTerritorio().intValue();
				try {
					wdContext.nodeTerrittorio().bind(wdThis.wdGetBajaUSController().getConsultasExternasBean().getTerritoriosPorCliente(esquema,sociedad,territ));
				} catch (RemoteException e) {
					e.printStackTrace();
					wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
				}
				if (wdContext.currentTerrittorioElement()!=null)
				{ 	ter_desc = wdContext.currentTerrittorioElement().getTerritorioDesc();
					wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).setTerritorio_desc(ter_desc);			
				}
				//Selecciono desc centro despacho cliente
				for (int l = 0; l < wdContext.nodeCentroDespacho().size(); l++) {
					if (wdContext.nodeCentroDespacho().getCentroDespachoElementAt(l).getId().trim().equals(wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).getCentroDespacho().trim()))
					{ cen_desc = wdContext.nodeCentroDespacho().getCentroDespachoElementAt(l).getDesc(); }
				}  	
				wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).setCentro_desc(cen_desc);
				
				//Selecciono desc canal venta
				canal = wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).getCanalVenta().intValue();
				try {
					can_desc = wdThis.wdGetBajaUSController().getConsultasExternasBean().getCanalDeVenta(esquema,canal);
				} catch (RemoteException e) {
					e.printStackTrace();
					wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
				}
				if (can_desc!=null)
					{ wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).setCanal_desc(can_desc); }				
		
			}

								  					
			//Cargo estructura de salida
			IDatosElement element = wdContext.nodeDatos().createDatosElement(); //Inicializo el elemento

////////////Para Usuario Final por RECHAZOO	
			int otros = 0;	
			boolean esta = false;
  			
  			if (master==null)			
			{ //Cargo Combo de Motivo de Baja
				 try {
			  		wdContext.nodeMotivoBaja().bind(wdThis.wdGetBajaUSController().getConsultasInternasBean().getMotivoBaja());
			  		wdContext.nodeMotivoBaja().setLeadSelection(-1);
			 	} catch (RemoteException e) {
			  		// TODO Auto-generated catch block
			  		e.printStackTrace();  	}
			 	//Selecciono el del cliente
			 	for (int i = 0; i < wdContext.nodeMotivoBaja().size(); i++) {
			 		if (wdContext.nodeMotivoBaja().getMotivoBajaElementAt(i).getDescripcion().equals(wdContext.currentTicketElement().getMotivoBaja()))
			 			{ wdContext.nodeMotivoBaja().setLeadSelection(i);	
			  			esta = true;  }
			  		//Guardo el index de la opcion otros
			  		if (wdContext.nodeMotivoBaja().getMotivoBajaElementAt(i).getDescripcion().equals("Otros"))
			  			{ otros = i;	}
			 	}
			 	//Si no encontro el valor cargado y tiene valor, es opcion "Otros"
			 	if (esta==false && wdContext.currentTicketElement().getMotivoBaja()!=null)
			 		{ wdContext.nodeMotivoBaja().setLeadSelection(otros);
					  element.setMot_baja(wdContext.currentTicketElement().getMotivoBaja()); 	}	
				
				//Cargo datos cliente Transf. si viene informado
				if (wdContext.currentTicketElement().getCodClienteTransfiereDeuda()!=null)
				{	if (wdContext.currentTicketElement().getCodClienteTransfiereDeuda().intValue()!=0)
					{ 	int nro_cli_t = wdContext.currentTicketElement().getCodClienteTransfiereDeuda().intValue();
						try { wdContext.nodeCliente_t().bind(wdThis.wdGetBajaUSController().getConsultasExternasBean().getClienteXNumero("01AR","01AR",800,nro_cli_t)); } 
						catch (RemoteException e) {
							// TODO Auto-generated catch block
							e.printStackTrace(); 
							//Linea para imprimir el error de catch
							wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage()); }			
					}
				}	
			}	
			else //Master data
				{  element.setMot_baja(wdContext.currentTicketElement().getMotivoBaja());  }
//			////////	

			
			if (wdContext.currentTicketElement().getTransfDeudaEnv() != null)
			{	
				if (wdContext.currentTicketElement().getTransfDeudaEnv().trim().equals("S"))	{ bool=true;  }
				else	{ bool=false;	}			
				element.setPosee_d(bool);	
			}		
			if (wdContext.currentTicketElement().getCodClienteTransfiereDeuda()!=null)
				{ element.setTransfiere(wdContext.currentTicketElement().getCodClienteTransfiereDeuda().intValue()); 
				  element.setPosee_d(true); }
			if (wdContext.currentTicketElement().getEsAltaBaja()!=null)
			{
				if (wdContext.currentTicketElement().getEsAltaBaja().trim().equals("S"))	{ bool=true;  }
				else	{ bool=false;	}			
				element.setAlta_baja(bool);				
			}
			if (wdContext.currentTicketElement().getTransfiereHistoricoVentas()!=null)
			{
				if (wdContext.currentTicketElement().getTransfiereHistoricoVentas().trim().equals("S")) 	{ bool=true; }
				else	{ bool=false;	}
				element.setHistorico(bool);				
			}
			if (wdContext.currentTicketElement().getCodNuevoClienteCCQ()!=null)
				{ element.setNcliente_ccq(wdContext.currentTicketElement().getCodNuevoClienteCCQ().intValue()); }
			if (wdContext.currentTicketElement().getCodCliente()!=null) 
				{ element.setNro_cliente(wdContext.currentTicketElement().getCodCliente().intValue()); } 
			element.setRazon_social(wdContext.currentTicketElement().getRazonSocial());
			element.setTipo_documento(wdContext.currentTicketElement().getCodTipoDocumento().shortValue());
			element.setDocumento(wdContext.currentTicketElement().getNumeroDocumento());
			if (wdContext.currentTicketElement().getSubCanalMkt()!=null)
				{ element.setSubcanal(wdContext.currentTicketElement().getSubCanalMkt().shortValue()); } 
			element.setLocalidad(wdContext.currentTicketElement().getLocalidadDesc());
			element.setCalle(wdContext.currentTicketElement().getCalle());
			element.setNumero(wdContext.currentTicketElement().getNumero());
			element.setPuerta(wdContext.currentTicketElement().getPuerta());
			element.setProvincia(wdContext.currentTicketElement().getProvinciaDesc());
			element.setCp(wdContext.currentTicketElement().getCp());
			element.setTelefono(wdContext.currentTicketElement().getTelefono());
			element.setEmail(wdContext.currentTicketElement().getEmail());
			element.setSaldo_cc(saldocta);
			element.setSaldo_doc(saldodoc);
			element.setSaldo_env(saldoenv);
			element.setSaldo_pp(saldopen);
			element.setSaldo_rech(saldotre);
			element.setSaldo_venc(saldotve);
			element.setTipo_vta(tip_vta);
			element.setObservac_us(wdContext.currentTicketElement().getObservacionesUs());
			element.setObservac_md(wdContext.currentTicketElement().getObservacionesMd());
			
			wdContext.nodeDatos().addElement(element);	
		}
		     
    
    //@@end
  }

  //@@begin javadoc:Finalizar(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void Finalizar(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin Finalizar(ServerEvent)
	String usuario = wdContext.currentContextElement().getUsuario();
	int nro_cli = wdContext.currentDatosElement().getNro_cliente();
	int segmento = wdContext.currentContextElement().getSegmento(); 
	String result = wdContext.currentContextElement().getResultado();
	String elecc = wdContext.currentContextElement().getEleccion().trim(); 
	
	String raz_soc = wdContext.currentDatosElement().getRazon_social();
	String pais = wdContext.currentContextElement().getPaisUsuario();
	short empresa = wdContext.currentContextElement().getEmpresa();
	String esquema = wdContext.currentContextElement().getEsquema();
	String master = wdContext.currentContextElement().getMaster();
	double saldoenv = 0;
	String tipo_sol = "B";
	long nro_sol = wdContext.currentContextElement().getNro_sol();	
    
	//Fecha del dia
	Calendar cal = Calendar.getInstance();
	java.sql.Date fecha = new java.sql.Date(cal.getTime().getTime());	 
	
	//Aceptar
 	if (result=="A")
	{ 	//Rechazo
		if (elecc.equals("R"))
		{ 	//Guardo los datos en base Portal	
			nro_sol = 0;
			nro_sol = ticket.getNroSolicitud(); 
			//Paso los datos modificados a la estructura el ticket
			ticket.setUsuarioAprobador(usuario);
			ticket.setObservacionesMd(wdContext.currentContextElement().getObservac());
			ticket.setFechaCierre(fecha);
			ticket.setSegmentoVta(new Integer(segmento));
			ticket.setEstadoTicket("2");
			//Si tiene adjuntos cambio nombre carpeta (por numero de tck)
			if (wdContext.nodeAdjuntos().size()>0)
				{ ticket.setCarpeta(wdContext.currentTicketElement().getNroTicketCrm());	}
			
			//Llamo al metodo de modificar en BD
	   		try { wdThis.wdGetBajaUSController().getConsultasInternasBean().updateTicket(ticket); }
		   catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 	
				wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
			}
			
			//Mando de vuelta proceso a US
			wdComponentAPI.getMessageManager().reportWarning("La baja del cliente " + nro_cli + " ha sido rechazada.");
    
			//Llamo al metodo Complete de la interfaz (parametro de salida)
			wdContext.currentContextElement().setNro_sol(nro_sol);
			wdThis.wdGetBajaUSInterfaceController().complete("Rechazado");   
		}
		else //Eliminar
		{
			//Termina y se envia a Master data o Borra si es Master Data
			if (master==null && nro_sol==0 ) 
			{ 		 
			  //Guardo los datos en base Portal	- Usuario Solicitante
			  //Paso los datos modificados a la estructura el ticket
			  Ticket ticket = new Ticket();
		  
			  if (wdContext.currentDatosElement().getMot_baja()!=null)
			  { ticket.setMotivoBaja(wdContext.currentDatosElement().getMot_baja());  }
			  else 
				{ if (wdContext.currentMotivoBajaElement().getDescripcion()!=null)
					{ ticket.setMotivoBaja(wdContext.currentMotivoBajaElement().getDescripcion()); }
				}
			  if (wdContext.currentDatosElement().getPosee_d()==true) 	
			  { ticket.setTransfDeudaEnv("S"); }	
			  else	{ ticket.setTransfDeudaEnv("N");	}	  
			  if (wdContext.currentDatosElement().getTransfiere()!=0)
				  { ticket.setCodClienteTransfiereDeuda(new Integer(wdContext.currentDatosElement().getTransfiere())); }
			  if (wdContext.currentDatosElement().getAlta_baja()==true) 	
			  { ticket.setEsAltaBaja("S"); }
			  else	{ ticket.setEsAltaBaja("N");	}
			  if (wdContext.currentDatosElement().getHistorico()==true) 	
			  { ticket.setTransfiereHistoricoVentas("S"); }
			  else	{ ticket.setTransfiereHistoricoVentas("N");	}
			  if (wdContext.currentDatosElement().getNcliente_ccq()!=0)
				  { ticket.setCodNuevoClienteCCQ(new Integer(wdContext.currentDatosElement().getNcliente_ccq())); }
			  if (wdContext.currentDatosElement().getNro_cliente()!=0) 
				  { ticket.setCodCliente(new Integer(wdContext.currentDatosElement().getNro_cliente())); } 
				ticket.setRazonSocial(wdContext.currentDatosElement().getRazon_social());
				ticket.setCodTipoDocumento(new Integer(wdContext.currentDatosElement().getTipo_documento()));
				ticket.setNumeroDocumento(wdContext.currentDatosElement().getDocumento());
			  if (wdContext.currentDatosElement().getSubcanal()!=0)
				  { ticket.setSubCanalMkt(new Integer(wdContext.currentDatosElement().getSubcanal())); } 
				ticket.setLocalidadDesc(wdContext.currentDatosElement().getLocalidad());
				ticket.setCalle(wdContext.currentDatosElement().getCalle());
				ticket.setNumero(wdContext.currentDatosElement().getNumero());
				ticket.setPuerta(wdContext.currentDatosElement().getPuerta());
				ticket.setProvinciaDesc(wdContext.currentDatosElement().getProvincia());
				ticket.setCodProvincia(new Integer(wdContext.currentProvinciasElement().getId()));
				ticket.setCp(wdContext.currentDatosElement().getCp());
				ticket.setTelefono(wdContext.currentDatosElement().getTelefono());
				ticket.setEmail(wdContext.currentDatosElement().getEmail());

			  if (wdContext.currentDatosclientesElement().getAceptaDesUniPed()!=null)
			  { ticket.setAceptaDesdUnifPedido(wdContext.currentDatosclientesElement().getAceptaDesUniPed()); } 
			  ticket.setAutVentaAlochol(wdContext.currentDatosclientesElement().getAutVtaAlcohol());
			  ticket.setCodCategCliente(wdContext.currentDatosclientesElement().getCategoria());
			  ticket.setCodCliente(new Integer(wdContext.currentDatosclientesElement().getCodCliente()));;
			  ticket.setCodCuentaMadre(new Integer(wdContext.currentDatosclientesElement().getCuentaMadre()));
			  ticket.setCodFormaAtencion(new Integer(wdContext.currentDatosclientesElement().getFormaAtencion()));
			  ticket.setCodLocalidad(wdContext.currentDatosclientesElement().getLocalidad());
			  ticket.setCoordenadaX(wdContext.currentDatosclientesElement().getCoordenadaX());
			  ticket.setCoordenadaY(wdContext.currentDatosclientesElement().getCoordenadaY());
		  
			  if (wdContext.currentContextElement().getVerifico()==true) {
				ticket.setCuitTrDeuda(wdContext.currentCliente_tElement().getDocumento());
				ticket.setDireccionTrDeuda(wdContext.currentCliente_tElement().getDomicilio());
				ticket.setLocalidadTrDeuda(wdContext.currentCliente_tElement().getLocalidad_Id());
				ticket.setRazonSocialClTrDeuda(wdContext.currentCliente_tElement().getRazonSocial());							  	
			  }

			  ticket.setEmail(wdContext.currentDatosclientesElement().getEmail());
			  ticket.setEsExcluivo(wdContext.currentDatosclientesElement().getEsExclusivo());
			  ticket.setEsquema(esquema);
			  ticket.setEstadoTicket("1");
			  ticket.setExcIIBBFechaDesde(wdContext.currentDatosclientesElement().getIIBBFchDesde());
			  ticket.setExcIIBBFechaHasta(wdContext.currentDatosclientesElement().getIIBBFchHasta());
			  ticket.setExcIvaFechaDesde(wdContext.currentDatosclientesElement().getIvaFchDesde());
			  ticket.setExcIvaFechaHasta(wdContext.currentDatosclientesElement().getIvaFchHasta());
			  ticket.setFechaCreacion(fecha);
			  ticket.setFechaVencimientoLicencia(wdContext.currentDatosclientesElement().getFechaVencLicencia());
			  ticket.setFormaEntregaCtaCte(wdContext.currentDatosclientesElement().getFrmEntregaCtaCte());
			  ticket.setFormaPago(new Integer(wdContext.currentDatosclientesElement().getFormaPago()));
			  ticket.setImprimeRemito(wdContext.currentDatosclientesElement().getImprimeRemito());
			  ticket.setListaPrecioBasico(new Integer(wdContext.currentDatosclientesElement().getListaPrcBasico()));
			  ticket.setListaPrecioMaximo(new Integer(wdContext.currentDatosclientesElement().getListaPrcMaxima()));
			  ticket.setLocalidadDesc(wdContext.currentDatosclientesElement().getLocalidad());
			  ticket.setMesajeFactura(wdContext.currentDatosclientesElement().getMensajeFactura());
			  ticket.setMoneda(wdContext.currentDatosclientesElement().getMoneda());
			  ticket.setNombreFantasia(wdContext.currentDatosclientesElement().getNombreFant());
			  ticket.setNroIIBB(wdContext.currentDatosclientesElement().getNroIIBB());
			  ticket.setNroLicVentaAlochol(wdContext.currentDatosclientesElement().getNroLicVtaAlcohol());

			  ticket.setObservacionesMd(wdContext.currentDatosElement().getObservac_md());
			  ticket.setObservacionesUs(wdContext.currentContextElement().getObservac());
			  ticket.setPagaSeguro(wdContext.currentDatosclientesElement().getPagaSeguro());
			  ticket.setPerfilCliente(wdContext.currentDatosclientesElement().getPerfilCliente());
			  ticket.setPorcExcIIBB(new BigDecimal(wdContext.currentDatosclientesElement().getPrjExcepcionIIBB()));
			  ticket.setPorcExcIva(new BigDecimal(wdContext.currentDatosclientesElement().getPrjPersepcionIva()));
			  ticket.setProvinciaDesc(wdContext.currentProvinciasElement().getDesc());
			  ticket.setRazonSocialAbreviada(wdContext.currentDatosclientesElement().getRazonABV());
		  
			  if (wdContext.currentContextElement().getCarpeta()!=null)
			  { ticket.setCarpeta(wdContext.currentContextElement().getCarpeta()); } 		  
			  if (wdContext.currentContextElement().getRepositorio()!=null)
			  { ticket.setRepositorio(wdContext.currentContextElement().getRepositorio()); } 
		    
			  ticket.setSegmentoVta(new Integer(segmento));
			  ticket.setSociedad(wdContext.currentRolElement().getSociedad());
			  ticket.setSubCanalMktDesc(wdContext.currentSubcanalesElement().getDesc());
			  ticket.setTelefono(wdContext.currentDatosclientesElement().getTelefono());
			  ticket.setTienePromocion(wdContext.currentDatosclientesElement().getTienePromocion());
			  ticket.setTipoClienteContab(new Integer(wdContext.currentDatosclientesElement().getTpoClienteContable()));
			  ticket.setTipoCobranza(new Integer(wdContext.currentDatosclientesElement().getTipoDeCobranza()));
			  ticket.setTipoDocumentoDesc(wdContext.currentTipoDocumentoElement().getDesc());
			  ticket.setTipoEmpresa(wdContext.currentDatosclientesElement().getTpoEmpresa());
			  ticket.setTipoIIBB(wdContext.currentDatosclientesElement().getTipoIIBB());
			  ticket.setRamo(new Integer(wdContext.currentDatosclientesElement().getRamo()));
			  ticket.setTipoSolicitud(tipo_sol);
			  ticket.setTipoVtaFsEnvases(new Integer(wdContext.currentDatosclientesElement().getTpoVtaFSxEnv()));
			  ticket.setTipoVtaFsMercaderia(new Integer(wdContext.currentDatosclientesElement().getTpoVtaFSxMerc()));
			  ticket.setUsuarioSolicitante(usuario);
	
			  //Territorios
			  ticket.setTerritorios(new HashSet());
			  for (int i = 0; i < wdContext.nodeTerriClien().size(); i++) {
				TerritorioTabla terr = new TerritorioTabla();
				terr.setFrecuencias(new HashSet());
				//Frecuencias
				for (int j = 0; j < wdContext.nodeTerriClien().getTerriClienElementAt(i).nodeFrecuencia().nodeFrecuencia2().size(); j++) {
					Frecuencia frecuencia = new Frecuencia();
					frecuencia.setTerritorio(terr);
					frecuencia.setCodDiaSemana(new Integer(wdContext.nodeTerriClien().getTerriClienElementAt(i).nodeFrecuencia().nodeFrecuencia2().getFrecuencia2ElementAt(j).getDiaSemana()));
					frecuencia.setDiaSemanaDesc(wdContext.nodeTerriClien().getTerriClienElementAt(i).nodeFrecuencia().nodeFrecuencia2().getFrecuencia2ElementAt(j).getDiaSemana_desc());
					frecuencia.setTipoFrecuencia(wdContext.nodeTerriClien().getTerriClienElementAt(i).nodeFrecuencia().nodeFrecuencia2().getFrecuencia2ElementAt(j).getTipoFrecuencia());
					frecuencia.setCodCliVisitAntes(new Integer((int)wdContext.nodeTerriClien().getTerriClienElementAt(i).nodeFrecuencia().nodeFrecuencia2().getFrecuencia2ElementAt(j).getClienteVisitaAntes()));
					terr.addFrecuencia(frecuencia);
				}	
				terr.setTicket(ticket);
				terr.setCodTerritorio(new Integer(wdContext.nodeTerriClien().getTerriClienElementAt(i).getCodTerritorio()));
				terr.setCanalVenta(wdContext.currentRolElement().getCanalVenta());
				terr.setCentroDespacho(wdContext.nodeTerriClien().getTerriClienElementAt(i).getCentrodesp());
				ticket.addTerritorios(terr);
			  }

			  //Adjuntos
			  ticket.setAdjuntos(new HashSet());
			  for (int i = 0; i < wdContext.nodeAdjunto().size(); i++) {
				Adjunto adj = new Adjunto();
				adj.setTicket(ticket);
				adj.setArchivo(wdContext.nodeAdjunto().getAdjuntoElementAt(i).getNombre());
				ticket.addAdjuntos(adj);
			  }		  

			  //Llamo al metodo de insertar a BD
			  nro_sol = 0;
			 try { nro_sol = wdThis.wdGetBajaUSController().getConsultasInternasBean().insertTicket(ticket); }
			 catch (RemoteException e) {
				  // TODO Auto-generated catch block
				  e.printStackTrace(); 	
				  //Linea para imprimir el error de catch
				  wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage()); 
				  }
			  	  
			  wdComponentAPI.getMessageManager().reportSuccess("Se envio el cliente: " + nro_cli + " " + raz_soc + " para darse de baja"); 
			  }
		  
			else
		
			  {	//Elimino - Master Data 
				// Paso los datos modificados a la estructura el ticket
				if (master != null)
				{	//Master Data
					nro_sol = ticket.getNroSolicitud();			
					ticket.setUsuarioAprobador(usuario);
					ticket.setObservacionesMd(wdContext.currentContextElement().getObservac());
					ticket.setEstadoTicket("3");
					ticket.setFechaCierre(fecha);
					ticket.setSegmentoVta(new Integer(segmento)); 
					if (wdContext.nodeAdjuntos().size()>0)
						{ ticket.setCarpeta(wdContext.currentTicketElement().getNroTicketCrm());	}
			
				
					//Llamo al metodo de modificar en BD
				   try { wdThis.wdGetBajaUSController().getConsultasInternasBean().updateTicket(ticket); }
				   catch (RemoteException e) {
						e.printStackTrace(); 	
						wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
						return; }
		
					// Llamo WS de baja			
					try { //Llamo al web services de baja
						BajaCliente model = new BajaCliente();
						RequestB_Execute requestE = new RequestB_Execute(model);
						BajaCliente_Execute bajaDatos = new BajaCliente_Execute(model);

						bajaDatos.setCliid(nro_cli);
						bajaDatos.setEmpid(empresa);
						bajaDatos.setPais(pais);

						requestE.setBajaClienteExecute(bajaDatos);
						wdContext.nodeBajaCliente().bind(requestE);
		
						wdContext.currentBajaClienteElement().modelObject().execute();
						wdContext.nodeBajaClienteExecuteResponse().invalidate();

						} catch (WDWSModelExecuteException e) {
							e.printStackTrace();
							wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getStackTraceString());
						}
					
						//Obtengo el mensaje del WS				
						String mensaje = wdContext.currentMensajesMensajesItem2Element().getMsgErrDesc();
						wdComponentAPI.getMessageManager().reportSuccess("Borrado: " + mensaje);					
				
					}
				else 
					{ //Usuario RECHAZADO - creo nuevo tck ////////////////
					if (wdContext.currentDatosElement().getMot_baja()!=null)
						{ ticket.setMotivoBaja(wdContext.currentDatosElement().getMot_baja());  }
					else 
						{ if (wdContext.currentMotivoBajaElement().getDescripcion()!=null)
						  { ticket.setMotivoBaja(wdContext.currentMotivoBajaElement().getDescripcion()); }
						}
					if (wdContext.currentDatosElement().getPosee_d()==true) 	
						{ ticket.setTransfDeudaEnv("S"); }	
					else	{ ticket.setTransfDeudaEnv("N");	}	  
					if (wdContext.currentDatosElement().getTransfiere()!=0)
						{ ticket.setCodClienteTransfiereDeuda(new Integer(wdContext.currentDatosElement().getTransfiere())); }
					if (wdContext.currentDatosElement().getAlta_baja()==true) 	
						{ ticket.setEsAltaBaja("S"); }
					else	{ ticket.setEsAltaBaja("N");	}
					if (wdContext.currentDatosElement().getHistorico()==true) 	
						{ ticket.setTransfiereHistoricoVentas("S"); }
					else	{ ticket.setTransfiereHistoricoVentas("N");	}
					//Cliente tranfiere				
					if (wdContext.currentContextElement().getVerifico()==true) {
					  ticket.setCuitTrDeuda(wdContext.currentCliente_tElement().getDocumento());
					  ticket.setDireccionTrDeuda(wdContext.currentCliente_tElement().getDomicilio());
					  ticket.setLocalidadTrDeuda(wdContext.currentCliente_tElement().getLocalidad_Id());
					  ticket.setRazonSocialClTrDeuda(wdContext.currentCliente_tElement().getRazonSocial());							  	
					}
					ticket.setEstadoTicket("1");
					ticket.setFechaCreacion(fecha);				
					ticket.setObservacionesMd(wdContext.currentDatosElement().getObservac_md());
					ticket.setObservacionesUs(wdContext.currentContextElement().getObservac());
				
					if (wdContext.currentContextElement().getCarpeta()!=null)
						{ ticket.setCarpeta(wdContext.currentContextElement().getCarpeta()); } 		  
					if (wdContext.currentContextElement().getRepositorio()!=null)
						{ ticket.setRepositorio(wdContext.currentContextElement().getRepositorio()); } 				
				
					//Carpeta nueva
					String carpeta = "TMP_" + fecha.getTime();
					carpeta.trim();		
					//Repositorio nuevo
					String repositorio = null;
					try { repositorio = wdThis.wdGetBajaUSController().getConsultasInternasBean().getRepositorio();  }
					catch (RemoteException e) {
						e.printStackTrace();
						wdComponentAPI.getMessageManager().reportException("Error BI: " + e.getMessage(),false);
						return; }	
					//Url nueva		
					String url = "/" + repositorio + "/" + ticket.getEsquema().trim() + "/" + ticket.getSegmentoVta() + "/" + carpeta + "/";		
				
					if (wdContext.nodeAdjunto().size()>0 || wdContext.nodeAdjuntos().size()>0 )
					{	//Creo Carpeta Nueva 			
						traerResource(url, true);  }
					else {  carpeta = null;  }
				
					//Adjuntos
					String archivo = null;
					ticket.setAdjuntos(new HashSet());
					
					if (wdContext.currentContextElement().getFlag_adjunto()!=null)
					{ 	for (int i = 0; i < wdContext.nodeAdjunto().size(); i++) {
							Adjunto adj = new Adjunto();
							adj.setTicket(ticket);
							archivo = wdContext.nodeAdjunto().getAdjuntoElementAt(i).getNombre();
							adj.setArchivo(archivo);
							ticket.addAdjuntos(adj);
				  
							//Traspaso Archivos a nueva carpeta
							IResource existente = traerResource("/" + ticket.getRepositorio() + "/" + ticket.getEsquema() + "/" + ticket.getSegmentoVta() + "/" + ticket.getCarpeta() + "/" + archivo, false);
							RID rid = RID.getRID(url + archivo);
							try {
								existente.copy(rid, null);
							} catch (NotSupportedException e) {
								e.printStackTrace();
							} catch (AccessDeniedException e) {
								e.printStackTrace();
							} catch (ResourceException e) {
								e.printStackTrace();
							}	
						}	//Fin For	  
					}	
					else //Cargo lo que tenga el tck (porque no entro a adjuntos)
					{	
						for (int i = 0; i < wdContext.nodeAdjuntos().size(); i++) {
							Adjunto adj = new Adjunto();
							adj.setTicket(ticket);
							archivo = wdContext.nodeAdjuntos().getAdjuntosElementAt(i).getArchivo();
							adj.setArchivo(archivo);
							ticket.addAdjuntos(adj);
				  	
							//Traspaso Archivos a nueva carpeta
							IResource existente = traerResource("/" + ticket.getRepositorio() + "/" + ticket.getEsquema() + "/" + ticket.getSegmentoVta() + "/" + ticket.getCarpeta() + "/" + archivo, false);
							RID rid = RID.getRID(url + archivo);
							try {
								existente.copy(rid, null);
							} catch (NotSupportedException e) {
								e.printStackTrace();
							} catch (AccessDeniedException e) {
								e.printStackTrace();
							} catch (ResourceException e) {
								e.printStackTrace();
							}
						}		//Fin For  
					}
				
					//Territorios
					ticket.setTerritorios(new HashSet());
					for (int i = 0; i < wdContext.nodeTerritorios_tck().size(); i++) {
					  TerritorioTabla terr = new TerritorioTabla();
					  terr.setFrecuencias(new HashSet());
					  //Frecuencias
					  for (int j = 0; j < wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).nodeFrecuencias().size(); j++) {
						  Frecuencia frecuencia = new Frecuencia();
						  frecuencia.setTerritorio(terr);
						  frecuencia.setCodDiaSemana(wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).nodeFrecuencias().getFrecuenciasElementAt(j).getCodDiaSemana());
						  frecuencia.setDiaSemanaDesc(wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).nodeFrecuencias().getFrecuenciasElementAt(j).getDiaSemanaDesc());
						  frecuencia.setTipoFrecuencia(wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).nodeFrecuencias().getFrecuenciasElementAt(j).getTipoFrecuencia());
						  frecuencia.setCodCliVisitAntes(wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).nodeFrecuencias().getFrecuenciasElementAt(j).getCodCliVisitAntes());
						  terr.addFrecuencia(frecuencia);
					  }
					  terr.setTicket(ticket);
					  terr.setCodTerritorio(wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).getCodTerritorio());
					  terr.setCanalVenta(wdContext.currentRolElement().getCanalVenta());
					  terr.setCentroDespacho(wdContext.nodeTerritorios_tck().getTerritorios_tckElementAt(i).getCentroDespacho());
					  ticket.addTerritorios(terr);
					}
				
					ticket.setNroSolicitud(0);
					ticket.setNroTicketCrm(null);
					ticket.setCarpeta(carpeta);
					ticket.setRepositorio(repositorio);
			
					//Llamo al metodo de insertar a BD
				   try { nro_sol = wdThis.wdGetBajaUSController().getConsultasInternasBean().insertTicket(ticket); }
				   catch (RemoteException e) {
						e.printStackTrace(); 	
						wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage()); }
			  
					wdComponentAPI.getMessageManager().reportSuccess("Se envio el cliente: " + nro_cli + " " + raz_soc + " para darse de baja"); 
					//wdComponentAPI.getMessageManager().reportSuccess("Solicitud copia: " + nro_sol); 					  							
				}  	 	
		}
	
		//Llamo al metodo Complete de la interfaz (parametro de salida)
		wdContext.currentContextElement().setNro_sol(nro_sol);
		wdThis.wdGetBajaUSInterfaceController().complete("Terminado");
					
		}
	}
	
	else //Cancelar
	{ wdComponentAPI.getMessageManager().reportWarning("No rechazo");	}
	
	
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
  Ticket ticket;
 
///////////////////////////////////
  public com.sapportals.wcm.repository.IResource traerResource( java.lang.String path, boolean modificable ) {
//	@@begin traerResource()
	IResource recurso = null;
  	
	try {
		IWDClientUser wdClientUser = WDClientUser.getCurrentUser();
		IUser sapUser = wdClientUser.getSAPUser();
		com.sapportals.portal.security.usermanagement.IUser ep5User = WPUMFactory.getUserFactory().getEP5User(sapUser);
		IResourceFactory resourseFactory = ResourceFactory.getInstance();
		IResourceContext resourseContext = new ResourceContext(ep5User);
		RID rid = RID.getRID(path);
		recurso = resourseFactory.getResource(rid, resourseContext, modificable);
	} catch (WDUMException e) {
		wdComponentAPI.getMessageManager().reportException("WDUMException " + e.getMessage(), true);
	 } catch (UserManagementException e) {
		wdComponentAPI.getMessageManager().reportException("UserManagementException " + e.getMessage(), true);
	} catch (ResourceException e) {
		throw new RuntimeException(e);
	}
 	
  return recurso;
  }  
  
  //@@end
}

// ---- content of obsolete user coding area(s) ----
//@@begin obsolete:finalizar()
//    if (resultado.trim().equals("R"))
//    {
//		String usuario = wdContext.currentContextElement().getUsuario();
//		int nro_cli = wdContext.currentDatosElement().getNro_cliente();
//		int segmento = wdContext.currentContextElement().getSegmento(); 
//		long nro_sol = 0;   
//    
//		//Fecha del dia
//		Calendar cal = Calendar.getInstance();
//		java.sql.Date fecha = new java.sql.Date(cal.getTime().getTime());	
//		
//		//Verifico long campo observac
//		if (wdContext.currentDatosElement().getObservac_md()!=null)
//		{ if (wdContext.currentDatosElement().getObservac_md().length() > 50)
//			{	wdComponentAPI.getMessageManager().reportWarning("Campo Observaciones solo permite hasta 50 caracteres");	
//				return;
//			}
//		}	
//	
//		//Guardo los datos en base Portal	
//		nro_sol = ticket.getNroSolicitud(); 
//		// Paso los datos modificados a la estructura el ticket
//		ticket.setUsuarioAprobador(usuario);
//		ticket.setObservacionesMd(wdContext.currentDatosElement().getObservac_md());
//		ticket.setFechaCierre(fecha);
//		ticket.setSegmentoVta(new Integer(segmento));
//		ticket.setEstadoTicket("2");
//			
//		//Llamo al metodo de modificar en BD
//	   try { wdThis.wdGetBajaUSController().getConsultasInternasBean().updateTicket(ticket); }
//	   catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace(); 	
//			wdComponentAPI.getMessageManager().reportWarning("Error BI: " + e.getMessage());
//		}
//			
//    
//		//Mando de vuelta proceso a US
//		wdComponentAPI.getMessageManager().reportWarning("La baja del cliente " + nro_cli + " ha sido rechazada.");
//   
//		//Llamo al metodo Complete de la interfaz (parametro de salida)
//		wdContext.currentContextElement().setNro_sol(nro_sol);
//		wdThis.wdGetBajaUSInterfaceController().complete("Rechazado");
//    }
//    else
//    { wdComponentAPI.getMessageManager().reportWarning("No se rechazo");    }
//    
//    
//@@end
//@@begin obsolete:javadoc:onActionvolver(ServerEvent)
//  /** Declared validating event handler. */
//@@end
//@@begin obsolete:javadoc:finalizar()
//  /** Declared method. */
//@@end
//@@begin obsolete:onActionvolver(ServerEvent)
//    //wdThis.wdFirePlugSalidabaja_e();
//@@end
