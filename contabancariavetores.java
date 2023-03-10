public static void main(String[] args){
    scanner ler = new Scanner(system.in);//Scanner para leitura do teclado;
    Conta clientes [] = new Conta[4];//Instanciar Conta com um vetor chamado clientes[] de tamanho 4.

   //Para cada posição do vetor cliente [], deve-se criar uma instância de Conta! 
    for (int i = 0; i < clientes.length; i++){
        clientes[i] = new Conta();
    }//Preencher os atributyos de cada instância no vetor Conta!
    for (int i = 0; i < clientes.length; i++){
        System.out.printf("-->Ddaos do %d Cliente--\n", i+1);
        System.out.printf("Informe o nome do Cliente: ");
        clientes[i].nome = ler.next();
        System.out.printf("Informe a Agência:");
        clientes[i].agencia = ler.nextInt();
        System.out.printf("Informe o Num Conta: ");
        clientes[i].numconta = ler.nextIntI();
        System.out.printf("Informe o Saldo: ");
        clientes[i].saldo = ler.nextDouble();
    }
    for (int i = 0; i < clientes.length; i++){
        System.out.printf("---Dados dos Clientes cadastrados ---\n");
        System.out.printf("Nome: %s \n", clientes[i].nome);
        System.out.printf("Agência: %d \n", clientes[i].agencia);
        System.out.printf("Núm. Conta: %d \n", clientes[i].numconta);
        System.out.printf("Saldo: %f \n", clientes[i].saldo);

    }
}