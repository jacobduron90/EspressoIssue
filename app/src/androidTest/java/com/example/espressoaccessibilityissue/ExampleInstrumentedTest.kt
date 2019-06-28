package com.example.espressoaccessibilityissue


import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.accessibility.AccessibilityChecks
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule

import org.junit.Test
import org.junit.Before
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleInstrumentedTest {

    @Rule
    @JvmField
    val actScenario = ActivityScenarioRule<MainActivity>(MainActivity::class.java)

    @Before
    fun setup() {
        AccessibilityChecks.enable()
    }

    @Test
    fun clickView() {
        onView(withId(R.id.button)).perform(click())
    }
}
