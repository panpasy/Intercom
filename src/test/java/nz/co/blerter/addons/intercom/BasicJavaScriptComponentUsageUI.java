package nz.co.blerter.addons.intercom;

import com.vaadin.ui.Component;
import nz.co.blerter.addons.intercom.jsexample.MyJavaScriptComponent;
import org.vaadin.addonhelpers.AbstractTest;

public class BasicJavaScriptComponentUsageUI extends AbstractTest {

    public static final String INITIAL_VALUE = "Foo!";

    @Override
    public Component getTestComponent() {
        MyJavaScriptComponent c = new MyJavaScriptComponent();
        c.setValue(INITIAL_VALUE);
        return c;
    }


}
