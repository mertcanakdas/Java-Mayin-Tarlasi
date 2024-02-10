
package mayıntarlası;

import java.util.Random;
import java.util.Scanner;


public class MayınTarlası {
    int rowNumber,colNumber;
    int[][] map;
    int[][] board;
    int size;
    boolean game = true;
    Random rand = new Random();
    Scanner ınput = new Scanner(System.in);

    public MayınTarlası(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = map;
        this.board = board;
        this.size = rowNumber * colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        
    }
    public void prepareGame(){
        int randRow,randCol,count = 0;
        while(count != (size/4)){
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if(map[randRow][randCol] != -1){
               map[randRow][randCol] = -1;
               count++;
               
            }
        }
        
    }
    public void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] >= 0){
                    System.out.print(" ");        
                }
                 System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void run(){
        int row,col,success = 0;
        prepareGame();
        print(map);
        System.out.println("Oyun Başladı!!");
        while(game){
            print(board);
            System.out.print("Satır: ");
            row = ınput.nextInt()-1;
            System.out.print("Sütun: ");
            col = ınput.nextInt()-1;
            if(row < 0 || row >= rowNumber){
                System.out.println("Geçersiz Koordinat");
                continue;
            }
            if(col < 0 || col >= colNumber){
                System.out.println("Geçersiz Koordinat");
                continue;
            }
            if(map[row][col] != -1){
                check(row, col);
                success++;
            if(success == size-(size/4)){
                System.out.println("Oyunu Bitirdiniz. Tebrikler");
                break;
            }
                
            }else{
                game = false;
                System.out.println("Game Over!!");
            }
            
        }
    }
    public void check(int r,int c){
        if(map[r][c] == 0){
            if((c < colNumber-1) && map[r][c+1] == -1){
                board[r][c]++;
            }
            if((r < rowNumber-1) && map[r+1][c] == -1){
                board[r][c]++;
            }
            if((r > 0) && map[r-1][c] == -1){
                board[r][c]++;
            }
            if((c < 0) && map[r][c-1] == -1){
                board[r][c]++;
            }
            if(board[r][c] == 0){
                board[r][c] = -2;
            }
        }
    }
    
    
    
    
    
    
    public static void main(String[] args) {
      
        
        
        
    }
    
}
