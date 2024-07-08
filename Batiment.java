package partie4;

public class Batiment implements Habitable {
    private String adresse;
    private static int nombreTotalDeBatiments = 0;

    public Batiment(String adresse) {
        this.adresse = adresse;
        nombreTotalDeBatiments++;
    }

    public Batiment() {
        nombreTotalDeBatiments++;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String toString(){
        String representation =
                "Représentation du bâtiment :" +
                        "                    ☼ \n"+
                        "       _____¶¶_║       \n"+
                        "      /   \\    |       \n"+
                        "     /_____\\   |    \n"+
                        "      |    |▓▓▓|   \n"+
                        "      | █  |   |\n"+
                        "      ---------┘\n";
        return representation;
    };

    public String afficherInformation(){
        String informations;
        informations = "Il y a au total " + nombreTotalDeBatiments + " bâtiment(s) et il est à l'adresse " + adresse;
        return informations;
    }

    public static int getNombreTotalDeBatiments(){
        return nombreTotalDeBatiments;
    }

    @Override
    public void occuper(int nombreDePersonnes) {
        System.out.println(Integer.toString(nombreDePersonnes) + " occupent le bâtiment");
    }

}
