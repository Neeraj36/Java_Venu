package org.login;

public class Amstro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1000,i,j,temp=0;
		for(int k=1;k<=a;k++){
			i=k;
			while(i>0){
				j=i%10;
				temp=temp+(j*j*j);
				i=i/10;
			}
			if(temp==k){
				System.out.println(k);
			}
			temp=0;
		}
		
	 }
	}
