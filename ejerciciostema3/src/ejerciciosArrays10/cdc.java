package ejerciciosArrays10;

public class cdc {
    public static void main(String[] args) {
        String[][] palabras = new String[10][10];
        
        for (int i = 0; i < palabras.length; i++) {
            palabras[i][i] = "blas";
        }
        
        System.out.println(palabras[0][0] + palabras[0][1]);
    }}