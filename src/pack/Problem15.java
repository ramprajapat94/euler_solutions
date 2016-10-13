
package pack;

/**
 * Title : Lattice paths
 * URL : https://projecteuler.net/problem=15
 * Time : Thu, 9 Oct 2016  06:20
 * Goal : How many such routes are there through a 20×20 grid?
 * @author Shriram Prajapat & Shirish Padalkar
 */

public class Problem15 {
    
    public static void main(String[] args) {
        int gridSize = 20;
        long grid[][] = new long[gridSize+1][gridSize+1];

        for (int i = 0; i < gridSize; i++) {
            grid[i][gridSize] = 1;
            grid[gridSize][i] = 1;
        }
        
        for (int i = gridSize - 1; i >= 0; i--) {
            for (int j = gridSize - 1; j >= 0; j--) {
                grid[i][j] = grid[i+1][j] + grid[i][j+1];
            }
        }
        
        System.out.println("The no. of routes are : "+grid[0][0]);
    }
    
}
