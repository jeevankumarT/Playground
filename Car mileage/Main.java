#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mil,pet,dis;
  float tml;
  cin>>mil>>pet>>dis;
  tml=mil*pet;
  if(tml>=dis)
  {
    cout<<"Can reach\n";
  }
  else
  {
    cout<<"Cannot reach";
  }
  
  
}