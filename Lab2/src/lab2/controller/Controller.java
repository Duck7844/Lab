/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.controller;
import java.util.Scanner;
import lab2.common.Algorithm;
import lab2.common.Library;
import lab2.model.Model;
import lab2.common.BubbleSort;
import lab2.view.Menu;


/**
 *
 * @author ROG
 */
public class Controller extends Menu
{

    static String[] mc =
    {
        "BinarySearch", "LinearSearch", "Exit"
    };

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public Controller(Model model)
    {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = model.getSize_array();
        array = model.getArray();
    }

    public void execute(int n)
    {
        switch (n)
        {
            case 1:
                Scanner sc= new Scanner(System.in);
                library.display(array);
                System.out.println("Enter number to find:");   
                System.out.println("\nBinary Search: ");
                library.display(array);
                algorithm.buddleSort(array);
                System.out.println("\nSorted array by Buddle Sort: ");
                library.display(array);
                int x = sc.nextInt();
                System.out.println("Index number to find:");   
                System.out.println(algorithm.binarySearch(array, x, 0, array.length));
                System.out.println("");
                break;
            case 2:
                System.out.println(" Lít array:");
                library.display(array);
                Scanner s= new Scanner(System.in);
               int  y =s.nextInt();
                System.out.println("\nFind index by linearSearch: "+ algorithm.linearSearch(array, y));
                break;
            case 3:
                System.out.println("Exitting");
                System.exit(0);
                break;
        }
    }

}