package org.child2;

import com.google.gson.Gson;

import java.util.Map;

/**
 * Child class for testing..
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Child2" );
        Gson gson = new Gson();
        System.out.println(gson.toJson(Map.of("message","Child2 working...")));
    }
}
