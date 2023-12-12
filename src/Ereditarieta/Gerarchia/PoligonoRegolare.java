package Ereditarieta.Gerarchia;

public interface PoligonoRegolare{

    double numFisQuadrato = 0.5;
    double numFisTriangolo = 0.289;

    default float calcolaApotema() {
        return 0;
    }
}
