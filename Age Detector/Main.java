#include<iostream>
using namespace std;
int main()
{
int a,b,x,y;
  std::cin>>a;
  std::cin>>b;
  if(a>b)
  {
  x=1900+a;
    y=2000+b;
    std::cout<<y-x;
  }
  else
  {
  x=2000+a;
    y=2000+b;
    std::cout<<y-x;
  }
  return 0;
}