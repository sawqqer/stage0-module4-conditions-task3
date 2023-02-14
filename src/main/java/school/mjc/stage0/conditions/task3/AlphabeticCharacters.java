package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (!Character.isLetter(character)) {
            System.out.println("wrong alphabet!");
        } else if ("AEIOUaeiou".indexOf(character) != -1) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
