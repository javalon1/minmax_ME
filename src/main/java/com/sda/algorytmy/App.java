package com.sda.algorytmy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

     int tab[] = {4,6,2,1,3};
     int res = max(tab);
     int res1 = min(tab);
     System.out.println("Max el: " +res);
        System.out.println("Min el: " +res1);

    }
        public static int max(int[] tab){
        int max =tab[0];
        for(int i =0; i < tab.length; i++){
            if(max < tab[i]){
            max = tab[i];
            }
        }
        return max;
        }
        public static int min(int[] tab){
        int min = tab[0];
        for(int i=0; i < tab.length; i++){
            if(min>tab[i]){
                min = tab[i];
            }
        }
        return min;
        }

}
