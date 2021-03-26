programa
{
	
	funcao inicio()
	{
       inteiro tempoSeg, horas, minutos, segundos

       escreva("Informe a quantidade de segundos do evento: ")
       leia(tempoSeg)

       horas = tempoSeg / (60*60)
       minutos = tempoSeg%(60*60)/60
       segundos = tempoSeg%(60*60)%60

       escreva("Quantidade de horas do evento: ", horas, "\nQuantidade de minutos: ", minutos, "\nQuantidade de segundos: ", segundos)
       


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 383; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */