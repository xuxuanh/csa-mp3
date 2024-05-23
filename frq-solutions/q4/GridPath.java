import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
  public Location getNextLoc(int row, int col) {
    Location result = new Location(row,col);
    if (row != grid.length-1 && col != grid[0].length-1){
      if (grid[row+1][col]<grid[row][col+1]){
        result = new Location(row+1,col);
      }
      else{
        result = new Location(row,col+1);
      }
    }
    else{
      if (row == grid.length-1){
        result = new Location(row,col+1);
      }
      else{
        result = new Location(row+1,col);
      }
    }
    return result;
  }

  
  // PART B
  public int sumPath(int row, int col) {
    int sum = 0;
    Location next;
    int newRow = row;
    int newCol = col;
    while(newRow != grid.length-1 || newCol != grid[0].length-1){
      sum += grid[newRow][newCol];
      next = getNextLoc(newRow,newCol);
      newRow = next.getRow();
      newCol = next.getCol();
    }
    return sum + grid[grid.length-1][grid[0].length-1];
  }

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
