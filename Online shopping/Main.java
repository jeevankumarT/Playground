#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int famo,fdis,fsch,samo,sdis,ssch,aamo,adis,asch;
  float flip,snap,amaz;
  cin>>famo>>fdis>>fsch;
  cin>>samo>>sdis>>ssch;
  cin>>aamo>>adis>>asch;
  flip=(famo-(famo*fdis/100))+fsch;
  snap=(samo-(samo*sdis/100))+ssch;
  amaz=(aamo-(aamo*adis/100))+asch;
  cout<<"In Flipkart Rs."<<flip<<"\n";
  cout<<"In Snapdeal Rs."<<snap<<"\n";
  cout<<"In Amazon Rs."<<amaz<<"\n";
  if (flip <= snap && flip <= amaz)
    cout <<"He will prefer Flipkart\n"; 
  else if(snap <= flip && snap <= amaz)
    cout<<"He will prefer Snapdeal\n";
  else
    cout<<"He will prefer Amazon\n";
}
  
