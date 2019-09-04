
public class Snake {
		  
	    static void traverseMatrix(int[][] mat, int n) 
	    { 
	  
	        for (int i = 0; i < n; i++) { 
	            if (i % 2 == 1) { 
	                for (int j = 0; j < n; j++) { 
	                    System.out.print(Integer.toString(mat[i][j]) + " "); 
	                } 
	            } 
	            else { 
	                for (int j = n - 1; j >= 0; j--) { 
	                    System.out.print(Integer.toString(mat[i][j]) + " "); 
	                } 
	            } 
	        } 
	    } 

	    public static void main(String[] args) 
	    { 
	        int n = 5; 
	        
	        int[][] mat = { 
	            { 1, 2, 3, 4, 5 }, 
	            { 6, 7, 8, 9, 10 }, 
	            { 11, 12, 13, 14, 15 }, 
	            { 16, 17, 18, 19, 20 }, 
	            { 21, 22, 23, 24, 25 } 
	        }; 
	  
	        traverseMatrix(mat, n); 

	        System.exit(0); 
	    } 
	} 

