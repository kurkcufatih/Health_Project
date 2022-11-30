package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //plugin = {"html:target/cucumber-reports.html"}, //1.yol target dosyasininaltinda cucumber.report.html adin da bir rapor verir
        plugin={"html:target\\cucumber-reports.html",     //2.yol plugini bu sekilde yazarsak json formatinda target dosyasinin
                "json:target/json-reports/cucumber.json", // altinda cucumber.json adin da bir rapor verir
                "junit:target/xml-report/cucumber.xml"},

        features ="src/test/resources/features",
        glue ="stepDefinitions",
        tags ="@aa",    //iki tane tag'i calistirmak istersek "@gp1 or @gp2",
        dryRun =false   //true yazarsak Driver'i acmadan testleri yapar
)


public class Runner {

}
