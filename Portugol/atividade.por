programa
{
	inclua biblioteca Graficos
	
	funcao inicio()
	{
		caracter opcao
		
		faca {
			limp()
			escreva("ESCOLA E D LASCAR\n")
			escreva("ENSINANDO BEM DESDE A PRÉ-HISTÓRIA")
			escreva("\n\n")
			
		escreva("1- BÁSICO\n")
		escreva("2- MÉDIO\n")
		escreva("3- GRADUAÇÃO\n")
		escreva("4- PÓS\n")
		escreva("5- MESTRADO\n")
		escreva("6- SAIR\n")

		escreva("Digite o número da sua opção: ")
		leia(opcao)

		se(opcao == '6'){
			escreva("Você escolheu sair")
			Util.aguarde(1000)
		}
		senao se (opcao == '1'){
			
			Util.aguarde(1000)
		}
		}enquanto (opcao != '6')}
		
		
		escreva("Fim de programa, volte sempre")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */