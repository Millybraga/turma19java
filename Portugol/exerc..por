programa
{
	
	funcao inicio()
	{

      inteiro ano, mes, dia, dias
      cadeia nome
      

      //dia: nasc. dias: quant. vida

	     escreva("Hello, como você se chama? ")
	     leia(nome)
		escreva("\nDigite quantos dias você viveu: ")
          leia(dia)

          
          ano = dia/365
          mes = dia%365/30
          
         
          

          escreva(ano, " ", mes, " ", dia)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 260; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */