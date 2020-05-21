#include<iostream>
using namespace std;
int main()
{
 int x1,x2,x3,y1,y2,y3;
  float X,Y,x,y;
  std::cin>>x1;
  std::cin>>y1;
  std::cin>>x2;
  std::cin>>y2;
  std::cin>>x3;
  std::cin>>y3;
  x=(x1+x2+x3);
  y=(y1+y2+y3);
  X=x/3;
  Y=y/3;
  std::cout<<""<<X<<"\n";
  std::cout<<""<<Y;
  return 0;
}