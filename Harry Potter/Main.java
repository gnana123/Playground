#include <iostream>
using namespace std;

int main()
{
   int n,first,last,sum;
   cin >> n;
   if(n<102)
   {
       std::cout<<"1";
   }
   else
   {
    first = n;
	last=n % 10;
	for(first=n;first>=10;first=first/10);
    
	cout<<""<<first+last<<endl;
   }
   return 0;
       
   }