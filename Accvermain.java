
import java.io.*;
import java.util.Scanner;
class AccExp extends Exception
{
AccExp(String v)
{
super(v);
}
}
class Accvermain
{
public static void verify(String n,String a) throws AccExp
{
  if(!n.equals("AthulJK") && !a.equals("123456"))
    {
        throw new AccExp("Invalid username or password");
    }
    System.out.print("Welcome user!!!!");
   
}
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    System.out.print("Enter username:");
    String n=s.next();
    System.out.print("Enter password:");
   String a=s.next();
   
try
{
 verify(n,a);
}
catch(AccExp e)
{
System.out.println("caught "+e);
}
}
 }
