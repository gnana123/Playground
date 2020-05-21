#include<iostream>
int main()
{
int r,x;
  std::cin>>r>>x;
  if(r>x/2)
  {
  	std::cout<<"circle cannot be inside a square";
  }
  else
  {
  	std::cout<<"circle can be inside a square";
  }
  
  return 0;
}