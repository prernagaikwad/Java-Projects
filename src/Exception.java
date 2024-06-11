import java.io.*;
import java.util.Scanner;

public class Exception
{
    public static void main(String[] args)
    {
      String filename ="example.txt";
      BufferedReader reader = null;

      try
      {
           reader = new BufferedReader(new FileReader(filename));
          System.out.println("File opened successfully");

          try
          {
              boolean line;
              while((line = reader.readLine() !=null))
              {
                  System.out.println(line);
              }

              }
          catch(IOException e)
              {
              System.out.println("IOException caught while reading the file:" + e.getMessage());
              }
            finally
                {
                 try
                  {
                    if(reader != null)
                     {
                       reader.close();
                       System.out.println("Bufferedreader closed successfully");
                      }
                  }
                 catch(IOException e)
                 {
                     System.out.println("IOException caught while closing the BufferedReader" +e.getMessage());
                 }

          }
      }
      catch(IOException e)
            {
             System.out.println("IOException caught while opening the file :"+e.getMessage());
            }
      finally
            {
            System.out.println("Finished handling file operations.");
            }
      int numerator =10;
      int denominator =0;
      try
            {
          int result =numerator / denominator;
             System.out.println("Result :" + result);
            }
      catch(ArithmeticException e)
             {
              System.out.println("ArithmeticException caught: "+e.getMessage());

             }

      finally
           {
          System.out.println("Program execution continues normally after exception handling");
           }
    }
}
