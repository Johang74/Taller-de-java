public class Calculadora {

    public static float calcularRectangulo(float base, float altura){
        float resultado = base * altura;
        return resultado;
    }

    public static float calcularTriangulo(float base, float altura){
        float resultado = (base * altura)/2;
        return resultado;
    }

    public static float calcularTrapecio(float baseMayor, float baseMenor,float altura){
        float resultado = (baseMayor+baseMenor)*altura/2;
        return resultado;
    }
}
