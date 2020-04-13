#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n,num=0,t;
  cin>>n;
  while(n>0)
  {
    t=n%10;
    num=num*10+t;
    n=n/10;
  }
  cout<<num;
    
    
	return 0;
}