//FindShortPath

public class Java78 {

    public static float FindShortPath(String path){
        int X=0 , Y=0 ;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //NORTH
            if(dir=='N'){
                Y++;
            }
            //SOUTH
            else if(dir=='S'){
                Y--;
            }
            //EAST
            else if(dir=='E'){
                X++;
            } 
            //WEST
            else{
                X--;
            }
            
        }

       int  X2 = X*X;
      int   Y2 = Y*Y;
        
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";

        System.out.println(FindShortPath(path));
    }
    
}
