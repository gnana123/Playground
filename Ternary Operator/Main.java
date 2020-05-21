#include<iostream>
using namespace std;
int main()
{
int n,N;
  std::cin>>n;
  N=n%2;
  (N==0)?std::cout<<"Even":std::cout<<"Odd";
  return 0;
}