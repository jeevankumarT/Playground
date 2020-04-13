#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int wt,ad,ch;
  int s1,s2;
  cin>>wt>>ad>>ch;
  s1=ad*75;
  s2=ch*30;
  if((s1+s2)<wt)
  {
    cout<<"Boat is stable\n";
  }
  else
  {
    cout<<"Boat will drow\n";
  }
  
  
}