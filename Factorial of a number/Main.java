#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,fact=1;
  cin>>n;
  if(n==0 || n==1)
    cout<<"0";
  else
    for(int i=0;i<n;i++)
    {
      fact=fact+fact*i;
    }
  cout<<fact<<"\n";
      
}