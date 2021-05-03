package com.senla.console.items;

import com.senla.console.actions.IAction;
import com.senla.init.IAdministrator;

public class MenuItem {
    private final String title;
    private final IAction doAction;
    private final Menu nextMenu;
    private final IAdministrator administrator;

    public MenuItem(String title, IAction doAction, Menu nextMenu, IAdministrator administrator){
        this.title = title;
        this.doAction = doAction;
        this.nextMenu = nextMenu;
        this.administrator = administrator;
    }

    public String getTitle() {
        return title;
    }

    public void doAction() {
        doAction.execute(administrator);
    }

    public Menu getNextMenu() {
        return nextMenu;
    }
}
