/*  Sinhgad Academy of Engineering, Kondhwa */
/*  Name :- Pawar Sumit Vikas               */
/*  Roll No:- COTB38 	Div:- B		  */

// package Priority;

import java.util.*;
public class Priority {
	
   public static void main(String[] args) {
 


       int n,sum=0;
       float total_tt=0,total_waiting=0;
       
         Scanner s=new Scanner(System.in);
         System.out.println("Enter Number Of Process U want 2 Execute---"); 
         n=s.nextInt();
         int arrival[]=new int[n];
         int cpu[]=new int[n];
         int pri[]=new int[n];
         int finish[]=new int[n];
         int turntt[]=new int[n];
         int wait[]=new int[n];
         int process[]=new int[n];
         
        // int pro[][]=new int[3][3];
         for(int i=0;i<n;i++)
         {
               System.out.println("Enter arrival time of "+(i+1)+" Process : ");
               arrival[i]=s.nextInt();
               System.out.println("Enter CPU time of "+(i+1)+" Process : ");
               cpu[i]=s.nextInt();
               
               System.out.println("Enter Priority of "+(i+1)+" Process : ");
               pri[i]=s.nextInt();
               
               process[i]=i+1;
         }
         
         for(int i=0;i<n-1;i++)
         {
               for(int j=i+1;j<n;j++)
               {
                       if(pri[i]>pri[j])
                       {
                               int temp=cpu[i];
                               cpu[i]=cpu[j];
                               cpu[j]=temp;
                               
                               //temp=arrival[i];
                               //arrival[i]=arrival[j];
                               //arrival[j]=temp;
                               
                               temp=process[i];
                               process[i]=process[j];
                               process[j]=temp;
                               
                               temp=pri[i];
                               pri[i]=pri[j];
                               pri[j]=temp;
                               
                               
                       }
               }
         }
         
         for(int i=0;i<n;i++)
         {
               sum=sum+cpu[i];
               finish[i]=sum;
         }
         
         for(int i=0;i<n;i++)
         {
               turntt[i]=finish[i]-arrival[i];
               
               total_tt=total_tt+turntt[i];
               
               wait[i]=turntt[i]-cpu[i];
               
               total_waiting+=wait[i];
         }
         
         System.out.println("\n\nProcess\t\tAT\tCPU_T");
         for(int i=0;i<n;i++)
         {
               System.out.println(process[i]+"\t\t"+arrival[i]+"\t"+cpu[i]);
         }
         
         System.out.println("\n\n");
         System.out.println("Total turn around time is : "+(total_tt/n));
         System.out.println("Total waiting time is : "+(total_waiting/n));
         
                                   
   }
}
/*
Output:-

Enter Number Of Process U want 2 Execute---
4
Enter arrival time of 1 Process :
0
Enter CPU time of 1 Process :
5
Enter Priority of 1 Process :
1
Enter arrival time of 2 Process :
2
Enter CPU time of 2 Process :
4
Enter Priority of 2 Process :
2
Enter arrival time of 3 Process :
4
Enter CPU time of 3 Process :
7
Enter Priority of 3 Process :
3
Enter arrival time of 4 Process :
6
Enter CPU time of 4 Process :
6
Enter Priority of 4 Process :
4


Process         AT      CPU_T
1               0       5
2               2       4
3               4       7
4               6       6



Total turn around time is : 10.0
Total waiting time is : 4.5
 */