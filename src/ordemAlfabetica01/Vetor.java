package ordemAlfabetica01;

import java.util.Arrays;

public class Vetor {
    private String[] array = new String[10];

    public Vetor() {

    }

    public Vetor(String[] array) {
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void ordernarArray(String[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}