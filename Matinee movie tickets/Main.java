#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float time,s1;
  cin>>age;
  cin>>time;
  s1=13.30;
  if(time==s1)
  {
    if(age>13)
      cout<<"$5.00\n";
     else
       cout<<"$2.00\n";
  }
  else
    {
    if(age>13)
      cout<<"$8.00\n";
     else
       cout<<"$4.00\n";
  }
    
        
}