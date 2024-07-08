package partie4;

public class Maison extends Batiment {
    private int nbPieces;

    public Maison() {
        super();
    }

    public Maison(String adresse, int nbPieces) {
        super(adresse);
        this.nbPieces = nbPieces;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    @Override
    public String toString() {
        String representation =
                "Représentation de la maison de " + Integer.toString(nbPieces) + " pièces : \n" +
                "        ▲      ☼ \n"+
                "       / \\       \n"+
                "      /   \\      \n"+
                "     /_____\\     \n"+
                "      |    ░|   \n"+
                "      | █   |   \n"+
                "      -------   \n";
        return representation;
    }

    @Override
    public String afficherInformation() {
        String informations;

        informations = super.afficherInformation() + "\n Il possède " + Integer.toString(nbPieces) + " pièces";
        return informations;
    }

    @Override
    public void occuper(int nombreDePersonnes) {
        System.out.println(Integer.toString(nombreDePersonnes) + " occupent la maison");
    }
}
