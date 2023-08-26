package io.github.lunkesapps;

import io.github.lunkesapps.MultiErrorCheck;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;

public class MultiErrorCheckTest {

    @Test
    public void verifyIfItRunsWithInteger()throws Throwable{
        MultiErrorCheck multiErrorCheck = new MultiErrorCheck();
        multiErrorCheck.addCheck(1, equalTo(1));
        multiErrorCheck.validateAllErrors();
    }

    @Test
    public void verifyIfItRunsWithString()throws Throwable{
        MultiErrorCheck multiErrorCheck = new MultiErrorCheck();
        multiErrorCheck.addCheck("a", equalTo("a"));
        multiErrorCheck.validateAllErrors();
    }

}
