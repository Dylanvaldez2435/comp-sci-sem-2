// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	
	char sym;
	cout<<" what kind of symbol would you like to use "<<endl;
	cout<<"ITS SNOWING OUTSIDE MA!!"<<endl;
	cin>>sym;
	for(int y = 1; y < 10; y++){
	for(int y = 1; y < 10; y++){
	for(int y = 1; y < 10; y++){
	for(int y = 1; y < 10; y++){
	
	gotoxy(12,7+y);
	cout<<sym<<endl;
	gotoxy(10,6+y);
	cout<<sym<<endl;
	gotoxy(14,9+y);
	cout<<sym<<endl;
	gotoxy(17,6+y);
	cout<<sym<<endl;
		sleep(1);
			gotoxy(10,6+y);
			cout<<" "<<endl;
			gotoxy(12,7+y);
			cout<<" "<<endl;
			gotoxy(14,9+y);
			cout<<" "<<endl;
			gotoxy(17,6+y);
			cout<<" "<<endl;
	
	}
	}
	}
	}

}
