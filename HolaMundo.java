import java.util.Scanner;
Class Add
{
public static void main(String [] arg)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("ingrese el Primer numero");
a=sc.nextInt();
System.out.println("ingrese el Segundo Numero");
b=sc.nextInt();
c=addition(a+b);
System.out.println("La suma de dos numeros es:" +c);
}
static int addition(int x, int y);
{
return x+y;
}
}



