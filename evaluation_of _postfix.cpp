#include<iostream>
#include<cmath>
using namespace std;
int stak[50];
int top=-1;
void push(int res)
{
    top++;
    stak[top]=res;
}
int pop()
{
    int res;
    res=stak[top];
    top--;
    return res;
}
int main()
{
    char postfix[50];
    cin>>postfix;
    int i=0,res;
    int A,B;
    while(postfix[i]!='\0')
    {
        if(isdigit(postfix[i]))
        {
           res=postfix[i]-48;
        }
        else
        {

            B=pop();
            A=pop();
            switch(postfix[i])
            {
            case '+':
                res=A+B;
                break;
            case '-':
                res=A-B;
                break;
            case '*':
                res=A*B;
                break;
            case '/':
                res=A/B;
                break;
            case '^':
                res=pow(A,B);
                break;
            }

        }
        push(res);
        i++;
    }
    cout<<stak[top];
return 0;
}
