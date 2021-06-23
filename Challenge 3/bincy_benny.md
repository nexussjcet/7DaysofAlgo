# Code
```cpp
#include<iostream>
#include<math.h>
#include<process.h>
const int n=50;
using namespace std;
class stack
{
    int a[n];
    int top;
    public:
    stack()
    {
        top=-1;
    }
    void push(int temp)
    {
        if(top!=n-1)
        {
            top++;
            a[top]=temp;
    }   }
    int pop()
    {
        if(top!=-1)
        {
            for(int i=top;i>=0;i--)
            {
                int temp=a[top];
                top--;
            }    
            return 0;
    }   }
    void display()
    {
        int i;
        for(i=top;i>=0;i--)
        cout<<a[i];
    }
};stack obj;
int convert_Tobase16(int num,char choice)
{
reiterate:
if(choice=='d')
{
    int temp=num;
    while(temp!=0||temp<num)
    {
        temp=num%16;
        if(temp<10)
        obj.push(temp);
        else
        {
            switch(temp)
            {
                case 10:obj.push('A');break;
                case 11:obj.push('B');break;
                case 12:obj.push('C');break;
                case 13:obj.push('D');break;
                case 14:obj.push('E');break;
                case 15:obj.push('F');break;
            }
        }
    }obj.display();
     obj.pop();
}
if(choice=='b')
{
    int j,c,decimal=0;
    int n=num;
    while(n!=0)
    {
        n/=10;
        c++;
    }
    for(int i=c;i!=0;i--)
    {
        int temp1=num%10;
        decimal+=temp1*pow(2,j);
        j++;
    }
    choice='d';
    goto reiterate;
}
return 0;
}


int main()
{
    int num;
    char choice;
    cout<<"WHICH ONE WOULD YOU LIKE TO CONVERT:\n\tBINARY\n\tDECIMAL\n**(press b/d)\t";
    cin>>choice;
    cout<<"Enter a no.\n";
    cin>>num;
    convert_Tobase16(num,choice);
    return 0;
}
```

# Explanation
The user is allowed to choose whether to convert decimal/binary to hexadecimal format.
*convert_Tobase16()*:converts 
                      * decimal -> hexadecimal
                      * binary -> decimal -> hexadecimal
Here stack is implemented to push and pop numerals for 'decimal to hexadecimal' conversion
to actually take place(helps in reversing the remainders obtained during long division method).                    
                      
