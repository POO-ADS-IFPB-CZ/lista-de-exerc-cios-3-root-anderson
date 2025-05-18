Em Java, quando você cria um array de tipos primitivos como int[] ou double[], cada posição do array guarda diretamente o valor correspondente. Por exemplo, um int[] de tamanho 5 já vem preenchido com zeros. A memória já é reservada para armazenar esses valores diretamente, sem precisar de mais nada.

Por outro lado, quando você cria um array de objetos, como Aluno[] ou Produto[], o que o array armazena são apenas referências (ou "endereços") para os objetos — e não os objetos em si. Isso significa que, inicialmente, cada posição do array está com valor null, pois os objetos ainda não foram criados.

Um cuidado importante com arrays de objetos é verificar se cada posição está preenchida antes de usá-la. Se você tentar acessar um método ou atributo de um elemento que ainda está null, seu programa vai lançar um erro chamado NullPointerException.

Por isso, ao trabalhar com arrays de objetos, é comum fazer algo assim: primeiro você cria o array, depois instancia cada objeto e coloca na posição desejada. Só então é seguro usar os métodos desses objetos.

Enquanto arrays de tipos primitivos são simples e diretos, arrays de objetos exigem atenção extra com a criação e o uso de cada elemento. Esse cuidado evita erros e ajuda a manter o código mais robusto.
