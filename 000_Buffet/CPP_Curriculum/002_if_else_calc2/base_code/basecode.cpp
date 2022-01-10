// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"yeah we are starting c++"<<endl;
	
	char joe;
	cout<<"please enter a number"<<endl;
	int x;
	cin>>x;
	cout<<"please enter another number"<<endl;
	int y;
	cin>>y;
	cout<<"Please enter an operation ex: + - * /"<<endl;
	cin>>joe;
	if(joe == '+'){
		cout<<x+y<<endl;
	}
	if(joe == '-'){
		cout<<x-y<<endl;
	}
	if(joe == '*'){
		cout<<x*y<<endl;
	}
	if(joe == '/'){
		cout<<x/y<<endl;
	}
}
