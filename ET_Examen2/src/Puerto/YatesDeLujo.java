package Puerto;

/**
 *
 * @author qinux
 */
public class YatesDeLujo extends Barco{
    
    int mastilesVeleros;
    int potencia;
    int camarotes;
    
    public YatesDeLujo(String matricula, int eslora, int añoFabricacion, int mastilesVeleros, int potencia, int camarotes) {
        super(matricula, eslora, añoFabricacion);
        this.mastilesVeleros = mastilesVeleros;
        this.potencia = potencia;
        this.camarotes = camarotes;
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

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    @Override
    public int moduloFuncion() {
        int modulo = super.moduloFuncion();
        return modulo + mastilesVeleros + potencia + camarotes;
    }
}
