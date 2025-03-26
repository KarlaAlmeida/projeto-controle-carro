import java.util.Scanner;

public class ControleCarro {

    private final static Scanner scanner = new Scanner(System.in);

    private final static Carro carro = new Carro(false, 0 ,0);

    public static void main(String[] args) {
        
        var option1 = -1;
        var option2 = -1;

        do{
            System.out.println("Olá! Você só poderá tomar alguma ação com o carro ligado. Digite 1 para ligar o carro ou 0 para permanecer desligado."); 
            option1 = scanner.nextInt();
            if(option1 == 1){
                carro.setLigado(true);
                System.out.println("O carro está ligado? " + carro.isLigado());
            }
            
        }while (option1 != 1 && option1 != 0);

        //System.out.println("A opção escolhida foi " + option1);

        if(option1 == 0){
            System.out.println("Saindo. O carro permanecerá desligado.");
        }
        
        if(carro.isLigado()){
        //if(option1 == 1){
            //carro.setLigado(true);
            
            do{
                System.out.println("===Escolha uma ação:===");
                System.out.println("1 - aumentar velocidade."); 
                System.out.println("2 - diminuir velocidade."); 
                System.out.println("3 - passar a marcha."); 
                System.out.println("4 - voltar a marcha."); 
                System.out.println("5 - verificar velocidade."); 
                System.out.println("6 - verificar marcha."); 
                System.out.println("7 - virar para direita."); 
                System.out.println("8 - virar para esquerda."); 
                System.out.println("9 - desligar.");
                System.out.println("0 - sair.");

                option2 = scanner.nextInt();
                System.out.println("A opção escolhida foi " + option2);

                switch (option2) {
                    case 1 -> carro.aumentarVelocidade();
                    case 2 -> carro.diminuirVelocidade();
                    case 3 -> carro.passarMarcha();
                    case 4 -> carro.voltarmarcha();
                    case 5 -> carro.getVelocidade();
                    case 6 -> carro.getCambio();
                    case 7 -> carro.virarDireita();
                    case 8 -> carro.virarEsquerda();
                    case 9 -> carro.desligarCarro();
                    case 0 -> {
                        System.out.println("Saindo.");
                        System.exit(0);
                    }
                    default -> System.out.println("Opção inválida");
                }
            }while(carro.isLigado());        

        }       
    }
}
