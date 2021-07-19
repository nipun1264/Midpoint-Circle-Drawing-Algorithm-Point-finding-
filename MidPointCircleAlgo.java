/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symmetryandmidpointcircle;
import java.util.Scanner;
import java.lang.Math;
import java.util.LinkedList;
import java.util.Queue;
public class MidPointCircleAlgo {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("input Radius : ");
      int Radius=input.nextInt();
      System.out.println("fsdxjklgn");
      MidPointCircle(Radius);
    }
    
    public static void MidPointCircle(int radius){
        Queue<Integer> X= new LinkedList<>();
        Queue<Integer> Y= new LinkedList<>();
        Queue<Integer> d= new LinkedList<>();
        Queue<String> direction= new LinkedList<>();
        X.add(0);
        Y.add(radius);
          int dir=1-radius;
        d.add(dir);
        int x1=(X.peek());
       int y1=(Y.peek());
       int count=0;
       int SEcount=0;
       int Ecount=0;
     
       
       
        while(x1<y1){
            if(dir<0){
                
                 dir=dir+2*x1+3;
                 
            direction.add("  E  ");
                
                   x1=x1+1;
                y1=y1;
                 
               Ecount++;
                   
            }
            else{
                
                 dir=dir+2*x1-2*y1+5;
               
                
               
                direction.add(" SE ");
               
                x1=x1+1;
                y1=y1-1;
                SEcount++;
                
            }
           // System.out.println(dir);
            X.add(x1);
                Y.add(y1);
                  d.add(dir);
                  count++;
        }
        
        
         System.out.println("X"+"    "+"Y"+"     "+"d"+"     "+"direction" );
         int[] x=new int[count];
         int[] y=new int[count];
        for(int i=0;i<count;i++){
            System.out.println(X.peek() +"    "+Y.peek() +"        "+d.peek()+"     "+direction.peek() );
            x[i] = X.peek();
            y[i] = Y.peek();
            X.remove();
            Y.remove();
            d.remove();
            direction.remove();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("total step  : "+count );
        System.out.println("total SEstep  : "+SEcount );
        System.out.println("total Estep  : "+Ecount );
        
        
        System.out.println("Which Zone do you want?");
        Scanner input=new Scanner(System.in);
        int zone = input.nextInt();
        
         if(zone == 0){
      for(int s=0;s<x.length;s++){
         System.out.println(" ( "+x[s] +" , "+y[s]+" )");
      }
 }
 if(zone == 1){
      for(int s=0;s<x.length;s++){
         System.out.println(" ( "+y[s]+"," +x[s] + ")");
      }
 }
 if(zone == 2){
      for(int s=0;s<x.length;s++){
         System.out.println(" ( "+y[s]+"," +(-x[s]) + ")");
      }
 }
 if(zone == 3){
      for(int s=0;s<x.length;s++){
         System.out.println(" ( "+(-x[s]) +" , "+y[s]+" )");
      }
 }
 if(zone == 4){
      for(int s=0;s<x.length;s++){
         System.out.println(" ( "+(-x[s]) +" , "+(-y[s])+" )");
      }
 }
 if(zone == 5){
      for(int s=0;s<x.length;s++){
         System.out.println(" ( "+(-y[s])+"," +(-x[s]) + ")");
      }
 }
 if(zone == 6){
      for(int s=0;s<x.length;s++){
         System.out.println(" ( "+(-y[s])+"," +x[s] + ")");
      }
 }
 if(zone == 7){
      for(int s=0;s<x.length;s++){
         System.out.println(" ( "+x[s] +" , "+(-y[s])+" )");
      }
 }
        
        
    }
}
