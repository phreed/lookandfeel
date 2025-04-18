package hu.modeldriven.cameo.lf;

import com.nomagic.magicdraw.actions.ActionsConfiguratorsManager;
import com.nomagic.magicdraw.plugins.Plugin;
import hu.modeldriven.cameo.lf.action.LFAction;
import hu.modeldriven.cameo.lf.action.LFConfigurator;
import javax.swing.*;

public class LFPlugin extends Plugin {

    /**
     * an init() method is called on a program startup.
     * The plugin must override this method and implement its own functionality there.
     */
    @Override
    public void init() {
        JOptionPane.showMessageDialog(null, "Look-and-Feel Plugin init");
        var action = new LFAction("LFAction", "Flat Look and Feel");
        var configurator = new LFConfigurator(action);
        ActionsConfiguratorsManager.getInstance().addMainMenuConfigurator(configurator);
    }

    /**
     * a close() method is called on a program exit. 
     * The plugin must override this method and return the value true if the plugin is ready to exit. 
     * In other case, it should return the value false. 
     * If the plugin returns false, the program exit is canceled.
     */
    @Override
    public boolean close() {
        JOptionPane.showMessageDialog(null, "Look-and-Feel Plugin close");
        return true;
    }

    /**
     * isSupported() method is called before the plugin initialization. 
     * If this method returns false, the plugin is not initialized. 
     * isSupported() may be used to check if the plugin can be started, for example, on this OS.
     */
    @Override
    public boolean isSupported() {
        return true;
    }
}
