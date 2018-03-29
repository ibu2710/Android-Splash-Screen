/*
 * Created by Mohamed Ibrahim N
 * Created on : 26/11/17 2:34 PM
 * File name : ExampleInstrumentedTest.java
 * Last modified by : Mohamed Ibrahim N
 * Last modified on : 26/11/17 2:26 PM
 * Project : BloodDonorApp
 * Organization : Agam
 * Copyright (c) 2017. All rights reserved.
 */

package in.tr.blooddonorapp;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("in.tr.blooddonorapp", appContext.getPackageName());
    }
}
