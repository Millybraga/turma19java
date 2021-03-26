programa
{
	
	
	funcao inicio()
	{
		inteiro inicioX
		inteiro resulSoma=0


		para(inicioX = 1; inicioX <= 500; inicioX++)
		{
		  
		
		se (inicioX % 3 == 0 e inicioX % 2 == 1) 
		{

		resulSoma = resulSoma + inicioX
		}
	}

           escreva("A soma dos numeros impares e multiplos de 3, entre 1 à 500 é: ", resulSoma)

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