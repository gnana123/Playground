#include<iostream>
int main()
{
int num,temp,res;
  std::cin>>num;
  int sum=0;
  temp=num;
  while(temp)
  {
  sum+=temp%10;
    temp=temp/10;
  }
  res=num%sum;
  if(res==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
  return 0;
}