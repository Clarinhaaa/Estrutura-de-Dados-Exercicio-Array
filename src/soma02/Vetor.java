package soma02;

public class Vetor {
    private int[] array = new int[10];

    public Vetor() {

    }

    public Vetor(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int somarArray (int[] array) {
        int resultado = 0;
        for (int i = 0; i < array.length; i++) {
            resultado += array[i];
        }
        return resultado;
    }
}