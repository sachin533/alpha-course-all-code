//find largest length of array
public class Java79{
    public static void main(String args[]){

        String fruit[] = {"Mango" , "Apple" , "Bnanna" };

        String largest = fruit[0];

        for(int i=0; i<fruit.length; i++){

            if(largest.compareTo(fruit[i]) < 0){
                largest = fruit[i];
            }
        }

        System.out.println(largest);
        

    }
}