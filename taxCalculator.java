public class taxCalculator {

    public static void main(String[] args) {
        
        double salario = 3300.0;

        if (salario <= 2800){
            // Para salários abaixo de R$ 2800.00 o desconto é de 7.5%
            double descontoSalario1 = salario * 0.075;
            System.out.println("Seu salário com o imposto de renda descontado é de " + (salario - descontoSalario1));

        }else if(salario <= 3751){
            // Para salários abaixo de R$ 3751.00 o desconto é de 15%
            double descontoSalario2 = salario * 0.15; 
            System.out.println("Seu salário com o imposto de renda descontado é de " + (salario - descontoSalario2));

        }else if(salario <= 4664){

            // Para salários abaixo de R$ 4664.00 o desconto é de 22.5%
            double descontoSalario3 = salario * 0.225;
            System.out.println("Seu salário com o imposto de renda descontado é de " + (salario - descontoSalario3));
        }
            
    }
    
}
