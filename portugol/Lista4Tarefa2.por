programa
{
	
	funcao inicio()
	{
		inteiro lancamentoDado[10], somaDados=0, maiorNumero=0, ocorrencia=0
		real mediaLancamentos=0.002
		

		para(inteiro i=0; i<10; i++)
		{
		    escreva("Digite o valor do " + (i+1) + " dado:" )
		    leia(lancamentoDado[i])
		    somaDados = somaDados + lancamentoDado[i]
		    mediaLancamentos = somaDados / 10.0

		    se(maiorNumero <= lancamentoDado[i]){
		    	  maiorNumero = lancamentoDado[i]
		    	  		    	
		    }
		    
		}
		para(inteiro i =0; i<10;i++){
			se(maiorNumero == lancamentoDado[i]){
			
				ocorrencia++
			}
		}
		escreva("\n")
		escreva("Informações sobre o lançamento dos dados: \n")
		escreva("A soma total é: " + somaDados + "\n")
		escreva("A média é: " + mediaLancamentos + "\n")
		escreva("O numero: " + maiorNumero + " apareceu mais vezes, com um total de: " +ocorrencia + " vezes." )
	}
		
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 548; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */