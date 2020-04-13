#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,res,sum=0,temp;
  cin>>n;
  temp=n;
  while(n>0)
  {
    int r=n%10;
    sum=sum+r;
    n=n/10;
  }
  if(temp%sum==0)
  {
    cout<<"Harshad Number";
  }
  else
  {
    cout<<"Not Harshad Number";
  }
}