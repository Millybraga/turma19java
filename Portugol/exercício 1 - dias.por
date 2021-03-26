programa
{
	inclua biblioteca Calendario --> Cal
	
	funcao inicio()
	{

	   inteiro ano, mes, dia
	   inteiro diasAtuais
	   inteiro diasVida

	   escreva("Em qual dia você nasceu? ")
	   leia(dia)
	   escreva("Em qual mes você nasceu? " )
	   leia(mes)
	   escreva("Qual o ano do seu nascimento? ")
        leia(ano)
        

        diasAtuais = ((Cal.ano_atual()*12*30)+(Cal.mes_atual()*30)+Cal.dia_mes_atual())
        diasVida = ((ano*12*30)+(mes*30)+dia)
        
        escreva("oi, você viveu ", diasAtuais-diasVida, " dias")
        


	   
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */