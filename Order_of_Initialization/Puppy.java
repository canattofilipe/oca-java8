public class Puppy {
    private String name = "Kiara";
    {
        System.out.println("Kiara intance initializer");
    };

    public Puppy() {
        System.out.println("Kiara constructor");
    }

    public static void main(String[] args) {

        Puppy puppy = new Puppy();
        System.out.println(puppy.name);
    }
}
