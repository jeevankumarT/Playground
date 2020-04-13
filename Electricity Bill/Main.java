#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int un,bill;
  cin>>un>>bill;
  if(un<=200)
  {
    int res=un*0.5;
    cout<<"Rs."<<res;
  }
  else if(un>200 && un<=400)
  {
    int res=(un*0.65)+100;
    cout<<"Rs"<<res;
  }
  else if(un>400 && un<=600)
  {
    int res=(un*0.80)+200;
    cout<<"Rs."<<res;
  }
  else
  {
    int res=(un*1.25)+425;
    cout<<"Rs."<<res;
  }
}