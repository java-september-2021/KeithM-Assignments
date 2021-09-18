import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    
    public void getTenRolls(){
        
        //Instance of Random
        Random rand = new Random();

        //Creating Array
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //Set Variable to Iterate on
        int i = 0;

        while(i < 10){
            //Set randomNumber value to a random number between 0-20
            int randomNumber = rand.nextInt(21);

            //Add that to the array
            numbers.add(randomNumber);

            //Increment
            i++;
            
            //Print Array
            System.out.println(numbers);
        }
    }

    public String getRandomLetter(){
        
        //Instance of Random
        Random rand = new Random();

        //Creating Alphabet Array
        char[] alphabetArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 

        //Get a random number between 0-25
        int randomNumber = rand.nextInt(26);

        String letter = Character.toString(alphabetArray[randomNumber]);

        return letter;
    }

    public void generatePassword(){
        

        //Set Variable to Iterate on
        int i = 0;

        String password = "";

        while(i < 8){

            password = password + getRandomLetter();
            //Increment
            i++;

        }

        //Print Password
        System.out.println(password);
        
    }


    public void generateNewPasswordSet(int length){
        

        //Set Variable to Iterate on
        int i = 0;

        String password = "";

        while(i < length){

            password = password + getRandomLetter();
            //Increment
            i++;

        }

        //Print Password
        System.out.println(password);
        
    }

}
