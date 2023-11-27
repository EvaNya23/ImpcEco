public class Edificio implements ImpactoEcologico {
    private double emisionesConstruccion;
    private String tipoEnergia;
    private double eficienciaEnergetica;
    private double mantenimiento;
    private int vidaUtil;
    private double impactoDemolicion;

    public Edificio(double emisionesConstruccion, String tipoEnergia, double eficienciaEnergetica, double mantenimiento, int vidaUtil, double impactoDemolicion) {
        this.emisionesConstruccion = emisionesConstruccion;
        this.tipoEnergia = tipoEnergia;
        this.eficienciaEnergetica = eficienciaEnergetica;
        this.mantenimiento = mantenimiento;
        this.vidaUtil = vidaUtil;
        this.impactoDemolicion = impactoDemolicion;
    }

    @Override
    public double calcularImpactoEcologico() {
        return emisionesConstruccion + eficienciaEnergetica + mantenimiento + (impactoDemolicion / vidaUtil);
    }

    @Override
    public String getIdentificacion() {
        return "Edificio";
    }
}

