public class Questão9 {
    public static void main(String[] args) {
        String texto = "Estou aprendendo java";
        int contador = 0;

        texto = texto.toLowerCase();


        for (int i = 0; i < texto.length(); i++) {
             char letra = texto.charAt(i);

             if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                  contador++;

              System.out.println("A quantidade de vogais é: " + contador);

            }
        }
    }
}
