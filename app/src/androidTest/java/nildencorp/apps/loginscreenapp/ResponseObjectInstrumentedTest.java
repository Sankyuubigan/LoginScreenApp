package nildencorp.apps.loginscreenapp;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;

import static org.junit.Assert.assertEquals;


@RunWith(AndroidJUnit4.class)
public class ResponseObjectInstrumentedTest {
    @Test
    public void useAppContext() {
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("nildencorp.apps.loginscreenapp", appContext.getPackageName());
    }
}
