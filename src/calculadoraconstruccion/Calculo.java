/*
*Principios de construcción de software
*Ulises González Robles
*Fecha: 21-Septiembre-2016
*Descripción: Es la clase que realiza los cálculos de la calculadora.
 */
package calculadoraconstruccion;



/**
 *
 * @author Zelph
 */
public class Calculo {
    String signo,valor1,valor2;
    String resultado;
    float valorFlotante, valorFlotante1, res;
    
    public Calculo(String signo, String valor1, String valor2){
        this.signo=signo;
        this.valor1=valor1;
        this.valor2=valor2;
    }
    
    public String calcularOperaciones(){
        valorFlotante=Float.parseFloat(valor1);
        valorFlotante1=Float.parseFloat(valor2);
        
        if (signo.equals("+")){
            res=valorFlotante+valorFlotante1;
        }
        if(signo.equals("-")){
            res=valorFlotante-valorFlotante1;
        }
        if(signo.equals("*")){
            res=valorFlotante*valorFlotante1;
        }
        if(signo.equals("/")){
            res=valorFlotante/valorFlotante1;
        } 
            
        resultado=String.valueOf(res);
        return resultado;
    }
}     
