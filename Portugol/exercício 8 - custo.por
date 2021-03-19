programa
{
	
	funcao inicio()
	{

	real impostoEstado, custoF
	real distribuidor, imposto
	real valorInicio
	
	impostoEstado = 0.28
	custoF = 0.45

	escreva("Informe o valor inicial: ")
	leia(valorInicio)

    
	real total = valorInicio + (valorInicio * impostoEstado) + (valorInicio * custoF) 
        escreva("O valor total a ser pago é de: ", total)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */