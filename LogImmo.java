package partie4;

public class LogImmo {
    public static void main(String[] args) {
        Maison maison = new Maison("123 rue bidon", 4);
        System.out.println("\n \n toStrings : ");
        System.out.println("Maison: " + maison.toString());
        System.out.println("Maison: " + maison.afficherInformation());

        System.out.println("\n \n");

        Batiment batiment = new Batiment("456 rue des cerises");
        System.out.println("Bâtiment: " + batiment.toString());

        System.out.println("\n \n Infos : ");
        System.out.println("Bâtiment: " + batiment.afficherInformation());

        System.out.println("\n \n Occupation : ");
        maison.occuper(3);
        batiment.occuper(10);
    }
}
