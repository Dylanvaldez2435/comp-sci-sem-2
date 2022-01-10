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

	for(int n = 15; n >= 5; n=n-1){
		cout<< n << endl;
	}


	for(int i = 5;	i <= 25;	i =i +1){
	cout<< i << endl;
	}
}