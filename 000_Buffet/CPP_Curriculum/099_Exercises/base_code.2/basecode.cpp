// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"yeah we are starting c++"<<endl;
	
	char sym;
	cout<<" what kind of symbol would you like to use "<<endl;
	cin>>sym;
	for(int y = 1; y < 10; y++){
	gotoxy(10,5+y);
		cout<<sym<<endl;
			sleep(1);
			gotoxy(10,5+y);
			cout<<" "<<endl;
	}
}