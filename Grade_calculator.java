import java.lang.*;
import java.io.*;
class Grade_calculator{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number of subjects");
        int n=Integer.parseInt(br.readLine());
        String a[];
        a=new String[n];
        int i;
        int m[]=new int[n];
        System.out.println("enter marks for subject wise");
        for(i=0;i<n;i++)
        {
            a[i]=br.readLine();
            m[i]=Integer.parseInt(br.readLine());
        }
        int total_marks=0;
        for(i=0;i<n;i++)
        {
            total_marks=total_marks+m[i];
        }
        float average_percentage=(total_marks*100/(n*100));
        System.out.println("overall report of a student");
        System.out.println("subjects with marks");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+":");
            System.out.println(+m[i]);
        }
        System.out.println("total marks: "+total_marks);
        System.out.println("average percentage: "+average_percentage);
    if(average_percentage>90)
{
    System.out.println("Grade:O");
}
else if(average_percentage>80)
{
       System.out.println("Grade:A+");
}
else if(average_percentage>70){
       System.out.println("Garde:A");
}
else if(average_percentage>60)
{
       System.out.println("Grade:B+");
}
else if(average_percentage>50)
{
       System.out.println("Grade:B");
}
else if(average_percentage>40)
{
       System.out.println("Grade:C");
}
else {
   System.out.println("FAIL");
}
    }}
  