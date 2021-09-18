public class TestPuzzleJava {
    
    public static void main(String[] args) {
        //Make an instance of BasicJava to easily access it
        PuzzleJava puzzles = new PuzzleJava();

        //Print 1-255
        puzzles.getTenRolls();

        //Print Random Letter
        System.out.println(puzzles.getRandomLetter());


        //Print Random Password
        puzzles.generatePassword();

        //Print Random Password of Specified Length
        puzzles.generateNewPasswordSet(15);
    }
}
