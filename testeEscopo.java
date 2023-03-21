public class testeEscopo{

    public static void main(String[] args) {
        
        int quantidadeDePessoas = 1;
        int idade = 17;
        boolean acompanhado;

        if (quantidadeDePessoas >= 2) {
            acompanhado = true;
        }else{
            acompanhado = false;
        }

        if (acompanhado || idade >= 18){
            System.out.println("Você pode entrar");
        }else{
            System.out.println("Você não pode entrar");
        }

    }


}