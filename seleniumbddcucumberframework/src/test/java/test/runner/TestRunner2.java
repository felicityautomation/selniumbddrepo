package test.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"features/Login.feature","features/LoginWithDataDriven.feature"},
glue = {"steps"},
plugin = {"html:htmlreport/cucumber-test-report.html","pretty","json:target/cucumber-report.json"},
tags = "@regression")
public class TestRunner2 extends AbstractTestNGCucumberTests {

}