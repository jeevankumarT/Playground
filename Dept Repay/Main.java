#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int X,Y,R;
  float si,intr,res,dis;
  std::cin>>X>>Y>>R;
  si=(X*Y*R)/100;
  intr=X+si;
  dis=si*0.02;
  res=intr-dis;
  std::cout<<si<<"\n";;
  std::cout<<intr<<"\n";
  std::cout<<dis<<"\n";
  std::cout<<res;

  
  
  
}