public class dados {

public String nome;
public double salario;
public double taxa;

public double salliquid(){
    return salario-taxa;
}
public double salario( double percent){
    double sal = (salario*percent)/100;
    return salliquid()+sal;
}
public String toString(){
    return nome + ", $ " + String.format("%.2f", salliquid());
}


}


