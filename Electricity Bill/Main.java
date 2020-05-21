#include<iostream>
using namespace std;
int main()
{
  int x,u;
  std::cin>>u;
  if(u<=200)
  {
    x=int(0.5*u);
  std::cout<<"Rs."<<x;
  }
  else if(u<=400)
  {
  std::cout<<"Rs."<<(0.65*u)+100;
  }
  else if(u<=600)
  {
  std::cout<<"Rs."<<(0.80*u)+200;
  }
  else if(u>600)
  {
  std::cout<<"Rs."<<(1.25*u)+425;
  }
  else
    std::cout<<"hahahaha";
  return 0;
}