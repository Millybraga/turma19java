programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
     	real multaEstado, pesoTomate= 0.0, excesso, multa
     	


     	escreva("Informe o peso do tomate: ")
     		leia(pesoTomate)

     	multaEstado = 4.00 
     	excesso = pesoTomate - 50
     	multa = excesso * multaEstado

     	se (pesoTomate <= 50) {
     		escreva("O peso do tomate foi igual ou menor que 50kg. O valor da multa é: ZERO") 
     	}

		senao se (pesoTomate >= 50)  {
			escreva("O peso do tomate ultrapassou o limite de 50kg, em: ", excesso, " kg! Você pagará 4,00 por kg ultrapassado, resutando em: ", multa, " reais em multa")
		}

		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 539; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */