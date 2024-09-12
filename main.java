class Mano {
    private int dedos;

    public Mano(int dedos) {
        this.dedos = dedos;
    }

    public String moverDedos() {
        return "Moviendo los dedos.";
    }

    @Override
    public String toString() {
        return "Mano con " + dedos + " dedos.";
    }
}


class Pierna {
    private int largo;

    public Pierna(int largo) {
        this.largo = largo;
    }

    public String caminar() {
        return "La pierna está caminando.";
    }

    @Override
    public String toString() {
        return "Pierna con largo de " + largo + " cm.";
    }
}


class Torso {
    private int ancho;
    private int alto;

    public Torso(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public String respirar() {
        return "El torso está moviendose para respirar.";
    }

    @Override
    public String toString() {
        return "Torso con ancho de " + ancho + " cm y alto de " + alto + " cm.";
    }
}


class Cabeza {
    private String forma;

    public Cabeza(String forma) {
        this.forma = forma;
    }

    public String mirar() {
        return "La cabeza está mirando.";
    }

    @Override
    public String toString() {
        return "Cabeza de forma " + forma + ".";
    }
}


class Robot {
    private Mano mano;
    private Pierna pierna;
    private Torso torso;
    private Cabeza cabeza;
    private Outfit outfit;

    public Robot(Mano mano, Pierna pierna, Torso torso, Cabeza cabeza) {
        this.mano = mano;
        this.pierna = pierna;
        this.torso = torso;
        this.cabeza = cabeza;
        this.outfit = null;
    }

    public String aplicarOutfit(Outfit outfit) {
        this.outfit = outfit;
        return "Aplicado " + outfit + " al robot.";
    }

    @Override
    public String toString() {
        return "Robot con " + mano + ", " + pierna + ", " + torso + ", " + cabeza + " y outfit: " + outfit + ".";
    }
}


abstract class Outfit {
    protected String tipo;

    public Outfit(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Outfit " + tipo;
    }
}


class CasualOutfit extends Outfit {
    public CasualOutfit() {
        super("casual");
    }

    @Override
    public String toString() {
        return "Outfit Casual";
    }
}


class FormalOutfit extends Outfit {
    public FormalOutfit() {
        super("formal");
    }

    @Override
    public String toString() {
        return "Outfit Formal";
    }
}

public class main {
    private String forma;

    public Cabeza(String forma) {
        this.forma = forma;
    }

    public String mirar() {
        return "La cabeza está mirando.";
    }

    @Override
    public String toString() {
        return "Cabeza de forma " + forma + ".";
    }
}
