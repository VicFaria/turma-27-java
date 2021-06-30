programa
{
	
	funcao inicio()
	{
		inteiro pontuacaoAtividade[5]
          inteiro maiorNumero=0

          para(inteiro i=0; i<=4; i++){
          	
		escreva ("Digite o valor da pontuação: ")
		leia(pontuacaoAtividade[i])
		  se (maiorNumero <pontuacaoAtividade[i])
		  {
		  	maiorNumero=pontuacaoAtividade[i]
	       }
		}
		escreva("O maior número digitado é: ", maiorNumero)
		

		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */