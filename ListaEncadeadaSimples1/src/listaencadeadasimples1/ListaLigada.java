package listaencadeadasimples1;
public class ListaLigada {
    Celula primeira; //cabeça da lista
    Celula ultima; //cauda
    int totalDeElementos = 0;
    
    void adicionaNoComeco(Object elemento){
        Celula nova = new Celula(this.primeira,elemento); //Cria uma celula e recebe elemento - Construtor
        this.primeira = nova; //Verifica onde ela está apontando
        if(this.totalDeElementos == 0){ //Valor 0
            this.ultima = this.primeira; //antes de incrementar a primeira e ultima apontam para mesma celula
        }
        this.totalDeElementos++; //Elemento passa a ser 1 - incremento
    }
    
    void adiciona(Object elemento){
        if(this.totalDeElementos == 0){ //Verifica se o total de elementos e 0
            this.adicionaNoComeco(elemento);
        }else{
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalDeElementos++; // Incrementa novo Elemento
        }
    }
    
    boolean posicaoOcupada(int pos){ //Verifica se a posição está ou não ocupada
        return ((pos >= 0)&&(pos < this.totalDeElementos));
    }
    
    Celula pegaCelula(int pos){
        if(!this.posicaoOcupada(pos)){ //! -> negação
            throw new IllegalArgumentException("Posicao nao existe!!!");
        }else{
            Celula atual = this.primeira; // Atual aponta para primeira
            for(int i = 0; i < pos; i++){
                atual = atual.getProxima(); // Fará o "Atual" apontar para a próxima Celula
            }
            return(atual);
        }
    }
    
}
