programa
{
	
	funcao inicio()
	{
		inteiro n1,n2,n3,n4
		inteiro q1, q2, q3, q4

		escreva("digite o primeiro numero: ")
		leia(n1)
		escreva("digite o primeiro segundo: ")
		leia(n2)
		escreva("digite o primeiro terceiro: ")
		leia(n3)
		escreva("digite o primeiro quarto: ")
		leia(n4)

		q1 = n1 * n1
		q2 = n2 * n2
		q3 = n3 * n3
		q4 = n4 * n4

		se (q3 >= 1000) {
			escreva(" o quadrado do numero 3, ", n3, "é igual à: ", q3)
		}

		senao {
			escreva("\no quadrado do numero 1, ", n1, " é igual à: ", q1)
			escreva(" o quadrado do numero 2, ", n2, " é igual à: ", q2)
			escreva(" o quadrado do numero 4, ", n4, " é igual à: ", q4)

		}
		


		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 628; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */