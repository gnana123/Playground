#include<iostream>
using namespace std;
int main()
{
  int W,a,c;
  std:cin>>W>>a>>c;
  if((a*75)+(c*30)<=W)
  {
  std::cout<<"Boat is stable";
  }
  else
  {
  std::cout<<"Boat will drow";
  }
}