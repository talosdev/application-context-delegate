package talosdev.delegate

import android.app.Activity
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    var activityRule: ActivityTestRule<TestActivity> = ActivityTestRule(TestActivity::class.java)

    @Test
    fun test() {
        val activityContext = activityRule.activity
        val delegateUser = DelegateUser(activityContext)
        val appContext = delegateUser.context

        assertTrue(activityContext is Activity)
        assertFalse(appContext is Activity)
    }
}
