package imc;

/**
 * Created by Márcio Ilson on 26/02/2022.
 */
public class ImcNovo extends Imc {
    public ImcNovo(double peso, double altura){
        super(peso,altura);
    }

    @Override
    public String classificacao() {
        this.calculaImc();
        if (this.getImc() < 16) return "magreza grave";
        if (this.getImc() < 17) return "magreza moderada";
        if (this.getImc() < 18.5) return "magreza leve";
        if (this.getImc() < 25) return "saudável";
        if (this.getImc() < 30) return "sobrepeso";
        if (this.getImc() < 35) return "obesidade grau 1";
        if (this.getImc() < 40) return "obesidade grau 2";
        return "obesidade grau 3";
    }
}
