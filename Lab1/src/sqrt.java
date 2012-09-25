
import javax.swing.*; 

      public class sqrt 
      { 
          public static void main(String args[]) 
          { 
            String tempString=JOptionPane.showInputDialog("Enter a positive number"); 
            double number=Double.parseDouble(tempString); 
            System.out.println("Square root of " + number+"="+sqrt(number));                      

          } 

          public static double sqrt(double number) 
          { 

                              

                    double estimate=number; 
                    double divisor=2; 

                    for(int i=0; i<100; i++)  { 

                        estimate=number/divisor;       
                        estimate=(estimate+divisor)/2; 
                        divisor=estimate; 

                    } 
                    return estimate;            
          } 

      } 

