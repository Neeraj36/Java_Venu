
public class Numbers {
	
	void neeraj(){
		
		int k;
		int n=6 ;
		int m=0;
		
		boolean s=true;
		
		for(int i=1;i<=n;i++){
			s=true;
			for(k=1;k<=i;k++){
			
				m=m+1;
				if(s){
					System.out.format("%4d",m);
					s=false;
				}else{
					if(k==i){ 
						System.out.print("  "+m+"  ");
					}else{
						System.out.print("  "+m+" ");
					}
					
				}
				
			}
			System.out.println("");
			int x=n-m;
			if(x<k){
				//System.out.println(x);
				break;
			}
		}
		
	}
	
	public static void main(String  aa[]){
		Numbers numbers=new Numbers();
		numbers.neeraj();
		
	}

}
