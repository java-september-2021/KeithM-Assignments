import java.util.ArrayList;
class Exceptions{
    public static void main(String[] args){
        
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue + " was converted to an Integer.");
            } catch (ClassCastException e){
                String errorValue = (String) myList.get(i);
                System.out.println("I'm sorry, " + errorValue + " can't be converted to an integer.");
            }

        }

    }
}