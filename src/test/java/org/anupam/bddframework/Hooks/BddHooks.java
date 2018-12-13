package org.anupam.bddframework.Hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import lombok.Data;
import org.anupam.bddframework.Base.BaseUtil;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class BddHooks extends BaseUtil {
    @Autowired
    private BaseUtil base;

    @Before
    public void beforeRun() {
        System.setProperty("webdriver.chrome.driver", "/Personal/Drivers/chromedriver");
    }

    @After
    public void afterRun(Scenario scenario) {
        System.out.println("Closing browser : MOCK");
        System.out.println(scenario.getName());
    }

}
