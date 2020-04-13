#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int noitem;
  float time,ttime,s1;
  cin>>noitem>>time;
  if(noitem==2)
  {
    s1=time/2;
    ttime=time+s1;
    cout<<ttime<<"\n";
  }
  else if(noitem==3) 
  {
    ttime=time*2;
    cout<<ttime<<"\n";
  }
  else
  {
    cout<<"Number of items is more"<<"\n";
  }
}