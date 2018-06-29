package com.hellofresh.challenge;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ WebApiTest.class, WebTest.class })
public class AllTests {

}
