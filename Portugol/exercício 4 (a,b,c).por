programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
       real a,b,c
       real R
       real S
       real D

    escreva("Olá, informe o primeiro numero: ")
    leia(a)
    limpa()

    escreva("Agora nos informe o segundo número: ")
    leia(b)
    limpa()

    escreva("Por fim, por favor digite o último número: ")
    leia(c)
    limpa()

    R = Mat.potencia ((a + b), 2.0)
    S = Mat.potencia ((b + c), 2.0)
    D = R + S / 2

    escreva ("O resultado da expressão é: ", D)


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 483; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */