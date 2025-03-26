public class Carro {

    private boolean ligado;

    private int cambio;

    private int velocidade;
  
    public Carro(boolean ligado, int cambio, int velocidade){
        this.ligado = ligado;
        this.cambio = cambio;
        this.velocidade = velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getCambio() {
        System.out.println("A marcha está em " + cambio);
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

    public int getVelocidade() {
        System.out.println("A velocidade está em " + velocidade + " km/h");
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void aumentarVelocidade(){
        if(cambio == 0){
            System.out.println("Passe a marcha para poder acelerar.");
            return;
        }
        else if(cambio == 1){
            if(velocidade >= 0 && velocidade < 20){
                velocidade += 1;
                return;
            }
            else{
                System.out.println("Passe a marcha para poder aumentar a velocidade.");
                return;
            }
        }
        else if(cambio == 2){
            if(velocidade >= 20 && velocidade < 40){
                velocidade += 1;
                return;
            }
            else{
                System.out.println("Passe a marcha para poder aumentar a velocidade.");
                return;
            }
        }
        else if(cambio == 3){
            if(velocidade >= 40 && velocidade < 60){
                velocidade += 1;
                return;
            }
            else{
                System.out.println("Passe a marcha para poder aumentar a velocidade.");
                return;
            }
        }
        else if(cambio == 4){
            if(velocidade >= 60 && velocidade < 80){
                velocidade += 1;
                return;
            }
            else{
                System.out.println("Passe a marcha para poder aumentar a velocidade.");
                return;
            }
        }
        else if(cambio == 5){
            if(velocidade >= 80 && velocidade < 100){
                velocidade += 1;
                return;
            }
            else{
                System.out.println("Passe a marcha para poder aumentar a velocidade.");
                return;
            }
        }
        else if(cambio == 6){
            if(velocidade >= 100 && velocidade < 120){
                velocidade += 1;
                return;
            }
            else{
                System.out.println("Passe a marcha para poder aumentar a velocidade.");
                return;
            }
        }

        System.out.println("A velocidade está no limite máximo de 120km/h.");
    }

    public void diminuirVelocidade(){
        
        if(cambio == 1){
            if(velocidade > 0 && velocidade <= 20){
                velocidade -= 1;
                return;
            }
            else{
                System.out.println("Volte a marcha para poder parar.");
                return;
            }
        }
        else if(cambio == 2){
            if(velocidade > 20 && velocidade <= 40){
                velocidade -= 1;
                return;
            }
            else{
                System.out.println("Volte a marcha para poder diminuir a velocidade.");
                return;
            }
        }
        else if(cambio == 3){
            if(velocidade > 40 && velocidade <= 60){
                velocidade -= 1;
                return;
            }
            else{
                System.out.println("Volte a marcha para poder diminuir a velocidade.");
                return;
            }
        }
        else if(cambio == 4){
            if(velocidade > 60 && velocidade <= 80){
                velocidade -= 1;
                return;
            }
            else{
                System.out.println("Volte a marcha para poder diminuir a velocidade.");
                return;
            }
        }
        else if(cambio == 5){
            if(velocidade > 80 && velocidade <= 100){
                velocidade -= 1;
                return;
            }
            else{
                System.out.println("Volte a marcha para poder diminuir a velocidade.");
                return;
            }
        }
        else if(cambio == 6){
            if(velocidade > 100 && velocidade <= 120){
                velocidade -= 1;
                return;
            }
            else{
                System.out.println("Volte a marcha para poder diminuir a velocidade.");
                return;
            }
        }
        
        System.out.println("O carro está parado.");
        
    }
    
    /*public void passarMarcha(){
        if(cambio < 6){
            cambio += 1;
            return;
        }
        System.out.println("A marcha já está no máximo.");
    }

    public void voltarmarcha(){
        if(cambio > 0){
            cambio -= 1;
            return;
        }
        System.out.println("A marcha já está no mínimo.");
    }*/

    public void passarMarcha(){
        if(cambio == 0 && velocidade == 0){
	        cambio += 1;
            System.out.println("A marcha esta em: " + cambio);
            return;
       }
       if(cambio == 1 && velocidade == 20){
            cambio += 1;
            System.out.println("A marcha esta em: " + cambio);
            return;
       }
      if(cambio == 2 && velocidade == 40){
            cambio += 1;
            System.out.println("A marcha esta em: " + cambio);
            return;
       }
      if(cambio == 3 && velocidade == 60){
            cambio += 1;
            System.out.println("A marcha esta em: " + cambio);
            return;
       }
       if(cambio == 4 && velocidade == 80){
	        cambio += 1;
	        System.out.println("A marcha esta em:" + cambio);
            return;
       }
       if(cambio == 5 && velocidade == 100){
	        cambio += 1;
	        System.out.println("A marcha esta em: " + cambio);
            return;
       }
       if(cambio == 6){
	        cambio += 1;
	        System.out.println("A marcha já está no máximo.");
            return;
       }
       System.out.println("A marcha só pode ser se aumentar a velocidade.");
    }

    public void voltarmarcha(){
        if(cambio == 1 && velocidade == 0){
	        cambio -= 1;
            System.out.println("A marcha esta em: " + cambio);  
            return;
       }
       if(cambio == 2 && velocidade == 20){
	        cambio -= 1;
            System.out.println("A marcha esta em: " + cambio);
            return;
       }
       if(cambio == 3 && velocidade == 40){
	        cambio -= 1;
            System.out.println("A marcha esta em: " + cambio);
            return;
       }
       if(cambio == 4 && velocidade == 60){
	        cambio -= 1;
            System.out.println("A marcha esta em: " + cambio);
            return;
       }
       if(cambio == 5 && velocidade == 80){
	        cambio -= 1;
            System.out.println("A marcha esta em: " + cambio);
            return;
       }
       if(cambio == 6 && velocidade == 100){
	        cambio -= 1;
            System.out.println("A marcha esta em: " + cambio);
            return;
       }
       if(cambio == 0){
            System.out.println("A marcha já está no mínimo.");
            return;
        }
        System.out.println("A marcha só pode se diminuir a velocidade.");
        
    }

    public void virarDireita(){
        if(velocidade >= 1 && velocidade <= 40){
            System.out.println("Virando a direita.");
        }
        else if(velocidade == 0) {
            System.out.println("O carro está parado.");
        }
        else{
            System.out.println("Reduza a velocidade para poder virar a direita.");
        }
        
    }

    public void virarEsquerda(){
        if(velocidade >= 1 && velocidade <= 40){
            System.out.println("Virando a esquerda.");
        }
        else if (velocidade == 0) {
            System.out.println("O carro está parado.");
        }
        else{
            System.out.println("Reduza a velocidade para poder virar a esquerda.");
        }
    }

    public void desligarCarro(){
        if(cambio != 0 || velocidade != 0){
            System.out.println("O carro só poderá ser desligado em ponto morto e velocidade 0 km/h." + " Câmbio atual: "+ cambio + " Velocidade atual: " + velocidade);
        }
        else{
            System.out.println("Desligando o carro.");
            setLigado(false);
            //System.out.println("O carro está ligado?" + ligado);
            return;}
    }

}
