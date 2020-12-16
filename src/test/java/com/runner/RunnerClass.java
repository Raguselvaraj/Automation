package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Greens-12\\eclipse-workspace\\ragu\\Automation\\src\\test\\resources\\LoginPage.feature",glue={"com.step"})
public class RunnerClass {

}
