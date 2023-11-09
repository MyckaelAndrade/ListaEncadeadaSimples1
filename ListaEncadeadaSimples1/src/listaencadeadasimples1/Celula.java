package listaencadeadasimples1;

//A classe celula -> Será necessária para montar os dados na lista
public class Celula { //Caixinha de dados

    Celula proxima; //Caixinha
    Object elemento; //Dado de dentro da Caixinha - Paciente

    Celula(Celula Proxima, Object elemento) { //Funciona como uma Validação
        this.elemento = elemento;
        this.proxima = proxima; 
    }

    Celula(Object elemento) { //Celula() -> Construtor da Classe, tendo os lugares corretos para serem chamados
        this.elemento = elemento; //Vai colocar o elemento na Caixinha
    }
    
    void setProxima(Celula proxima){ //vai apontar para próxima Célula
        this.proxima = proxima;
    }
    
    Celula getProxima(){ //Vai retornar a próxima célula, buscando a informação através da lista
        return(this.proxima);
    }
    
    Object getElemento(){ //Vai pegar o primeiro Elemento e mostrar suas informações, "Jogar para Fora", e Objeto pois tem que retornar um objeto
        return(this.elemento);
    }
        

}
