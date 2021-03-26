programa
{
	
	funcao inicio()
	{
	    inteiro horaTrabalho
        inteiro digito = 123
        inteiro excesso
        inteiro excesso2
        real salario


        escreva ("Olá, informe seu código de acesso. ")
        leia(codigo)

        se(digito == 123){
            escreva("Ola, digite suas horas de trabalho da semana. ")
                leia (horaTrabalho)

        se(horaTrabalho <=50){
            escreva("você vai receber R$",horaTrabalho," esta semana")
            
		 horaTrabalho = horaTrabalho *10

            }

            senao{
                excesso = (horaTrabalho - 50) *20
                horaTrabalho = (horaTrabalho - 50)
                horaTrabalho = (horaTrabalho * 20)
                horaTrabalho = (horaTrabalho + 500)
                escreva("o seu salário é R$",horaTrabalho)
                escreva("\no valor excedente é R$", excesso)
            }
        }

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 910; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */