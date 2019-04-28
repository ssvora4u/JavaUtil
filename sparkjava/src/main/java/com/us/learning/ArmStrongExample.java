package com.us.learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArmStrongExample{
    private static final Logger LOGGER = LoggerFactory.getLogger( ArmStrongExample.class );
    public static void main(String[] args)  {
        LOGGER.info("Application started for finding Armstrong Number");
        LOGGER.info("checking armstrongNumber for - {}",args[0]);
        int c=0;
        int temp;
        int n=Integer.parseInt(args[0]);//It is the number to check armstrong
        temp=n;
        c = calculateArmstrong(c, n);
        if(temp==c)
            LOGGER.info("{} is armstrong number",args[0]);
        else
            LOGGER.error("{} is not an armstrong number",args[0]);
    }

    public static int calculateArmstrong(int c, int n) {
        int a;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        return c;
    }
}
