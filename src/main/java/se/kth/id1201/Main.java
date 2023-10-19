package se.kth.id1201;

import se.kth.id1201.T9.InvalidCharException;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) throws InvalidCharException
    {
        T9 t9 = new T9(args[0]);
        System.out.println(t9.decode(args[1]).toString());
    }
}
