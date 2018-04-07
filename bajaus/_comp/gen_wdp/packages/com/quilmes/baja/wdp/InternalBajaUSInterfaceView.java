// ---------------------------------------------------------------------------
// This file has been generated by the Web Dynpro Code Generator
// DON'T MODIFY!!! CHANGES WILL BE LOST WHENEVER THE FILE GETS GENERATED AGAIN
// ---------------------------------------------------------------------------
package com.quilmes.baja.wdp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.sap.tc.logging.Location;
import com.sap.tc.webdynpro.progmodel.api.*;
import com.sap.tc.webdynpro.progmodel.gci.*;
import com.sap.tc.webdynpro.progmodel.context.*;
import com.sap.tc.webdynpro.progmodel.gci.*;
import com.sap.tc.webdynpro.services.exceptions.WDRuntimeException;

public class InternalBajaUSInterfaceView
  implements IPrivateBajaUSInterfaceView, com.sap.tc.webdynpro.progmodel.gci.IGCIViewDelegate
{

  /**
   * Location for this controller.
   */
  private static final Location logger = Location.getLocation(InternalBajaUSInterfaceView.class);

  /**
   * Framework implementation of Controller that delegates to this.
   */
  private final com.sap.tc.webdynpro.progmodel.gci.IGCIView wdAlterEgo;

  /**
   * Delegate that implements application defined logic
   */
  private final com.quilmes.baja.BajaUSInterfaceView delegate;


  // ---- Context --------------------------------------------------------------

  // This is never called and has only been generated to fully implement IControllerDelegate
  public IWDNode wdGetRootNode() { return null; }


  // ---- Actions --------------------------------------------------------------

  /**
   * Create a new action for this controller. A unique name for the action is generated automatially.
   * @param eventHandler is the action's eventhandler with proper signature
   * @param text is the text displayed in the UI element triggering this action
   */
  public IWDAction wdCreateAction(WDActionEventHandler eventHandler, String text) {
    return wdAlterEgo.createAction(null, eventHandler, text, null);
  }

  /**
   * Create a new action with the given name for this controller
   * @param eventHandler is the action's eventhandler with proper signature
   * @param name is the action's name
   * @param text is the text displayed in the UI element triggering this action
   */
  public IWDAction wdCreateNamedAction(WDActionEventHandler eventHandler, String name, String text) {
    return wdAlterEgo.createAction(name, eventHandler, text, null);
  }

  // ---- Controller part ------------------------------------------------------

  /**
   * Creates a new instance of this controller.
   */
  public InternalBajaUSInterfaceView(com.sap.tc.webdynpro.progmodel.gci.IGCIView alterEgo) {
    this.wdAlterEgo = alterEgo;
    this.delegate = new com.quilmes.baja.BajaUSInterfaceView((IPrivateBajaUSInterfaceView) this);
  }

  /**
   * Returns the public API for this controller instance.
   */
  public com.sap.tc.webdynpro.progmodel.api.IWDViewController wdGetAPI() {
    return (com.sap.tc.webdynpro.progmodel.api.IWDViewController) wdAlterEgo;
  }

  /**
   * Hook method called to initialize interface_view controller.
   */
  public void wdDoInit() {
    logger.pathT("entering: wdDoInit");
    logger.pathT("exiting: wdDoInit"); 
  }

  /**
   * Hook method called to clean up interface_view controller.
   */
  public void wdDoExit() {
    logger.pathT("entering: wdDoExit");
    logger.pathT("exiting: wdDoExit"); 
  }

  public Object wdInvokeEventHandler(String handlerName, IWDCustomEvent event)
    throws NoSuchMethodException {
    
    logger.pathT("entering: wdInvokeEventHandler", new Object[] { handlerName } );
    try {
      if("onPlugDefault".equals(handlerName)) {

        delegate.onPlugDefault(event );
        return null;
      }
      throw new NoSuchMethodException("Eventhandler " + handlerName + " not found for event " + event.getName());
    } finally {
      logger.pathT("exiting: wdInvokeEventHandler"); 
    }
  }

  public void onPlugDefault(IWDCustomEvent wdEvent ) {
    delegate.onPlugDefault(wdEvent );
  }


  // ---- UI Tree ---------------------------------------------------------

  // create UI tree
  public com.sap.tc.webdynpro.progmodel.api.IWDViewElement wdCreateUITree()
  {
    return wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDViewContainerUIElement.class, wdAlterEgo.getName());
  }


  /**
   * Hook method called to modify view before rendering. Access to UI elements
   * is via the given view API only!
   * 
   * @param firstTime indicates whether the hook is called for the first time
   * during the lifetime of this view
   */
  public void wdDoModifyView(IWDView view, boolean firstTime) {
    logger.pathT("entering: doModifyView");
    // nothing to do for interface views
    logger.pathT("exiting: doModifyView"); 
  }


}
