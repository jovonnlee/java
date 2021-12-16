public class Rectangle{
    public int x;
    public int y;
    public int width;
    public int height;
    
    public Rectangle(){
        int x=0;
        int y=0;
        int width =0;
        int height = 0;
    }
    public Rectangle(int x, int y, int width, int height)throws IllegalArgumentException{
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String toString(){
        return "Rectangle[x="+x+",y="+y+",width="+width+",height="+height+"]";
    }
}