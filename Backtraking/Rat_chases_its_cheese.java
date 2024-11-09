import java.util.*;

public class Rat_chases_its_cheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of column: ");
        int m = sc.nextInt();

        int[][] maze = new int[n][m];
        
        System.out.println("Insert the value inside maze matrix: ");
        
        // Read the newline character after m
        sc.nextLine();
        
        // Modified input processing
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            for(int j = 0; j < s.length(); j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        
        int[][] ans = new int[n][m];
        Ratinmaze(maze, 0, 0, ans);
    }

    public static void Ratinmaze(int maze[][], int curr, int curc, int[][] ans) {
        // Modified termination condition
        if(curr == maze.length-1 && curc == maze[0].length-1 && maze[curr][curc] != 'X') {
            ans[curr][curc] = 1;
            display(ans);
            return;
        }

        if(curr < 0 || curc < 0 || curr >= maze.length || curc >= maze[0].length || maze[curr][curc] == 'X') {
            return;
        }

        maze[curr][curc] = 'X';  // marking as visited
        ans[curr][curc] = 1;
        
        Ratinmaze(maze, curr, curc-1, ans); // Left
        Ratinmaze(maze, curr, curc+1, ans); // Right
        Ratinmaze(maze, curr-1, curc, ans); // Up
        Ratinmaze(maze, curr+1, curc, ans); // Down
        
        maze[curr][curc] = 'O';  // backtracking
        ans[curr][curc] = 0;
    }

    public static void display(int ans[][]) {
        for(int i = 0; i < ans.length; i++) {
            for(int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}