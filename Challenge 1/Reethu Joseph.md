#include<stdio.h>  
int main(){    
int n,i,r=0,flag=0;    
printf("Enter the number to check prime:");    
scanf("%d",&n);    
r=n/2;    
for(i=2;i<=r;i++)    
{    
if(n%i==0)    
{    
printf("Number is not prime");    
flag=1;    
break;    
}    
}    
if(flag==0)    
printf("Number is prime");     
return 0;  
 }    
