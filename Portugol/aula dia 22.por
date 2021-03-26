programa
{
	
	inclua biblioteca Util
	
	
	funcao inicio()
	{
		inteiro dado[10]
		real media =0.0
		inteiro maiorNumero =0
		inteiro contador =0
		inteiro lancamento=0

		para (inteiro x=0; x<10; x++)
		{
			faca
			{
				limpa()
			
			escreva("Informe o número do lançamento: ", x+1, ": ")
			leia(lancamento)
			
			
			se (lancamento < 1 ou lancamento > 6){
				escreva("Numero indisponível\n Um dado possui apenas 6 lados! Tente outra vez e escolha um numero de (1-6)")
				
			}	
		
			}enquanto (lancamento < 1 ou lancamento > 6)
			dado[x] = lancamento
			
			
		}
			escreva("Lançamento: \n")
			para (inteiro x=0; x< Util.numero_elementos(dado); x++){

		}
		
} 
			
}
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 169; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */