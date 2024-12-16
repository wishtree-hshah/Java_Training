package org.child1;

import com.google.gson.Gson;
import java.util.Map;

/**
 * Child class for testing...
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Child1...." );
        Gson gson = new Gson();
        System.out.println(gson.toJson(Map.of("message","Child1 working...")));
    }
}
