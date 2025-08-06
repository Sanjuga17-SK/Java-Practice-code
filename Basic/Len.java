
public class Len{
    public static void main(String[] args){
        int len = args.length;
        if(len > 0){
            for(int i = 0;i< len;i++){
                System.out.print(args[i]);
            }
        }
        else{
            System.out.println("no value");
        }
        
    }
}