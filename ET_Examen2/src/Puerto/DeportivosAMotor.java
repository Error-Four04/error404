package Puerto;

/**
 *
 * @author qinux
 */
public class DeportivosAMotor extends Barco{
    int mastilesVeleros;
    int potencia;
    
    public DeportivosAMotor(String matricula, int eslora, int añoFabricacion, int mastilesVeleros, int potencia) {
        super(matricula, eslora, añoFabricacion);
        this.mastilesVeleros = mastilesVeleros;
        this.potencia = potencia;
    }

    public int getMastilesVeleros() {
        return mastilesVeleros;
    }

    public void setMastilesVeleros(int mastilesVeleros) {
        this.mastilesVeleros = mastilesVeleros;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    @Override
    public int moduloFuncion() {
        int modulo = super.moduloFuncion();
        return modulo + mastilesVeleros + potencia;
    }
}
