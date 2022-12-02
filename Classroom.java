public class Classroom {
    public static void main(String[] args) {
        Wilder margot = new Wilder("Margot", true);
        Wilder cedric = new Wilder("Cédric", true);
        Wilder benjamin = new Wilder("Benjamin", false);
        Wilder loic = new Wilder("Loic", false);

        System.out.println(margot.whoAmI());
        System.out.println(cedric.whoAmI());
        System.out.println(benjamin.whoAmI());
        System.out.println(loic.whoAmI());

    }
}
