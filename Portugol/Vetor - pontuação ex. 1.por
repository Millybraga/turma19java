programa
{
	
	funcao inicio()
	{
	inteiro valor [5],x
	inteiro maiorPontuacao=0.0

	para (x=0; x<5; x++){

	escreva("Informe um valor: ")
	leia(valor[x])
	
	
	}
	para(x=0; x<5; x++)
	{
		escreva(valor[x],"\n")
		se (maiorPontuacao < valor[x]) {
					maiorPontuacao = valor[x]
				}
		}
		escreva("O número maior da pontuação é: ", maiorPontuacao)
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 189; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */