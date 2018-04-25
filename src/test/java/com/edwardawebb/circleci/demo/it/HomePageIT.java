package com.edwardawebb.circleci.demo.it;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertTrue;

public class HomePageIT {


    @Test
    public void testHomePageButtonsUseProperMarketingCopy() throws Exception {
        assertTrue("This test merely exists to ensure Maven orb stores failsake test results",true);
    }


}
