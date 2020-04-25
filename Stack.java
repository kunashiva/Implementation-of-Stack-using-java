import java.util.Scanner;
class Stack
{
 void Push(int arr[],int t)
 {
  System.out.println("************************************************");
  int newarr[]=new int[t+1]; 
  Scanner q=new Scanner(System.in);
  System.out.println("enter the element you want to enter into stack");
  int new_element=q.nextInt();
  for(int i=0;i<t;i++)
  {
    newarr[i]=arr[i];
  }
  int len=newarr.length;
  newarr[len-1]=new_element;
  System.out.println("Updated Stack After Pushing an Element");
  for(int i=len-1;i>=0;i--)
  {
   System.out.println("|"+newarr[i]+"|");
   System.out.println(" __");
  }
  System.out.println("***********************************************************");
  System.out.println("if you  want to insert an element in stack ''ENTER PUSH''");
  System.out.println("if you want  to delete an element in stack ''ENTER POP''");
  System.out.println("if you want to exit the program'' ENTER DONE''");
  Scanner scan=new Scanner(System.in);
  String op=scan.nextLine();
  op=op.toLowerCase();
  if(op.equals("push"))
  {
   Push(newarr,len);
  }
  else if(op.equals("pop"))
  {
   Pop(newarr,len);
  }
  else if(op.equals("done"))
  {
   System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^DONE^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
   System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Thank^^You^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  }
  else
  {
   System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Exit^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
   System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Thank^^You^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  }
 }





 void Pop(int arr[],int t)
 {
  System.out.println("*************************************************************************");
  int newarr[]=new int[t-1];
  for(int i=0;i<t-1;i++)
  {
   newarr[i]=arr[i];
  }
  System.out.println("Updated Stack after Poping an Element");
  int len=newarr.length;
  int stack_empty=0;
  for(int i=len-1;i>=0;i--)
  {
   System.out.println("|"+newarr[i]+"|");
   System.out.println(" __");
   stack_empty++;
  }
  if((stack_empty)!=0)
  {
   System.out.println("***********************************************************");
   System.out.println("if you  want to insert an element in stack ''ENTER PUSH''");
   System.out.println("if you want  to delete an element in stack ''ENTER POP''");
   System.out.println("if you want to exit the program'' ENTER DONE''");
   Scanner scan=new Scanner(System.in);
   String op=scan.nextLine();
   op=op.toLowerCase();
   if(op.equals("push"))
   {
    Push(newarr,len);
   }
   else if(op.equals("pop"))
   {
    Pop(newarr,len);
   }
   else if(op.equals("done"))
   {
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^DONE^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Thank^^You^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
   }
   else
   {
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Exit^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Thank^^You^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
   }
  }
  else
  {
   System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Stack Is Empty^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
   System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Exit^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
   System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Thank^^You^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  }
 
 }




 public static void main(String ar[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("enter the no of elements");
  int n=s.nextInt();
  int a[]=new int[n];
  System.out.println("enter the elemnts in the stack");
  for(int i=0;i<n;i++)
  {
   a[i]=s.nextInt();
  }
  System.out.println("stack elements are");
  for(int i=n-1;i>=0;i--)
  {
   System.out.println("| "+a[i]+" |");
   System.out.println(" ___");
  }
  Stack st=new Stack();
  System.out.println("***********************************************************");
  System.out.println("if you  want to insert an element in stack ''ENTER PUSH''");
  System.out.println("if you want  to delete an element in stack ''ENTER POP''");
  System.out.println("if you want to exit the program'' ENTER DONE''");
  Scanner scan=new Scanner(System.in);
  String op=scan.nextLine();
  op=op.toLowerCase();
  if(op.equals("push"))
  {
   st.Push(a,n);
  }
  else if(op.equals("pop"))
  {
   st.Pop(a,n);
  }
  else if(op.equals("done"))
  {
   System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^DONE^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
   System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Thank^^You^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  }
  else
  {
   System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Exit^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
   System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Thank^^You^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  }
 }
}