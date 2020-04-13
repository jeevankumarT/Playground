#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,res=0;
  cin>>n;
  cout<<n<<"\n";
  while(n>1)
  {
  	if(n%2==0)
  	{
    	n=n/2;
      res+=1;
      //cout<<n<<"\n";
  	}
  	else
    {
      n=3*n+1;
      res+=1;
    }
    cout<<n<<"\n";
    
  }
  cout<<res<<"\n";
}