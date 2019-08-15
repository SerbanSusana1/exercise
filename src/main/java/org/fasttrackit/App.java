package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        suma suma= new suma();
        suma.displaySum(2,6);
        suma.displaySum(1.5,5);

        Multiplication multiplication=new Multiplication();
        multiplication.displayMultiplication(3,4,9);
        multiplication.displayMultiplication(1.6,7.9,12);
    }
}
