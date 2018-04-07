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
// AT LEAST ONE IMPORT STATEMENT (E.G. THAT FOR IPrivateAdjuntos_View).
// OTHERWISE, USING THE ECLIPSE FUNCTION "Organize Imports" FOLLOWED BY
// A WEB DYNPRO CODE GENERATION (E.G. PROJECT BUILD) WILL RESULT IN THE LOSS
// OF IMPORT STATEMENTS.
//
//@@begin imports
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

import ar.com.quilmes.bue.mdm_clientes.model.internas.Parametro;

import com.quilmes.baja.wdp.IPrivateAdjuntos_View;
import com.quilmes.baja.wdp.IPrivateAdjuntos_View.IAdjuntoElement;
import com.sap.security.api.IUser;
import com.sap.tc.webdynpro.progmodel.api.WDVisibility;
import com.sap.tc.webdynpro.services.sal.datatransport.api.IWDResource;
import com.sap.tc.webdynpro.services.sal.um.api.IWDClientUser;
import com.sap.tc.webdynpro.services.sal.um.api.WDClientUser;
import com.sap.tc.webdynpro.services.sal.um.api.WDUMException;
import com.sapportals.portal.security.usermanagement.UserManagementException;
import com.sapportals.wcm.repository.AccessDeniedException;
import com.sapportals.wcm.repository.Content;
import com.sapportals.wcm.repository.ICollection;
import com.sapportals.wcm.repository.IResource;
import com.sapportals.wcm.repository.IResourceContext;
import com.sapportals.wcm.repository.IResourceFactory;
import com.sapportals.wcm.repository.NotSupportedException;
import com.sapportals.wcm.repository.ResourceContext;
import com.sapportals.wcm.repository.ResourceException;
import com.sapportals.wcm.repository.ResourceFactory;
import com.sapportals.wcm.util.content.IContent;
import com.sapportals.wcm.util.uri.RID;
import com.sapportals.wcm.util.usermanagement.WPUMFactory;
//@@end

//@@begin documentation
//@@end

public class Adjuntos_View
{
  /**
   * Logging location.
   */
  private static final com.sap.tc.logging.Location logger = 
    com.sap.tc.logging.Location.getLocation(Adjuntos_View.class);

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
   * @see com.quilmes.baja.wdp.IPrivateAdjuntos_View for more details
   */
  private final IPrivateAdjuntos_View wdThis;

  /**
   * Root node of this controller's context. </p>
   *
   * Provides typed access not only to the elements of the root node 
   * but also to all nodes in the context (methods node<i>XYZ</i>()) 
   * and their currently selected element (methods current<i>XYZ</i>Element()). 
   * It also facilitates the creation of new elements for all nodes 
   * (methods create<i>XYZ</i>Element()). </p>
   *
   * @see com.quilmes.baja.wdp.IPrivateAdjuntos_View.IContextNode for more details.
   */
  private final IPrivateAdjuntos_View.IContextNode wdContext;

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
  
  public Adjuntos_View(IPrivateAdjuntos_View wdThis)
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
    
	//Nombre carpeta (con fecha del dia)
	String carpeta = null;
	String repositorio = null;
	int tamano  = 0;
	int cant    = 0;
	int cant_us = 0;
	//Fecha
	Calendar cal = Calendar.getInstance();
	java.sql.Date fecha = new java.sql.Date(cal.getTime().getTime());
	
    
    //Obtengo tamaño max de archivo
	try { tamano = wdThis.wdGetBajaUSController().getConsultasInternasBean().getTamanoMaximoAdjuntos();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		wdComponentAPI.getMessageManager().reportException("Error BI: " + e.getMessage(),false);
	}	    
    
    //Obtengo cant max de archivos
	try { cant = wdThis.wdGetBajaUSController().getConsultasInternasBean().getMaxAdjuntos();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		wdComponentAPI.getMessageManager().reportException("Error BI: " + e.getMessage(),false);
	}		    
    
      
    //Verifico si es master data en Controller
	String master = wdContext.currentContextElement().getMaster();
	String esquema = wdContext.currentContextElement().getEsquema();
	String segmento = Integer.toString(wdContext.currentContextElement().getSegmento()); 
	String url = null;
	String nombre = null;
	
	if (master != null || wdContext.currentContextElement().getNro_solicitud()!=0) {
		//Para master data
		if (master!=null)
			{ wdContext.currentContextElement().setMD(WDVisibility.VISIBLE);
			wdContext.currentContextElement().setUS(WDVisibility.NONE);  
			}
		else //Usuario Rechazo
			{ wdContext.currentContextElement().setMD(WDVisibility.NONE);	
			wdContext.currentContextElement().setUS(WDVisibility.VISIBLE); 	
			}
			
		if (wdContext.currentTicketElement().getCarpeta()==null && master==null)
		{	//Carpeta nueva
			carpeta = "TMP_" + fecha.getTime();
			carpeta.trim();		
			//Repositorio nuevo
			try { repositorio = wdThis.wdGetBajaUSController().getConsultasInternasBean().getRepositorio();  }
			catch (RemoteException e) {
					e.printStackTrace();
					wdComponentAPI.getMessageManager().reportException("Error BI: " + e.getMessage(),false);
					return; }			
			//URL Nueva
			url = "/" + repositorio + "/" + esquema.trim() + "/" + segmento.trim() + "/" + carpeta + "/";			
		}
		else
		{ 	//Carpeta
			carpeta = wdContext.currentTicketElement().getNroTicketCrm();
			//Obtengo repositorio
			repositorio = wdContext.currentTicketElement().getRepositorio();
			//Url
			url = "/" + repositorio + "/" + esquema.trim() + "/" + segmento.trim() + "/" + carpeta + "/";
		}
		
		//Cargo cant de archivos cargados
		cant_us = wdContext.nodeAdjuntos().size();
		//Cargo tabla de salida
		for (int i = 0; i < wdContext.nodeAdjuntos().size(); i++) {
			IAdjuntoElement adjunto = wdContext.nodeAdjunto().createAdjuntoElement();
			nombre = wdContext.nodeAdjuntos().getAdjuntosElementAt(i).getArchivo();
			adjunto.setNombre(nombre);
			nombre = nombre.replaceAll(" ","%20");
			adjunto.setUrl("/irj/go/km/docs"+url+nombre);
			nombre = nombre.replaceAll("%20"," ");
			wdContext.nodeAdjunto().addElement(adjunto); 	
			}	  									
		}
	else {
		//Carpeta nueva
		carpeta = "TMP_" + fecha.getTime();
		carpeta.trim();		

		//Repositorio nuevo
		try { repositorio = wdThis.wdGetBajaUSController().getConsultasInternasBean().getRepositorio();  }
		catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				wdComponentAPI.getMessageManager().reportException("Error BI: " + e.getMessage(),false);
				return; }			
		//URL Nueva
		url = null;
		url = "/" + repositorio + "/" + esquema.trim() + "/" + segmento.trim() + "/" + carpeta + "/";
		
		wdContext.currentContextElement().setMD(WDVisibility.NONE);	
		wdContext.currentContextElement().setUS(WDVisibility.VISIBLE);
	}


	//Seteo las variables de contexto
	wdContext.currentContextElement().setCarpeta(carpeta);
	wdContext.currentContextElement().setRepositorio(repositorio);
	wdContext.currentContextElement().setTamano(tamano);
	wdContext.currentContextElement().setCantidad(cant);
	wdContext.currentContextElement().setCant_us(cant_us);
	wdContext.currentContextElement().setUrl(url);
	wdContext.currentContextElement().setFlag_adjunto("X");
		
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
  public static void wdDoModifyView(IPrivateAdjuntos_View wdThis, IPrivateAdjuntos_View.IContextNode wdContext, com.sap.tc.webdynpro.progmodel.api.IWDView view, boolean firstTime)
  {
    //@@begin wdDoModifyView
    //@@end
  }

  //@@begin javadoc:onPlugentradaadjuntos(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onPlugentradaadjuntos(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onPlugentradaadjuntos(ServerEvent)

    //@@end
  }

  //@@begin javadoc:onActionvolver(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActionvolver(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActionvolver(ServerEvent)
	//Si no cargo archivos NO cargo carpeta ni repositorio
	if (wdContext.nodeAdjunto().size() < 1)
	{	wdContext.currentContextElement().setCarpeta(null); }
	
    wdThis.wdFirePlugSalidaadjuntos_v();
    
    //@@end
  }

  //@@begin javadoc:onActionadjuntar(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActionadjuntar(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActionadjuntar(ServerEvent)
    
	IWDResource resourceFirma = wdContext.currentContextElement().getAdjunto1();
	boolean cargo = false;		
	int cant_us = wdContext.currentContextElement().getCant_us();
	int cant    = wdContext.currentContextElement().getCantidad();
	
	//Verifico si ya cargo cant max de archivos
	if (cant_us >= cant)
	{ wdComponentAPI.getMessageManager().reportWarning("Ya cargo la cantidad maxima de archivos permitidos: " + cant);
	  return;
	}
	
			
	if (resourceFirma == null) {
		wdComponentAPI.getMessageManager().reportWarning("No cargo archivo en path.");
		//return;
	}
	else {
		if (!validarTipoDeArchivo(resourceFirma.getResourceType().getFileExtension())){
			wdComponentAPI.getMessageManager().reportWarning("La extension " + resourceFirma.getResourceType().getFileExtension() + " ingresada, no es valida.");
			}
		else {
			if (!subirArchivo(resourceFirma, false)){
				wdComponentAPI.getMessageManager().reportWarning("No se pudo adjuntar el archivo.");
			} 
			else { wdComponentAPI.getMessageManager().reportSuccess("Se adjunto el archivo."); 
				   resourceFirma = null;
				   wdContext.currentContextElement().setAdjunto1(resourceFirma); 
				   //Actualizo la cant max a cargar
				   cant_us = cant_us + 1;
				   wdContext.currentContextElement().setCant_us(cant_us); }
		}
	}  

    //@@end
  }

  //@@begin javadoc:onActionborrar(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActionborrar(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActionborrar(ServerEvent)
	String url = null;
	String esquema = wdContext.currentContextElement().getEsquema();
	String segmento = Integer.toString(wdContext.currentContextElement().getSegmento());
	String repositorio = wdContext.currentContextElement().getRepositorio();
	String carpeta = wdContext.currentContextElement().getCarpeta();
	int cant_us = wdContext.currentContextElement().getCant_us();
	
	//Verifico si hay archivos a borrar
	if (cant_us < 1)
	{ wdComponentAPI.getMessageManager().reportWarning("No hay archivos para Eliminar.");
	  return;
	}

	//Cargo URL
	url = "/" + repositorio + "/" + esquema.trim() + "/" + segmento.trim() + "/" + carpeta + "/";
    
	try {
		IResource existente = traerResource(url + wdContext.currentAdjuntoElement().getNombre(), false);
		existente.delete();
		wdContext.nodeAdjunto().removeElement(wdContext.currentAdjuntoElement());
		if (wdContext.nodeAdjunto().size()==0) {
		existente = traerResource(url, false);
		existente.delete();
		}
	} catch (NotSupportedException e) {
		e.printStackTrace();
		wdComponentAPI.getMessageManager().reportWarning("Error al borrar el archivo por favor contactese con master data");
	} catch (AccessDeniedException e) {
		e.printStackTrace();
		wdComponentAPI.getMessageManager().reportWarning("Error al borrar el archivo por favor contactese con master data");
	} catch (ResourceException e) {
		e.printStackTrace();
		wdComponentAPI.getMessageManager().reportWarning("Error al borrar el archivo por favor contactese con master data");
	}
    
    //Actualizo la cant cargada
	cant_us = cant_us - 1;
	wdContext.currentContextElement().setCant_us(cant_us);
	
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
  
 ///////////////////////////////////////////////
 public boolean subirArchivo(IWDResource resourceFirma, boolean esMapa) {
		
 String nombre = null;
 IContent contenido = null;
 ICollection folder = null;
 String url = wdContext.currentContextElement().getUrl();
 int tamanoMaximo = wdContext.currentContextElement().getTamano(); 
 
 try {
	 IResource existente = traerResource(url + resourceFirma.getResourceName(), false);
	 if (!esMapa){
		 if (existente != null) {
		 wdComponentAPI.getMessageManager().reportWarning("El archivo que quiere subir ya existe");
		 wdContext.currentContextElement().setAdjunto1(null);
		 return false;
		 }
	 }

	 InputStream is = resourceFirma.read(true);
	 if (!esMapa){
		 if (!validarTamanoArchivo(is.available())) {
			 wdComponentAPI.getMessageManager().reportWarning("El archivo supera el tamaño maximo permitido (" + tamanoMaximo + " Kb)");
			 wdContext.currentContextElement().setAdjunto1(null);
			 return false;
		 }
	 }

	 if (wdContext.nodeAdjunto().size() == 0) {
		 existente = traerResource(url, true);
	 }

	 contenido = new Content(is, "", -1);
	 folder = (ICollection) traerResource(url, false);
	 

	 if (esMapa){
		 nombre = "Mapa.JPG"; 		} 
	 else {
		 nombre = resourceFirma.getResourceName(); 		
		 }

	 if (nombre.length() > 30)
	 { wdComponentAPI.getMessageManager().reportWarning("Nombre de archivo Invalido: supera los 30 caracteres.");
		wdContext.currentContextElement().setAdjunto1(null);
		return false;	 	
	 }

	 folder.createResource(nombre, null, contenido);

 } catch (ResourceException e) {
	 wdComponentAPI.getMessageManager().reportWarning("ResourceException " + e.getMessage());
	 return false;
 } catch (IOException e) {
	 wdComponentAPI.getMessageManager().reportWarning("IOException " + e.getMessage());
	 return false;
 }

	//Cargo tabla
	IAdjuntoElement adjunto = wdContext.nodeAdjunto().createAdjuntoElement();
	adjunto.setNombre(nombre);
	nombre = nombre.replaceAll(" ","%20");
	adjunto.setUrl("/irj/go/km/docs"+url+nombre);
	nombre = nombre.replaceAll("%20"," ");	
	wdContext.nodeAdjunto().addElement(adjunto);
	
 return true;
 }   
 
 //////////////////////////////////////
 public boolean validarTamanoArchivo(int size){
 	int aux = size / 1024;
 	int tamanoMaximo = wdContext.currentContextElement().getTamano();	
		
 	if (aux < tamanoMaximo) {
 		return true;
 	} else {
 		return false;
 	}
 }  
 
 //////////////////////////////////////////////
 public boolean validarTipoDeArchivo(String tipo){
 	
	Collection tiposDeArchivo=null;

	try { 
		tiposDeArchivo = wdThis.wdGetBajaUSController().getConsultasInternasBean().getExtensionesDeAdjuntosValidas();
 	
 	} catch (RemoteException e) {
		 // TODO Auto-generated catch block
	 	e.printStackTrace();
	 	wdComponentAPI.getMessageManager().reportException("Error BI: " + e.getMessage(),false);
 	}	

 	Iterator it = tiposDeArchivo.iterator();
 	
 	while (it.hasNext()) {
 		Parametro parametro = (Parametro) it.next();
 		if (tipo.toUpperCase().trim().equals(parametro.getValor().toUpperCase().trim())){
 			return true;
 		}
 	}

 	return false;
 }
 
  //@@end
}
