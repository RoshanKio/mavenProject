package com.takeo;

import java.sql.Date;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "I generated a random number, n = "+new Random().nextDouble()+", on "+new Date(124, 0, 13) );
    }
}
