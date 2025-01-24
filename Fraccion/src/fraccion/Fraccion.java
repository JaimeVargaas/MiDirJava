//Variables de instancia
package fraccion;


public class fraccion   {
    private int signo;
    private int denominador;
    private int numerador;


//Constructor

public fraccion(int n, int d){
    if (d==0) {
        System.out.println("Una fracción no puede tener como denominador el número 0");
    }else{
        if (n*d < 0) {
            this.signo = -1;
        }else{
            this.signo = 1;
        }
        this.numerador = Math.abs(n);
        this.denominador = Math.abs(d);
    }
}
// genero los getter y setter
public int getSigno() {
    return signo;
}

public int getDenominador() {
    return denominador;
}

public int getNumerador() {
    return numerador;
}



public void setSigno(int signo) {
    this.signo = signo;
}
public void setDenominador(int denominador) {
    this.denominador = denominador;
}
public void setNumerador(int numerador) {
    this.numerador = numerador;
}

// toString

@Override
public String toString(){
    if (signo == -1) {
        return "-" + this.numerador + "/" + this.denominador;
    }else {
        return this.numerador + "/" + this.denominador;
    }
}


// METODO QUE INVIERTE UNA FRACCIÓN

public fraccion invierte() {
    //Fraccion nuevaFraccion = new Fraccion(this.signo * this.denominador, this.numerador);
    //return nuevaFraccion;+

    return new fraccion(this.signo * this.denominador, this.numerador);
}

//Metodo para multiplicar por un numero

public fraccion multiplica ( int n){
    return new fraccion(this.signo * this.numerador * n, this.denominador);
}


//Metodo para multiplicar fraccion por fraccion
// f llega como parametro es decir lo introduce el usuario
public fraccion multiplica(fraccion f){
    return new fraccion(this.signo * this.denominador * f.getNumerador(), this.denominador * f.getDenominador());
}

//DIVISION ENTRE ESCALAR (numero)

public fraccion divide (int n){
    return new fraccion(this.signo*this.numerador, this.denominador * n);
}


//Division entre fracciones

public fraccion divide (fraccion f){
    return new fraccion(this.signo * this.numerador * f.getDenominador(),this.denominador * f.getNumerador());
}


//Simplificar una fraccion

public fraccion simplifica(){
    int s = this.signo;
    int n = this.numerador;
    int d = this.denominador;

    for(int i=Math.min(this.numerador, this.denominador); i>=2; i--){
        if (((n % i) == 0) && ((d % i) == 0)) {
            n = n / i;
            d = d/ i;
        }
    }
    return new fraccion(s * n, d);
    
}
}




