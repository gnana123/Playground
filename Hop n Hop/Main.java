#include<iostream>
#include<cmath>
int main()
{
int x,y,n1,n2,result;
  int h;
  double n;
  std::cin>>x;
  std::cin>>y;
  n1=(x-3)*(x-3);
  n2=(y-4)*(y-4);
  n=n1+n2;
 
	result = sqrt(n);
	std::cout << "" << result;
}