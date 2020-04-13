#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  float x1,x2,x3,y1,y2,y3;
  float s1,s2,s3;
 float res,fin;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
 s1=(x1+x2+x3);
  s2=(y1+y2+y3);

  res=float(s1/3);
  fin=float(s2/3);
  std::cout<<res<<"\n";
  std::cout<<fin<<"\n";

}