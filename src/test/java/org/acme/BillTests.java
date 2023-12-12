package org.acme;

import io.quarkiverse.cucumber.CucumberOptions;
import io.quarkiverse.cucumber.CucumberQuarkusTest;

@CucumberOptions(
        features = {
                "src/test/resources/features"
        },
        plugin = {"pretty",
                "json:target/site/cucumber-reports/cucumber.json",
                "html:target/site/cucumber-reports/cucumber.html"
        })
public class BillTests extends CucumberQuarkusTest {

    public static void main(String[] args) {
        runMain(BillTests.class, args);
    }
    
}
