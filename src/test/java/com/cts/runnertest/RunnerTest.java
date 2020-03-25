package com.cts.runnertest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@CucumberOptions(features= {"src/main/resources/feature/open.feature"},
			glue= {"com/cts/stepdefinitions"},strict=true,//dryRun=false,
			//tags= {"@valid"},
			plugin= {"html:reports/","pretty"})//when step definiton not there it will throw error)
			@RunWith(Cucumber.class)
			public class RunnerTest {


}
