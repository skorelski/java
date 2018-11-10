public class Earth {
    public static void main(String args[]){

        Human tom;

        tom = new Human();
        tom.age = 3;
        tom.eyeColor = "blue";
        tom.heightInInches = 40;
        tom.name = "Mees";

        tom.speak();

        Human danique = new Human();
        danique.age = 33;
        danique.eyeColor = "green";
        danique.heightInInches = 67;
        danique.name = "Danique";

        danique.speak();

        System.out.println();
    }
}
