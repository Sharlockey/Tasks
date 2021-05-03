package com.senla.console.items;

import com.senla.console.actions.*;
import com.senla.init.IAdministrator;

public class Builder {

    private Menu rootMenu;

    public void buildMenu(IAdministrator administrator) {
        Menu rootMenu = new Menu();
        rootMenu.setName("Root Menu Options:");

        MenuItem createObject       = new MenuItem("Create object"          , new CreateAction() , rootMenu, administrator);
        MenuItem deleteObject       = new MenuItem("Delete object"          , new DeleteAction() , rootMenu, administrator);
        MenuItem doBookActions      = new MenuItem("Do other book actions"  , new BookAction()   , rootMenu, administrator);
        MenuItem doOrderActions     = new MenuItem("Do other order actions" , new OrderAction()  , rootMenu, administrator);
        MenuItem showObject         = new MenuItem("Show object"            , new ShowAction  () , rootMenu, administrator);
        MenuItem exit               = new MenuItem("Exit"                   , new ExitAction()   , rootMenu, administrator);


        rootMenu.setMenuItems(new MenuItem[] { createObject, deleteObject, doBookActions, doOrderActions, showObject, exit });
        setRootMenu(rootMenu);
    }

    public Menu getRootMenu() {
        return rootMenu;
    }

    public void setRootMenu(Menu rootMenu) {
        this.rootMenu = rootMenu;
    }

}
