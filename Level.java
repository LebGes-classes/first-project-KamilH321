public class Level {
    private char[][] lvl;
    private int x, y;
    private char player = '@';
    private int count_stars;
    private int cor_str1_x;
    private int cor_str2_x;
    private int cor_str3_x;
    private int cor_str1_y;
    private int cor_str2_y;
    private int cor_str3_y;

    public Level(char[][] lvl, int startX, int startY, int cor_str1_x, int cor_str2_x, int cor_str3_x, int cor_str1_y, int cor_str2_y, int cor_str3_y) {
        this.lvl = lvl;
        this.x = startX;
        this.y = startY;
        this.cor_str1_x = cor_str1_x;
        this.cor_str2_x = cor_str2_x;
        this.cor_str3_x = cor_str3_x;
        this.cor_str1_y = cor_str1_y;
        this.cor_str2_y = cor_str2_y;
        this.cor_str3_y = cor_str3_y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLvl(char[][] lvl){
        ClearConsole clear = new ClearConsole();
        clear.clear_console();
        lvl[y][x] = player;
        if (lvl[y][x-1] == '@'){
            lvl[y][x-1] = '.';
        }
        else if (lvl[y][x+1] == '@'){
            lvl[y][x+1] = '.';
        }
        else if (lvl[y+1][x] == '@'){
            lvl[y+1][x] = '.';
        }
        else if (lvl[y-1][x] == '@'){
            lvl[y-1][x] = '.';
        }
        this.lvl = lvl;
    }

    public char[][] getLvl(){
        return lvl;
    }

    public void print_map(char[][] lvl){
        for (int i = 0; i < lvl.length; i++){
            for (int j = 0; j < lvl[i].length; j++){
                System.out.print(lvl[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public void setCount_Stars(int count_stars) {
        this.count_stars = count_stars;
    }

    public int getCount_Stars() {
        return count_stars;
    }

    public int check_ending(int end_x, int end_y){
        if (x == end_x && y == end_y){
            return 1;
        }
        else{
            return 0;
        }
    }

    public void count_Stars(){
        if (x == cor_str1_x &&  y == cor_str1_y) {
            setCount_Stars(getCount_Stars() + 1);
            cor_str1_x = -1;
            cor_str1_y = -1;
        }
        else if (x == cor_str2_x &&  y == cor_str2_y){
            setCount_Stars(getCount_Stars() + 1);
            cor_str2_x = -1;
            cor_str2_y = -1;
        }
        else if (x == cor_str3_x &&  y == cor_str3_y){
            setCount_Stars(getCount_Stars() + 1);
            cor_str3_x = -1;
            cor_str3_y = -1;
        }
     }
}
