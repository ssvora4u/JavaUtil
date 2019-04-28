package com.us.learning;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArmStrongExampleTest {

    @Test
    public void main() {
        int expected=92;
        int num=134;
        int c=0;

        int actual = ArmStrongExample.calculateArmstrong(c, num);
        Assert.assertEquals(expected,actual);

    }
}