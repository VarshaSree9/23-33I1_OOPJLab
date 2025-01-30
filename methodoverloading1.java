public class methodoverloading1
{
public int add(int a,int b)
{
return a+b;
}
public int add(int a,int b,int c)
{
return a+b+c;
}
public double add(double a,double b)
{
return a+b;
}
public static void main(String args[])
{
methodoverloading1 obj=new methodoverloading1();
System.out.println("sum of 5 and 12:"+obj.add(5,12));
System.out.println("sum of 5,10 and 12:"+obj.add(5,10,12));
System.out.println("sum of 0.5 and 12.5:"+obj.add(0.5,12.5));
}
}

output:
sum of 5 and 12:17
sum of 5,10 and 12:27
sum of 0.5 and 12.5:13.0
