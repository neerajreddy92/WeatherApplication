package com.swetha.admin.mausam;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by ADMIN on 4/22/2016.
 */

public class FullTest extends TestSuite {
    public static Test suite() {
        return new TestSuiteBuilder(FullTest.class)
                .includeAllPackagesUnderHere().build();
    }

    public FullTest() {
        super();
    }
}
