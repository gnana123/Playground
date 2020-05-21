#include<iostream>
int main()
{
int Mx,w;
  std::cin>>Mx>>w;
  if(Mx>w)
  {
  std::cout<<"Yes, you can enter.";
  }
  else if(Mx==w)
  {
  std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else
  {
  std::cout<<"Sorry, you can't enter";
  }
  return 0;
}