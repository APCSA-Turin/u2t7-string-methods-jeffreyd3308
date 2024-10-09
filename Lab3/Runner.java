package Lab3;

public class Runner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        System.out.println(methods.longerThan("longer", 4));
        System.out.println(methods.funnyString("bananas", 4));
        System.out.println(methods.halvesReversed("advancedplacement"));
        System.out.println(methods.pigLatin("cool"));
        System.out.println(methods.removeCharacter("orange", 3));
        System.out.println(methods.insertAt("computer", "cool", "p"));
        System.out.println(methods.endUp("aaaaaaaaa", 5));
        System.out.println(methods.yellOrWhisper("Helloworld"));
    }
}
