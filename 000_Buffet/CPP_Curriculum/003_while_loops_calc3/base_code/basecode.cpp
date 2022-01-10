// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"yeah we are starting c++"<<endl;
	
	int x = 4;
	char quit = 'x';
	
	while(true){
		cout<<x+1;
		
		if(quit == 'q'){
			cout<< x;
			break;
			
			
		}
		if(x==24){
			break;
		}
		x=x+1;
		

	}	
	coutl<<x;
	int y = 14;
	
	
	while(true){
		cout<<y+1;
		
		if(quit == 'q'){
			cout<< y;
			break;
			
			
		}
		if(y==4){
			break;
		}
		y=y-1;
		

	}	








}
